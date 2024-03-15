package sprintreporter.model;

public class Task {
	String name;
	String state;
	Member member;

	public Task(String name, String state, Member member) {
		super();
		this.name = name;
		this.state = state;
		this.member = member;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", state=" + state + ", Member=" + member.name + "]";
	}

}
