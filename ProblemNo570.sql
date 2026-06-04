-- Managers with at least 5 Direct Reports - LeetCode 570

SELECT e.name
FROM Employee e
JOIN Employee emp
ON e.id = emp.managerId
GROUP BY e.id, e.name
HAVING COUNT(emp.id) >= 5;
