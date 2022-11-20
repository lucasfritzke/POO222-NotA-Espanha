package fifa;

import java.awt.Image;
import java.nio.file.Path;

/**
 * Interface que define o comportamento de um software que retorna dados a respeito dos integrantes de uma seleção participante da Copa do Mundo 2022
 * <br>
 * <br>Desenvolvido em Java 11.
 * 
 * @author Marcel Hugo e turma de POO 22/2 (BCC)
 *
 * @version 1.0.0
 *
 */
public interface NationalTeamInfos {
	/**
	 * Método para retornar a quantidade de integrantes da comitiva da seleção.
	 * @return int - quantidade de integrantes.
	 * 
	*/
	int getHowManyMembers();
	
	/**
	 * Método para indicar o jogador com a maior idade (mais velho) da seleção.
	 * 
	 * @return int - o número do jogador mais velho
	 * 
	*/
	int getOldestPlayer();
	
	/**
	 * Método para indicar o jogador com a menor idade (mais novo) da seleção.
	 * 
	 * @return int - o número do jogador mais novo
	 * 
	*/
	int getYoungestPlayer();

	/**
	 * Método para retornar a idade média dos jogadores da seleção.
	 *  
	 * @return double - idade média dos jogadores da seleção.
	 * 
	*/
	double getAverageAge();

	/**
	 * Método para retornar os dados do jogador solicitado. 
	 * <br>
	 * Os dados retornam em uma String no formato JSON contendo os atributos em inglês: número da camisa, nome, apelido, altura, peso, data de nascimento, posição.  
	 * <br>
	 * number; name; nickname; height (cm); weight (kg); birthDate (yyyy-MM-dd); position; currentClub 
	 * <br>
	 * Exemplo: {number:1, name:"Alisson Ramses Becker", nickname:"Alisson", height:191, weight:91.2, birthDate:"1992-10-02", position:"goalkeeper", currentClub:"Liverpool"}
	 * <br>
	 * <br>
	 * @param number (int) - número do jogador
	 * @return String - JSON com os dados do jogador
	 * <br>  Caso o número não seja válido, a String deve retornar nula (null).
	*/
	String getPlayer(int number);

	/**
	 * Método que retorna os dados de contato do dirigente responsável pela relação com a imprensa (assessor de imprensa ou porta-voz).
	 * <br>
	 * Os dados retornam em uma String no formato JSON contendo os atributos em inglês: nome, telefone1, telefone2, conta de email.  
	 * <br>
	 * name; tel1; tel2; emailAccount 
	 * <br>
	 * Exemplo: {name:"Paulo Castro Soares", tel1:"+5521989876543", tel2:"+974992008765", emailAccount:"pcsoares@cbf.com.br"}
	 * <br>
	 * @return String - JSON com os dados de contato do assessor de imprensa
	 * 
	*/
	String getPressOfficerContacts();

	/**
	 * Método que retorna o nome do país representado pela seleção.
	 *   
	 * @return String - nome do país.
	 * 
	*/
	String getCountryName();
	
	/**
	 * Método que retorna a imagem da bandeira do país.
	 *   
	 * @return Image - um objeto de Image contendo a imagem da bandeira do país.
	 * 
	*/
	Image getFlagImage();

	/**
	 * Método para retornar o Path do arquivo JSON criado com os dados de todos os membros da comissão técnica da seleção.
	 * <br>
	 * Os dados de um membro contendo os atributos em inglês: nome, apelido, função, idade.  
	 * <br>
	 * name; nickname; role; age 
	 * <br>
	 * Exemplo: {name:"Adenor Leonardo Bachi", nickname:"Tite", role:"Main coach", age:61}
	 * <br> Lembre-se que serão vários membros da comissão técnica.
	 * 
	 * @return Path - o caminho de onde foi gravado o arquivo JSON. 
	 * 
	*/
	Path getTechnicalCommittee();

	/**
	 * Método para retornar o objeto que responde pelas estatísticas de consulta - interface NationalTeamStats.
	 * <br>
	 * 
	 * 
	 * @return NationalTeamStats - objeto que implementa a interface NationalTeamStats. 
	 * 
	*/
	NationalTeamStats getStatsResponsible();
	

}

