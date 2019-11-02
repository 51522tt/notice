/*
 Navicat Premium Data Transfer

 Source Server         : 本地数据库
 Source Server Type    : MariaDB
 Source Server Version : 50564
 Source Host           : 10.211.55.12:3306
 Source Schema         : message_notice_db

 Target Server Type    : MariaDB
 Target Server Version : 50564
 File Encoding         : 65001

 Date: 02/11/2019 01:12:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for log_notice_sending_record
-- ----------------------------
DROP TABLE IF EXISTS `log_notice_sending_record`;
CREATE TABLE `log_notice_sending_record` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `log_suorce_data` text COMMENT '原始数据',
  `notice_template_number` int(10) DEFAULT NULL COMMENT '通知模板编号',
  `log_send_data` text COMMENT '拼装好后发送的信息',
  `log_send_user` varchar(255) DEFAULT NULL COMMENT '发送人',
  `log_send_ip` varchar(255) DEFAULT NULL COMMENT '发送IP',
  `log_receive_user` varchar(255) DEFAULT NULL COMMENT '接收人(多个用''|''表示)',
  `log_receive_department` varchar(255) DEFAULT NULL COMMENT '接收部门(多个用''|''表示)',
  `log_cc` varchar(255) DEFAULT NULL COMMENT '抄送人（好像没什么卵用）',
  `log_send_datetime` datetime(6) NOT NULL COMMENT '发送时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tab_notice_template
-- ----------------------------
DROP TABLE IF EXISTS `tab_notice_template`;
CREATE TABLE `tab_notice_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `notice_template_number` varchar(255) DEFAULT NULL COMMENT '通知模板表编号',
  `notice_template_format` text COMMENT '通知格式',
  `notice_type_number` varchar(255) DEFAULT NULL COMMENT '通知类型表(外表）',
  `general_application_number` varchar(255) DEFAULT NULL COMMENT '通用应用编号(结合通知类型表)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tab_notice_type
-- ----------------------------
DROP TABLE IF EXISTS `tab_notice_type`;
CREATE TABLE `tab_notice_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `notice_type_number` varchar(255) DEFAULT NULL COMMENT '通知类型编号',
  `notice_type_name` varchar(255) DEFAULT NULL COMMENT '通知类型名称',
  `notice_type_profile` varchar(255) DEFAULT NULL COMMENT '通知类型配置信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tab_wechat_app_info
-- ----------------------------
DROP TABLE IF EXISTS `tab_wechat_app_info`;
CREATE TABLE `tab_wechat_app_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `wechat_app_info_appid` varchar(255) DEFAULT NULL COMMENT '微信应用appid',
  `wechat_app_info_secrte` varchar(255) DEFAULT NULL COMMENT '微信应用secrte',
  `wechat_app_info_name` varchar(255) DEFAULT NULL COMMENT '微信应用名称',
  `wechat_app_info_number` varchar(0) DEFAULT NULL COMMENT '微信应用编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
