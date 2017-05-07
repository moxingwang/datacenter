## 项目说明
> spring boot集成rabbit Mq，实现接受mq发送过来的数据保存数据到MySq，rest获取数据；

* [Spring boot集成rabbitmq](http://www.cnblogs.com/hlhdidi/p/6535677.html)
* [rabbitmq安装](http://www.myexception.cn/linux-unix/1820786.html)
* [rabbitmq添加用户](http://blog.csdn.net/zyz511919766/article/details/42292655)

* 打包命令
````
    mvn -U clean install   -Dmaven.test.skip=true -am
````

## 需求
````
实现rest风格的web Service

主要实现：本课题拟搭建智能家居的后台服务器系统，基于MQTT协议与感知层通信，接收传感器采集到的环境数据，并对感知层进行反馈控制；同时，管理采集到的数据，并为Web客户端或手机客户端提供REST风格的WebService，以方便构建智能家居的客户端系统。


我的上一个同学A实现：实现温度、湿度、光照度等信息的感知和传输，并实现远程开关灯等反馈控制功能。以MQTT作为消息中间件，通过消息发布和订阅的方式，实现感知层与服务器之间的消息通信，进而实现数据采集与反馈控制功能


同学A将数据传给我，我把数据保存起来。数据为：温度、光照度、当前温度


同学C实现：能够从服务端查询各感知节点的数据，并能实现对一些节点的反馈控制。以开源物联网平台SiteWhere为服务端，通过REST风格的Web服务接口访问采集到的数据，并实现智能家居的环境监测、控制与数据可视化功能。

我主要将A给的数据存储起来。1、对C的安卓端发出查询数据的请求应答.展现出温度、湿度、光照度、当前时间 
                           2、安卓端请求关灯开灯，通过我提供的rest风格的web service对硬件端进行控制
                           3、将每次查询时间保存起来，并可以根据历史查询时间查看到历史数据。
````