package CustomerProject.demo.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RootAccount {
		public List<Account> account;
	    public List<Characteristic> characteristic;
	    public IndividualName individualName;
	    public RootAccount() {
	    	
	    }
		public List<Account> getAccount() {
			return account;
		}
		public void setAccount(List<Account> account) {
			this.account = account;
		}
		public List<Characteristic> getCharacteristic() {
			return characteristic;
		}
		public void setCharacteristic(List<Characteristic> characteristic) {
			this.characteristic = characteristic;
		}
		public IndividualName getIndividualName() {
			return individualName;
		}
		public void setIndividualName(IndividualName individualName) {
			this.individualName = individualName;
		}
	  
}
