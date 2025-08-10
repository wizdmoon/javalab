package javalab.ch08;

/*
 * 1. 자식은 인스턴스를 생성할 때 부모 기본 생성자를 찾는다.
 * 2. 부모의 기본 생성자가 없을 경우 에러가 발생된다.
 * 3. 만약 부모에 기본 생성자가 없을 경우 자식에서 사용할 부모 생성자를 지정해야 한다.
 */
public class VIPCustomer extends Customer {
	
	// 멤버변수
	private double saleRatio;
	private int agentID;
		
	// 생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // 부모 생성자인 Customer 호출
		this.saleRatio = 0.1;
		this.agentID = agentID;
		bonusRatio = 0.05;
		
		// 디버깅
		System.out.println("VIPCustomer(int customerID, String customerName, int agentID) 생성자 호출");
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public int getAgentID() {
		return agentID;
	}
	
	// 부모에게 상속받은 멤버변수는 this 사용안하고 그냥 쓰기
	@Override // 어노테이션: 오버라이드(부모의 메서드를 재정의, 덮어씌움)
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * this.saleRatio);
	}

	@Override
	public String toString() {
		return "VIPCustomer [saleRatio=" + saleRatio + ", agentID=" + agentID + ", bonusPoint=" + bonusPoint
				+ ", bonusRatio=" + bonusRatio + "]" + super.toString();
	}
	
	


	
}
