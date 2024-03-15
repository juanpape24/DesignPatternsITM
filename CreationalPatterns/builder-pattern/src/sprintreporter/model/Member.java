package sprintreporter.model;

public class Member {
	
	String name;
	int capacity;
	
	
	public Member(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", capacity=" + capacity + "]";
	}

}
