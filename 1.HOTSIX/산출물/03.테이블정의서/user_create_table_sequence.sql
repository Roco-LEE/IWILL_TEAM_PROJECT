DROP TABLE userinfo CASCADE CONSTRAINTS;

CREATE TABLE userinfo(
		user_id                       		VARCHAR2(100)		 NULL ,
		user_pw                       		VARCHAR2(100)		 NULL ,
		user_pw_check                 		VARCHAR2(100)		 NULL ,
		user_name                     		VARCHAR2(100)		 NULL ,
		user_email                    		VARCHAR2(100)		 NULL ,
		user_email_send               		VARCHAR2(100)		 NULL ,
		user_jumin                    		VARCHAR2(100)		 NULL ,
		user_phone                    		VARCHAR2(100)		 NULL ,
		user_gender                   		VARCHAR2(100)		 NULL 
);
