package CustomerProject.demo.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Account {
	    public List<Characteristic> characteristic;
	    public List<AssociatedCustomerAccount> associatedCustomerAccount;
	    public Account() {
	    	
	    }
		public List<Characteristic> getCharacteristic() {
			return characteristic;
		}
		public void setCharacteristic(List<Characteristic> characteristic) {
			this.characteristic = characteristic;
		}
		public List<AssociatedCustomerAccount> getAssociatedCustomerAccount() {
			return associatedCustomerAccount;
		}
		public void setAssociatedCustomerAccount(List<AssociatedCustomerAccount> associatedCustomerAccount) {
			this.associatedCustomerAccount = associatedCustomerAccount;
		}
}
