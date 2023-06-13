package ch03;

public class Ex3_2 {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		j = i;	// 후위형    j = 5
		i++;	// i = 6 
		System.out.println("j=j++; 실행 후, i=" + i + ", j="+ j);
		
		j = 5;
		i = 0;
		
		++i;	// i = 1
		j = i;	// 전위형  j = 1
		System.out.println("j=++i, 실행 후, i=" +i + ", j="+ j);
	}
}
