package com.homepage.web.services;

import java.util.List;

import com.homepage.web.beans.MemberBean;

public interface MemberService {
public int join(MemberBean bean);
	
	public void login(String id, String password);
	public List<MemberBean> getList();
	//  출력문 예시
	// 입력하신 ID 는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.
	// 비번이 다릅니다.다시 입력하세요.
	// 환영합니다. 서울시에 사는 20세 홍길동님 ..
}
