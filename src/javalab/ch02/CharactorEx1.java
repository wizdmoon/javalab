package javalab.ch02;

public class CharactorEx1 {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);		// 문자 출력
		System.out.println((int)ch1);	// 문자에 해당하는 정숫값(아스키코드) 출력
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char ch4 = '한';
		char ch5 = '\uD55C';
		
		System.out.println(ch4);
		System.out.println(ch5);
		
	}

}
