DROP TABLE IF EXISTS card;
DROP TABLE IF EXISTS student;


  create table student (id serial primary key,
name varchar(255),
email varchar(255),
mobile_number bigint,
age integer,
country varchar);

CREATE TABLE card (
    id SERIAL PRIMARY KEY,
    student_id INT UNIQUE,
    created_on date,
    updated_on date,
    card_status varchar(255),
    FOREIGN KEY (student_id) REFERENCES student(id) ON DELETE CASCADE ON UPDATE CASCADE 
);