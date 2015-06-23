create table reserve(
	reserve_no number,		-- 예매번호 --
	naildate date, 			-- 예 매 일 --
	pay number, 			-- 결제금액 --
	pay_type varchar2(30), 	-- 결제종류 --
	acc_no varchar2(30), 	-- 계좌번호 --
	amount number, 			-- 총 수 익 --
	use_cnt number			-- 이용자수 --
);
commit;