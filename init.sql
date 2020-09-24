-- # 如何设置编码和数据 https://blog.csdn.net/llllloj/article/details/53022156


DROP DATABASE IF EXISTS scdisk_user;
CREATE DATABASE scdisk_user DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE scdisk_user;
CREATE TABLE user
(
    id            INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    username      CHAR(64),
    password      CHAR(64),
    role          TINYINT UNSIGNED,
    create_time   DATETIME,
    modified_time DATETIME,
    is_delete     TINYINT
) ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8mb4
  AUTO_INCREMENT = 1 COMMENT ='用户基本信息表';

INSERT INTO scdisk_user.user(id, username, password, role, create_time, modified_time, is_delete)
VALUES (1, 'LiZeC', '123', 0, NOW(), NOW(), 0);
INSERT INTO scdisk_user.user(id, username, password, role, create_time, modified_time, is_delete)
VALUES (2, 'GGBoy', '123', 0, NOW(), NOW(), 0);
INSERT INTO scdisk_user.user(id, username, password, role, create_time, modified_time, is_delete)
VALUES (3, '中文用户', '123', 0, NOW(), NOW(), 0);



DROP DATABASE IF EXISTS scdisk_file;
CREATE DATABASE scdisk_file DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE scdisk_file;
CREATE TABLE scdisk_file.file
(
    id            INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    filename      CHAR(64),
    create_time   DATETIME,
    modified_time DATETIME,
    is_delete     TINYINT
) ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8mb4
  AUTO_INCREMENT = 1 COMMENT ='文件基本测试';




