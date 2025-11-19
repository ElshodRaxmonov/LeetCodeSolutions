# My solution
# Runtime : 5352ms

SELECT e.name
FROM Employee as e
RIGHT JOIN Employee as m
ON e.id = m.managerId
GROUP BY e.id
HAVING COUNT(e.id) >= 5 ;
