package reunited.kickstart.controller;

import java.util.Date;

public class Attendance {

	private boolean marked;
	private String id;
	
	

	public Attendance(boolean marked, String id, Date date) {
		super();
		this.marked = marked;
		this.id = id;
		this.date = date;
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
