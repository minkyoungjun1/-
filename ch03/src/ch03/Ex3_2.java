package ch03;

public class Ex3_2 {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		j = i;	// ������    j = 5
		i++;	// i = 6 
		System.out.println("j=j++; ���� ��, i=" + i + ", j="+ j);
		
		j = 5;
		i = 0;
		
		++i;	// i = 1
		j = i;	// ������  j = 1
		System.out.println("j=++i, ���� ��, i=" +i + ", j="+ j);
	}
}
