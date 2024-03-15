package sprintreporter.director;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import sprintreporter.builder.IReportBuilder;
import sprintreporter.model.Member;
import sprintreporter.model.Report;
import sprintreporter.model.ReportType;
import sprintreporter.model.Task;

public class ReportManager {
	
	public Report buildDeveloperReport(IReportBuilder builder) {
		Member member = new Member("Developer", 10);
		
		return buildBasicReport(builder)
				.setTitle("Developer Report")
				.setDescription("Developer Report")
				.addTasks(new Task("Developer Task1", "pending", member))
				.addTasks(new Task("Developer Task2", "finished", member))
				.addTasks(new Task("Developer Task3", "in process", member))
				.setReportType(ReportType.DEVELOPER)
				.build();
		
	}
	
	public Report buildProductReport(IReportBuilder builder) {
		
		Member member = new Member("Developer", 10);
		
		return buildBasicReport(builder)
				.setTitle("Product Owner Report")
				.setDescription("Product Owner Report")
				.setTotalCapacity(20)
				.addTasks(new Task("Developer Task1", "pending", member))
				.addTasks(new Task("Developer Task2", "finished", member))
				.addTasks(new Task("Developer Task3", "in process", member))
				.setGraphicAdvance("show graphic advance")
				.setnumberOfBugs(1)
				.setnumberCompletedTasks(1)
				.setnumberPendingTasks(2)
				.setReportType(ReportType.PRODUCT)
				.build();
	}
	
	public Report buildScrumReport(IReportBuilder builder) {
		
		Member member = new Member("Developer", 10);
		
		return buildBasicReport(builder)
				.setTitle("Scrum Report")
				.setDescription("Scrum Report")
				.addMembers(new Member("Developer", 10))
				.setTotalCapacity(20)
				.addTasks(new Task("Developer Task1", "pending", member))
				.addTasks(new Task("Developer Task2", "finished", member))
				.addTasks(new Task("Developer Task3", "in process", member))
				.setGraphicAdvance("show graphic advance")
				.setnumberOfBugs(1)
				.setnumberCompletedTasks(1)
				.setnumberPendingTasks(2)
				.setReportType(ReportType.PRODUCT)
				.build();
	}
	
	public IReportBuilder buildBasicReport(IReportBuilder builder) {
		
		LocalDate now = LocalDate.now();
		LocalDate end = now.with(TemporalAdjusters.next(now.getDayOfWeek()));
		
		return builder.setSprintBegin(now)
				.setSprintEnd(end);
	}
	
	

}
