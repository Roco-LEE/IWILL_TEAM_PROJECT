insert into orders(order_no, order_name, order_phone, order_price, order_date, user_id)
			values(orders_order_no_SEQ.nextval, '비회원', '010-1234-5678', 50000, sysdate, 'guard1');
insert into order_item(oi_no,oi_qty,product_no,order_no) values(order_item_oi_no_SEQ.nextval,1,1,orders_order_no_SEQ.currval);
insert into order_item(oi_no,oi_qty,product_no,order_no) values(order_item_oi_no_SEQ.nextval,1,3,orders_order_no_SEQ.currval);


insert into orders(order_no, order_name, order_phone, order_price, order_date, user_id)
			values(orders_order_no_SEQ.nextval, '이소라', '010-5678-5689', 150000, sysdate, 'guard2');
insert into order_item(oi_no,oi_qty,product_no,order_no) values(order_item_oi_no_SEQ.nextval,1,1,orders_order_no_SEQ.currval);
insert into order_item(oi_no,oi_qty,product_no,order_no) values(order_item_oi_no_SEQ.nextval,1,3,orders_order_no_SEQ.currval);

insert into orders(order_no, order_name, order_phone, order_price, order_date, user_id)
			values(orders_order_no_SEQ.nextval, '삼소라', '010-1234-8745', 30000, sysdate, 'guard3');
insert into order_item(oi_no,oi_qty,product_no,order_no) values(order_item_oi_no_SEQ.nextval,1,1,orders_order_no_SEQ.currval);
insert into order_item(oi_no,oi_qty,product_no,order_no) values(order_item_oi_no_SEQ.nextval,1,3,orders_order_no_SEQ.currval);

			