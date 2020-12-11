SELECT DISTINCT CITY
FROM STATION
WHERE REGEXP_LIKE(City, '^[AEIOU]'); -- this ^ is used to signalize that the word should begin with [AEIOU]