package chap18_Enum.enums;

public enum Calculator {
	PLUS("+") {
		public int calculate
	},
	MINUS("-"), MULTIPLY("*"), DIVIDE("/");
	
	private String operator;
	
	Calculator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	//추상메소드 선언
	public abstract int calculate(int a, int b);
	return operator;
}
