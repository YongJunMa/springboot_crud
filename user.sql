/*
Navicat MySQL Data Transfer

Source Server         : learn
Source Server Version : 50643
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50643
File Encoding         : 65001

Date: 2019-03-29 17:09:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('13', 'Robin11', '10', 'male');
INSERT INTO `user` VALUES ('14', 'Perter', '10', 'male');
INSERT INTO `user` VALUES ('15', 'Rose', '10', 'female');
INSERT INTO `user` VALUES ('19', 'sda', '11', 'male');
INSERT INTO `user` VALUES ('20', '111', '1111', 'male');
INSERT INTO `user` VALUES ('29', '2342342', '5', 'male');
INSERT INTO `user` VALUES ('30', 'Lucy', '111', 'female');
INSERT INTO `user` VALUES ('32', '111', '111111', 'male');
INSERT INTO `user` VALUES ('33', 'Tom', '10', 'male');
INSERT INTO `user` VALUES ('34', 'Perter', '10', 'male');
INSERT INTO `user` VALUES ('35', 'Rose', '10', 'female');
INSERT INTO `user` VALUES ('36', 'Tom', '10', 'male');
INSERT INTO `user` VALUES ('37', 'Perter', '10', 'male');
INSERT INTO `user` VALUES ('38', 'Rose', '10', 'female');
INSERT INTO `user` VALUES ('39', 'Tom', '10', 'male');
INSERT INTO `user` VALUES ('40', 'Perter', '10', 'male');
INSERT INTO `user` VALUES ('41', 'Rose', '10', 'female');
INSERT INTO `user` VALUES ('42', 'Tom', '10', 'male');
INSERT INTO `user` VALUES ('43', 'Perter', '10', 'male');
INSERT INTO `user` VALUES ('44', 'Rose', '10', 'female');
INSERT INTO `user` VALUES ('45', 'Tom', '10', 'male');
INSERT INTO `user` VALUES ('46', 'Perter', '10', 'male');
INSERT INTO `user` VALUES ('47', 'Rose', '10', 'female');
