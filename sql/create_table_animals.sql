CREATE TABLE Animals (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name CHAR(30),
    commands TEXT,
    birthDate DATE,
    age TEXT,
    animal_type ENUM('cat','dog','hamster', 'horse_and_donkey', 'young_animals') NOT NULL
);

INSERT INTO Animals (name, commands, birthDate, age, animal_type)
SELECT name, commands, birthDate, countAge(birthDate), 'dog'
FROM Dog;

INSERT INTO Animals (name, commands, birthDate, age, animal_type)
SELECT name, commands, birthDate, countAge(birthDate), 'cat'
FROM Cat;

INSERT INTO Animals (name, commands, birthDate, age, animal_type)
SELECT name, commands, birthDate, countAge(birthDate), 'hamster'
FROM Hamster;

INSERT INTO Animals (name, commands, birthDate, age, animal_type)
SELECT name, commands, birthDate, countAge(birthDate), 'horse_and_donkey'
FROM HorseAndDonkey;

INSERT INTO Animals (name, commands, birthDate, age, animal_type)
SELECT name, commands, birthDate, countAge(birthDate), 'young_animals'
FROM YoungAnimals;