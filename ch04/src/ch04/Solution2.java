package ch04;

class Solution2 {
    public static void main(String args[]) {
    	int num = 0;
    	
    	// ��ȣ {} ���� ������ 20�� �ݺ��Ѵ�.
    	// Quiz1. 1~10 ������ ������ 20�� ����Ͻÿ�.
//    	for(int i=1; i<=20; i++) {
//    		System.out.println(i + "=" + (int)(Math.random() * 10 + 1));
//    	}
    	
    	// Quiz2. -5 ~ 5 ������ ������ 20�� ���
    	// -5 -4 -3 -2 -1 0 1 2 3 4 5
    	for(int i=1; i<=20; i++) {
    		System.out.println((int)(Math.random() * 11-5));
    	}
    }
}