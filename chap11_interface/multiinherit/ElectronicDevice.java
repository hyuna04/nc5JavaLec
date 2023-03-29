package chap11_interface.multiinherit;

public interface ElectronicDevice {
	
	void powerOn();
	void powerOff();
	
	default void reset() {
		
	}
}
