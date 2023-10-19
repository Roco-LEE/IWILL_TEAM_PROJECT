--select
--로그인한 사람의 카트리스트
select * from cart where user_id='user1';
select * from cart c join product p on c.product_no=p.product_no where c.user_id='user1';
select * from cart c join userinfo u on u.user_id=c.user_id where c.user_id='user1';
select * from cart c join userinfo u on u.user_id=c.user_id where c.user_id='user2';
select * from cart c join userinfo u on u.user_id=c.user_id where c.user_id='user3';

--update
--상품 수량 증가
update cart set cart_qty=cart_qty+1 where cart_no=2;
--상품 수량 감소
update cart set cart_qty=cart_qty-1 where cart_no=2;
--상품 수량 변경
update cart set cart_qty=4 where cart_no=2;
--예약 날짜 변경
update product set product_start_date = to_date('20230609', 'YYYYMMDD') WHERE product_no = '1';

--delete
--cart 아이템 1개 삭제
delete from cart where cart_no=2;
--cart 아이템 모두삭제
delete from cart where user_id='guard1';


