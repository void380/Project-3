package domains;

import java.util.List;

public class DropDownList {

	private String tableName;
	private String attributeName;
	private String selectedOption;
	
	private List<String> listOfOptions;
	
	public DropDownList(String tableName, String attributeName, List<String> listOfOptions) {
		
		this.tableName = tableName;
		this.attributeName = attributeName;
		this.listOfOptions = listOfOptions;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	
	public String getSelectedOption() {
		return selectedOption;
	}

	public void setSelectedOption(String selectedOption) {
		this.selectedOption = selectedOption;
	}

	public void addOption(String option) {
		if (!listOfOptions.contains(option))
			listOfOptions.add(option);
	}
	
	public void removeOption(String option) {
		listOfOptions.remove(option);
	}
	
	public List<String> getOptions(){
		return listOfOptions;
	}
	
	@Override
	public boolean equals(Object o){
		// TODO Auto-generated method stub
		return true;
	}
}
