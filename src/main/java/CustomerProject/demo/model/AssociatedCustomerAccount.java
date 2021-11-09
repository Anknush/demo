package CustomerProject.demo.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AssociatedCustomerAccount {
	public String accountStatus;
    public List<Characteristic> characteristic;
    public AccountPartyRole accountPartyRole;
    public Agreement agreement;
    public AssociatedCustomerAccount() {
    	
    }
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public List<Characteristic> getCharacteristic() {
		return characteristic;
	}
	public void setCharacteristic(List<Characteristic> characteristic) {
		this.characteristic = characteristic;
	}
	public AccountPartyRole getAccountPartyRole() {
		return accountPartyRole;
	}
	public void setAccountPartyRole(AccountPartyRole accountPartyRole) {
		this.accountPartyRole = accountPartyRole;
	}
	public Agreement getAgreement() {
		return agreement;
	}
	public void setAgreement(Agreement agreement) {
		this.agreement = agreement;
	}
}
