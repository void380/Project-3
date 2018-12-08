package domains;

import java.util.List;
import java.util.Date;

public class Resource {
	
	private String title;
	private List<Date> availability;
	private float payRate;
	
	public Resource(){
		title = "";
		payRate = 0.0f;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Date> getAvailability() {
		return availability;
	}
	public void setAvailability(List<Date> availability) {
		this.availability = availability;
	}
	public float getPayRate() {
		return payRate;
	}
	public void setPayRate(float payRate) {
		this.payRate = payRate;
	}
	
	
}
