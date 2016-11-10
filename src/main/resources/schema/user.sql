/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2016-11-09 21:07:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0', 'qq', '12', 'qq');
INSERT INTO `user` VALUES ('1', '7player', '22', '123456');
INSERT INTO `user` VALUES ('2', 'xujiuhua', '31', '123456');
INSERT INTO `user` VALUES ('3', 'demo', '11', '123456');
INSERT INTO `user` VALUES ('4', 'ww', '12', 'ww');
INSERT INTO `user` VALUES ('6', 'ee', '12', 'ee');
INSERT INTO `user` VALUES ('7', 'rr', '12', 'rr');
INSERT INTO `user` VALUES ('8', 'tt', '12', 'tt');
INSERT INTO `user` VALUES ('9', 'yy', '12', 'yy');
INSERT INTO `user` VALUES ('10', 'uu', '12', 'uu');
INSERT INTO `user` VALUES ('11', 'ii', '12', 'ii');
