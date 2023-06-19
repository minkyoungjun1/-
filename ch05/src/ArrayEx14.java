class ArrayEx14 {
	public static void main(String[] args) {
		//			  01234
		String str = "ABCDE";	// str.length()는 5
		char ch = str.charAt(4);
		
		String str2 = str.substring(1, 4); // BCD
		String str3 = str.substring(1); // BCDE
		// 뒤에 to를 생략하면 str.length() 생략되어 들어감, 1~4
		String str4 = str.substring(1, str.length()); // BCDE

		System.out.println(str4);
	}
}
