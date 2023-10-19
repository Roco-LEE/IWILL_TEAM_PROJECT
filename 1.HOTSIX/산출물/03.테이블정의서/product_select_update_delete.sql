<<<<<<< HEAD
--select
=======
--guard1 멤버한사람의  카트에 제품번호 존재여부
select count(*)  as p_count from cart c join userinfo u on c.userid=u.userid where u.userid='guard1' and c.p_no=1;
>>>>>>> branch 'master' of https://github.com/2023-05-JAVA-DEVELOPER-143/java-project-team4-hot6

--전체 제품 리스트
select * from product

--제품 상세보기(상품 클릭시 상품 페이지로 이동)
select * from product where product_no=?;

--제품 검색
select * from product where product_name like '%*test%'

--조회수 최고 상품정보 제공

select * from product order by product_read_count desc;


--장바구니로의 이동

<<<<<<< HEAD
select * from product
=======
--2. 주문한개(멤버 한사람의) 
select * from orders where o_no=1;


--3. 주문한개의  주문상세 여러개(주문상세)
select * from order_item where o_no = 1;

--4. 주문한개의 주문상세,제품정보 여러개(주문상세,제품)
select * from orders o join order_item oi on o.o_no=oi.o_no  join  product p on oi.p_no=p.p_no 
where o.userid='guard1' and o.o_no = 1;

--5. 주문한개삭제(주문1개삭제,주문상세삭제)
--on delete cascade
delete from order_item where o_no=1;
delete from orders where o_no=1;
--rollback;
--6. 멤버한사람의 주문내역전체삭제
----on delete cascade
--select j_no from orders where userid='guard1';
delete from order_item where o_no in(select o_no from orders where userid='guard1');
delete from orders where userid='guard1';

--rollback;
---------------------------------------------------
--메인페이지
--select
--1. 키워드 검색
select * from product where product_name like '%크림마들렌%';

--2. select 조건
select * from product where product_no=3;

--카테고리별 표시
select product_category from product where product_category='요리';


--update
--1. 조회수 증가
update product set product_read_count=product_read_count+1 where product_no=1; 

--2.제품(강의) 남은 인원수(좌석수) 제공

update product set product_seatLeft_count=product_seatLeft_count-1 where product_no=1;












