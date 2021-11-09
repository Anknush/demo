package CustomerProject.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Medium {
	 	public String city;
	    public String country;
	    public String postcode;
	    public String stateOrProvince;
	    public String type;
	    public String number;
	    public Medium() {
	    	
	    }
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getPostcode() {
			return postcode;
		}
		public void setPostcode(String postcode) {
			this.postcode = postcode;
		}
		public String getStateOrProvince() {
			return stateOrProvince;
		}
		public void setStateOrProvince(String stateOrProvince) {
			this.stateOrProvince = stateOrProvince;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
}
