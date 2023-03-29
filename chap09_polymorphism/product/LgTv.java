package chap09_polymorphism.product;

public class LgTv extends Tv {
	public void powerOn() {
		System.out.println("재조사 : Lg");
		super.powerOff();
	}
	
	public void operae(int channel) {
		super.operate(channel);
	}
	
	public class LgTv extends Tv {
		public void powerOn() {
			System.out.println("전원켜기")
		}
		public void powerOff() {
			System.out.println("전원끄기")
		}
}
