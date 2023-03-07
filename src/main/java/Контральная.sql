-- task 7
CREATE DATABASE humanFriends;
USE HumanFriends;

-- task 8

CREATE TABLE Animals
(
	ID int auto_increment primary key,
	AnimalsType varchar(30)
);

INSERT INTO Animals(AnimalsType)
VALUES ('Pets'), ('PackAnimals');

CREATE TABLE Pets
(
	ID int auto_increment primary key,
	AnimalsTypeID int not null,
	PetsType varchar(30),
    FOREIGN KEY (AnimalsTypeID) REFERENCES Animals(Id) 
    ON DELETE CASCADE
    
);

INSERT INTO Pets(AnimalsTypeId, PetsType)
VALUES (
(SELECT ID FROM Animals WHERE AnimalsType='Pets'),
'Dogs'
),
(
(SELECT ID FROM Animals WHERE AnimalsType='Pets'),
'Cats'
),
(
(SELECT ID FROM Animals WHERE AnimalsType='Pets'),
'Hamsters'
);

SELECT * FROM PETS;

CREATE TABLE PackAnimals
(
	ID int auto_increment primary key,
	AnimalsTypeID int not null,
	PackAnimalsType varchar(30),
    FOREIGN KEY (AnimalsTypeID) REFERENCES Animals(Id) ON DELETE CASCADE
);

INSERT INTO PackAnimals(AnimalsTypeId, PackAnimalsType)
VALUES (
(SELECT ID FROM Animals WHERE AnimalsType='PackAnimals'),
'Horses'
),
(
(SELECT ID FROM Animals WHERE AnimalsType='PackAnimals'),
'Camels'
),
(
(SELECT ID FROM Animals WHERE AnimalsType='PackAnimals'),
'Donkeys'
);

SELECT * FROM PackAnimals;

CREATE TABLE Dogs
(
	ID int auto_increment primary key,
	PetsTypeID int not null,
	Name varchar(30),
    Birth date,
    Commands text,
	FOREIGN KEY (PetsTypeID) REFERENCES Pets(Id) ON DELETE CASCADE
);

CREATE TABLE Cats
(
	ID int auto_increment primary key,
	PetsTypeID int not null,
	Name varchar(30),
    Birth date,
    Commands text,
    FOREIGN KEY (PetsTypeID) REFERENCES Pets(Id) ON DELETE CASCADE
);

CREATE TABLE Hamsters
(
	ID int auto_increment primary key,
	PetsTypeID int not null,
	Name varchar(30),
    Birth date,
    Commands text,
    FOREIGN KEY (PetsTypeID) REFERENCES Pets(Id) ON DELETE CASCADE
);

CREATE TABLE Horses
(
	ID int auto_increment primary key,
	PackAnTypeID int not null,
	Name varchar(30),
    Birth date,
    Commands text,
    FOREIGN KEY (PackAnTypeID) REFERENCES PackAnimals(Id) ON DELETE CASCADE
);

CREATE TABLE Camels
(
	ID int auto_increment primary key,
	PackAnTypeID int not null,
	Name varchar(30),
    Birth date,
    Commands text,
	FOREIGN KEY (PackAnTypeID) REFERENCES PackAnimals(Id) ON DELETE CASCADE
);

CREATE TABLE Donkeys
(
	ID int auto_increment primary key,
	PackAnTypeID int not null,
	Name varchar(30),
    Birth date,
    Commands text,
	FOREIGN KEY (PackAnTypeID) REFERENCES PackAnimals(Id) ON DELETE CASCADE
);

-- task 9

INSERT INTO Dogs(PetsTypeID, Name, Birth, Commands)
VALUES (
(SELECT ID FROM Pets WHERE PetsType='Dogs'),
'Barry',
'2022-09-10',
'Come, Stay, Lay, Follow, Catch'
),
(
(SELECT ID FROM Pets WHERE PetsType='Dogs'),
'Moska',
'2021-06-15',
'Stay, Follow, Stop, Go'
),
(
(SELECT ID FROM Pets WHERE PetsType='Dogs'),
'Jhonn',
'2016-02-01',
'He know nothing'
);

SELECT * FROM Dogs;

INSERT INTO Cats(PetsTypeID, Name, Birth, Commands)
VALUES (
(SELECT ID FROM Pets WHERE PetsType='Cats'),
'Tom',
'2020-07-19',
'Lay on the sun, Eat'
),
(
(SELECT ID FROM Pets WHERE PetsType='Cats'),
'Borsch',
'2018-01-22',
null
),
(
(SELECT ID FROM Pets WHERE PetsType='Cats'),
'Baron',
'2023-01-01',
'Peee evrywhere'
);

SELECT * FROM Cats;

INSERT INTO Hamsters(PetsTypeID, Name, Birth, Commands)
VALUES (
(SELECT ID FROM Pets WHERE PetsType='Hamsters'),
'Garry',
'2018-08-29',
'Eat'
),
(
(SELECT ID FROM Pets WHERE PetsType='Hamsters'),
'Larry',
'2023-02-02',
null
),
(
(SELECT ID FROM Pets WHERE PetsType='Hamsters'),
'Kuska',
'2020-12-01',
'Run'
);

SELECT * FROM Hamsters;

INSERT INTO Horses(PackAnTypeID, Name, Birth, Commands)
VALUES (
(SELECT ID FROM PackAnimals WHERE PackAnimalsType='Horses'),
'Plotva',
'2011-08-20',
'Prrrrr, Lets go'
),
(
(SELECT ID FROM PackAnimals WHERE PackAnimalsType='Horses'),
'Wind',
'2013-04-10',
'Prrrrr, Lets go'
);

SELECT * FROM Horses;

INSERT INTO Camels(PackAnTypeID, Name, Birth, Commands)
VALUES (
(SELECT ID FROM PackAnimals WHERE PackAnimalsType='Camels'),
'Zorg',
'2019-03-09',
'Prrrrr, Lets go'
);

SELECT * FROM Camels;

INSERT INTO Donkeys(PackAnTypeID, Name, Birth, Commands)
VALUES (
(SELECT ID FROM PackAnimals WHERE PackAnimalsType='Donkeys'),
'Don',
'2011-06-20',
null
),
(
(SELECT ID FROM PackAnimals WHERE PackAnimalsType='Donkeys'),
'Jerry',
'2017-04-11',
null
);

SELECT * FROM Donkeys;

-- task 10

TRUNCATE Camels;

CREATE TABLE NewPackAnimals AS
SELECT * FROM Horses
UNION
SELECT * FROM Donkeys;

SELECT * FROM NewPackAnimals;

-- task 11

CREATE TABLE YoungAnimals AS
SELECT *, TIMESTAMPDIFF(MONTH, Birth, CURDATE()) AS Age FROM Dogs
WHERE ((Birth < CURDATE() - INTERVAL 12 MONTH) AND (Birth > CURDATE() - INTERVAL 36 MONTH))
UNION
SELECT *, TIMESTAMPDIFF(MONTH, Birth, CURDATE()) AS Age FROM Cats
WHERE ((Birth < CURDATE() - INTERVAL 12 MONTH) AND (Birth > CURDATE() - INTERVAL 36 MONTH))
UNION
SELECT *, TIMESTAMPDIFF(MONTH, Birth, CURDATE()) AS Age FROM Hamsters
WHERE ((Birth < CURDATE() - INTERVAL 12 MONTH) AND (Birth > CURDATE() - INTERVAL 36 MONTH))
UNION 
SELECT *, TIMESTAMPDIFF(MONTH, Birth, CURDATE()) AS Age FROM NewPackAnimals
WHERE ((Birth < CURDATE() - INTERVAL 12 MONTH) AND (Birth > CURDATE() - INTERVAL 36 MONTH));

SELECT * FROM YoungAnimals;

-- task 12

CREATE TABLE AllAnimals AS
SELECT * FROM Dogs
UNION
SELECT * FROM Cats
UNION
SELECT * FROM Hamsters
UNION
SELECT * FROM NewPackAnimals;


SELECT * FROM AllAnimals;




