package drivers;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Date;
import java.util.List;

import domains.Deliverable;
import domains.Requirement;

public class IOController {
	
	public static final int TEXT_SMALL = 50;
	public static final int TEXT_LARGE = 500;
	private static Scanner input  = new Scanner(System.in);
	
	public static void closeInput(){ input.close(); }
	
	public static int inputNumeric(){
		int num = input.nextInt();
		return num;
	}
	
	public static String inputTextSmall(){
		String text = "";
		
			while (text.length() == 0 || text.length() > TEXT_SMALL)
				text = input.nextLine();
		
		text = text.replace("\n", "");
		
		return text;
	}
	
	public static String inputTextLarge(){
		String text = "";
		
			while (text.length() == 0 || text.length() > TEXT_LARGE)
				text = input.nextLine();
		
		text = text.replace("\n", "");
		
		return text;
	}
	
	@SuppressWarnings("deprecation")
	public static Date inputDate(){
		
		Date date;
		int year = 0, month = 0, day = 0;
		
		System.out.print("\nEnter Date Year:  ");
		year = input.nextInt();
		
		System.out.print("\nEnter Date Month:  ");
		month = input.nextInt();
		
		System.out.print("\nEnter Date Day:  ");
		day = input.nextInt();
		
		date = new Date(year - 1900, month - 1, day);
		return date;
	}
	
	
	public static void displayDeliverables(List<Deliverable> list){
		
		Iterator<Deliverable> deliverableIterator = list.iterator();
		
		while (deliverableIterator.hasNext()){
			Deliverable deliv = deliverableIterator.next();
			System.out.println("ID:  " + deliv.getID());
			System.out.println("name:  " + deliv.getName());
			System.out.println("description:  " + deliv.getDescription());
			System.out.println("dueDate:  " + deliv.getDueDate());
		}
	}
	
	public static void displayRequirements(List<Requirement> list){
		
		Iterator<Requirement> requirementIterator = list.iterator();
		
		while (requirementIterator.hasNext()){
			Requirement req = requirementIterator.next();
			System.out.println("ID:  " + req.getID());
			System.out.println("name:  " + req.getName());
			System.out.println("requirement text:  " + req.getReqText());
			System.out.println("source document:  " + req.getSourceDoc());
		}
	}
	
	public static Deliverable createDeliverable(){
		
		Deliverable newDeliverable = new Deliverable();
		
		String name = "", description = "";
		Date dueDate;
		
		System.out.println("---------------------------\n\t\n" + "Deliverable Creation\n\n");
		
		System.out.print("Enter Name (up to " + IOController.TEXT_SMALL + " characters):  ");
		name  = IOController.inputTextSmall();
		
		System.out.print("Enter Description (up to " + IOController.TEXT_LARGE + " characters):  ");
		description = IOController.inputTextLarge();
		
		System.out.println("Due Date Field");
		dueDate = IOController.inputDate();
		
		newDeliverable.setName(name);
		newDeliverable.setDescription(description);
		newDeliverable.setDueDate(dueDate);
		
		return newDeliverable;
	}
	
	public static Requirement createRequirement(){
		
		Requirement requirement = new Requirement();
		String name = "", reqText = "", sourceDoc = "";
		
		System.out.println("---------------------------\n\t\n" + "Requirement Creation\n\n");
		
		System.out.print("Enter Name (up to " + IOController.TEXT_SMALL + " characters):  ");
		name  = IOController.inputTextSmall();
		
		System.out.print("Enter Requirement Text (up to " + IOController.TEXT_LARGE + " characters):  ");
		reqText = IOController.inputTextLarge();
		
		System.out.print("Enter Source Document Name (up to " + IOController.TEXT_SMALL + " characters):  ");
		sourceDoc  = IOController.inputTextSmall();
		
		requirement.setName(name);
		requirement.setReqText(reqText);
		requirement.setSourceDoc(sourceDoc);

		return requirement;
	}
	

	
}
