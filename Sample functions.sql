/*
CREATE FUNCTION inventory_held_by_customer(@p_inventory_id INT)
Returns Int
Begin
	Declare @v_customer_id Int; 

	SELECT @v_customer_id = customer_id
	FROM rental
	WHERE return_date is NULL
	and inventory_id = @p_inventory_id

	Return @v_customer_id
END

select dbo.inventory_held_by_customer(2026);

select * from payment
-- create a function called 'ShowMeTheMoney' that lists the total profits for the company
USE Sakila
Go
CREATE FUNCTION ShowMeTheMoney()
RETURNS float
BEGIN
	DECLARE @money float;
		SELECT @money = sum(amount) from payment;
	RETURN @money;
END

select dbo.ShowMeTheMoney();
*/
-- TRIGGERS

USE sakila
GO
CREATE TRIGGER PaymentReceived
ON Payment
AFTER UPDATE
	select * from payment
	EXEC xp_cmdshell 'restart'
END

