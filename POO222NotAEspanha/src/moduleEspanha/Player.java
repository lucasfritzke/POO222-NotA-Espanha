package moduleEspanha;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Player extends Person implements Serializable {

	// Atributos
	private String number;
	private String nickName;
	private double heigth;
	private double weigth;
	private LocalDate birthDate;
	private String position;
	private String currentClub;
	private int howManyQuestions;
	private static ArrayList<String> positionsList = new ArrayList<>(Arrays.asList("Goalkeeper", "Right-back",
			"Centre-back", "Forward", "Defensive Mid", "Attacking Mid", "Winger", "Striker"));

	// Classe utilizada para testes
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String name, String number, String nickName, double heigth, double weigth, LocalDate birthDate, String position,
			String currentClub) {
		super(name);
		this.setNumber(number);
		this.setNickName(nickName);
		this.setHeigth(heigth);
		this.setWeigth(weigth);
		this.setBirthDate(birthDate);
		this.setPosition(position);
		this.setCurrentClub(currentClub);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		// Caso o usuario passe uma String com letras, não será possivel utilizar o
		// parseInt
		// Nesse caso vai gerar uma exception que tratamos no try/catch

		try {
			if (Integer.parseInt(number) > 0) {
				this.number = number;
			} else {
				throw new IllegalArgumentException("invalid number"); // Numero negativo ou zero
			}
		} catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException("invalid number"); // numero invalido
		}

	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {

		if (nickName != null && !nickName.isEmpty()) {
			this.nickName = nickName;
		} else {
			throw new IllegalArgumentException("nickname invalid");
		}

	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {

		if (heigth >= 0) {
			this.heigth = heigth;
		} else {
			throw new IllegalArgumentException("heigth invalid");
		}
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {

		if (weigth > 0) {
			this.weigth = weigth;
		} else {
			throw new IllegalArgumentException("weigth invalid");
		}
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {

		if (birthDate != null) {
			this.birthDate = birthDate;
		} else {
			throw new IllegalArgumentException("birthDate invalid");
		}
	}

	public String getCurrentClub() {
		return currentClub;
	}

	public void setCurrentClub(String currentClub) {
		if (currentClub != null && !currentClub.isBlank()) {
			this.currentClub = currentClub;
		} else {
			throw new IllegalArgumentException("currentClub invalid");
		}

	}

	public int addHowManyQuestions() {
		return howManyQuestions;
	}

	public void setHowManyQuestions() {
		this.howManyQuestions++;
	}

	public String getPosition() {
		return position;
	}

	// Retorna para classe de apresentacao as posicoes existentes
	public ArrayList<String> getPositionsList() {
		return this.positionsList;
	}

	public void setPosition(String position) {

		if (position != null && positionsList.contains(position)) {
			this.position = position;
		} else {
			throw new IllegalArgumentException("Posição invalida");
		}

	}

}
