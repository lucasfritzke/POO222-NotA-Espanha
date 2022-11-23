package moduleTeste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import module_espanha.Espanha;
import module_espanha.Player;

class EspanhaTest {

	@Test
	void testaddPlayerException() {
		Espanha e = new Espanha();
		e.addPlayer("Lucas","10","LC",1.84, 65.2, LocalDate.of(2000, 12, 25), "Forward","Vasco");
		assertThrows(IllegalArgumentException.class, () -> e.addPlayer("Lucas","10","LC",1.84, 65.2, LocalDate.of(2000, 12, 25), "Forward","Vasco"));
	}
	
	/*@Test
	void testaddPlayerExceptionTestandoRemove() {
		Espanha e = new Espanha();
		e.addPlayer("Lucas","10","LC",1.84, 65.2, LocalDate.of(2000, 12, 25), "Forward","Vasco");
		e.removePlayer("10");
		assertThrows(IllegalArgumentException.class, () -> e.addPlayer(null,"10","LC",1.84, 65.2, LocalDate.of(2000, 12, 25), "Forward","Vasco"));
	}*/
	
	@Test
	void testgetHowManyMembers() {
		Espanha e = new Espanha();
		e.addPlayer("Lucas","10","LC",1.84, 65.2, LocalDate.of(2000, 12, 25), "Forward","Vasco");
		e.addPlayer("Lucas","11","LC",1.84, 65.2, LocalDate.of(2000, 12, 25), "Forward","Vasco");
		e.addPlayer("Lucas","13","LC",1.84, 65.2, LocalDate.of(2000, 12, 25), "Forward","Vasco");
		assertEquals(3, e.getHowManyMembers());
	}
	
	
	
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
	
	
}
