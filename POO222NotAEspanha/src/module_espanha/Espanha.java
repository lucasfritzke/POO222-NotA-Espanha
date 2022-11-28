package module_espanha;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import fifa.NationalTeamInfos;
import fifa.NationalTeamStats;

public class Espanha implements NationalTeamInfos, NationalTeamStats, Serializable {

	private HashMap<String, Player> players = new HashMap<>();
	private ArrayList<TeamManager> teamManagerList = new ArrayList<>();
	private ArrayList<TechnicalCommitteeMember> technicalMemberList = new ArrayList<>();
	private DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	private static String countryName = "Spain";
	private Integer manyQuestions;

	public Espanha() {
		super();
		initizalize();
	}

	private void initizalize() {

		try {
			ObjectInputStream ois = new ObjectInputStream(getClass().getResourceAsStream("/arquivos_espanha/dadosPlayers.dat"));
			this.players = (HashMap<String, Player>) ois.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream ois = new ObjectInputStream(getClass().getResourceAsStream("/arquivos_espanha/dadosTechnicalMember.dat"));
			this.technicalMemberList = (ArrayList<TechnicalCommitteeMember>) ois.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			ObjectInputStream ois = new ObjectInputStream(getClass().getResourceAsStream("/arquivos_espanha/dadosTeamManager.dat"));
			this.teamManagerList = (ArrayList<TeamManager>) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream ois = new ObjectInputStream(getClass().getResourceAsStream("/arquivos_espanha/dadosManyQuestions.dat"));
			this.manyQuestions = (Integer) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		

	}

	public void addTeamManager(String name, String tel1, String tel2, String email, boolean isPressOfficer) {
		// If the user decides to insert one PressOfficer it will look by all the
		// TeamManager List to see if there is one PressOfficer already
		// and checks if the email is already in use
		for (TeamManager tm : teamManagerList) {
			if (isPressOfficer == true && tm.isPressOfficer() == true) {
				throw new IllegalArgumentException("there is already one Press Officer");
			}
			if (email.equals(tm.getEmailAccount())) {
				throw new IllegalArgumentException("this email is already in use");
			}
		}
		// Adding team manager
		TeamManager tm = new TeamManager(name, tel1, tel2, email, isPressOfficer);
		teamManagerList.add(tm);
	}

	public void removeTeamManger(String email) {
		// checks if the email exists, since the email is unique by user its used to
		// delete the managers
		for (TeamManager tm : teamManagerList) {
			if (email.equals(tm.getEmailAccount())) {
				teamManagerList.remove(tm);
				return;
			}
		}
		throw new IllegalArgumentException("No Team Manager with this email");
	}

	public void addTCMember(String name, String nickname, String role, LocalDate birthDate) {
		TechnicalCommitteeMember tcm = new TechnicalCommitteeMember(name, nickname, role, birthDate);
		technicalMemberList.add(tcm);
	}

	public void removeTCMember(String name) {
		for (TechnicalCommitteeMember tcm : technicalMemberList) {
			if (tcm.getName().equals(name)) {
				technicalMemberList.remove(tcm);
				return;
			}
		}
		throw new IllegalArgumentException("No TCMember with this name");

	}

	public void addPlayer(String name, String number, String nickName, double heigth, double weigth,
			LocalDate birthDate, String position, String currentClub) {
		if (number != null && !players.containsKey(number)) {
			Player p = new Player(name, number, nickName, heigth, weigth, birthDate, position, currentClub);
			players.put(p.getNumber(), p);
		} else {
			throw new IllegalArgumentException("number to play already used");
		}

	}

	public void removePlayer(String number) {
		if (number != null && players.containsKey(number)) {
			Player p = players.get(number);
			players.remove(number);
			JOptionPane.showMessageDialog(null, "Player " + p.getName() + "successfully removed");
		} else {
			throw new IllegalArgumentException("player does not exist");
		}
	}

	@Override
	public int getHowManyMembers() {
		this.manyQuestions++;
		int manyMembers = 0;
		manyMembers += players.size(); // Quantos jogadores tem cadastrado
		return manyMembers;

	}

	@Override
	public int getOldestPlayer() {
		this.manyQuestions++;
		int olderPlayer = 0;
		if (!players.isEmpty()) {

			for (Player p : players.values()) {
				if (p.getAge() > olderPlayer) {
					olderPlayer = p.getAge();
				}
			}
			return olderPlayer;
		} else {
			return 0;
		}

	}

	@Override
	public int getYoungestPlayer() {
		this.manyQuestions++;
		int youngesPlayer = -1;
		if (!players.isEmpty()) {

			for (Player p : players.values()) {
				if (youngesPlayer == -1 || p.getAge() < youngesPlayer) {
					youngesPlayer = p.getAge();
				}

			}
			return youngesPlayer;
		} else {
			return 0;
		}

	}

	@Override
	public double getAverageAge() {
		this.manyQuestions++;
		double sumAge = 0;
		double count = 0;
		if (!players.isEmpty()) {
			for (Player p : players.values()) {
				sumAge += p.getAge();
				count++;
			}

			return sumAge / count;

		} else {
			return 0;
		}
	}

	@Override
	public String getPlayer(int number) {
		this.manyQuestions++;
		if (players.containsKey(Integer.toString(number))) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			Player p = players.get(Integer.toString(number));
			JsonObject js = new JsonObject();
			js.addProperty("number: ", p.getNumber());
			js.addProperty("name: ", p.getName());
			js.addProperty("nickname", p.getNickName());
			js.addProperty("height", p.getHeigth());
			js.addProperty("weight", p.getWeigth());
			js.addProperty("birthDate", df.format(p.getBirthDate()));
			js.addProperty("position", p.getPosition());
			js.addProperty("number: ", p.getNumber());
			js.addProperty("currentClub", p.getCurrentClub());
			p.countQuestion();
			players.put(p.getNumber(), p);
			String json = gson.toJson(js).toString();
			return json;
		} else {
			return null;
		}
	}

	@Override
	public String getPressOfficerContacts() {
		this.manyQuestions++;
		TeamManager tmTemporary = null;
		for (TeamManager tm : teamManagerList) {
			if (tm.isPressOfficer() == true) {
				tmTemporary = tm;
				break;
			}
		}
		if (tmTemporary == null) {
			return null;
		}
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonObject js = new JsonObject();
		js.addProperty("name", tmTemporary.getName());
		js.addProperty("cellphone1", tmTemporary.getTel1());
		js.addProperty("cellphone2", tmTemporary.getTel2());
		js.addProperty("email", tmTemporary.getEmailAccount());
		String json = gson.toJson(js).toString();
		return json;
	}

	@Override
	public String getCountryName() {
		manyQuestions++;
		return this.countryName;
	}

	@Override
	public Image getFlagImage() {
		this.manyQuestions++;
		
		BufferedImage bim = null;
		try {
			bim = ImageIO.read(getClass().getResourceAsStream("/arquivos_espanha/countryFlag.jpg"));
			Image im = bim.getScaledInstance(1118, 788, 300);
			return im;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Path getTechnicalCommittee() {
		this.manyQuestions++;
		File fl = new File("TechnicalCommittee.json");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonArray jsa = new JsonArray();

		for (TechnicalCommitteeMember tmt : technicalMemberList) {
			JsonObject jsn = new JsonObject();
			jsn.addProperty("name", tmt.getName());
			jsn.addProperty("nickname", tmt.getNickname());
			jsn.addProperty("role", tmt.getRole());
			jsn.addProperty("birthDate", df.format(tmt.getBirthDate()));
			jsa.add(jsn);
		}

		try (FileWriter fw = new FileWriter(fl);) {
			// BufferedWriter bw = new BufferedWriter(fw);
			// bw.write(gson.toJson(jsa).toString());
			fw.write(gson.toJson(jsa).toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Path.of(fl.toString());
	}

	@Override
	public NationalTeamStats getStatsResponsible() {
		return this;
	}

	@Override
	public int getHowManyQuestions() {
		
		return this.manyQuestions;
	}

	@Override
	public String getHowManyCallsToPlayer(int number) {
		
		if(players.containsKey(Integer.toString(number))) {
			Player p = players.get(Integer.toString(number));
			return Integer.toString(p.getHowManyQuestions());
		} else {
			return null;
		}
		
	}

	
	
	
	public ArrayList<String> getPositionsList() {
		Player p = new Player();
		return p.getPositionsList();
	}

	
	public void salvar() {
		
		
		try (	FileOutputStream fos = new FileOutputStream("src/arquivos_espanha/dadosPlayers.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(this.players); 

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try (FileOutputStream fos = new FileOutputStream("src/arquivos_espanha/dadosTeamManager.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) { 
			oos.writeObject(this.teamManagerList);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try (FileOutputStream fos = new FileOutputStream("src/arquivos_espanha/dadosTechnicalMember.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) { 
			oos.writeObject(this.technicalMemberList);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try (FileOutputStream fos = new FileOutputStream("src/arquivos_espanha/dadosManyQuestions.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) { 
			oos.writeObject(this.manyQuestions);
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		this.salvar();
	}
	
	

}
