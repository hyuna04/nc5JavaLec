package chap06_class.phone;

public class PhoneInfo {
	//이름 100개와 전화번호 100개를 담을 수 있는 배열2개(
	private String[] name = new String[100];
	private String[] num = new String[100];
	//배열의 현재 인덱스를 담고있을 수 있는 변수
	private int currentIndex = 0;
	//전달받은 이름과 전화번호를 저장하는 메소드
	public void insertPhoneNum(String name, String num) {
		this.name[currentIndex] = name;
        this.num[currentIndex] = num;
        currentIndex++;//0은 이미 차서 다음값으로 넘어가야함
	}
	//insertPhoneNum
	
	//저장된 모든 이름과 전화번호를 출력하는 메소드
	//printAllPhoneNum
	//ex) 이름 : 홍길동1, 전화번호 : 1111111111
	//    이름 : 홍길동2, 전화번호 : 2222222222
	//    이름 : 홍길동3, 전화번호 : 3333333333
	//    이름 : 홍길동4, 전화번호 : 4444444444
	
	//전달받은 인덱스의 해당하는 이름과 전화번호를 출력하는 메소드
	//printAllPhoneNum
    //ex) 이름 : 홍길동3, 전화번호 : 3333333333
	public void printAllPhoneNum() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("이름: " + name[i] + ", 전화번호: " + num[i]);
        }
    }
	public void printPhoneNum(String num) {
        for (int i = 0; i < currentIndex; i++) {
            if (this.num[i].equals(num)) {
                System.out.println("이름: " + name[i] + ", 전화번호: " + this.num[i]);
                return;
            }
        }
        System.out.println("일치하는 번호가 없습니다.");
    }
}
