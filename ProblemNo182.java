// Duplicate Emails - LeetCode 182

SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
