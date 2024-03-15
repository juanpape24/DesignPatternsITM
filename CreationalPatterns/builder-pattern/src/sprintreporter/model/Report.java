package sprintreporter.model;

import java.time.LocalDate;
import java.util.List;

public class Report {
	String title;
	String description;
	List<Member> members;
	long totalCapacity;
	LocalDate sprintBegin;
	LocalDate sprintEnd;
	List<Task> tasks;
	String graphicAdvance;
	long numbersOfBugs;
	long numberCompletedTasks;
	long numberPendingTasks;
	ReportType reportType;


	public Report(String title, String description, List<Member> members, long totalCapacity, LocalDate sprintBegin,
			LocalDate sprintEnd, List<Task> tasks, String graphicAdvance, long numbersOfBugs, long numberCompletedTasks,
			long numberPendingTasks, ReportType reportType) {
		super();
		this.title = title;
		this.description = description;
		this.members = members;
		this.totalCapacity = totalCapacity;
		this.sprintBegin = sprintBegin;
		this.sprintEnd = sprintEnd;
		this.tasks = tasks;
		this.graphicAdvance = graphicAdvance;
		this.numbersOfBugs = numbersOfBugs;
		this.numberCompletedTasks = numberCompletedTasks;
		this.numberPendingTasks = numberPendingTasks;
		this.reportType = reportType;
	}

	@Override
	public String toString() {
		return "Report: \n" +
                "title='" + title + "'\n" +
                "description='" + description +  "'\n" +
                "members=" + members + "'\n" + 
                "totalCapacity=" + totalCapacity + "\n" +
                "sprintBegin=" + sprintBegin + "\n" +
                "sprintEnd=" + sprintEnd + "\n" +
                "tasks=" + tasks + "\n" +
                "graphicAdvance='" + graphicAdvance + "'\n" +
                "numbersOfBugs=" + numbersOfBugs + "\n" +
                "numberCompletedTasks=" + numberCompletedTasks + "\n" +
                "numberPendingTasks=" + numberPendingTasks + "\n" +
                "reportType=" + reportType + "\n" +
                '}';
	}
	
	
	
	

}
