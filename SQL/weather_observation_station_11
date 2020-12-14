SELECT DISTINCT city
FROM station
WHERE NOT REGEXP_LIKE(LOWER(city), '^[aeiou]') OR NOT REGEXP_LIKE(LOWER(city), '[aeiou]$');
