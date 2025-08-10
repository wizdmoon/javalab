package javalab.ch14;

public class IDFormat {
	private String userID;

	public String getUserID() {
		return userID;
	}

	// 메서드가 지정된 예외를 던질 수도 있다.
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null이 될 수 없습니다.");
		} else if(userID.length() < 8 || userID.length() > 20 ) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용하세요.");
		}
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "IDFormat [userID=" + userID + "]";
	}
	
	
}
