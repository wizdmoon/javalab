package javalab.ch04;

public class IfExample {

	public static void main(String[] args) {
		
		// 나이(변수명 age)가 8살 이상이면 "학교에 다닙니다." 그 밖의 경우는 "학교에 다니지 않습니다" 라고 출력해 주세요.
		// 현재 아이의 나이는 2살 입니다.;
		int age = 2;
		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		//
		age = 9;
		int charge;
		if ( age < 8 ) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		} else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 " + charge + "원 입니다.");
		
		if ( age < 8 ) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		} 
		if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		} 
		if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		} else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 " + charge + "원 입니다.");
	}

}
