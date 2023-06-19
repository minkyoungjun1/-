package ch04;

public class Exam1 {

	public static void main(String[] args) {
//		2.
//		int sum = 0;
//		for(int i=1; i<=20; i++) {
//			if((i%2 != 0) && (i%3 != 0)) {
//				System.out.println("2 또는 3의 배수가 아닌 수: "+i);
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		// 3.
//		int sum = 0;
//		int totalSum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += i;
//			totalSum += sum;
//			System.out.println(totalSum);
//		}
		
		// 4.
//		int sum = 0;	// 총합을 저장할 변수
//		int s = 1;		// 값의 부호를 바꿔주는데 사용할 변수
//		int num = 0;
//		for(int i=1; sum < 100; i++, s=-s) {
//			num = s * i;	// i와 부호(s)를 곱해서 더할 값을 구한다.
//			sum += num;		// sum = sum + num
//			
//			if(sum >= 100) {	// 총합이 100보다 같거나 크면 반복문을 빠져 나간다.
//				break;
//			}
//			
//			System.out.println("num = " + num);
//			System.out.println("sum = " + sum);
//		}
		
		// 5.
//		int i=0;
//		while(i<=10) {
//			int j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;				
//			}
//			System.out.println();
//			i++;
//		}
		
		// 6.
//		for(int i=1; i<=6; i++) {
//			for(int j=1; j<=6; j++) {
//				if(i+j==6) {
//					System.out.println(i + "+" + j + "=" + (i+j));
//				}
//			}
//		}
		
		// 7.
//		int value = (int)(Math.random() * 6)+1;
//		System.out.println("value:" + value);
		
		// 8.
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=10; j++) {
//				if((2 * i) + (4 * j) == 10) {
//					System.out.println("i="+i);
//					System.out.println("j="+j);
//				}
//			}
//		}
		
		// 9.
//		String str = "12345";
//		int sum = 0;
//		
//		for(int i=0; i<str.length(); i++) {
//			sum += str.charAt(i) - '0';
//			System.out.println(sum);
//		}
//		
//		System.out.println("sum="+sum);
		
		// 10.
		// 나머지 연산 이용
//		int num = 12345;
//		int sum = 0;
//		
//		while(num > 0) {
//			sum += num % 10;
//			num /= 10;
//		}
//		
//		System.out.println("sum="+sum);
		
		// 11.
		// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0; // 세번째 값
//		System.out.print(num1+","+num2);
//		
//		for(int i=0; i<8 ; i++) {
//			num3 = num1+num2;
//			System.out.print(","+num3);
//			
//			num1 = num2;
//			num2 = num3;
//		}
		
		// 12.
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}
}
