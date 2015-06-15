package reunited.kickstart.controller;

import java.util.Date;

public class Attendance {

	private boolean marked;
	private String id;
	private String userName;
	
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Attendance(boolean marked, String id, Date date,String userName) {
		super();
		this.marked = marked;
		this.id = id;
		this.date = date;
		this.userName=userName;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	private Date date;

	public boolean isMarked() {
		return marked;
	}

	public void setMarked(boolean marked) {
		this.marked = marked;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
