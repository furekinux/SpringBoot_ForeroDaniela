create database restaurant_management;
use restaurant_management;

create table plato(
	id int primary key auto_increment,
    nombre varchar(100),
    precio decimal(10,2),
    disponibilidad boolean
);

create table mesa(
	id int primary key auto_increment,
    numero_mesa int unique,
    ocupada boolean
);