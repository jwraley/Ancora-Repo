-- insert into actor ( first_name, last_name)  values ( 'Adrian', 'Brody');

-- select * from actor where first_name = 'Adrian';

-- insert into actor (first_name, last_name) values ('Bob', ' ');

-- select * from actor where first_name = 'Bob';
 -- insert into address (address, district, city_id, postal_code, phone)
 -- values ('1600 Pennsylvania Avenue', 'Dallas', '135', '10000', '123-234-3456');

-- select * from city where city like 'da%'

-- select * from address where postal_code = '10000';

BEGIN TRAN T1;
Update Actor set first_name = 'Bill';
GO

rollback;

select * from actor


insert into rental (rental_date, inventory_id, customer_id, return_date, staff_id, last_update) values
('2019-03-01 00:00:00', 1, 1, '2019-03-02 00:00:00', 1, GETDATE()); 

select * from inventory

update staff set first_name = 'Steven' where first_name = 'Mike';

update staff set email = 'steven123@gmail.com' where last_name = 'Stephens';

select * from staff where last_name = 'Stephens';

select * from inventory