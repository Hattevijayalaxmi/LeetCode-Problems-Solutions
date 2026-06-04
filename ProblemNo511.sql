-- Game Play Analysis 1 - Leetcode 511
SELECT
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;
