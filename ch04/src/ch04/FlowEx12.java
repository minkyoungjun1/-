package ch04;

public class FlowEx12 {

	public static void main(String[] args) {
		int sum = 0;	// �հ踦 �����ϱ����� ����
		
		//sum += 1;
		//sum += 2;
		//sum += 3;
		//sum += 4;
		//sum += 5;
		
		for(int i=1; i<=5; i++) {
			sum += i;	// sum = sum + i
			System.out.printf("1���� %2d ������ �� : %2d%n", i, sum);
		}
	}

}