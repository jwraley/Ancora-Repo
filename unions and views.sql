--get a list of the first name, last name, and email
-- of the customers and the staff

/*
select first_name, last_name, email from customer;

select * from customer;

select * from staff;

select first_name, last_name, address, city, postal_code, email 
from customer join address on 
customer.address_id = address.address_id join city on city.city_id = address.city_id
union
select first_name, last_name, address, city, postal_code, email 
from staff join address on 
staff.address_id = address.address_id join city on city.city_id = address.city_id;

select * from address
select * from city

select * from actor
select * from city
select first_name from actor
union
select city from city;
*/

create view all_people as
select first_name, last_name, address, city, postal_code, email 
from customer join address on 
customer.address_id = address.address_id join city on city.city_id = address.city_id
union
select first_name, last_name, address, city, postal_code, email 
from staff join address on 
staff.address_id = address.address_id join city on city.city_id = address.city_id;

select * from all_people