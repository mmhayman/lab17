1. SELECT * FROM customers;
        2. SELECT DISTINCT country FROM customers;
        3. SELECT *FROM Customers WHERE CustomerID LIKE 'BL%'
        4. SELECT * FROM Orders LIMIT 100;

        5. SELECT * FROM customers WHERE PostalCode = '1010' ;
        SELECT * FROM customers WHERE PostalCode = '3012' ;
        SELECT * FROM customers WHERE PostalCode = '12209' ;
        SELECT * FROM customers WHERE PostalCode = '05023' ;

        6. SELECT * FROM orders WHERE ShipRegion IS NOT NULL ;
        7. SELECT * FROM customers ORDER BY Country , City;
        8. INSERT INTO Customers (CustomerID, CompanyName, ContactName, ContactTitle, Address, City, Region, PostalCode, Country, Phone, Fax)
        VALUES ('tomc', '2by2', 'John Smith' , 'IT', ' 123 Main street' , 'Detroit', 'MI', '44990' , 'USA' , '(810)-434-9999', '(111)-333-4444' ) ;
        9. UPDATE Orders SET ShipRegion = 'EuroZone' WHERE ShipCountry = 'France';
        10.DELETE FROM `Order Details` WHERE Quantity = 1;
        11. SELECT AVG (Quantity) FROM `Order Details`;
        SELECT MAX (Quantity) FROM `Order Details`;
        SELECT MIN (Quantity) FROM `Order Details`;
        12. SELECT AVG (Quantity) FROM `Order Details` GROUP BY OrderID;
        SELECT MAX (Quantity) FROM `Order Details` GROUP BY OrderID;
        SELECT MIN (Quantity) FROM `Order Details` GROUP BY OrderID;
        13. SELECT CustomerID FROM orders WHERE OrderID = 10290;
        14. SELECT Customers.CustomerID FROM Customers INNER JOIN Orders ON Customers.CustomerID = Orders.CustomerID;
        SELECT Customers.CustomerID FROM Customers RIGHT JOIN Orders ON Customers.CustomerID = Orders.CustomerID;
        SELECT Customers.CustomerID FROM Customers LEFT JOIN Orders ON Customers.CustomerID = Orders.CustomerID;
        15. SELECT firstName FROM Employees WHERE ReportsTo IS NULL;
        16. SELECT firstName FROM Employees WHERE ReportsTo = 2;

