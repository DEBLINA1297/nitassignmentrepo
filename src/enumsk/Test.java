package enumsk;

public enum Test {

	SUNDAY("Holiday"),MONDAY("Test data");

	Test(String value) {
		this.value=value;
	}
	
	public String value;

	public String getValue() {
		return value;
	}

	
}
