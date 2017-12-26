/*
SQLyog Community Edition- MySQL GUI v6.07
Host - 5.0.67-community-nt : Database - message
*********************************************************************
Server version : 5.0.67-community-nt
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `message`;

USE `message`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

insert  into `admin`(`name`,`password`) values ('admin','admin');

/*Table structure for table `collector` */

DROP TABLE IF EXISTS `collector`;

CREATE TABLE `collector` (
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `collector` */

insert  into `collector`(`name`,`password`) values ('collector','collector');

/*Table structure for table `data` */

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

/*Data for the table `data` */

insert  into `data`(`id`,`name`,`height`,`weight`,`eye`,`hair`,`mole`,`blood`,`martial`,`occupation`,`ethnicity`,`diseases`,`smoke`,`allergies`) values ('20','¤õ¶3¼–Áìißr\"Mð','±Íof‚%Sí¨afæê$j','e£UÂ€\" Ó“QÍz','NB¶zí?ñÉ¼3á0Wtt','TŒÃ\n«)l[šë–Œ-5','[°¥dŠ9ó7 e\rê!ò>','K¡Gtô˜¨À*»£Õ\r›Û','kNp˜úórN™—¢Ä¿à',',l2’Â,±‰–“)èµ','ëS¹@ÁJ•©\ZÏaÈdÉõ','Å‡9§’g¼x×h¼è‚¨',',ßim^«lpý>’Œëµ','§¡‚¨ü><²é“Ûbq¹'),('24','cƒ@2\Z¨U¿ºªNš','Ù“Ã#°è)¢%ì(','e£UÂ€\" Ó“QÍz','”WÝâ½ŠÎè\'o‰x±','TŒÃ\n«)l[šë–Œ-5','n–EK|™à(f!d°Äžìã','ÿ	¬ºv°4Ï`S:lºÛÐ','F×ßm¾òaŠhã‚2±{•','.‰›K·}òé>#Ö–(?','ëS¹@ÁJ•©\ZÏaÈdÉõ','@Ýéá&/òÿ”ƒ',',ßim^«lpý>’Œëµ','§¡‚¨ü><²é“Ûbq¹');

/*Table structure for table `data1` */

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

/*Data for the table `data1` */

insert  into `data1`(`id`,`name`,`height`,`weight`,`eye`,`hair`,`mole`,`blood`,`martial`,`occupation`,`ethnicity`,`diseases`,`smoke`,`allergies`) values ('20','U)úi¾:µ½‰R\0LOÎZ','/L¯}ÙŽì›ƒ¸kß?ê?','±Íof‚%Sí¨afæê$j','l­×Z}6ËÜÚÇ…Éf','@ÃÅ\rðç˜U¡Ä¯è','#IÁ¢Ò°«¯÷Å,õ<®','¡ùûê¶™	ËÑòUä\"“','é8¨°»«B€9!','H=¥M”;%[	5N\"]','hI9bé¼¬(\\Ÿ\"ÓoNÍ','%:¯îÝËJ¹…¦ršE','ñ 1	F6¾Tü/]zX÷D','ˆ8æ-H¯ÔÝxƒâÂ'),('24','cƒ@2\Z¨U¿ºªNš','e£UÂ€\" Ó“QÍz','³€:<´ìâ\Z>€þ7>¬','ïÐa6ýþÝMµ‚zñÒ','Ô¢¼Šé‡Å½H†µÔ§±i','M¶8–¡·w’‹Æi}­','[¥;R¾iª\'Ìäýz!','PLM6-!‹~ÚÿAÐ¹{q‡','S}q”5láî¥O-Œhy@','hI9bé¼¬(\\Ÿ\"ÓoNÍ','öîséSX	\\D€yù.”','ñ 1	F6¾Tü/]zX÷D','ˆ8æ-H¯ÔÝxƒâÂ');

/*Table structure for table `data2` */

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

/*Data for the table `data2` */

insert  into `data2`(`id`,`name`,`height`,`weight`,`eye`,`hair`,`mole`,`blood`,`martial`,`occupation`,`ethnicity`,`diseases`,`smoke`,`allergies`) values ('20','ìÿ~\\.¶\'ïŠ;-','ÇSAó u{J¡¿¯Ä.','ÇSAó u{J¡¿¯Ä.','Iò×~hÜÎn2U©¯y¦B','¤õ¶3¼–Áìißr\"Mð','cƒ@2\Z¨U¿ºªNš','ÇSAó u{J¡¿¯Ä.','Iò×~hÜÎn2U©¯y¦B','ÇSAó u{J¡¿¯Ä.','ÀÜNŽ<òn‰úÒ} ”Í','U)úi¾:µ½‰R\0LOÎZ','ÇSAó u{J¡¿¯Ä.','ÇSAó u{J¡¿¯Ä.'),('24','ÇSAó u{J¡¿¯Ä.','ÇSAó u{J¡¿¯Ä.','ÇSAó u{J¡¿¯Ä.','ÇSAó u{J¡¿¯Ä.','¤õ¶3¼–Áìißr\"Mð','cƒ@2\Z¨U¿ºªNš','¤õ¶3¼–Áìißr\"Mð','Iò×~hÜÎn2U©¯y¦B','ÇSAó u{J¡¿¯Ä.','ÀÜNŽ<òn‰úÒ} ”Í','É…<¥äòÉV­¸¢@,´','ÇSAó u{J¡¿¯Ä.','ÇSAó u{J¡¿¯Ä.');

/*Table structure for table `root1` */

DROP TABLE IF EXISTS `root1`;

CREATE TABLE `root1` (
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

/*Data for the table `root1` */

insert  into `root1`(`id`,`name`,`height`,`weight`,`eye`,`hair`,`mole`,`blood`,`martial`,`occupation`,`ethnicity`,`diseases`,`smoke`,`allergies`) values ('7','#ÆM	SxÞ²oö^,ßÛ',' •×g\0¥N´ÃK?è\\hìÆ','¹³Á‰M´ð>yõ=ê½öè','šŸ¸?š¾5ñ=jJTj','yÐÅ±L•\r€þi»_ˆvO','[°¥dŠ9ó7 e\rê!ò>','Ç,n‰ñÃÇuEUu¿','/Þ};Úìükfùb¡Ï×Wu','êëûKWÞæÖ\'-ÿÓ»!±','%e˜´sQ/J»ôP\rÇÛÃ+','D|‰ðÚÏ§ÄMãMÏ',']â	Ñ‡Œ©pC*I¹&','xÒÍöÚ*	åtÌ¼#¶\n’—'),('98','_ákáå:mL/¢[ÊÇ','¿¿9Ú5\\ìÉ‰Õ³lô†','ˆUAŠ›œóÔ%\'Õ+º‘','4H3fVjÂäŒ^ÄÛk','R¨î+„Ûlï¨OÚ','Øâg— ò s|ÆäN','`Eaeô¦dï5Â½¸=ë','/Þ};Úìükfùb¡Ï×Wu','ÜP©Ô¦:P»Æôô=','%e˜´sQ/J»ôP\rÇÛÃ+','D|‰ðÚÏ§ÄMãMÏ',']â	Ñ‡Œ©pC*I¹&','¥b‡ÐtÖ.w\\“HÈ¤:Dr'),('78','tÍ…ü$ïþ;y|1‰|','yîëºÇi`ŒºOÆÜöý','yîëºÇi`ŒºOÆÜöý','šŸ¸?š¾5ñ=jJTj','R¨î+„Ûlï¨OÚ','Øâg— ò s|ÆäN','`Eaeô¦dï5Â½¸=ë','/Þ};Úìükfùb¡Ï×Wu','³]ˆ¿ÝÐÔ^’òR·ìÝ¹','mzcŸÊ‰®¤âŽ,rS£','9øý‘G#t®kÈs','’|4·Ésvt¿µlŽÈ','{ûBJ_uOÛÙj¹tÎ¤'),('45','Û*úÑË‰ˆS¾¢Ì²ùö‘','åªÇ¡ËþÓK<ùV˜ˆ¹','yîëºÇi`ŒºOÆÜöý','šŸ¸?š¾5ñ=jJTj','šŸ¸?š¾5ñ=jJTj','ÌÊ´#&Bð:Zºín9','ëÆæ(#Éºçá«ö','V•i4º3¦ŒüÅá3Ž\0Nz','•Ð?*ú°@†rÙ^íX','˜ýî€Ø…ØE–¢°²','±ÔÆ]lXR\\(µšå3',']â	Ñ‡Œ©pC*I¹&','{ûBJ_uOÛÙj¹tÎ¤'),('33',' \\í*›Ë~¥ÐûI\0','§ ®7ý­/Ï\"óæ}l','\\üT;	pÐø(Þê™;„Ñ','šŸ¸?š¾5ñ=jJTj','R¨î+„Ûlï¨OÚ','£I¡PÉ_ø}—áèˆí¤\'','Ç,n‰ñÃÇuEUu¿','/Þ};Úìükfùb¡Ï×Wu','êëûKWÞæÖ\'-ÿÓ»!±','mzcŸÊ‰®¤âŽ,rS£','D|‰ðÚÏ§ÄMãMÏ',']â	Ñ‡Œ©pC*I¹&','¥b‡ÐtÖ.w\\“HÈ¤:Dr'),('17','\'™^í„.PÛ±ó­\Zã&Ù','„OÌù]¨X¨™guÔ‹','nÍõ5:Ÿ›‘¾˜á­ê]T','šŸ¸?š¾5ñ=jJTj','R¨î+„Ûlï¨OÚ','[°¥dŠ9ó7 e\rê!ò>','FÖštA—fœ´’ì(<’_','/Þ};Úìükfùb¡Ï×Wu','êëûKWÞæÖ\'-ÿÓ»!±','mzcŸÊ‰®¤âŽ,rS£','D|‰ðÚÏ§ÄMãMÏ',']â	Ñ‡Œ©pC*I¹&','¥b‡ÐtÖ.w\\“HÈ¤:Dr'),('52','Ô9€+y’·UK™','KSì€”¾vfG­öé5e','õVŒ“÷Z›Û:ÑÖ×¹8ø','šŸ¸?š¾5ñ=jJTj','R¨î+„Ûlï¨OÚ','[°¥dŠ9ó7 e\rê!ò>','Ç,n‰ñÃÇuEUu¿','/Þ};Úìükfùb¡Ï×Wu','êëûKWÞæÖ\'-ÿÓ»!±','mzcŸÊ‰®¤âŽ,rS£','Íþê¥ì0häV—’¦&lß',']â	Ñ‡Œ©pC*I¹&','¥b‡ÐtÖ.w\\“HÈ¤:Dr'),('71','\n‰¦}øÐp@‹G‚­¶‚','èø½•‰rj\\Gî}3Š–(','õVŒ“÷Z›Û:ÑÖ×¹8ø','šŸ¸?š¾5ñ=jJTj','R¨î+„Ûlï¨OÚ','[°¥dŠ9ó7 e\rê!ò>','Ç,n‰ñÃÇuEUu¿','/Þ};Úìükfùb¡Ï×Wu','êëûKWÞæÖ\'-ÿÓ»!±','˜ýî€Ø…ØE–¢°²','D|‰ðÚÏ§ÄMãMÏ',']â	Ñ‡Œ©pC*I¹&','¥b‡ÐtÖ.w\\“HÈ¤:Dr'),('36','üÍk#Åëž!JÂA8¸éÝ','	ÍÜ9Ê5Á°ñ°Úé×','nÍõ5:Ÿ›‘¾˜á­ê]T','÷ˆÅ·ß<Å»´w/@','R¨î+„Ûlï¨OÚ','R\"ÂN\'moÅP£ñ‡“¯','Ç,n‰ñÃÇuEUu¿','V•i4º3¦ŒüÅá3Ž\0Nz','´­À¹LTK>}!\'¯À','˜ýî€Ø…ØE–¢°²','D|‰ðÚÏ§ÄMãMÏ',']â	Ñ‡Œ©pC*I¹&','¥b‡ÐtÖ.w\\“HÈ¤:Dr');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`password`,`age`,`gender`) values ('11','palani','palani','22','male'),('17','baji','baji','24','male'),('20','kai','kai','58','male'),('24','ff','ff','45','female'),('30','sk','sk','22','male'),('33','sujitha','sujitha','21','female'),('36','pardhu','pardhu','21','male'),('45','bai','bai','45','female'),('46','sai','sai','21','male'),('52','sai2','sai2','23','male'),('6','skumar','skumar','22','male'),('66','sai23','sai','21','male'),('69','dr','dr','24','male'),('7','saii','sai','21','male'),('71','hemanth','hemanth','20','male'),('78','hai','hai','45','male'),('98','jai','jai','52','male');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
