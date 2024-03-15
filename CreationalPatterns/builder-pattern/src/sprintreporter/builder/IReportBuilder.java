package sprintreporter.builder;

import java.time.LocalDate;

import sprintreporter.model.Member;
import sprintreporter.model.Report;
import sprintreporter.model.ReportType;
import sprintreporter.model.Task;

public interface IReportBuilder {
	
	IReportBuilder setTitle(String title);
	IReportBuilder setDescription(String description);
	IReportBuilder addMembers(Member member);
	IReportBuilder setTotalCapacity(long totalCapacity);
	IReportBuilder setSprintBegin(LocalDate sprintBegin);
	IReportBuilder setSprintEnd(LocalDate sprintEnd);
	IReportBuilder addTasks(Task task);
	IReportBuilder setGraphicAdvance(String graphicAdvance);
	IReportBuilder setnumberOfBugs(long numberOfBugs);
	IReportBuilder setnumberCompletedTasks(long numberCompletedTasks);
	IReportBuilder setnumberPendingTasks(long numberPendingTasks);
	IReportBuilder setReportType(ReportType reportType);
	Report build();

}
