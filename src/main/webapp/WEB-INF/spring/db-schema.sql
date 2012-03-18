create table BOOKINGS(
  id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) CONSTRAINT BOOKINGS_PK PRIMARY KEY,
  username varchar(100),
  startDate varchar(8),
  endDate varchar(8),
  flight varchar(100),
  hotel varchar(100),
  car varchar(100)
);
