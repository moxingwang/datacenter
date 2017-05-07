CREATE DATABASE IF NOT EXISTS `datacenter` ;
USE `datacenter`;


DROP TABLE IF EXISTS `device_info`;
CREATE TABLE  `device_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `device_id` VARCHAR(255) NOT NULL ,
  `device_name` VARCHAR(255) DEFAULT NULL ,
  `device_type` VARCHAR(255) DEFAULT NULL ,
  `temperature` VARCHAR(64) DEFAULT NULL ,
  `humidity` VARCHAR(64) DEFAULT NULL ,
  `intensity` VARCHAR(64) DEFAULT NULL,
  `write_time` datetime DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `time_aspect_log`;
CREATE TABLE  `time_aspect_log` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `tag` VARCHAR (255) DEFAULT NULL ,
  `used_times` bigint(11) DEFAULT 0,
  `create_date` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;