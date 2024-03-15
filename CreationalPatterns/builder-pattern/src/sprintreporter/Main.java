package sprintreporter;

import java.util.Scanner;

import sprintreporter.builder.IReportBuilder;
import sprintreporter.builder.ReportBuilderImpl;
import sprintreporter.director.ReportManager;
import sprintreporter.model.Report;

public class Main {

	public static void main(String[] arg) {
		String option;
		do {
			option = showMenu();
			showReport(option);
		} while (!option.equals("4"));
	}

	private static String showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the report generator for this sprint.!!");
		System.out.println("Select the report you need to view: ");
		System.out.println("1. Developer");
		System.out.println("2. Product Owner");
		System.out.println("3. Scrum Master");
		System.out.println("4. Exit");
		System.out.println("");
		String selectedOption = sc.nextLine();
		//sc.close();
		return selectedOption;
	}

	private static void showReport(String option) {
		ReportManager reportManager = new ReportManager();
		IReportBuilder reportBuilder = new ReportBuilderImpl();
		Report report;
		switch (option) {
		case "1":
			report = reportManager.buildDeveloperReport(reportBuilder);
			System.out.println(report);
			break;
		case "2":			
			report = reportManager.buildProductReport(reportBuilder);
			System.out.println(report);
			break;
		case "3":			
			report = reportManager.buildScrumReport(reportBuilder);
			System.out.println(report);
			break;
		case "4":
			System.out.println("Thanks for using our report generator!");
			break;
		}
	}

}
