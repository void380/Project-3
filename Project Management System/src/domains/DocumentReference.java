package domains;

public class DocumentReference{
	protected int page;
	protected int paragraph;
	
	public DocumentReference(int page, int paragraph){
		this.page = page;
		this.paragraph = paragraph;
	}
	
	@Override
	public boolean equals(Object o){
		// TODO Auto-generated method stub
		return true;
	}
}

