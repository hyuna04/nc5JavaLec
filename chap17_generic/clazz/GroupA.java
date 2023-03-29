package chap17_generic.clazz;

import java.util.HashMap;
import java.util.Map;

public class GroupA implements Group {
	private Map<String, String> memMap = new HashMap<String, String>();
	public GroupA() {
	this.memMap.put("a", "조원");
	this.memMap.put("b", "조원");
	this.memMap.put("c", "조원");
	this.memMap.put("d", "조원");
	}
	public Map<String, String> getMemMap() {
		return memMap;
	}
	public void setMemMap(Map<String, String> memMap) {
		this.memMap = memMap;
	}
	
}
