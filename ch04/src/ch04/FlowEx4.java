package ch04;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		int score = 0;		// ������ �����ϱ� ���� ����
		char grade = ' ';	// ������ �����ϱ� ���� ����. �������� �ʱ�ȭ
		
		System.out.printf("������ �Է��ϼ���. > ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ������ score�� ����
		
		if(score >= 90) {
			grade = 'A';
		} else if (score >= 80){
			grade = 'B';			
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("����� ������ " + grade + "�Դϴ�.");
	}

}
