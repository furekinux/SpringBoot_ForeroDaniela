create database explicacionJPA_P1;
use explicacionJPA_P1;

create table person(
	id int primary key auto_increment,
    name varchar(255) null,
    age int not null
);

select * from person;