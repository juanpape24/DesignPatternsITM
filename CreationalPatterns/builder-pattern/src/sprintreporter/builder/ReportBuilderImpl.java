package sprintreporter.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import sprintreporter.model.Member;
import sprintreporter.model.Report;
import sprintreporter.model.ReportType;
import sprintreporter.model.Task;

public class ReportBuilderImpl implements IReportBuilder{
	
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
	
	

	public ReportBuilderImpl() {
		this.tasks = new ArrayList<>();
		this.members = new ArrayList<>();
	}

	@Override
	public IReportBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

	@Override
	public IReportBuilder setDescription(String description) {
		this.description = description;
		return this;
	}

	@Override
	public IReportBuilder addMembers(Member member) {
		this.members.add(member);
		return this;
	}

	@Override
	public IReportBuilder setTotalCapacity(long totalCapacity) {
		this.totalCapacity = totalCapacity;
		return this;
	}

	@Override
	public IReportBuilder setSprintBegin(LocalDate sprintBegin) {
		this.sprintBegin = sprintBegin;
		return this;
	}

	@Override
	public IReportBuilder setSprintEnd(LocalDate sprintEnd) {
		this.sprintEnd = sprintEnd;
		return this;
	}

	@Override
	public IReportBuilder addTasks(Task task) {
		this.tasks.add(task);
		return this;
	}

	@Override
	public IReportBuilder setGraphicAdvance(String graphicAdvance) {
		this.graphicAdvance = graphicAdvance;
		return this;
	}

	@Override
	public IReportBuilder setnumberOfBugs(long numberOfBugs) {
		this.numbersOfBugs = numberOfBugs;
		return this;
	}

	@Override
	public IReportBuilder setnumberCompletedTasks(long numberCompletedTasks) {
		this.numberCompletedTasks = numberCompletedTasks;
		return this;
	}

	@Override
	public IReportBuilder setnumberPendingTasks(long numberPendingTasks) {
		this.numberPendingTasks = numberPendingTasks;
		return this;
	}

	@Override
	public IReportBuilder setReportType(ReportType reportType) {
		this.reportType = reportType;
		return this;
	}

	@Override
	public Report build() {
		// TODO Auto-generated method stub
		return new Report(title, description, members, totalCapacity, sprintBegin, sprintEnd, tasks, graphicAdvance,
				numbersOfBugs, numberCompletedTasks, numberPendingTasks, reportType);
	}

}
