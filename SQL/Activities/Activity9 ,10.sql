REM   Script: ACTIVITY 9 and ACTIVITY 10
REM   Activity 9 for Join
Activity 10 for subquery and corelated query

Create table customers (  
    customer_id int primary key, customer_name varchar(32),  
    city varchar(20), grade int, salesman_id int);

INSERT ALL  
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)  
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)  
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)  
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)  
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)  
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)  
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)  
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)  
SELECT 1 FROM DUAL;

SELECT * FROM customers;

create table orders(  
    order_no int primary key, purchase_amount float, order_date date,  
    customer_id int, salesman_id int);

INSERT ALL  
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)  
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)  
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)  
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)  
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)  
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)  
SELECT 1 FROM DUAL;

SELECT * FROM orders;

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)  
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)  
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)  
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)  
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

CREATE TABLE salesman (  
    salesman_id int,  
    salesman_name varchar2(32),  
    salesman_city varchar2(32),  
    commission int  
);

SELECT * FROM salesman;

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)  
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)  
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT a.customer_name,a.city,b.salesman_name,b.salesman_city  
    FROM customer a INNER JOIN salesman b ON a.salesman_id= b.salesman_id;

SELECT a.customer_name,a.city,b.salesman_name,b.salesman_city  
    FROM customer a INNER JOIN salesman b ON a.salesman_id= b.salesman_id;

SELECT a.customer_name,a.city,b.salesman_name,b.salesman_city  
    FROM customer.a INNER JOIN salesman.b ON a.salesman_id= b.salesman_id;

SELECT a.customer_name,a.city,b.salesman_name,b.salesman_city  
    FROM customer a INNER JOIN salesman b ON a.salesman_id= b.salesman_id;

SELECT a.customer_name,a.city,b.salesman_name,b.commission  
    FROM customer a INNER JOIN salesman b ON a.salesman_id= b.salesman_id;

SELECT customers.customer_name,customers.city,salesman.salesman_name,salesman.commission, salesman.salesman_city 
    FROM customers INNER JOIN salesman ON customers.salesman_id= salesman.salesman_id;

SELECT customers.customer_name,customers.city,salesman.salesman_name,salesman.commission, salesman.salesman_city,salesman.salesman_id 
    FROM customers INNER JOIN salesman ON customers.salesman_id= salesman.salesman_id;

SELECT customers.customer_name,customers.grade,salesman.salesman_name. salesman.salesman_id FROM customers INNER JOIN salesman 
ON customers.salesman_id= salesman.salesman_id WHERE customers.grade<300 ORDER BY customer_name;

SELECT customers.customer_name,customers.grade,salesman.salesman_name. salesman.salesman_id FROM customers LEFT OUTER JOIN salesman 
ON customers.salesman_id= salesman.salesman_id WHERE customers.grade<300 ORDER BY customer_name;

SELECT customers.customer_name,customers.grade,salesman.salesman_name. salesman.salesman_id FROM customers  
LEFT OUTER JOIN salesmanON customers.salesman_id= salesman.salesman_id WHERE customers.grade<300  
ORDER BY customer_name;

SELECT customers.customer_name,customers.grade,salesman.salesman_name. salesman.salesman_id FROM customers  
LEFT OUTER JOIN salesman ON customers.salesman_id= salesman.salesman_id WHERE customers.grade<300  
ORDER BY customer_name;

SELECT customers.customer_name,customers.grade,salesman.salesman_name,salesman.salesman_id FROM customers  
LEFT OUTER JOIN salesman ON customers.salesman_id= salesman.salesman_id WHERE customers.grade<300  
ORDER BY customer_name;

SELECT customers.customer_name,salesman.salesman_name,salesman.commission FROM customers INNER JOIN salesman ON  
    customers.salesman_id= salesman.salesman_id WHERE salesman.commission>12;

SELECT customers.customer_name,salesman.salesman_name,salesman.commission FROM customers LEFT OUTER JOIN salesman ON  
    customers.salesman_id= salesman.salesman_id WHERE salesman.commission>12;

SELECT customers.customer_name,salesman.salesman_name,salesman.commission FROM customers INNER JOIN salesman ON  
    customers.salesman_id= salesman.salesman_id WHERE salesman.commission>12;

SELECT orders.order_no, orders.purchase_amount, orders.order_date,customers.customer_name, 
salesman.salesman_name,salesman.commission FROM orders INNER JOIN customers ON orders.customer.id=customers.customer.id 
INNER JOIN salesman ON customers.customer_id=salesman.salesman_id;

SELECT orders.order_no, orders.purchase_amount, orders.order_date,customers.customer_name, 
salesman.salesman_name,salesman.commission FROM orders INNER JOIN customers ON orders.customer.id=customers.customer_id 
INNER JOIN salesman ON customers.customer_id=salesman.salesman_id;

SELECT orders.order_no, orders.purchase_amount, orders.order_date,customers.customer_name, 
salesman.salesman_name,salesman.commission FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id 
INNER JOIN salesman ON customers.customer_id=salesman.salesman_id;

SELECT orders.order_no, orders.purchase_amount, orders.order_date,customers.customer_name, 
salesman.salesman_name,salesman.commission FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id;

SELECT orders.order_no, orders.purchase_amount, orders.order_date,customers.customer_name, 
salesman.salesman_name FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id;

SELECT orders.order_no, orders.purchase_amount, orders.order_date,customers.customer_name, 
FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id;

SELECT orders.order_no, orders.purchase_amount, orders.order_date,customers.customer_name  
    FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id;

SELECT orders.order_no, orders.purchase_amount, orders.order_date,customers.customer_name;customers.customer_id 
    FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id;

SELECT orders.order_no, orders.purchase_amount, orders.order_date,customers.customer_name;customers.customer_id 
FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id;

SELECT orders.order_no, orders.purchase_amount, orders.order_date, customers.customer_name; customers.customer_id 
FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id;

SELECT orders.order_no, orders.purchase_amount, orders.order_date, customers.customer_name; customers.customer_id FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id;

SELECT orders.order_no, orders.purchase_amount, orders.order_date, customers.customer_name;

customers.customer_id FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id;


SELECT orders.order_no, orders.purchase_amount, orders.order_date, customers.customer_name;

FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id;


SELECT orders.order_no, orders.purchase_amount, orders.order_date, customers.customer_name;

FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id;


SELECT orders.order_no, orders.purchase_amount, orders.order_date, customers.customer_name 
FROM orders INNER JOIN customers ON orders.customer_id = customers.customer_id;

SELECT orders.order_no, orders.purchase_amount, orders.order_date, customers.customer_name, customers.customer_id 
FROM orders INNER JOIN customers ON orders.customer_id = customers.customer_id;

INSERT INTO salesman VALUES(3005, 'Poo lii', 'London', 16);

INSERT INTO salesman VALUES(3002, 'Pyy loo', 'London', 17);

SELECT * FROM salesman;

SELECT orders.order_no, orders.purchase_amount, orders.order_date,customers.customer_name, 
salesman.salesman_name,salesman.commission, salesman.salesman_id FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id 
INNER JOIN salesman ON customers.customer_id=salesman.salesman_id;

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders 
WHERE salesman_id=(SELECT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders 
WHERE salesman_id=(SELECT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders Where salesman_id IN (SELECT salesman_id from Salesman WHERE salesman_city='New York');

INSERT INTO salesman VALUES(3089, 'Klp Lo', 'Paris', 16);

INSERT INTO salesman VALUES(3072, 'Loo Kii', 'Paris', 17);

SELECT * FROM salesman;

SELECT * FROM orders Where salesman_id IN (SELECT salesman_id from Salesman WHERE salesman_city='New York');

SELECT * FROM orders Where salesman_id IN (SELECT salesman_id from Salesman WHERE salesman_city='Paris');

SELECT grade, COUNT (customer_id) FROM customers  
HAVING grade > (SELECT AVG (garde) from customers WHERE City='New York');

SELECT grade, COUNT (customer_id) FROM customers  
HAVING grade > (SELECT AVG (grade) from customers WHERE City='New York');

SELECT grade, COUNT (customer_id) FROM customers GROUP BY grade 
HAVING grade > (SELECT AVG (grade) from customers WHERE City='New York');

SELECT * FROM orders WHERE salesman_id IN  
    (SELECT salesman_id FROM salesman WHERE commission= (SELECT MAX(Commission) FROM salesman ));

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders WHERE salesman_id IN  
    (SELECT salesman_id FROM salesman WHERE commission= (SELECT MAX(Commission) FROM salesman ));

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders WHERE salesman_id IN  
    (SELECT salesman_id FROM salesman WHERE commission= (SELECT MIN(Commission) FROM salesman ));

