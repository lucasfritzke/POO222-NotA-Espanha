package moduleEspanha;

import java.io.Serializable;
import java.time.LocalDate;

public class PressOfficerContacts extends Person implements Serializable{
	//Atributos 
	private String nickname;
	private String role;
	private LocalDate birthDate;
	
	//Constructors
	public PressOfficerContacts() {
		super();
	}
	public PressOfficerContacts(String name,String nickname, String role, LocalDate birthDate) {
		super(name);
		setBirthDate(birthDate);
		setName(nickname);
		setRole(role);
	}
	
	//Nickname
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		if(nickname != null && !nickname.isBlank()) {this.nickname = nickname;}
		else {throw new IllegalArgumentException("invalid nickname");}
	}
	//Role 
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		if(role != null && !role.isBlank()) {this.role = role;}
		else {throw new IllegalArgumentException("invalid role");}
		
	}
	//BirthDate
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate){
		if(birthDate != null) {this.birthDate = birthDate;}
		else {throw new IllegalArgumentException("invalid birthDate");}
	}
	
	
}
	