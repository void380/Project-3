package domains;

import java.util.Date;
import java.util.TreeSet;

import domains.Requirement;
import domains.Task;

public class Deliverable {
	
	private int ID;
	private String name;
	private String description;
	private Date dueDate;
	
	private TreeSet<Requirement> listOfRequirements;
	private TreeSet<Task> listOfTasks;
	
	public Deliverable(){
		ID = 0;
		name = "PLACEHOLDER";
		description = "PLACEHOLDER";
		dueDate = new Date();
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getDueDate() {
		return dueDate;
	}
	
	@SuppressWarnings("deprecation")
	public void setDueDate(int year, int month, int day){
		dueDate.setYear(year - 1900);
		dueDate.setDate(day - 1);
		dueDate.setMonth(month);
	}
	
	public void setDueDate(Date date){
		dueDate = date;
	}
	
	
	public void addRequirement(Requirement requirement){
		
		if (requirement != null)
			listOfRequirements.add(requirement);
	}
	
}
