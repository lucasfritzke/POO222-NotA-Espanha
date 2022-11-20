package moduleEspanha;
import java.awt.Component;
import java.awt.Image;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import fifa.NationalTeamInfos;
import fifa.NationalTeamStats;

public class Espanha implements NationalTeamInfos, NationalTeamStats{
	
	private HashMap<String, Player> players = new HashMap<>();
	
	
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPressOfficerContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCountryName() {
		// TODO Auto-generated method stub
		return null;
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
	
	

}
