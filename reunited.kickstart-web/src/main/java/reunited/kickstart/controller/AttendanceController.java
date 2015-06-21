package reunited.kickstart.controller;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;



@ManagedBean
@RequestScoped
public class AttendanceController {
	
	
	@Inject
	private FacesContext facesContext;

	private List<ProfileBean> selectedProfiles;
	
	
	private Date to;
	private Date from;
	public FacesContext getFacesContext() {
		return facesContext;
	}
	public void setFacesContext(FacesContext facesContext) {
		this.facesContext = facesContext;
	}
	public List<ProfileBean> getSelectedProfiles() {
		return selectedProfiles;
	}
	public void setSelectedProfiles(List<ProfileBean> selectedProfiles) {
		this.selectedProfiles = selectedProfiles;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	
	
	public void mark(){
		System.out.println("Mark called");
		//write new service to add multiple attaendance in db
	}
	
	
	 public void onRowSelect(SelectEvent event) {
	        FacesMessage msg = new FacesMessage("Car Selected");
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }
	 
	    public void onRowUnselect(UnselectEvent event) {
	        FacesMessage msg = new FacesMessage("Car Unselected");
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }
	
	
	
	
	

}
