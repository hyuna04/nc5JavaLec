package chap09_polymorphism.product;

public class TV extends ElectronicDevice{
	public nt lastChannel;
	
	public void powerOn() {
	System.out.println("TV의 전원을 켭니다.");	
	moveTo(lastChannel);
	
	}
	
	public void powerOff() {
	System.out.println("TV의 전원을 끕니다.");	
	
	}
	
	public void moveTo(int channel) {
		System.out.println(channel + "로 이동합니다.");
	}
	
	public void channelUp{
		lastChannel
	}
}