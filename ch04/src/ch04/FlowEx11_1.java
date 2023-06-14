package ch04;

import java.util.Scanner;

public class FlowEx11_1 {

	public static void main(String[] args) {
		int i=1; // scope(범위) - 선언위치부터 선언된 블럭의 끝까지
		
		//for(i=1; i<=10; i++) {
		
		// 조건식을 생략하면, true로 간주되어서 무한반복 문이 됨
		for(;true;) {
			System.out.println("i="+i);
		}
//		System.out.println(i);
	}

}
