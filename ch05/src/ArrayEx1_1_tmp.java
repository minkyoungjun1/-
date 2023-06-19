import java.util.Arrays;	// ctrl + shift + o 자동으로 import문 추가

class ArrayEx1_1_tmp {
	public static void main(String[] args) { 
		//int[] arr = {0,1,2,3,4};			// 1차원 배열 arr
		int[] arr = {3,4,1,0,2};			// 1차원 배열 arr
		int[][] arr2D = {{11,12},{21,22}};	// 2차원 배열
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		// deepToString : 2, 3 차원 배열 이상 일때 사용
		
		String[][] str2D = {{"aaa", "bbb"},{"AAA", "BBB"}};
		String[][] str2D2 = {{"aaa", "bbb"},{"AAA", "BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		// 배열의 복사
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr3));
		
		// 배열의 정렬
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // 배열 arr를 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		
	}
}
