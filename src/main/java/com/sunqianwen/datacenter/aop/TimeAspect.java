package com.sunqianwen.datacenter.aop;

import com.sunqianwen.datacenter.mapper.TimeAspectLogMapper;
import com.sunqianwen.datacenter.model.TimeAspectLog;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by MoXingwang on 2017/4/27.
 */
@Component
@Aspect
public class TimeAspect {
    private Logger logger = Logger.getLogger(TimeAspect.class);

    @Autowired
    private TimeAspectLogMapper timeAspectLogMapper;

    @Pointcut("execution(* com.sunqianwen.datacenter.controller.query..*.*(..))")
    public void logPointcut() {
    }

    @org.aspectj.lang.annotation.Around("logPointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        String tag = joinPoint.getSignature().getDeclaringType().getName() + "." + joinPoint.getSignature().getName();

        TimeAspectLog timeAspectLog = new TimeAspectLog();
        timeAspectLog.setTag(tag);
        timeAspectLog.setCreateDate(new Date());

        long start = System.currentTimeMillis();
        try {
            Object result = joinPoint.proceed();
            long end = System.currentTimeMillis();

            long usedTime = end - start;
            timeAspectLog.setUsedTimes(usedTime);

            timeAspectLogMapper.insert(timeAspectLog);

            return result;
        } catch (Throwable e) {
            logger.error("TimeAspect error",e);
            long end = System.currentTimeMillis();
            long usedTime = end - start;

            timeAspectLog.setUsedTimes(usedTime);

            timeAspectLogMapper.insert(timeAspectLog);

            throw e;
        }

    }
}
