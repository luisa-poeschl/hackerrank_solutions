SELECT DISTINCT city
FROM station
WHERE REGEXP_LIKE(city, '[aeiou]$'); -- the $ is used to signalize that a,e,i,o,u should be at the end of the word