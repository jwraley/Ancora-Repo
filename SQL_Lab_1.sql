--select * from Country;
--select * from Country where region = 'Caribbean';
--select * from Country where Population between 6000000 and 12000000
--select * from city where name like 'f%';
--select name, LocalName from country where LocalName <> name;
--select population, name from city where name <>'f%o' order by Population desc;
--select * from city where CountryCode = 'USA' and Population > 1000000 order by population desc;
-- select * from countrylanguage where language = 'English' or language = 'Spanish'
--select * from countrylanguage where language = 'english' or percentage > 5.0 order by percentage;
--select * from city where CountryCode not like 'USA';
--select * from countrylanguage where language = 'english' or percentage > 5.0 order by CountryCode, percentage;
--select * from country where Population > 2000000 and SurfaceArea < 50000 order by SurfaceArea;
--select distinct headofstate, name from country;
--select TOP 10 * from city order by Population desc;
--SELECT * FROM country WHERE region in ('Caribbean', 'North America', 'South America');
SELECT * from city
WHERE CountryCode in 
(
SELECT code from country where LifeExpectancy > 80
);