package CustomerProject.demo.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Agreement {
    public Date startDate;
    
    public Agreement() {
    	
    }

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}
