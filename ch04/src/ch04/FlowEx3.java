package ch04;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		System.out.printf("숫자를 하나 입력하세요. > ");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); // 화면을 통해 입력받은 내용을 input에 저장
		
		if(input == 0) {
			System.out.println("입력하신 숫자는 0 입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");			
		}		
	}

}
