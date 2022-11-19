package moduleTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import moduleEspanha.Player;

class PlayerTest {

	@Test
	void testArrayListTeste() {
		
		Player p = new Player();
		p.setName("Lucas");
		p.setPosition("Goalkeeper");
		assertEquals("Goalkeeper", p.getPosition());
		
	}
	
	@Test
	void testArrayListTesteException() {
		Player p = new Player();
		p.setName("Lucas");
		assertThrows(IllegalArgumentException.class, () -> p.setPosition("Goalkeeer"));
		
	}
	
	@Test
	void testSetNumber() {
		Player p = new Player();
		p.setName("Lucas");
		p.setNumber("10");
		assertEquals("10", p.getNumber());
		
	}
	
	
	@Test
	void testSetNumberException() {
		Player p = new Player();
		p.setName("Lucas");
		assertThrows(IllegalArgumentException.class, () -> p.setNumber("-2"));
		
	}
	
	@Test
	void testSetNickname() {
		Player p = new Player();
		p.setName("Lucas");
		p.setNumber("10");
		p.setNickName("LC");
		assertEquals("LC", p.getNickName());
		
	}
	
	@Test
	void testSetNicknameException() {
		Player p = new Player();
		p.setName("Lucas");
		p.setNumber("10");
		assertThrows(IllegalArgumentException.class, () -> p.setNickName(""));
		
	}
	
	@Test
	void testSetHeigth() {
		Player p = new Player();
		p.setName("Lucas");
		p.setNumber("10");
		p.setNickName("LC");
		p.setHeigth(52.3);
		assertEquals(52.3, p.getHeigth());
		
	}
	
	@Test
	void testSetHeigthException() {
		Player p = new Player();
		p.setName("Lucas");
		p.setNumber("10");
		p.setNickName("LC");
		assertThrows(IllegalArgumentException.class, () -> p.setHeigth(-0.5));
		
	}
	
	


}
