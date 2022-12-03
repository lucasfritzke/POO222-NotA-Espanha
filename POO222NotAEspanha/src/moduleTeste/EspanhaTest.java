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
		Gson gson = new Gson();
		String p = e.getPlayer(10);
		JsonObject jo = (JsonObject) JsonParser.parseString(p);
		JsonElement nome = jo.get("name");
		assertEquals("Marco Asensio", nome.getAsString());
	}
	
	/*
	@Test
	void testgetOldestPlayer() {
		Espanha e = new Espanha();
		e.addPlayer("Lucas","10","LC",1.84, 65.2, LocalDate.of(2000, 12, 25), "Forward","Vasco");
		e.addPlayer("Lucas","11","LC",1.84, 65.2, LocalDate.of(1995, 12, 25), "Forward","Vasco");
		e.addPlayer("Lucas","13","LC",1.84, 65.2, LocalDate.of(1992, 12, 25), "Forward","Vasco");
		assertEquals(29, e.getOldestPlayer());
	}
	
	@Test
	void testgetYoungestPlayer() {
		Espanha e = new Espanha();
		e.addPlayer("Lucas","10","LC",1.84, 65.2, LocalDate.of(2000, 12, 25), "Forward","Vasco");
		e.addPlayer("Lucas","11","LC",1.84, 65.2, LocalDate.of(1995, 12, 25), "Forward","Vasco");
		e.addPlayer("Lucas","13","LC",1.84, 65.2, LocalDate.of(1992, 12, 25), "Forward","Vasco");
		assertEquals(21, e.getYoungestPlayer());
	}
	
	@Test
	void testgetYoungestPlayerException() {
		Espanha e = new Espanha();
		assertThrows(IllegalArgumentException.class, () -> e.getYoungestPlayer()); // Não há nenhum jogador adicionado
	}
	*/
	
}
