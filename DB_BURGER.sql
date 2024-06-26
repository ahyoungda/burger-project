DROP TABLE `메뉴`;

CREATE TABLE `메뉴`
(
    `menu_code`    INTEGER(255) NOT NULL COMMENT '메뉴코드',
    `menu_name`    VARCHAR(255) NOT NULL COMMENT '메뉴명',
    `menu_price`    INTEGER(255) NOT NULL COMMENT '가격',
    `category`    VARCHAR(255) NOT NULL COMMENT '카테고리',
    PRIMARY KEY ( `menu_code` )
) COMMENT = '메뉴';

ALTER TABLE `메뉴`
    ADD CONSTRAINT `메뉴_PK` PRIMARY KEY ( `menu_code` );


DROP TABLE `주문`;

CREATE TABLE `주문`
(
    `order_code`    INTEGER(255) NOT NULL COMMENT '주문코드',
    `customer_code`    INTEGER(255) NOT NULL COMMENT '고객코드',
    `menu_code`    INTEGER(255) NOT NULL COMMENT '메뉴코드',
    `order_date`    VARCHAR(255) NOT NULL COMMENT '주문일',
    PRIMARY KEY ( `order_code` )
) COMMENT = '주문';

ALTER TABLE `주문`
    ADD CONSTRAINT `주문_PK` PRIMARY KEY ( `order_code` );


DROP TABLE `고객`;

CREATE TABLE `고객`
(
    `customer_code`    INTEGER(255) NOT NULL COMMENT '고객코드',
    `customer_name`    VARCHAR(255) NOT NULL COMMENT '고객이름',
    `reg_date`    VARCHAR(255) NOT NULL COMMENT '가입일',
    `customer_grade`    VARCHAR(255) NOT NULL COMMENT '고객등급',
    PRIMARY KEY ( `customer_code` )
) COMMENT = '고객';



