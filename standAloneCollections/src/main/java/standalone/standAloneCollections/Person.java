package standalone.standAloneCollections;

import java.util.List;
import java.util.Map;

public class Person 
{
	private List<String> friends;
	private Map<String,Integer> freestructure;
	

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [freestructure=" + freestructure + "]";
	}

	public Map<String, Integer> getFreestructure() {
		return freestructure;
	}

	public void setFreestructure(Map<String, Integer> freestructure) {
		this.freestructure = freestructure;
	}
	
	

}
