--1. 멤버 한사람의 주문전체목록
select * from orders where user_id='guard1';

--2. 주문한개(멤버 한사람의) 
select * from orders where order_no=1;

--3. 주문한개의  주문상세 여러개(주문상세)
select * from order_item where order_no = 1;

--4. 주문한개의 주문상세,제품정보 여러개(주문상세,제품)
select * from orders o join order_item oi on o.order_no=oi.order_no join product p on oi.product_no=p.product_no 
where o.user_id='guard1';

--5. 주문한개삭제(주문1개삭제,주문상세삭제)
--on delete cascade
delete from order_item where order_no=1;
delete from orders where order_no=1;
--rollback;

--6. 멤버한사람의 주문내역전체삭제
----on delete cascade
--select j_no from orders where userid='guard1';
delete from order_item where order_no in(select order_no from orders where user_id='guard1');
delete from orders where user_id='guard1';

--rollback;














