package moduleEspanha;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.JOptionPane;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import fifa.NationalTeamInfos;
import fifa.NationalTeamStats;

public class Espanha implements NationalTeamInfos, NationalTeamStats, Serializable {
	
	private HashMap<String, Player> players = new HashMap<>();
	private ArrayList<PressOfficerContacts> pressOfficerList = new ArrayList<>();
	private ArrayList<TechnicalCommitteeMember> technicalMemberList = new ArrayList<>();
	private DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	private static String countryName = "Spain";
	
	public Espanha() {
		super();
		initizalize();
	}

	private void initizalize() {
		
			try(FileInputStream fis = new FileInputStream("dadosEspanha.dat");
					ObjectInputStream ois = new ObjectInputStream(fis)) {
				
				players = (HashMap<String, Player>)ois.readObject();
				pressOfficerList = (ArrayList<PressOfficerContacts>)ois.readObject();
				technicalMemberList = (ArrayList<TechnicalCommitteeMember>)ois.readObject();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(null,"Primeira execu��o. Arquivo ainda n�o existe.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	public void addPlayer(String name, String number, String nickName, double heigth, 
			double weigth, LocalDate birthDate, String position,String currentClub) {
		if(number != null && !players.containsKey(number)) {
			Player p = new Player(name, number, nickName, heigth, weigth, birthDate, position, currentClub);
			players.put(p.getNumber(), p);
		} else {
			throw new IllegalArgumentException("number to play already used");
		}
		
	}
	
	public void removePlayer(String number) {
		if(number != null && players.containsKey(number)) {
			Player p =players.get(number);
			players.remove(number);
			JOptionPane.showMessageDialog(null, "Player "+ p.getName()+ "successfully removed");
		} else {
			throw new IllegalArgumentException("player does not exist");
		}
	}
	
	@Override
	public int getHowManyMembers() {
		
		int manyMembers=0;
		manyMembers += players.size(); // Quantos jogadores tem cadastrado
		return manyMembers;
		
	}

	@Override
	public int getOldestPlayer() {
		int olderPlayer=0;
		if(!players.isEmpty()) {
			
			for (Player p : players.values()) {	
				if(p.getAge() > olderPlayer){
					olderPlayer = p.getAge();
				}
			}
			
		} else {
			throw new IllegalArgumentException("There are no registered player");
		}
		return olderPlayer;
	}

	@Override
	public int getYoungestPlayer() {
		int youngesPlayer = -1;
		if(!players.isEmpty()) {
			
			for (Player p : players.values()) {
				if(youngesPlayer == -1 || p.getAge() < youngesPlayer){
					youngesPlayer = p.getAge();
				}
			}
			
		} else {
			throw new IllegalArgumentException("There are no registered player");
		}
		return youngesPlayer;
	}

	@Override
	public double getAverageAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String getPlayer(int number) {
		
		if(players.containsKey(Integer.toString(number))) {
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
			String json = gson.toJson(js).toString();
			return json;
			
		} else {
			return null;
		}
	}

	@Override
	public String getPressOfficerContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCountryName() {
		// TODO Auto-generated method stub
		return this.countryName;
	}

	@Override
	public Image getFlagImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Path getTechnicalCommittee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NationalTeamStats getStatsResponsible() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHowManyQuestions() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getHowManyCallsToPlayer(int number) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<String> getPositionsList() {
		Player p = new Player();
		return p.getPositionsList();
	}
	
	public void salvar() {
		
		try (FileOutputStream fos = new FileOutputStream("dadosEspanha.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(players);
			oos.writeObject(pressOfficerList);
			oos.writeObject(technicalMemberList);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
