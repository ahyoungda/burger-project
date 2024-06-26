create
user 'burgerland'@'%' identified by 'burgerland';

use
mysql;
select *
from user;

create database burgerdb;

show databases;

grant all privileges on burgerdb.* to 'burgerland'@'%';

show grants for 'burgerland'@'%';

use burgerdb