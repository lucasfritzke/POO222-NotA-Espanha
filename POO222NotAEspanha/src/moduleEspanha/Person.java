package moduleEspanha;

public abstract class Person {
	
	private String name;

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
