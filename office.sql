-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.21-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 office 的数据库结构
CREATE DATABASE IF NOT EXISTS `office` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `office`;

-- 导出  表 office.attendance 结构
CREATE TABLE IF NOT EXISTS `attendance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL DEFAULT '0',
  `record_date` date NOT NULL,
  `amount` double NOT NULL DEFAULT '0',
  `leave` double NOT NULL DEFAULT '0',
  `absenteeism` double NOT NULL DEFAULT '0',
  `vacation` double NOT NULL DEFAULT '0',
  `real_amount` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `user_att` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- 正在导出表  office.attendance 的数据：~1 rows (大约)
DELETE FROM `attendance`;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` (`id`, `user_id`, `record_date`, `amount`, `leave`, `absenteeism`, `vacation`, `real_amount`) VALUES
	(1, 1, '2018-04-01', 23, 23, 23, 23, 23),
	(2, 3, '2018-04-01', 31, 2, 0, 2, 27);
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;

-- 导出  表 office.dept 结构
CREATE TABLE IF NOT EXISTS `dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `number` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- 正在导出表  office.dept 的数据：~2 rows (大约)
DELETE FROM `dept`;
/*!40000 ALTER TABLE `dept` DISABLE KEYS */;
INSERT INTO `dept` (`id`, `name`, `number`) VALUES
	(1, '软件研发事业部', '43232432432423'),
	(2, '硬件研发事业部', '432454365342625');
/*!40000 ALTER TABLE `dept` ENABLE KEYS */;

-- 导出  表 office.dept_schedule 结构
CREATE TABLE IF NOT EXISTS `dept_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `position` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `content` text COLLATE utf8_unicode_ci NOT NULL,
  `dept_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- 正在导出表  office.dept_schedule 的数据：~1 rows (大约)
DELETE FROM `dept_schedule`;
/*!40000 ALTER TABLE `dept_schedule` DISABLE KEYS */;
INSERT INTO `dept_schedule` (`id`, `start_date`, `end_date`, `position`, `content`, `dept_id`) VALUES
	(2, '2018-04-03', '2018-05-03', '锦业路1329号中科大厦', '前往中科现代集团场地进行测试', 1);
/*!40000 ALTER TABLE `dept_schedule` ENABLE KEYS */;

-- 导出  表 office.education 结构
CREATE TABLE IF NOT EXISTS `education` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- 正在导出表  office.education 的数据：~8 rows (大约)
DELETE FROM `education`;
/*!40000 ALTER TABLE `education` DISABLE KEYS */;
INSERT INTO `education` (`id`, `name`) VALUES
	(1, '小学'),
	(2, '初中'),
	(3, '高中'),
	(4, '中专'),
	(5, '大专'),
	(6, '本科'),
	(7, '硕士研究生'),
	(8, '博士研究生'),
	(9, '博士后');
/*!40000 ALTER TABLE `education` ENABLE KEYS */;

-- 导出  表 office.national 结构
CREATE TABLE IF NOT EXISTS `national` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- 正在导出表  office.national 的数据：~45 rows (大约)
DELETE FROM `national`;
/*!40000 ALTER TABLE `national` DISABLE KEYS */;
INSERT INTO `national` (`id`, `name`) VALUES
	(1, '汉族'),
	(2, '回族'),
	(3, '哈萨克族'),
	(4, '东乡族'),
	(5, '维吾尔族'),
	(6, '撒拉族'),
	(7, '保安族'),
	(8, '土族'),
	(9, '壮族'),
	(10, '布依族'),
	(11, '彝族'),
	(12, '水族'),
	(13, '苗族'),
	(14, '俄罗斯族'),
	(15, '朝鲜族'),
	(16, '蒙古族'),
	(17, '裕固族'),
	(18, '满族'),
	(19, '瑶族'),
	(20, '高山族'),
	(21, '藏族'),
	(22, '羌族'),
	(23, '塔吉克族'),
	(24, '黎族'),
	(25, '侗族'),
	(26, '仡佬族'),
	(27, '傣族'),
	(28, '哈尼族'),
	(29, '佤族'),
	(30, '纳西族'),
	(31, '门巴族'),
	(32, '乌孜别克族'),
	(33, '基诺族'),
	(34, '德昂族'),
	(35, '塔塔尔族'),
	(36, '鄂伦春族'),
	(37, '布朗族'),
	(38, '赫哲族'),
	(39, '怒族'),
	(40, '普米族'),
	(41, '达翰尔族'),
	(42, '锡伯族'),
	(43, '毛南族'),
	(44, '景颇族'),
	(45, '珞巴族'),
	(46, '京族'),
	(47, '阿昌族'),
	(48, '仫佬族'),
	(49, '塔塔尔族'),
	(50, '拉祜族');
/*!40000 ALTER TABLE `national` ENABLE KEYS */;

-- 导出  表 office.news 结构
CREATE TABLE IF NOT EXISTS `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `content` text COLLATE utf8_unicode_ci NOT NULL,
  `user_id` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- 正在导出表  office.news 的数据：~1 rows (大约)
DELETE FROM `news`;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` (`id`, `title`, `content`, `user_id`, `create_time`) VALUES
	(1, '关于“五一劳动节“”房价的通知', '根据公司安排，五一劳动节放假时间为4月29号到5月1号，共三天，其中4月28号正常上班！', 1, '2018-04-14 18:17:39');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;

-- 导出  表 office.project 结构
CREATE TABLE IF NOT EXISTS `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `budget` double NOT NULL DEFAULT '0',
  `content` text COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- 正在导出表  office.project 的数据：~1 rows (大约)
DELETE FROM `project`;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` (`id`, `name`, `start_date`, `end_date`, `budget`, `content`) VALUES
	(1, '西安建工集团信息化平台', '2018-04-11', '2018-04-16', 350000, '为西安建工平台开发信息化平台项目，将集团业务以及客户业务实现信息化');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;

-- 导出  表 office.user 结构
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `wages` double NOT NULL DEFAULT '0',
  `number` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `dept_id` int(11) NOT NULL DEFAULT '0',
  `role_id` int(11) NOT NULL DEFAULT '0',
  `gender` int(11) NOT NULL DEFAULT '0',
  `telphone` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `address` varchar(200) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `id_card_no` varchar(200) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `national_id` int(11) NOT NULL DEFAULT '0',
  `education_id` int(11) NOT NULL DEFAULT '0',
  `institute` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `major` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `project_id` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- 正在导出表  office.user 的数据：~3 rows (大约)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `account`, `password`, `wages`, `number`, `name`, `dept_id`, `role_id`, `gender`, `telphone`, `address`, `id_card_no`, `national_id`, `education_id`, `institute`, `major`, `project_id`) VALUES
	(1, 'chenda', 'admin', 5500, '1523455865969', '陈达', 2, 0, 1, '18998026781', '西安市雁塔区长安南路1209号牙合花园', '829019199209139876', 16, 7, '西安理工大学', '前去湿系统·嵌入式系统工程', NULL),
	(3, 'liuqi', '111111', 3500, '1523700661694', '王伟', 1, 1, 1, '17791092378', '西安市未央区明光路2129号', '622923199901010235', 1, 6, '西安工业大学', '计算机科学与技术', NULL),
	(4, 'liwei', '111111', 7500, '1523700866862', '李伟', 1, 1, 1, '17791910256', '西安市未央区明光北路2301号', '622920199202030015', 9, 7, '西安工业大学', '计算机科学与技术', NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- 导出  表 office.user_schedule 结构
CREATE TABLE IF NOT EXISTS `user_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `position` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `content` text COLLATE utf8_unicode_ci NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- 正在导出表  office.user_schedule 的数据：~2 rows (大约)
DELETE FROM `user_schedule`;
/*!40000 ALTER TABLE `user_schedule` DISABLE KEYS */;
INSERT INTO `user_schedule` (`id`, `start_date`, `end_date`, `position`, `content`, `user_id`) VALUES
	(1, '2018-02-25', '2018-03-31', '西安建工集团总部文景总部', '完成西安建工集团信息化平台相关调查工作', 1),
	(3, '2018-04-03', '2018-04-18', '西安建工集团文景事业部', '前往西安建工集团客户场地进行项目实地测试', 3);
/*!40000 ALTER TABLE `user_schedule` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
