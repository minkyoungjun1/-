package ch04;

import java.util.Scanner;

public class FlowEx25 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		// i�� 1�� �������Ѽ� sum�� ��� ���س�����.
		while(sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}
	}
}