package drivers;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import drivers.SqlConnection;
import domains.Deliverable;
import drivers.DeliverableDAO;
import domains.Requirement;
import drivers.RequirementDAO;


public class DBController {

	public static void main(String[] args) throws IOException {
		
		SqlSessionFactory factory = SqlConnection.getSessionFactory();
		SqlSession session = factory.openSession();
		
		
		//------------------------------------------------------------------------------------------------------
		// USED FOR CREATING A NEW DELIVERABLE ENTRY IN THE MYSQL DATABASE DELIVERABLES TABLE.
		/*
		Deliverable newDeliverable = IOController.createDeliverable();
		DeliverableDAO.createDeliverable(session, newDeliverable);
		*/
		
		//------------------------------------------------------------------------------------------------------
		
		//------------------------------------------------------------------------------------------------------
		//The creation of the requirement object does not involve adding in foreign key associations.
		//That is done separately after the creation of the requirement by calling the RequirementDAO.allocateDeliverable method and specifying the necessary keys.
		//The key of the newly created Requirement object is passed into the first parameter, then the key of the desired Deliverable object to allocate to.
		/*
		Requirement newRequirement = IOController.createRequirement();  
		RequirementDAO.createRequirement(session, newRequirement);
		
		
		//The prompts for allocating a requirement to a deliverable.
		int reqID, delivID;
		
		IOController.displayRequirements(RequirementDAO.getRequirements(session));
		System.out.println("Enter the ID of the Requirement you wish to modify:  ");
		reqID = IOController.inputNumeric();
		
		IOController.displayDeliverables(DeliverableDAO.getDeliverables(session));
		System.out.println("Enter the ID of the Deliverable you wish to allocate the Requirement to:  ");
		delivID = IOController.inputNumeric();
		
		RequirementDAO.allocateDeliverable(session, reqID, delivID);
		*/
		//------------------------------------------------------------------------------------------------------
		
		//List<Requirement> allocatedReqs = RequirementDAO.getRequirementsAllocatedToDeliverableID(session, 76);
		//IOController.displayRequirements(allocatedReqs);
		
		
		
		session.close();
		IOController.closeInput();
	}

}
