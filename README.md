To get this project up and running you will require a customers table in the postgres database. 

Here is the SQL to run to create it.

CREATE TABLE public.customers (
	customer_ref varchar(255) NOT NULL,
	customer_name varchar(255) NULL,
	address_line_1 varchar(255) NULL,
	address_line_2 varchar(255) NULL,
	town varchar(255) NULL,
	county varchar(255) NULL,
	country varchar(255) NULL,
	postcode varchar(50) NULL,
	CONSTRAINT customers_pk PRIMARY KEY (customer_ref)
);

The project uses JOOQ to scaffold any DB changes. 
