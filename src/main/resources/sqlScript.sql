-- Table: Cars
CREATE TABLE public.cars
(
	id integer NOT NULL GENERATED ALWAYS AS IDENTITY,
	model character varying,
	price float,
    PRIMARY KEY (id)
);

