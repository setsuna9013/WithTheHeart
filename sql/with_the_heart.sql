DROP DATABASE IF EXISTS with_the_heart;

CREATE DATABASE with_the_heart;

USE with_the_heart;

CREATE TABLE reservation(
stock BOOLEAN DEFAULT FALSE,
daytime DATETIME);

CREATE TABLE admin(
name VARCHAR(16) NOT NULL,
password VARCHAR(16) NOT NULL);

INSERT INTO reservation(daytime)VALUES
(20160801120000),(20160801130000);

INSERT INTO admin(name,password)VALUES
("testuser","test");
