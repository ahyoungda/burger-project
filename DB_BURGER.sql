DROP TABLE if exists `menu` cascade ;

CREATE TABLE if not exists `menu`
(
    `menu_code`    INTEGER(255) NOT NULL COMMENT '메뉴코드',
    `menu_name`    VARCHAR(255) NOT NULL COMMENT '메뉴명',
    `menu_price`    INTEGER(255) NOT NULL COMMENT '가격',
    `category`    VARCHAR(255) NOT NULL COMMENT '카테고리',
    PRIMARY KEY ( `menu_code` )
) COMMENT = 'menu';


DROP TABLE if exists `customer` cascade ;

CREATE TABLE if not exists `customer`
(
    `customer_code`    INTEGER(255) NOT NULL COMMENT '고객코드',
    `customer_name`    VARCHAR(255) NOT NULL COMMENT '고객이름',
    `reg_date`    VARCHAR(255) NOT NULL COMMENT '가입일',
    `customer_grade`    VARCHAR(255) NOT NULL COMMENT '고객등급',
    PRIMARY KEY ( `customer_code` )
) COMMENT = 'customer';



DROP TABLE if exists `order` cascade ;

CREATE TABLE if not exists `order`
(
    `order_code`    INTEGER(255) NOT NULL COMMENT '주문코드',
    `customer_code`    INTEGER(255) NOT NULL COMMENT '고객코드',
    `menu_code`    INTEGER(255) NOT NULL COMMENT '메뉴코드',
    `order_date`    VARCHAR(255) NOT NULL COMMENT '주문일',
    PRIMARY KEY ( `order_code` )
) COMMENT = 'order';



