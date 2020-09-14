
DROP DATABASE if exists scdisk;
CREATE DATABASE scdisk;
USE scdisk;
CREATE TABLE user (
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    username CHAR(64),
    password CHAR(64),
    role TINYINT UNSIGNED
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;

# 如何设置编码和数据 https://blog.csdn.net/llllloj/article/details/53022156



