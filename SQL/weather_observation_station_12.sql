SELECT DISTINCT city
FROM station
WHERE NOT REGEXP_LIKE(LOWER(city), '^[aeiou]') AND NOT REGEXP_LIKE(LOWER(city), '[aeiou]$');
