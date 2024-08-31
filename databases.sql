show databases;
use student_manage;
select * from students;
create database attendance;
use attendance;
create table students (ID int primary key auto_increment, Student_name varchar(55) not null, CNIC varchar(13), Email varchar(100));
ALTER TABLE students MODIFY COLUMN CNIC char(13);
ALTER TABLE students add column attendance boolean;
select* from students;
show databases;
ALTER TABLE students add column passkey varchar(255);
insert into students (passkey) values (1234);
select * from students;
show tables;
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL,
    role ENUM('Admin', 'Student') NOT NULL,
    profile_picture VARCHAR(100)
);
select * from users;
drop table users;
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id int,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL,
    role ENUM('Admin', 'Student') NOT NULL,
    profile_picture VARCHAR(100),
    foreign key (user_id) references students(ID)
);
drop table  users;
create database attendanceparttwo;
use attendanceparttwo;
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL,
    role ENUM('Admin', 'Student') NOT NULL,
    profile_picture VARCHAR(100)
);
CREATE TABLE attendance (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    date DATE,
    status ENUM('Present', 'Absent'),
    FOREIGN KEY (user_id) REFERENCES users(id)
);
CREATE TABLE leave_requests (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    request_date DATE,
    status ENUM('Pending', 'Approved', 'Rejected'),
    FOREIGN KEY (user_id) REFERENCES users(id)
);
select * from attendanceparttwo;
drop database attendanceparttwo;
use attendance;
alter table students add column role enum('Admin','Student') not null;
select * from students;


