/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : localhost:3306
 Source Schema         : chefassist

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 10/07/2021 16:15:44
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for desk
-- ----------------------------
DROP TABLE IF EXISTS `desk`;
CREATE TABLE `desk`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `size` int(0) NULL DEFAULT NULL,
  `is_using` int(0) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of desk
-- ----------------------------
INSERT INTO `desk` VALUES (9, '3号桌', 8, 1);
INSERT INTO `desk` VALUES (10, '2号桌', 5, 1);
INSERT INTO `desk` VALUES (19, '1号桌', 3, 1);
INSERT INTO `desk` VALUES (22, '5号桌', 3, 0);
INSERT INTO `desk` VALUES (38, '1号卓', 3, 0);
INSERT INTO `desk` VALUES (39, '66号卓', 1, 0);

-- ----------------------------
-- Table structure for dish
-- ----------------------------
DROP TABLE IF EXISTS `dish`;
CREATE TABLE `dish`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` double NULL DEFAULT NULL,
  `picture` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `time` double NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dish
-- ----------------------------
INSERT INTO `dish` VALUES (2, '鱼香肉丝', '好吃', 15, 'img/yxrs.jpg', 10);
INSERT INTO `dish` VALUES (5, ' 生姜鸡腿汤', '虽然是夏天，偶尔喝喝姜汤发发汗也很好', 15, 'img/sjjtt.jpg', 10);
INSERT INTO `dish` VALUES (11, '1', '1', 1, 'img/hmj.jpg', 1);

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `dish_id` int(0) NULL DEFAULT NULL,
  `count` int(0) NULL DEFAULT NULL,
  `status` int(0) NULL DEFAULT 0,
  `order_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 91 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `order_detail` VALUES (62, 2, 1, 1, '5d2f79da-3721-4923-ba56-df02bf03fc5e');
INSERT INTO `order_detail` VALUES (63, 5, 1, 1, '5d2f79da-3721-4923-ba56-df02bf03fc5e');
INSERT INTO `order_detail` VALUES (64, 2, 1, 0, '36fb0d3a-d4e2-44e8-8852-a184f79a6b57');
INSERT INTO `order_detail` VALUES (65, 5, 1, 0, '36fb0d3a-d4e2-44e8-8852-a184f79a6b57');
INSERT INTO `order_detail` VALUES (66, 2, 2, 1, 'bf9a78b2-6a69-4dd3-8da5-a2fcfaa9bde1');
INSERT INTO `order_detail` VALUES (67, 2, 2, 1, '53c93a8a-e941-4fd6-baba-9b4c5afa335c');
INSERT INTO `order_detail` VALUES (68, 2, 2, 1, 'e911017a-3e4b-4a96-9779-1fd214c6b8cf');
INSERT INTO `order_detail` VALUES (69, 5, 3, 1, 'e911017a-3e4b-4a96-9779-1fd214c6b8cf');
INSERT INTO `order_detail` VALUES (70, 2, 2, 1, 'b285b85b-3ccc-4999-8908-19ba4bb04dbb');
INSERT INTO `order_detail` VALUES (71, 5, 3, 0, 'b285b85b-3ccc-4999-8908-19ba4bb04dbb');
INSERT INTO `order_detail` VALUES (72, 2, 2, 1, 'd7bae85f-33ba-4ad1-87fe-c4d508a947c6');
INSERT INTO `order_detail` VALUES (73, 5, 1, 1, 'd7bae85f-33ba-4ad1-87fe-c4d508a947c6');
INSERT INTO `order_detail` VALUES (74, 2, 1, 1, '91bf0060-9cc4-4ab6-86c9-1b4e93b444a2');
INSERT INTO `order_detail` VALUES (75, 5, 3, 1, '91bf0060-9cc4-4ab6-86c9-1b4e93b444a2');
INSERT INTO `order_detail` VALUES (76, 2, 4, 1, 'b475942a-6ae8-42bc-bffd-e0790ac6cb5a');
INSERT INTO `order_detail` VALUES (77, 5, 6, 1, 'b475942a-6ae8-42bc-bffd-e0790ac6cb5a');
INSERT INTO `order_detail` VALUES (78, 2, 3, 1, '05a5295c-d2af-45ce-b942-5bdd741a262d');
INSERT INTO `order_detail` VALUES (79, 2, 2, 1, '58b24c12-3211-4ee4-9775-6a1697201dff');
INSERT INTO `order_detail` VALUES (80, 5, 3, 1, '58b24c12-3211-4ee4-9775-6a1697201dff');
INSERT INTO `order_detail` VALUES (81, 2, 2, 1, '642c439c-144d-4625-9550-71a9a454f19c');
INSERT INTO `order_detail` VALUES (82, 5, 1, 1, '52901a74-804f-4980-8348-aa00e6c1e566');
INSERT INTO `order_detail` VALUES (83, 2, 3, 1, 'bd7c523d-0d5d-4da3-80ca-d439c6936b72');
INSERT INTO `order_detail` VALUES (84, 2, 3, 1, '7c6c0ccd-7694-41c1-b3b7-61b3b283bde1');
INSERT INTO `order_detail` VALUES (85, 2, 1, 1, 'f5e7ea3d-0920-4aef-887b-07816731a94a');
INSERT INTO `order_detail` VALUES (86, 2, 1, 1, '8bdd2f09-0d74-478f-aecc-cb10ad7b12be');
INSERT INTO `order_detail` VALUES (87, 5, 1, 1, '8bdd2f09-0d74-478f-aecc-cb10ad7b12be');
INSERT INTO `order_detail` VALUES (88, 2, 1, 1, 'cb501a02-3c7a-4531-8a72-bcc94c890bff');
INSERT INTO `order_detail` VALUES (89, 2, 2, 1, '0fb375a4-cb55-4198-b0ce-a1ecbfff4ffa');
INSERT INTO `order_detail` VALUES (90, 2, 1, 1, '07c3e4da-bd7a-4779-89f3-87e22894abb3');

-- ----------------------------
-- Table structure for order_list
-- ----------------------------
DROP TABLE IF EXISTS `order_list`;
CREATE TABLE `order_list`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `table_id` int(0) NULL DEFAULT NULL,
  `start_time` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `end_time` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `total_money` double NULL DEFAULT NULL,
  `status` int(0) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_list
-- ----------------------------
INSERT INTO `order_list` VALUES ('05a5295c-d2af-45ce-b942-5bdd741a262d', 19, '2021年07月07日 10:30:21', '2021年07月07日 10:30:27', 45, 1);
INSERT INTO `order_list` VALUES ('07c3e4da-bd7a-4779-89f3-87e22894abb3', 39, '2021年07月08日 09:40:26', '2021年07月08日 09:40:30', 15, 1);
INSERT INTO `order_list` VALUES ('0fb375a4-cb55-4198-b0ce-a1ecbfff4ffa', 19, '2021年07月07日 15:08:51', NULL, 30, 0);
INSERT INTO `order_list` VALUES ('52901a74-804f-4980-8348-aa00e6c1e566', 10, '2021年07月07日 11:09:42', '2021年07月07日 13:43:17', 15, 1);
INSERT INTO `order_list` VALUES ('58b24c12-3211-4ee4-9775-6a1697201dff', 9, '2021年07月07日 10:32:31', '2021年07月07日 10:32:36', 75, 1);
INSERT INTO `order_list` VALUES ('642c439c-144d-4625-9550-71a9a454f19c', 9, '2021年07月07日 13:42:31', '2021年07月07日 13:42:38', 30, 1);
INSERT INTO `order_list` VALUES ('7c6c0ccd-7694-41c1-b3b7-61b3b283bde1', 9, '2021年07月07日 14:33:34', '2021年07月07日 14:33:41', 45, 1);
INSERT INTO `order_list` VALUES ('8bdd2f09-0d74-478f-aecc-cb10ad7b12be', 9, '2021年07月07日 14:38:00', NULL, 30, 0);
INSERT INTO `order_list` VALUES ('bd7c523d-0d5d-4da3-80ca-d439c6936b72', 9, '2021年07月07日 13:56:02', '2021年07月07日 13:56:07', 45, 1);
INSERT INTO `order_list` VALUES ('cb501a02-3c7a-4531-8a72-bcc94c890bff', 10, '2021年07月07日 14:38:35', NULL, 15, 0);
INSERT INTO `order_list` VALUES ('f5e7ea3d-0920-4aef-887b-07816731a94a', 19, '2021年07月07日 14:34:08', '2021年07月07日 14:34:11', 15, 1);

SET FOREIGN_KEY_CHECKS = 1;
