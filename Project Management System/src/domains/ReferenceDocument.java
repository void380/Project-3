package domains;

public class ReferenceDocument {
	private int ID;
	private String name;
	private String referenceTopic;  //Indicates which category the reference is for, either Decisions or Requirements.
	private int referenceID;  //Indicates the ID of the specific Decision or Requirement.
	private String referenceName;  //Indicates the name specific Decision or Requirement.
	
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
	public String getReferenceTopic() {
		return referenceTopic;
	}
	public void setReferenceTopic(String referenceTopic) {
		this.referenceTopic = referenceTopic;
	}
	public int getReferenceID() {
		return referenceID;
	}
	public void setReferenceID(int referenceID) {
		this.referenceID = referenceID;
	}
	public String getReferenceName() {
		return referenceName;
	}
	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}
	
	@Override
	public boolean equals(Object o){
		// TODO Auto-generated method stub
		return true;
	}
}
