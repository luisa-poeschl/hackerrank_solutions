SELECT city, LENGTH(city)
FROM (
    SELECT city
    FROM station
    ORDER BY LENGTH(city) ASC, city ASC)
WHERE ROWNUM = 1;

SELECT city, LENGTH(city)
FROM (
    SELECT city
    FROM station
    ORDER BY LENGTH(city) DESC, city ASC)
WHERE ROWNUM = 1;