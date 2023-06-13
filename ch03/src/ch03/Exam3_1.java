package ch03;

public class Exam3_1 {

	public static void main(String[] args) {

		// ＊3-2
//		int numOfApples = 123; // 사과의 개수
//		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
//		int numOfBucket = ( numOfApples / sizeOfBucket +(numOfApples%sizeOfBucket > 0 ? 1 : 0 ); // 모든 사과를 담는데 필요한 바구니의 수
//		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		
		// 3-3
		//int num = 10;
		// (조건식) ? 참 : (조건식) ? 참 : 거짓
		// System.out.println((num == 0) ? "0" : (num > 0) ? "양수" : "음수");
		
		// 3-4
		//int num = 456;
		//System.out.println((num/100)*100);

		// 3-5
		//int num = 333;
		//System.out.println((num % 100)*10+1);
		
		// 3-6
		//int num = 24;
		//System.out.println((int)(Math.ceil((num / 10)+1)*10-num));
		// 10 - num % 10
		
		// ＊3-7
		//'C = 5/9 * (F - 32)'
//		int fahrenheit = 100;
//		float celcius = ((float)5/9) * (fahrenheit - 32);
//		float celcius = (int)((5-9f * (fahrenheit - 32))*100 + 0.5) / 100f;
//		
//		System.out.println("Fahrenheit : " +fahrenheit);
//		System.out.println("Celcius : " + celcius);
		
		// 3-8
//		byte a = 10;
//		byte b = 20;
//		int c = a + b;
//		
//		char ch = 'A';
//		ch = 'A' + 2;
//		
//		float f = 3 / (float)2;
//		long l = 3000 * 3000 * (long)3000;
//		
//		float f2 = 0.1f;
//		double d = 0.1;
//		
//		boolean result = d != f2;
//		
//		System.out.println("c="+c);
//		System.out.println("ch="+ch);
//		System.out.println("f="+f);
//		System.out.println("l="+l);
//		System.out.println("result="+result);
		
		// ＊3-9
		// 문자형 변수 ch가 영문자(대문자 or 소문자)이거나 ★숫자일때만 true
//		char ch = 'z';
//		boolean b = ('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z') && ('0'<=ch && ch<='9');
//		System.out.println(b);
		
		// ＊3-10
		// ch에 저장된 문자가 대문자인 경우에만 소문자로 변경 (-32)
//		char ch = 'A';
//		
//		char lowerCase = ('A'<=ch || ch<='Z') ? (char)(ch+32): ch;
//		
//		System.out.println("ch:" + ch);
//		System.out.println("ch to lowerCase:" + lowerCase);
		}
	}
