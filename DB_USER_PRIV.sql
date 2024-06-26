create user 'ohgiraffers'@'%' identified by 'ohgiraffers';

-- 2) 계정이 추가된 것을 확인하기
use mysql;
select * from user;

-- 데이터베이스 생성하기
-- 1) 데이터베이스 생성
create database burgerdb;

SHOW databases;

grant all privileges on burgerdb.* to 'ohgiraffers'@'%';

show grants for 'ohgiraffers'@'%';


use burgerdb;