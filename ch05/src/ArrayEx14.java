class ArrayEx14 {
	public static void main(String[] args) {
		//			  01234
		String str = "ABCDE";	// str.length()�� 5
		char ch = str.charAt(4);
		
		String str2 = str.substring(1, 4); // BCD
		String str3 = str.substring(1); // BCDE
		// �ڿ� to�� �����ϸ� str.length() �����Ǿ� ��, 1~4
		String str4 = str.substring(1, str.length()); // BCDE

		System.out.println(str4);
	}
}
