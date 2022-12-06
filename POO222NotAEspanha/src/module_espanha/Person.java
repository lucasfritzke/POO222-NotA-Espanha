// Dupla: Lucas Fritzke e Guilherme W. Back

package module_espanha;

import java.io.Serializable;

public abstract class Person implements Serializable{
	
	private String name;
	
	public Person() {
		
	}

	public Person(String name) {
		super();
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name != null && !name.isBlank()) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Nome Inválido");
		}
		
	}
	
	

}
