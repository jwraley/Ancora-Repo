--select * from address;
/*
select address, city_id,
	case when city_id = '300' then 'Itasca'
         when city_id = '576' then 'Los Angeles'
		 when city_id = '463' then 'Fort Worth'
		 else 'Unknown'
	end
	from address;

--	select distinct city_id from address;

select rental_id, payment_date as payment_date, last_update 
from payment 
order by payment_date desc;

select rental_id, payment_date, last_update, DATEDIFF(second, payment_date, last_update ) 
from payment 
order by payment_date desc;
-- create a due date by adding 3 days to the payment date
select rental_id, payment_date, 
DATEADD(day, 3, payment_date) as 'Due Date'  
from payment;


select FORMAT (getdate(), 'dd-MM-yy') as date;

select FORMAT (getdate(), 'MMMM') as date;

select FORMAT (getdate(), 'HH:mm:ss') as date;

select FORMAT (getdate(), 'yyyy MMM-dd HH:mm:ss') as date;

select getdate();

*/
select
DATEDIFF (s, '1970-01-01 00:00:00',
'2017-11-20 23:12:02.000') as EpochTimeStamp;
-- 1970-01-01 is 'epoch date'(date unix created)