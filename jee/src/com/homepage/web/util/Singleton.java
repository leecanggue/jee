package com.homepage.web.util;
/*
@ Date : 
@ Author :
@ Story : GoF 의 자바디자인 패턴 중의 하나
	- 요청이 있을 때마다 인스턴스를 생성하는 것이 아니라
	- 단 하나의 인스턴스만 사용하도록 강제하는 패턴
	- 보안 밑 메모리 점유에 민감하거나 혹은 한가지 기능만을
	- 수행하는 객체라면 싱글톤으로 처리한다.
 * */
public class Singleton {
	private static Singleton singleton = new Singleton();
	/*
	 * 생성자를 접근불가로 처리
	 * */
	public Singleton() {
		System.out.println("인스턴스 생성");
	}
	public static Singleton getInstance(){
		return singleton;
	}
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		if(singleton1==singleton2){
			System.out.println("같다.");
		}else{
			System.out.println("다르다.");
		}
	}
}
