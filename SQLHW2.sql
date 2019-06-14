-- Select all cities in the BGR country code and not in the District of England.
-- select * from city where CountryCode = 'BGR' and District <> 'England';
-- note there are no BGR cities with district England, but I believe this code would work

-- Select all cities with districts that start with 'al-'.
-- select * from City where district like 'al%';


-- Select all cities with Populations between 1 and 2 million.
-- select * from city where Population >= 1000000 and Population <= 2000000;

-- Select all cities with Populations between 1 and 2 million that are in the EGY country code.
-- select * from city where CountryCode = 'EGY' -- and Population >= 100000 and Population <= 2000000;
-- CHANGED TO BETWEEN 100,000 AND 2 MIL AS BIGGEST CITY IS LESS THAN 1 MIL

-- Get the total population of the EGY cities.
-- SELECT SUM(POPULATION) as "Total Population of EGY" FROM CITY Where CountryCode = 'EGY';

-- Get the average population of the PHL and HKG cities.
-- select countrycode, AVG(population) as 'Average Population' from city where CountryCode in('HKG', 'PHL') group by CountryCode;

-- Get list of all cities sorted first by the country code in alphabetical order and then by the population from greatest to least.
-- select name, countrycode, population from City order by CountryCode, population desc;

-- Get a list of the Minimum, Maximum and Average population of each country code ordered by country code.  Rename the columns to something sensible.
-- select CountryCode, MIN(population) as Min, MAX(population) as Max, AVG(population) as AVG from City group by CountryCode order by CountryCode;

-- Get list of all country names that end in  'an' ordered by country code.
-- select * from country where name like '%an';


-- Get list of all countries ordered by continent and sorted by surface area.
--select Name, Continent, SurfaceArea from country order by Continent, SurfaceArea;

-- Get list of countries with life expectancy > 60 and GNP > 100
-- Select Name, LifeExpectancy, GNP from Country where LifeExpectancy > 60 and GNP > 100

-- Get an alphabetical list of countries where the GNP is not the same as the GNPOld
-- Select * from Country where GNP <> GNPOld order by Name;

-- Get alphabetical list of country names and  3 letter capitol code.
--select name, capital from Country order by Name;

-- Get list of all government forms in the country language table listed in alphabetical order; determine the total land area of each.
--select GovernmentForm, sum(SurfaceArea) as "Total SA" from country join countrylanguage on country.Code = countrylanguage.CountryCode group by GovernmentForm;


-- Get list of all un-official languages in each country code ordered by it's percentage of usage.
-- select CountryCode, Language, Percentage, IsOfficial from CountryLanguage where IsOfficial = 'F' order by CountryCode, percentage;


-- Get list of languages that are not officially in the EU; join this table to the country table by country code and then add the population and GNP.
/*
select country.code, country.population, country.GNP, countrylanguage.language from countrylanguage 
join country on countrylanguage.CountryCode = country.Code  where countrylanguage.Language  Not in 
( 'Bulgarian', 'Croatian', 'Czech',  'Danish', 'Dutch', 'English', 'Estonian', 'Finnish', 'French', 'German', 'Greek', 'Hungarian',
'Irish', 'Italian', 'Latvian', 'Lithuanian', 'Maltese', 'Polish', 'Portuguese', 'Romanian', 'Slovak', 'Slovene', 'Spanish', 'Swedish') 
 
 */

-- Get list of countries ordered by independance year; rename column to Independance.
-- select name, IndepYear as 'Independance' from country order by 'Independance';

-- Get a list of countries who's name is not the same as it's local name; order table by population.
-- select * from Country where Name <> LocalName order by Population;

-- Find list of continents that have Republic governments; order them by continent.
-- select Distinct Continent from Country  where GovernmentForm = 'Republic' order by Continent;

-- Find all heads of state that have characters outisde of [A-Z] and [a-z].
 -- Select name, HeadOfState from Country where HeadOfState LIKE  '%[^a-Z0-9 \.]%'

-- Find the sum of all contenent surface area grouped by continent and ordered from greatest to least.
-- select Continent, sum(SurfaceArea) as 'Total S.A.' from Country group by Continent order by 'Total S.A.' desc;

-- Get a list of each countryform of government that does not have an Independance day; make sure there are no repeated forms of government; get a count of countries that have each form.
/*
select GovernmentForm, count(*) as 'Count' from country where code in
(select code from Country where IndepYear is null) group by GovernmentForm;
*/
