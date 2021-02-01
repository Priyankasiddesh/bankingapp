create database BankingApp;
create table user(id int primary key,username varchar(45),password varchar(45));
create table customer(custid int primary key,name varchar(45));
create table account(id int primary key,bankname varchar(45),branch varchar(45),accountholder int foriegn key references customer(custid),accounttype ENUM('savings','current','salary'),bankcode varchar(45));
create table transaction(id int primary key,custid int foriegn key references account(accountholder),date date,description varchar(45),references varchar(45),withdrawal int,deposit int,balance int);
