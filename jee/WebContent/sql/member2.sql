-- DDL 테이블 생성 -- 
create table MEMBER(
    MEMBERID varchar2(10),-- primary key, -- 간편하게 추가하는데 비추
    PASSWORD varchar2(10) unique,
    NAME varchar2(20) not null,
    EMAIL varchar2(80),
    constraint member_pk primary key(addressid),
    constraint member_fk_address foreign key(addressid) 
    references ADDRESS(addressid)
);
create table ADDRESS(
	addressid varchar2(10)
	constraint address_pk primary key(addressid)
);

commit;
-- DDL 테이블 삭제 --
drop table member;commit;
-- DML 데이터 삽입(1) --
insert into member(memberid, password, name, email)
values('hong','hong','홍길동','hong@naver.com');commit;

-- DML 데이터 삽입(2) --
insert into member
values('hong2','hong2','홍길동','hong2@naver.com');commit;

-- DML 데이터 삽입(3) 널인값이 있는 경우
insert into member( memberid , password, name)
values( 'hong2', 'hong2' ,'홍길동' );commit;

-- DML 데이터 조회 --
select * from member;

-- DML 데이터 조회(where 절 사용)
select * from member
where memberid = 'hong2';

-- DML 두가지 조건을 가지고 검색
select * from member
where name = '홍길동' and email = 'hong@naver.com';

-- DML null 인경우 검색
select *from member
where email is null;

-- DML null 이 아닌경우
select * from member
where email is not null;

-- DML 조건검색 like
select * from member
where name like '홍%';

select * from member
where name like '%길%';

-- DML 정렬 
select * from member
where name like '%길%'
order by name asc; -- ㄱ. ㄴ. ㄷ... 오름차순

select * from member
where name like '%길%'
order by name desc; -- ㅎ. ㅌ. ㅍ... 내림차순

-- DML 내장된 함수
select count(*) from member;
-- count() 은 인스턴스(row)의 수량을 출력함
-- 그런데 파라미터 자리에 * count(*) 이 오면
-- 전체 갯수를 리턴

-- DML 중복정렬
select * from member
order by name asc, memberid asc

-- DML 데이터 수정
update member
set name = '최길동'
where memberid = 'hong2' and email is null;
commit;

update member
set password = 'choi'
where name = '최*' and email is null;
commit;

-- 테이블 삭제 drop 이고, 데이터 삭제 delete 입니다.
-- 차이는 클래스를 제거하든지 인스턴스를 제거하는 차이

delete from member
where email is null;
commit;

-- DDL 테이블 수정
-- 컬럼을 추가하는 구문
alter table member
add age number;commit;

-- 컬럼을 삭제하는 구문
alter table member
drop column age;commit;

-- 컬럼의 유형을 변경
alter table member
modify age varchar2(10);commit;

-- 컬럼 출력
desc member;

-- primary key 추가하기
alter table member
add primary key(memberid);

-- 프라이머리 키값 이름 주기
alter table member
add constraint member_pk primary key(memberid);

-- 프라이머리 키 삭제
alter table member
drop primary key

-- pk 조회
select table_name, constraint_name, constraint_type
from user_constraints -- 내장 
where table_name = 'MEMBER'; -- 주의 대문자




















