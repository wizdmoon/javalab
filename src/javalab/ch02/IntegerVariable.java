package javalab.ch02;

import java.math.BigInteger;

// 정수형

public class IntegerVariable {

	public static void main(String[] args) {
		
		byte bVal = 20;
		short sVal = 10;
		
		System.out.println(bVal + sVal);
		
//		int num = 12345678900;		// int 최대값을 벗어난 오류
		long num1 = 12345678900L;	// long에 대한 리터럴
		
		// 정수 10, 20을 더한 값을 출력하세요
		System.out.println(10 + 20);
		
		System.out.println(num1);
		
		// long의 최대값
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MAX_VALUE + 1);
		
		BigInteger c = new BigInteger("1000000000000000000000000000000000");
		BigInteger d = new BigInteger("1");
		BigInteger e = c.add(d);
		
		System.out.println(e.toString());
		
	}

}
