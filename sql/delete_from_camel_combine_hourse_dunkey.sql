TRUNCATE Camel;

INSERT INTO Horse (name, commands, birthDate)
SELECT name, commands, birthDate
FROM Dunkey;