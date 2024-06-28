DROP TABLE if exists `menu` cascade ;

CREATE TABLE if not exists `menu`
(
    `menu_code`    INT AUTO_INCREMENT COMMENT '메뉴코드',
    `menu_name`    VARCHAR(255) NOT NULL COMMENT '메뉴명',
    `menu_price`    INTEGER(255) NOT NULL COMMENT '가격',
    `category`    VARCHAR(255) NOT NULL COMMENT '카테고리',
    PRIMARY KEY ( `menu_code` )
) COMMENT = 'menu';


DROP TABLE if exists `customer` cascade ;

CREATE TABLE if not exists `customer`
(
    `customer_code`    INT AUTO_INCREMENT COMMENT '고객코드',
    `customer_name`    VARCHAR(255) NOT NULL COMMENT '고객이름',
    `reg_date`    VARCHAR(255) NOT NULL COMMENT '가입일',
    `customer_grade`    VARCHAR(255) NOT NULL COMMENT '고객등급',
    `customer_contact`    INTEGER(255) NOT NULL COMMENT '고객연락처',
    PRIMARY KEY ( `customer_code` )
) COMMENT = 'customer';



DROP TABLE if exists `orders` cascade ;

CREATE TABLE if not exists `orders`
(
    `order_code`    INT AUTO_INCREMENT COMMENT '주문코드',
    `customer_contact` INTEGER(255) NOT NULL COMMENT '고객 전화번호',
    `menu_name`    VARCHAR(255) NOT NULL COMMENT '메뉴명',
    `order_date`    VARCHAR(255) NOT NULL COMMENT '주문일',
    PRIMARY KEY ( `order_code` )
) COMMENT = 'orders';


-- 고객 테이블 데이터 삽입
insert into customer values (null, '박태근', '2024.06.26', 'DIAMOND', 01000001234);
insert into customer values (null, '이득규', '2024.06.24', 'PLATINUM', 01012341234);
insert into customer values (null, '전유안', '2024.06.24', 'PLATINUM', 01043214321);
insert into customer values (null, '위성민', '2024.06.25', 'GOLD', 01012340000);
insert into customer values (null, '김강현', '2024.06.27', 'GOLD', 01011112222);
insert into customer values (null, '배하은', '2024.06.26', 'GOLD', 01022223333);
insert into customer values (null, '박성은', '2024.06.26', 'SILVER', 01000004321);
insert into customer values (null, '권은혜', '2024.06.26', 'SILVER', 01033332222);
insert into customer values (null, '강연진', '2024.06.26', 'BRONZE', 01022221111);
insert into customer values (null, '박하얀', '2024.06.26', 'BRONZE', 01022223334);
insert into customer values (null, '홍주연', '2024.06.26', 'IRON', 01043210000);

-- 메뉴 테이블 데이터 삽입
insert into menu values (null, '통새우와퍼랜드', 30000, '버거');
insert into menu values (null, '더블쿼터파운드치즈버거랜드', 30000, '버거');
insert into menu values (null, '치즈프라이랜드', 15000, '사이드');
insert into menu values (null, '고구마프라이랜드', 18000, '사이드');
insert into menu values (null, '메론소다랜드', 10000, '음료');
insert into menu values (null, '밀바사랜드', 10000, '음료');
insert into menu values (null, '솔의눈', 120000, '음료');

insert into `orders` values (1, 01012341234, '통새우와퍼랜드', '2024.06.26');

commit;



