REM   Script: ACTIVITY 1,2,3,4,
REM   This activity is for 1,2,3,4,

CREATE TABLE Salesman(Salesman_id int PRIMARY KEY,Salesman_name varchar(20),Salesman_city varchar(20),commission int);

DESCRIBE Salesman


INSERT INTO Salesman VALUES (5001,'James Hoog','New York',15);

Salesman VALUES (5005,'Pit Alex','London', 11); 


Salesman VALUES (5006,'McLyon','Paris', 14); 


Salesman VALUES (5007,'Paul Adam','Rome', 13); 


Salesman VALUES (5003,'Lauson Hen','San Jose', 12);


INSERT ALL INTO Salesman VALUES (5002,'Nail Knite','Paris', 13);

Salesman VALUES (5005,'Pit Alex','London', 11); 


Salesman VALUES (5006,'McLyon','Paris', 14); 


Salesman VALUES (5007,'Paul Adam','Rome', 13); 


Salesman VALUES (5003,'Lauson Hen','San Jose', 12);


INSERT ALL INTO Salesman VALUES (5002,'Nail Knite','Paris', 13) 
INTO Salesman VALUES (5005,'Pit Alex','London', 11) 
INTO Salesman VALUES (5006,'McLyon','Paris', 14) 
INTO Salesman VALUES (5007,'Paul Adam','Rome', 13) 
INTO Salesman VALUES (5003,'Lauson Hen','San Jose', 12);

INSERT ALL INTO Salesman VALUES (5002,'Nail Knite','Paris', 13) 
INTO Salesman VALUES (5005,'Pit Alex','London', 11) 
INTO Salesman VALUES (5006,'McLyon','Paris', 14) 
INTO Salesman VALUES (5007,'Paul Adam','Rome', 13) 
INTO Salesman VALUES (5003,'Lauson Hen','San Jose', 12);

SELECT* FROM Salesman;

SELECT* FROM Salesman;

SELECT* FROM Salesman;

NSERT ALL INTO Salesman VALUES (5002,'Nail Knite','Paris', 13) 


INTO Salesman VALUES (5005,'Pit Alex','London', 11) 


INTO Salesman VALUES (5006,'McLyon','Paris', 14) 


INTO Salesman VALUES (5007,'Paul Adam','Rome', 13) 


INTO Salesman VALUES (5003,'Lauson Hen','San Jose', 12) 


SELECT 1 FROM Dual;

INSERT ALL INTO Salesman VALUES (5002,'Nail Knite','Paris', 13) 
INTO Salesman VALUES (5005,'Pit Alex','London', 11) 
INTO Salesman VALUES (5006,'McLyon','Paris', 14) 
INTO Salesman VALUES (5007,'Paul Adam','Rome', 13) 
INTO Salesman VALUES (5003,'Lauson Hen','San Jose', 12) 
SELECT 1 FROM Dual;

SELECT* FROM Salesman;

SELECT* FROM Salesman;

INSERT ALL INTO Salesman VALUES (5002,'Nail Knite','Paris', 13) 
INTO Salesman VALUES (5005,'Pit Alex','London', 11) 
INTO Salesman VALUES (5006,'McLyon','Paris', 14) 
INTO Salesman VALUES (5007,'Paul Adam','Rome', 13) 
INTO Salesman VALUES (5003,'Lauson Hen','San Jose', 12) 
SELECT 2 FROM Dual;

SELECT Salesman_id, Salesman_city From Salesman;

SELECT * FROM Salesman WHERE Salesman_city ='Paris';

SELECT Salesman_id, commission FROM Salesman WHERE Salesman_name ='Paul Adam';

ALTER TABLE Salesman 
ADD Grade int;

SELECT* FROM Salesman;

UPDATE TABLE Salesman 
SET Grade =100 WHERE Salesman_id IN (5001,5002,5005,5006,5007,5003);

UPDATE TABLE Salesman() 
SET Grade =100 WHERE Salesman_id IN (5001,5002,5005,5006,5007,5003);

UPDATE Salesman SET Grade =100;

SELECT* FROM Salesman;

