# My solution
# Runtime : 873ms

SELECT e.name as name , b.bonus as bonus
FROM Employee as e
LEFT JOIN Bonus as b
ON e.empId = b. empId
WHERE bonus <1000 OR bonus is null ;
