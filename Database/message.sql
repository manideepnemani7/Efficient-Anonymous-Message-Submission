/*
MySQL Data Transfer
Source Host: localhost
Source Database: message
Target Host: localhost
Target Database: message
Date: 9/28/2012 3:32:37 PM
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for admin1
-- ----------------------------
DROP TABLE IF EXISTS `admin1`;
CREATE TABLE `admin1` (
  `id` text NOT NULL,
  `name` text NOT NULL,
  `height` text NOT NULL,
  `weight` text NOT NULL,
  `eye` text NOT NULL,
  `hair` text NOT NULL,
  `mole` text NOT NULL,
  `blood` text NOT NULL,
  `martial` text NOT NULL,
  `occupation` text NOT NULL,
  `ethnicity` text NOT NULL,
  `diseases` text,
  `smoke` text NOT NULL,
  `allergies` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for collector
-- ----------------------------
DROP TABLE IF EXISTS `collector`;
CREATE TABLE `collector` (
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for data
-- ----------------------------
DROP TABLE IF EXISTS `data`;
CREATE TABLE `data` (
  `id` varchar(255) NOT NULL,
  `name` text NOT NULL,
  `height` text NOT NULL,
  `weight` text NOT NULL,
  `eye` text NOT NULL,
  `hair` text NOT NULL,
  `mole` text NOT NULL,
  `blood` text NOT NULL,
  `martial` text NOT NULL,
  `occupation` text NOT NULL,
  `ethnicity` text NOT NULL,
  `diseases` text,
  `smoke` text NOT NULL,
  `allergies` text NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for data1
-- ----------------------------
DROP TABLE IF EXISTS `data1`;
CREATE TABLE `data1` (
  `id` varchar(255) NOT NULL,
  `name` text NOT NULL,
  `height` text NOT NULL,
  `weight` text NOT NULL,
  `eye` text NOT NULL,
  `hair` text NOT NULL,
  `mole` text NOT NULL,
  `blood` text NOT NULL,
  `martial` text NOT NULL,
  `occupation` text NOT NULL,
  `ethnicity` text NOT NULL,
  `diseases` text,
  `smoke` text NOT NULL,
  `allergies` text NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for data2
-- ----------------------------
DROP TABLE IF EXISTS `data2`;
CREATE TABLE `data2` (
  `id` varchar(255) NOT NULL,
  `name` text NOT NULL,
  `height` text NOT NULL,
  `weight` text NOT NULL,
  `eye` text NOT NULL,
  `hair` text NOT NULL,
  `mole` text NOT NULL,
  `blood` text NOT NULL,
  `martial` text NOT NULL,
  `occupation` text NOT NULL,
  `ethnicity` text NOT NULL,
  `diseases` text,
  `smoke` text NOT NULL,
  `allergies` text NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', 'admin');
INSERT INTO `admin1` VALUES ('4', '‚àl‚È\'¢m×‚ ¨', 'èø½•‰rj\\Gî}3Š–(', 'ËÐ5¿xøÁø‡òÏ8œÞ', '˜žoAø¶+¶9³Ìˆ¬Æû', '˜žoAø¶+¶9³Ìˆ¬Æû', 'ƒ7o~ ¨ÅdÊéq¤y´F', 's£}J%tÑ5¿Ûh‰“ƒ', '/Þ};Úìükfùb¡Ï×Wu', 'êëûKWÞæÖ\'-ÿÓ»!±', '%e˜´sQ/J»ôP\rÇÛÃ+', '~]óŠ&³ùu¬ŽOÌ<4', ']â	Ñ‡Œ©pC*I¹&', '¥b‡ÐtÖ.w\\“HÈ¤:Dr');
INSERT INTO `admin1` VALUES ('11', '¼Ê²Ä~ÅðÏØõ°|j', 'Éú¨a/ëàôr›±S4;W', 'Éú¨a/ëàôr›±S4;W', '˜žoAø¶+¶9³Ìˆ¬Æû', '˜žoAø¶+¶9³Ìˆ¬Æû', '1¯ôu`T4×Ä\\©ÿµ¦C', 's£}J%tÑ5¿Ûh‰“ƒ', '/Þ};Úìükfùb¡Ï×Wu', 'êëûKWÞæÖ\'-ÿÓ»!±', '%e˜´sQ/J»ôP\rÇÛÃ+', 'YfÛÜ=ÂÃfÏ!ÑÑAf8ß¬ðÂ¢Uî9ù{tß3', ']â	Ñ‡Œ©pC*I¹&', '¥b‡ÐtÖ.w\\“HÈ¤:Dr');
INSERT INTO `admin1` VALUES ('30', '‚àl‚È\'¢m×‚ ¨', 'èø½•‰rj\\Gî}3Š–(', 'ËÐ5¿xøÁø‡òÏ8œÞ', '˜žoAø¶+¶9³Ìˆ¬Æû', '˜žoAø¶+¶9³Ìˆ¬Æû', 'ƒ7o~ ¨ÅdÊéq¤y´F', 'Ú­«Øv°Ð³7åÑ', '/Þ};Úìükfùb¡Ï×Wu', 'êëûKWÞæÖ\'-ÿÓ»!±', '%e˜´sQ/J»ôP\rÇÛÃ+', 'D|‰ðÚÏ§ÄMãMÏ', ']â	Ñ‡Œ©pC*I¹&', 'R³#');
INSERT INTO `admin1` VALUES ('6', '½’mÇê\Z¹Ze[«;é®', '	ÍÜ9Ê5Á°ñ°Úé×', 'nÍõ5:Ÿ›‘¾˜á­ê]T', '˜žoAø¶+¶9³Ìˆ¬Æû', 'šŸ¸?š¾5ñ=jJTj', 'Kåc6“v4C€¹iÃ+ÒÇSAó u{J¡¿¯Ä.', '0µtØë\r”40wõ&', '/Þ};Úìükfùb¡Ï×Wu', 'êëûKWÞæÖ\'-ÿÓ»!±', '%e˜´sQ/J»ôP\rÇÛÃ+', '~]óŠ&³ùu¬ŽOÌ<4', ']â	Ñ‡Œ©pC*I¹&', '{ûBJ_uOÛÙj¹tÎ¤');
INSERT INTO `collector` VALUES ('collector', 'collector');
INSERT INTO `user` VALUES ('11', 'palani', 'palani', '22', 'male');
INSERT INTO `user` VALUES ('30', 'sk', 'sk', '22', 'male');
INSERT INTO `user` VALUES ('6', 'skumar', 'skumar', '22', 'male');
