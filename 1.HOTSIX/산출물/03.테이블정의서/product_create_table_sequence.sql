DROP TABLE product CASCADE CONSTRAINTS;

CREATE TABLE product(
		product_no                    		NUMBER(10)		 NULL ,
		product_start_date            		DATE		 DEFAULT sysdate		 NULL ,
		product_category              		VARCHAR2(100)		 NULL ,
		product_name                  		VARCHAR2(100)		 NULL ,
		product_price                 		NUMBER(10)		 NULL ,
		product_detail                		VARCHAR2(100)		 NULL ,
		product_image                 		VARCHAR2(100)		 NULL ,
		product_read_count            		NUMBER(10)		 DEFAULT 0		 NULL 
);

DROP SEQUENCE product_product_no_SEQ;

CREATE SEQUENCE product_product_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;