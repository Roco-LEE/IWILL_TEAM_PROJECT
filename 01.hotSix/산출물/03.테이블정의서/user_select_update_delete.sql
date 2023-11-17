--update pk

update userinfo set 
    user_pw='2872',
    user_pw_check='2872',
    user_name='신짱구', 
    user_email='짱구@email.com',
    user_email_send='T',
    user_phone='010-7777-7777'
    
where user_id='guard2';


update userinfo set 
    user_pw='1717',
    user_pw_check='1717',
    user_name='맹구', 
    user_email='맹구@email.com',
    user_email_send='F',
    user_phone='010-4555-1111'
    
where user_id='user4';

update userinfo set 
    user_pw='9090',
    user_pw_check='9090',
    user_name='유리', 
    user_email='유리@email.com',
    user_email_send='F',
    user_phone='010-4455-1341'
    
where user_id='user2';


update userinfo set 
    user_pw='9090',
    user_pw_check='9090',
    user_name='유리', 
    user_email='유리@email.com',
    user_email_send='F',
    user_phone='010-4455-1341'
    
where user_id='user10';


update userinfo set 
    user_pw='1111',
    user_pw_check='1111',
    user_name='옥지', 
    user_email='옥지@email.com',
    user_email_send='F',
    user_phone='010-4123-2354'
    
where user_id='user9';

update userinfo set 
    user_pw='4343',
    user_pw_check='4343',
    user_name='빵빵이', 
    user_email='빵빵이@email.com',
    user_email_send='F',
    user_phone='010-4123-2354'
    
where user_id='user6';





--delete pk
delete from userinfo where user_id='guard2';
delete from userinfo where user_id='user1';


--select pk
select user_id, user_pw, user_pw_check, user_name, user_email, user_email_send, user_jumin, user_phone, user_gender from userinfo where user_id='장희주';

--select All
select user_id, user_pw, user_pw_check, user_name, user_email, user_email_send, user_jumin, user_phone, user_gender  from userinfo;


commit;

