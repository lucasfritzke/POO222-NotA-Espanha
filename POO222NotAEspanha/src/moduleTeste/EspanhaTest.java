package moduleTeste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import fifa.NationalTeamStats;
import module_espanha.Espanha;
import module_espanha.Player;

class EspanhaTest {
	
	Espanha e = new Espanha();
	
	@Test
	void testGetHowManyMembers() {
		// 2 dirigentes + 3 integrantes da equite tecnica + 13 jogadores = 18
		assertEquals(18, e.getHowManyMembers());
		
	}
	
	@Test
	void testGetOldestPlayer() {
		// Yeremi Pino - Jogador numero 7 é o mais velho
		assertEquals(7, e.getOldestPlayer());
	}
	
	@Test
	void testGetYoungestPlayer() {
		// Sergio Busquets - Jogador numero 8 é o mais novo
		assertEquals(8, e.getYoungestPlayer());
	}
	
	@Test
	void testGetPlaye() {
		String p = e.getPlayer(10);
		JsonObject jo = (JsonObject) JsonParser.parseString(p);
		JsonElement nome = jo.get("name");
		assertEquals("Marco Asensio", nome.getAsString());
	}
	
	@Test
	void testGetPlaye2() {
		String p = e.getPlayer(9);
		JsonObject jo = (JsonObject) JsonParser.parseString(p);
		JsonElement club = jo.get("currentClub");
		assertEquals("RB Leipzig", club.getAsString());
	}
	
	@Test
	void testgetPressOfficerContacts() {
		String p = e.getPressOfficerContacts();
		JsonObject jo = (JsonObject) JsonParser.parseString(p);
		JsonElement nome = jo.get("name");
		assertEquals("Marcos Rodriguez", nome.getAsString());
	}
	
	@Test
	void testGetCountryName() {
		assertEquals("Spain", e.getCountryName());
	}
	
	@Test
	void testGetStatsResponsible() {
		int qtd_inicial = e.getHowManyQuestions();
		double d = e.getAverageAge();
		int i = e.getOldestPlayer();
		NationalTeamStats n = e;
		assertEquals((qtd_inicial+2), n.getHowManyQuestions());
	}
	
	
	
	@Test
	void testGetHowManyCallsToPlayer() {
		int qtd_inicial = e.getHowManyCallsToPlayer(1);
		String j = e.getPlayer(1);
		assertEquals((qtd_inicial+1),e.getHowManyCallsToPlayer(1));
	}
	
	@Test
	void testGetHowManyCallsToPlayerStats() {
		int qtd_inicial =e.getHowManyCallsToPlayer(1);
		String j = e.getPlayer(1);
		j = e.getPlayer(1);
		j = e.getPlayer(1);
		NationalTeamStats n = e;
		assertEquals((qtd_inicial+3),n.getHowManyCallsToPlayer(1));
	}
}
