-- SELECT ALL CITIES WITH DISTRICTS THAT START WITH RIO
-- select * from City where District like 'RIO%';
--SELECT ALL CITIES WITH POPULATION > 10000
--select * from city where Population > 10000
--GET THE TOP MOST POPULATION CITIES
--select * from City order by  Population desc
--GET THE LEAST MOST POPULATED CITIES
--select * from City order by Population asc;
--GET THE LIST OF ALL CITIES SORTED FIRST BY THE COUNTRY CODE IN ALPHABETICAL ORDER AND THEN THE POPULATION FROM LEAST TO GREATEST
--select * from City order by CountryCode, population;
--GET LIST OF ALL COUNTRIES ORDERED BY COUNTRY CODE
--select * from Country order by code;
--GET A LIST OF ALL COUNTRIES ORDERED BY CONTINENT AND SURFACE AREA
--select * from country order by Continent, SurfaceArea;
--GET LIST OF 15 MOST DENSE COUNTRIES < 45 AND gnp < 100
 /* Select * from Country
	  where LifeExpectancy < 60 AND
	  GNP < 100;  */
-- GET AN ALPHABETICAL LIST OF COUNTRIES AND THE 3 LETTER CAPITAL CODE
-- Select Name, Code from  Country order by Name;
--GET ALPHABETICAL LOCAL NAME OF COUNTRIES AND ITS GOVERNMENT FORM; CALL THE LOCAL NAME "NAME" AND THE GOVERNMENT FORM "GOV  ASTYPE"
-- SELECT lOCALNAME AS NAME, GovernmentForm AS 'Gov Type'  FROM country order by LocalName;
-- GET INDEPENDANCE YEAR AND LOCAL NAME ORDERED BY GNP;
--Select localname, indepyear from country order by GNP;
--GET A LIST OF ALL LANGUAGES IN THE COUNTRY LANGUAGE TABLE LISTED IN ALPHABETICAL ORDER; REMOVE ALL THE DUPLICATES
-- SELECT LIST OF ALL THE COUNTRY CODES IN COUNTRY LANGUAGE TABLE WITHOUT DUPLICATES
-- Select Distinct Language from countrylanguage order by language; 
--select Distinct countrycode from countrylanguage;
-- GET A LIST OF OFFICIAL LANGUAGES IN EACH COUNTRY ORDERED BY ITS PERCENTAGE OF USAGE
-- Select CountryCode, Language, Percentage from countrylanguage group by countrycode, language, Percentage order by CountryCode, Percentage;
--GET A LIST OF COUNTRIES THAT ARE NOT IN THE EU USE THE 2 DIGIT CODE NOT THE 3 DIGIT CODE
/* SELECT DISTINCT CODE2 FROM COUNTRY
     Where Code2 not in 
       ('AT', 'BE',  'BG', 'CY', 'CZ', 'DK', 'EE', 'FI', 'FR', 'DE', 'GR', 'HU', 'IE', 'IT',
        'LV', 'LT', 'LU', 'MT', 'NL', 'PL', 'PT', 'RO', 'SK', 'SI', 'ES', 'SE', 'GB');  */

-- GET LIST OF COUNTRIES ORDERED BY INDEPENDANCE YEAR; RENAME COLUMNT TO INDEPENDANCE
-- select code, name, continent, region, surfacearea, indepyear as Independance, population, lifeexpectancy, gnp, gnpold, localname from country order by IndepYear;
-- GET A LIST OF COUNTRIES WITH HIGHEST LIFE EXPECTANCY IN OCEANIA
--Select * from Country where continent = 'oceania' order by LifeExpectancy desc;
-- FIND ALL HEADS OF STATES THAT ARE NOT REPUBLIC GOVERNMENTS
-- Select Distinct HeadOfState from Country WHERE GovernmentForm <> 'REPUBLIC' and HeadOfState <> ' ';
--FIND THE SUM OF ALL COUNTRY SURFACE AREA GROUPED BY CONTINENT AND ORDERED FROM LEAST TO GREATEST
--Select continent, sum(surfacearea) as 'Surface Area Sum' from country group by Continent order by 'Surface Area Sum';
--GET A LIST OF THE TOP 10 HEADS OF STATE AND THE NUMBER OF COUNTRIES THAT PERSON RULES, ORDER FROM MOST TO LEAST
--select top 10 HeadofState from Country Where
select Distinct top 10HeadOfState, Count(headofstate) as 'Number of Countries' from Country where HeadOfState <> '' group by headofstate order by 'Number of Countries' desc;
