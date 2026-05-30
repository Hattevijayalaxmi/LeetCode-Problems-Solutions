-- Replace Employee ID with the unique identifier - LeetCode 1378

SELECT eu.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id;
