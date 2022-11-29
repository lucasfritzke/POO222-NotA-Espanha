package moduleTeste;

import java.time.LocalDate;

import module_espanha.Espanha;

public class CadastrarPlayers {

	public static void main(String[] args) {
		
		Espanha e = new Espanha();
		e.addPlayer("Roberto Sanchez","1", "Sanchez", 1.98, 1.98, LocalDate.parse("1997-11-18") ,"Goalkeeper" , "Brighton & Hove Albion");
		e.addPlayer("César Azpilicuet","2", "César", 1.78, 77.00, LocalDate.parse("1989-08-28") ,"Right-back" , "Chelsea Football Club");
		e.addPlayer("Marco Asensio","10", "Asensio", 1.82, 76.00, LocalDate.parse("1996-04-03") ,"Winger" , "Real Madrid"); 
		e.addPlayer("Eric García","3", "García", 1.82, 76.00, LocalDate.parse("2001-02-09") ,"Centre-back" , "Futbol Club Barcelona");
		e.addPlayer("Jorge Merodio","4", "Koke", 1.76, 78.00, LocalDate.parse("1992-01-08") ,"Right-back" , "Atlético de Madrid");
		e.addPlayer("Pau Torres","5", "Torres", 1.91, 81.00, LocalDate.parse("1997-01-16") ,"Centre-back" , "Villarreal Club");
		e.addPlayer("Pablo Gavira","6", "Gavi", 1.82, 75.00, LocalDate.parse("1999-06-21") ,"Centre-back" , "Futbol Club Barcelona");
		e.addPlayer("Yeremi Pino","7", "Pino", 1.78, 74.00, LocalDate.parse("1988-06-03") ,"Forward" , " 	Villarreal Club");
		e.addPlayer("Sergio Busquets","8", "Busquets", 1.84, 81.00, LocalDate.parse("2002-01-17") ,"Defensive Mid" , "Villarreal Club");
		e.addPlayer("Dani Olmo","9", "Olmo", 1.78, 72.00, LocalDate.parse("1995-07-20") ,"Attacking Mid" , "RB Leipzig");
		e.addPlayer("Álvaro Morata","11", "Morata", 1.90, 84.00, LocalDate.parse("1992-06-23") ,"Striker" , "Atlético Madrid");
		e.addPlayer("Ansu Fati","12", "Fati", 1.75, 76.00, LocalDate.parse("2001-08-25") ,"Forward" , "Futbol Club Barcelona");
		e.addPlayer("David Raya","13", "Raya", 1.83, 80.00, LocalDate.parse("1997-09-15") ,"Goalkeeper" , "Brentford");
		
		e.addTCMember("Luis Enrique Martínez", "Luis Enrique", "Main Coach", LocalDate.parse("1970-05-08"));
		e.addTCMember("John Avila Garcez", "Garcez", "Assistant Coach", LocalDate.parse("1975-02-03"));
		e.addTCMember("Carlo D'Ferraz Gomez", "D'Ferraz", "Assistant Coach", LocalDate.parse("1985-03-07"));
		
		e.addTeamManager("Marcos Rodriguez", "+34 91 98514-7580", "+34 91 94114-7245", "marcosrodrigues@rfef.com", true);
		e.addTeamManager("Ruan Bueno", "+34 85 93214-7541", "+34 85 345578-1487", "rbueno@rfef.com", false);
		
		e.salvar();
	}

}
