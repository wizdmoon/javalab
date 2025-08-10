package javalab.ch05.encapsulation;

public class PhoneStoreTest {

	public static void main(String[] args) {

		Phone phone = new Phone("아이폰", 1000000);
		Phone phone1 = new Phone("갤럭시", 1000000);
		
		Customer customer = new Customer("홍길동", 1000000);
		PhoneStore store = new PhoneStore("아이폰 대리점", phone);
		PhoneStore store1 = new PhoneStore("갤럭시 대리점", phone1);
		
		customer.buyPhone(store);
		
	}

}
