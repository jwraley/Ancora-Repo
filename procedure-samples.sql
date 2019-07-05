/*
USE sakila
GO
CREATE PROCEDURE RentalCounts
@inventory_id int
AS
BEGIN
	SELECT * from rental
	WHERE 
	inventory_id = @inventory_id
END


USE sakila
GO
ALTER PROCEDURE RentalCounts
@inventory_id int
AS
BEGIN
	SET NOCOUNT ON
	SELECT * from rental
	WHERE 
	inventory_id = @inventory_id
	SET NOCOUNT ON;
END
exec RentalCounts 1

SELECT * from rental where inventory_id = 1


-- write procedure to change customer's address

select * from address

USE sakila
GO
ALTER PROCEDURE ModifyCustomerAddress
@address_id int,
@address varchar(50),
@address2 varchar(50),
@district varchar(10),
@city_id int,
@postal_code varchar(16)

AS
BEGIN
	UPDATE address 
		SET address = @address, address2 = @address2, district= @district, city_id = @city_id, postal_code = @postal_code
		WHERE address_id = @address_id;
	END
	
exec ModifyCustomerAddress 1, '123 Any St ', 'Apt 456', 1, 1, '76108';

SELECT * from address where address_id = 1


-- be sure to include all relevant fields
-- write a procedure to add a payment to the payment table
USE sakila
Go
CREATE PROCEDURE AddPayment
@customer_id int,
@staff_id tinyint,
@rental_id int,
@amount decimal(5,2)

AS
BEGIN 

	INSERT INTO payment (customer_id, staff_id, rental_id, amount, payment_date, last_update)
	VALUES	(@customer_id, @staff_id, @rental_id, @amount, GETDATE(), GETDATE() )
	END

exec AddPayment 1, 2, 3, 4.99;

select * from payment where customer_id = 1;




-- write a procedure to unlock a user's account
select * from customer
USE sakila
Go
ALTER PROCEDURE UnlockUser
@customer_id int
As
Begin

UPDATE Customer 
	set active = 1 where customer_id = @customer_id;
	End

	exec UnlockUser 16;

select * from customer where active = 0;

-- write a procedure to receive a rental return 

USE sakila
Go
CREATE PROCEDURE RentalReturn
@rental_id int
As
Begin

UPDATE Rental 
	set rental_date = GETDATE() where rental_id = @rental_id
	End

	exec RentalReturn 11496

	select * from rental  where rental_id = 11496

	*/