// Dupla: Lucas Fritzke e Guilherme W. Back

package module_espanha;

import java.io.Serializable;
import java.time.LocalDate;

public class TechnicalCommitteeMember extends Person implements Serializable {
	//Atributos 
		private String nickname;
		private String role;
		private LocalDate birthDate;
		
		//Constructors
		public TechnicalCommitteeMember() {
			super();
		}
		public TechnicalCommitteeMember(String name,String nickname, String role, LocalDate birthDate) {
			super(name);
			this.setBirthDate(birthDate);
			this.setNickname(nickname);
			this.setRole(role);
		}
		
		//Nickname
		public String getNickname() {
			return this.nickname;
		}
		public void setNickname(String nickname) {
			if(nickname != null && !nickname.isBlank()) {this.nickname = nickname;}
			else {throw new IllegalArgumentException("invalid nickname");}
		}
		//Role 
		public String getRole() {
			return this.role;
		}
		public void setRole(String role) {
			if(role != null && !role.isBlank()) {this.role = role;}
			else {throw new IllegalArgumentException("invalid role");}
			
		}
		//BirthDate
		public LocalDate getBirthDate() {
			return this.birthDate;
		}
		public void setBirthDate(LocalDate birthDate){
			if(birthDate != null) {this.birthDate = birthDate;}
			else {throw new IllegalArgumentException("invalid birthDate");}
		}
		
}
