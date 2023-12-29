CREATE TABLE YoungAnimals (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name CHAR(30),
    commands TEXT,
    birthDate DATE,
    age TEXT
);


DROP FUNCTION IF EXISTS countAge;


DELIMITER $$
CREATE FUNCTION countAge(birthDate DATE)
RETURNS TEXT
DETERMINISTIC
BEGIN
    DECLARE result TEXT DEFAULT '';
	SET result = CONCAT(
            TIMESTAMPDIFF(YEAR, birthDate, CURDATE()),
            ' years ',
            TIMESTAMPDIFF(MONTH, birthDate, CURDATE()) % 12,
            ' month'
        );
	RETURN result;
END $$
DELIMITER ;



INSERT INTO YoungAnimals (name, commands, birthDate, age)
SELECT name, commands, birthDate, countAge(birthDate)
FROM Dog
WHERE TIMESTAMPDIFF(YEAR, birthDate, CURDATE()) BETWEEN 1 AND 3
UNION ALL
SELECT name, commands, birthDate, countAge(birthDate)
FROM Cat
WHERE TIMESTAMPDIFF(YEAR, birthDate, CURDATE()) BETWEEN 1 AND 3
UNION ALL
SELECT name, commands, birthDate, countAge(birthDate)
FROM Hamster
WHERE TIMESTAMPDIFF(YEAR, birthDate, CURDATE()) BETWEEN 1 AND 3
UNION ALL
SELECT name, commands, birthDate, countAge(birthDate)
FROM HorseAndDonkey
WHERE TIMESTAMPDIFF(YEAR, birthDate, CURDATE()) BETWEEN 1 AND 3;