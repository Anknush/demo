package CustomerProject.demo.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ContactMedium {
	    public String type;
	    public Medium medium;
	    public String streetNumber;
	    public String streetName;
	    public String streetType;
	    public List<Characteristic> characteristic;
	    public ContactMedium() {
	    	
	    }
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Medium getMedium() {
			return medium;
		}
		public void setMedium(Medium medium) {
			this.medium = medium;
		}
		public String getStreetNumber() {
			return streetNumber;
		}
		public void setStreetNumber(String streetNumber) {
			this.streetNumber = streetNumber;
		}
		public String getStreetName() {
			return streetName;
		}
		public void setStreetName(String streetName) {
			this.streetName = streetName;
		}
		public String getStreetType() {
			return streetType;
		}
		public void setStreetType(String streetType) {
			this.streetType = streetType;
		}
		public List<Characteristic> getCharacteristic() {
			return characteristic;
		}
		public void setCharacteristic(List<Characteristic> characteristic) {
			this.characteristic = characteristic;
		}
}
