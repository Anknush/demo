package CustomerProject.demo.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AccountPartyRole {
	public List<ContactMedium> contactMedium;
    public List<Characteristic> characteristic;
    public AccountPartyRole() {
    	
    }
	public List<ContactMedium> getContactMedium() {
		return contactMedium;
	}
	public void setContactMedium(List<ContactMedium> contactMedium) {
		this.contactMedium = contactMedium;
	}
	public List<Characteristic> getCharacteristic() {
		return characteristic;
	}
	public void setCharacteristic(List<Characteristic> characteristic) {
		this.characteristic = characteristic;
	}
}
