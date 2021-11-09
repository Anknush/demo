package CustomerProject.demo.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class IndividualName {
	public String familyName;
    public String givenName;
    public List<Characteristic> characteristic;
    public IndividualName() {
    	
    }
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public List<Characteristic> getCharacteristic() {
		return characteristic;
	}
	public void setCharacteristic(List<Characteristic> characteristic) {
		this.characteristic = characteristic;
	}
}
