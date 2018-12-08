package domains;

import java.util.List;

public class Requirement {
	
	private Integer ID;
	private String name;
	private String reqText;
	private String sourceDoc;

	private List<DocumentReference> sourceLocation;
	private List<DocumentReference> clientRef;
	
	//Indicates which specific deliverable is associated with this requirement.
	private int deliverableAssociated;

	public Requirement(){
		ID = 0;
		name = "";
		reqText = "";
		sourceDoc = "";
		
		deliverableAssociated = 0;
	}
	
	public Integer getID(){ return ID; }
	
	public void setName(String name){ 
		
		if(name.length() > 0)
			this.name = name;
		
	}
	
	public String getName() { return name; }
	
	public void setReqText(String text){ 
		
		if(text.length() > 0)
			reqText = text;
		
	}
	
	public String getReqText() { return reqText; }
	
	public void setSourceDoc(String doc) { 
		
		if(doc.length() > 0)
			sourceDoc = doc;
		
	}
	
	public String getSourceDoc() { return sourceDoc; }
	
	public void allocateDeliverable(int deliv) {
		deliverableAssociated = deliv;
	}
	
	public void deallocateDeliverable(Deliverable deliv) {
		deliverableAssociated = -1;
	}
	
	public int getDeliverable() { return deliverableAssociated; }
	
	public void addSourceLocation(int page, int paragraph) {
		
		if (page < 1 || paragraph < 1) {
			System.out.print("\n\n\t" + "Error:  Page or paragraph number is invalid!");
			return;
		}
		
		DocumentReference ref = new DocumentReference(page, paragraph);
		
		if (!sourceLocation.contains(ref))
			sourceLocation.add(ref);
	}
	
	public void removeSourceLocation(int page, int paragraph) {
		
		if (page < 1 || paragraph < 1) {
			System.out.print("\n\n\t" + "Error:  Page or paragraph number is invalid!");
			return;
		}
		
		DocumentReference ref = new DocumentReference(page, paragraph);
		sourceLocation.remove(ref);
	}
	
	public void addClientRef(int page, int paragraph) {
		
		if (page < 1 || paragraph < 1) {
			System.out.print("\n\n\t" + "Error:  Page or paragraph number is invalid!");
			return;
		}
		
		DocumentReference ref = new DocumentReference(page, paragraph);
		
		if (!clientRef.contains(ref))
			clientRef.add(ref);
	}
	
	public void removeClientRef(int page, int paragraph) {
		
		if (page < 1 || paragraph < 1) {
			System.out.print("\n\n\t" + "Error:  Page or paragraph number is invalid!");
			return;
		}
		
		DocumentReference ref = new DocumentReference(page, paragraph);
		clientRef.remove(ref);
	}
	
	
	
	
	
	
}
