package ch04;

import java.util.Scanner;

public class FlowEx11_1 {

	public static void main(String[] args) {
		int i=1; // scope(����) - ������ġ���� ����� ���� ������
		
		//for(i=1; i<=10; i++) {
		
		// ���ǽ��� �����ϸ�, true�� ���ֵǾ ���ѹݺ� ���� ��
		for(;true;) {
			System.out.println("i="+i);
		}
//		System.out.println(i);
	}

}
