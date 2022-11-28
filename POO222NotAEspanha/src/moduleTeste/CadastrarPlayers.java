package moduleTeste;

import java.time.LocalDate;

import module_espanha.Espanha;

public class CadastrarPlayers {

	public static void main(String[] args) {
		
		Espanha e = new Espanha();
		//e.addPlayer("Roberto Sanchez","1", "Sanchez", 1.98, 1.98, LocalDate.parse("1997-11-18") ,"Goalkeeper" , "Brighton & Hove Albion");
		//e.addPlayer("César Azpilicuet","2", "César", 1.78, 77.00, LocalDate.parse("1989-08-28") ,"Right-back" , "Chelsea Football Club");
		//e.addPlayer("Marco Asensio","10", "Asensio", 1.82, 76.00, LocalDate.parse("1996-04-03") ,"Winger" , "Real Madrid");
		
		e.addTCMember("Luis Enrique Martínez", "Luis Enrique", "Main Coach", LocalDate.parse("1970-05-08"));
		e.addTCMember("John Avila Garcez", "Garcez", "Assistant Coach", LocalDate.parse("1975-02-03"));
		e.addTCMember("Carlo D'Ferraz Gomez", "D'Ferraz", "Assistant Coach", LocalDate.parse("1985-03-07"));
		
		//e.addTeamManager("Marcos Rodriguez", "+34 91 98514-7580", "+34 91 94114-7245", "marcosrodrigues@rfef.com", true);
		//e.addTeamManager("Ruan Bueno", "+34 85 93214-7541", "+34 85 345578-1487", "rbueno@rfef.com", false);
		
		e.salvar();
	}

}
