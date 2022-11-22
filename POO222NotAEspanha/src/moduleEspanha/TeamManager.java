package moduleEspanha;

import java.io.Serializable;
import java.time.LocalDate;

public class TeamManager extends Person implements Serializable{
	//Atributes
	private String tel1;
	private String tel2;
	private String  emailAccount;
	private boolean pressOfficer;
	
	//Constructors
	public TeamManager() {
		super();
	}
	public TeamManager(String name,String tel1, String tel2, String email, boolean isPressOfficer) {
		super(name);
		setTel1(tel1);
		setTel2(tel2);
		setEmailAccount(email);
		setManager(isPressOfficer);
	}

	//Tel1
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		if(tel1 != null && !tel1.isBlank()) {this.tel1 = tel1;}
		else {throw new IllegalArgumentException("invalid tel1");}
	}
	//Tel2
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		if(tel2 != null && !tel2.isBlank()) {this.tel2 = tel2;}
		else {throw new IllegalArgumentException("invalid tel2");}
	}
	//Email
	public String getEmailAccount() {
		return emailAccount;
	}
	public void setEmailAccount(String emailAccount) {
		if(emailAccount != null && !emailAccount.isBlank()) {this.emailAccount = emailAccount;}
		else {throw new IllegalArgumentException("invalid emailAccount");}

	}
	// If IsManager = true this class is the press officer 
	public boolean isPressOfficer() {
		return pressOfficer;
	}
	public void setManager(boolean pressOfficer) {
		this.pressOfficer = pressOfficer;
	}
	
}
	