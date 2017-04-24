SELECT 
    ordernumber,
    SUM(quantityOrdered) AS itemsCount,
    SUM(priceeach) AS total
FROM
    orderdetails
GROUP BY ordernumber
HAVING total > 1000 AND itemsCount > 600;

SELECT 
    a.ordernumber, SUM(priceeach) total, status
FROM
    orderdetails a
        INNER JOIN
    orders b ON b.ordernumber = a.ordernumber
GROUP BY ordernumber
HAVING b.status = 'Shipped' AND total > 1500;

SELECT customerNumber,
       checkNumber,
    amount
FROM payments
WHERE amount > (
 SELECT AVG(amount) 
    FROM payments
);


DELIMITER $$
 
CREATE FUNCTION CustomerLevel(p_creditLimit double) RETURNS VARCHAR(10)
    DETERMINISTIC
BEGIN
    DECLARE lvl varchar(10);
 
    IF p_creditLimit > 50000 THEN
 SET lvl = 'PLATINUM';
    ELSEIF (p_creditLimit <= 50000 AND p_creditLimit >= 10000) THEN
        SET lvl = 'GOLD';
    ELSEIF p_creditLimit < 10000 THEN
        SET lvl = 'SILVER';
    END IF;
 
 RETURN (lvl);
END



SELECT 
    customerName, CustomerLevel(creditLimit)
FROM
    customers
ORDER BY customerName;



DELIMITER $$
 
CREATE PROCEDURE GetCustomerLevel(
    IN  p_customerNumber INT(11),
    OUT p_customerLevel  varchar(10)
)
BEGIN
    DECLARE creditlim DOUBLE;
 
    SELECT creditlimit INTO creditlim
    FROM customers
    WHERE customerNumber = p_customerNumber;
 
    SELECT CUSTOMERLEVEL(creditlim) 
    INTO p_customerLevel;
 
end