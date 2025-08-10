package javalab.ch07;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int idx = 0, len = nums.length; idx < len; idx++) {
			System.out.println(idx + ". " + nums[idx]);
		}
		
		
		nums[0] = 2;
		nums[1] = 1;
		
		// 문자배열
		// 문자의 배열 = 문자열
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0, len = alphabets.length; i < len; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for(int i = 0, len = alphabets.length; i < len; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
		
		// 객체배열
		Book[] books = new Book[5];
		
		books[0] = new Book("태백산맥", "조정래");
        books[1] = new Book("데미안", "헤르만 헤세");
        books[2] = new Book("어떻게 살 것인가", "유시민");
        books[3] = new Book("토지", "박경리");
        books[4] = new Book("어린왕자", "생텍쥐페리");
        
        for(int i = 0, len = books.length; i < len; i ++) {
        	books[i].showBookInfo();
        }
        
        for(int i = 0, len = books.length; i < len; i++) {
        	System.out.println(books[i]);
        }
        
        // 2차원 배열
        int[][] arr = {{1,2,3}, {4,5,6}}; // 2행 3열
        
        for(int i = 0; i < arr.length; i++) { // 행
        	for(int j = 0; j < arr[i].length; j++) { // 열
        		System.out.println(arr[i][j]);
        	}
        	System.out.println();
        }
        
        System.out.println(arr.length);		// 행
        System.out.println(arr[0].length);	// 열
        
        
		
	}

}