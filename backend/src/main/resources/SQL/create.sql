create database if not exists bank;
use bank;

create table addresses(
    id int primary key auto_increment,
   state varchar(120) not null,
   country varchar(120) not null,
   postal_code varchar(10) not null
   
);

create table customers(
    id int primary key auto_increment,
    name varchar(256) not null,
    social_security_number varchar(256) not null,
    phone_no varchar(32) not null,
    address_id int not null,
    age smallint not null,
    foreign key (address_id) references addresses(id)

);

create table accounts(
id int primary key auto_increment,
account_no varchar(256) not null,
customer_id int not null,
created_at timestamp not null,
balance decimal not null,
foreign key (customer_id) references customers(id)
);

create table transactions(
id int primary key auto_increment,
source_account_id int not null,
destination_account_id int not null,
amount decimal not null,
created_at timestamp not null,
foreign key (source_account_id) references accounts(id),
foreign key (destination_account_id) references accounts(id)
);