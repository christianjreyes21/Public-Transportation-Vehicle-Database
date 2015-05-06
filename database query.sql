CREATE DATABASE PUV_DATABASE;
USE PUV_DATABASE;
CREATE TABLE USERACC (user VARCHAR(30), pw VARCHAR(30));
CREATE TABLE PUVENTRY (plateNumber VARCHAR(30), route VARCHAR(50), operatorName VARCHAR(30), driverName VARCHAR(30));



delimiter $$
CREATE PROCEDURE getUser(IN userReceived VARCHAR(30))
	BEGIN
		SELECT user,pw FROM USERACC WHERE user=userReceived;
	END$$
DELIMITER ;

delimiter $$
CREATE PROCEDURE setUser(IN user VARCHAR(30), IN pass VARCHAR(30))
	BEGIN
		INSERT INTO USERACC VALUES (user,pass);
	END$$
DELIMITER ;

delimiter $$
CREATE PROCEDURE getPUV(IN plateNumberReceive VARCHAR(30))
	BEGIN
		SELECT plateNumber,route,operatorName,driverName FROM USERACC WHERE plateNumberReceive=plateNumber;
	END$$
DELIMITER ;

delimiter $$
CREATE PROCEDURE setPUV(IN plateNumberReceive VARCHAR(30), IN routeReceive VARCHAR(50), IN operatorName VARCHAR(30), IN driverNameReceive VARCHAR(30))
	BEGIN
		INSERT INTO PUVENTRY VALUES (plateNumberReceive,routeReceive,operatorName,driverNameReceive);
	END$$
DELIMITER ;

SELECT * FROM USERACC;

CALL getUser("chrissan1tos");