-- 1번 INSERT
INSERT INTO MEMBER (ID, BIRTHDAY, GRADE_POINT, JOIN_DATE, ADDRESS, EMAIL, GRADE, NAME, NICKNAME, PASSWORD, PHONE_NO, ROLE, USER_NAME)
VALUES (MEMBER_MEMBER_NO_SEQ.NEXTVAL, TO_DATE('2000-01-01', 'YYYY-MM-DD'), 100, TO_TIMESTAMP('2023-01-01 10:00:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF'), '주소1', 'email1@example.com', 'Gold', '사용자1', '닉네임1', 'password1', '123-456-7890', 'member', 'User1');

-- 2번 INSERT
INSERT INTO MEMBER (ID, BIRTHDAY, GRADE_POINT, JOIN_DATE, ADDRESS, EMAIL, GRADE, NAME, NICKNAME, PASSWORD, PHONE_NO, ROLE, USER_NAME)
VALUES (MEMBER_MEMBER_NO_SEQ.NEXTVAL, TO_DATE('1995-02-15', 'YYYY-MM-DD'), 85, TO_TIMESTAMP('2022-11-15 09:30:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF'), '주소2', 'email2@example.com', 'Silver', '사용자2', '닉네임2', 'password2', '987-654-3210', 'member', 'User2');

-- 3번 INSERT
INSERT INTO MEMBER (ID, BIRTHDAY, GRADE_POINT, JOIN_DATE, ADDRESS, EMAIL, GRADE, NAME, NICKNAME, PASSWORD, PHONE_NO, ROLE, USER_NAME)
VALUES (MEMBER_MEMBER_NO_SEQ.NEXTVAL, TO_DATE('1998-05-20', 'YYYY-MM-DD'), 70, TO_TIMESTAMP('2022-10-05 14:45:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF'), '주소3', 'email3@example.com', 'Bronze', '사용자3', '닉네임3', 'password3', '111-222-3333', 'member', 'User3');

-- 4번 INSERT
INSERT INTO MEMBER (ID, BIRTHDAY, GRADE_POINT, JOIN_DATE, ADDRESS, EMAIL, GRADE, NAME, NICKNAME, PASSWORD, PHONE_NO, ROLE, USER_NAME)
VALUES (MEMBER_MEMBER_NO_SEQ.NEXTVAL, TO_DATE('2001-12-10', 'YYYY-MM-DD'), 120, TO_TIMESTAMP('2023-03-20 11:15:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF'), '주소4', 'email4@example.com', 'Platinum', '사용자4', '닉네임4', 'password4', '555-777-9999', 'admin', 'User4');

-- 5번 INSERT
INSERT INTO MEMBER (ID, BIRTHDAY, GRADE_POINT, JOIN_DATE, ADDRESS, EMAIL, GRADE, NAME, NICKNAME, PASSWORD, PHONE_NO, ROLE, USER_NAME)
VALUES (MEMBER_MEMBER_NO_SEQ.NEXTVAL, TO_DATE('2003-08-05', 'YYYY-MM-DD'), 95, TO_TIMESTAMP('2022-09-10 16:30:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF'), '주소5', 'email5@example.com', 'Gold', '사용자5', '닉네임5', 'password5', '123-987-6543', 'member', 'User5');

-- 6번 INSERT
INSERT INTO MEMBER (ID, BIRTHDAY, GRADE_POINT, JOIN_DATE, ADDRESS, EMAIL, GRADE, NAME, NICKNAME, PASSWORD, PHONE_NO, ROLE, USER_NAME)
VALUES (MEMBER_MEMBER_NO_SEQ.NEXTVAL, TO_DATE('1999-06-25', 'YYYY-MM-DD'), 80, TO_TIMESTAMP('2022-12-05 08:45:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF'), '주소6', 'email6@example.com', 'Silver', '사용자6', '닉네임6', 'password6', '987-123-4567', 'member', 'User6');

-- 7번 INSERT
INSERT INTO MEMBER (ID, BIRTHDAY, GRADE_POINT, JOIN_DATE, ADDRESS, EMAIL, GRADE, NAME, NICKNAME, PASSWORD, PHONE_NO, ROLE, USER_NAME)
VALUES (MEMBER_MEMBER_NO_SEQ.NEXTVAL, TO_DATE('2002-03-30', 'YYYY-MM-DD'), 65, TO_TIMESTAMP('2022-07-01 13:00:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF'), '주소7', 'email7@example.com', 'Bronze', '사용자7', '닉네임7', 'password7', '555-444-8888', 'member', 'User7');

-- 8번 INSERT
INSERT INTO MEMBER (ID, BIRTHDAY, GRADE_POINT, JOIN_DATE, ADDRESS, EMAIL, GRADE, NAME, NICKNAME, PASSWORD, PHONE_NO, ROLE, USER_NAME)
VALUES (MEMBER_MEMBER_NO_SEQ.NEXTVAL, TO_DATE('2000-04-18', 'YYYY-MM-DD'), 110, TO_TIMESTAMP('2022-08-25 10:20:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF'), '주소8', 'email8@example.com', 'Platinum', '사용자8', '닉네임8', 'password8', '111-555-9999', 'member', 'User8');

-- 9번 INSERT
INSERT INTO MEMBER (ID, BIRTHDAY, GRADE_POINT, JOIN_DATE, ADDRESS, EMAIL, GRADE, NAME, NICKNAME, PASSWORD, PHONE_NO, ROLE, USER_NAME)
VALUES (MEMBER_MEMBER_NO_SEQ.NEXTVAL, TO_DATE('2001-11-12', 'YYYY-MM-DD'), 70, TO_TIMESTAMP('2022-06-30 17:00:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF'), '주소9', 'email9@example.com', 'Gold', '사용자9', '닉네임9', 'password9', '555-222-3333', 'member', 'User9');

-- 10번 INSERT
INSERT INTO MEMBER (ID, BIRTHDAY, GRADE_POINT, JOIN_DATE, ADDRESS, EMAIL, GRADE, NAME, NICKNAME, PASSWORD, PHONE_NO, ROLE, USER_NAME)
VALUES (MEMBER_MEMBER_NO_SEQ.NEXTVAL, TO_DATE('1996-09-07', 'YYYY-MM-DD'), 105, TO_TIMESTAMP('2023-04-05 09:45:00.000000', 'YYYY-MM-DD HH24:MI:SS.FF'), '주소10', 'email10@example.com', 'Silver', '사용자10', '닉네임10', 'password10', '123-789-4567', 'admin', 'User10');
commit;