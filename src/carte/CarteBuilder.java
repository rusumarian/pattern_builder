package carte;

/**interfata ce defineste metodele prin care 
 * sunt construite parti ale obiectului complex
 * @author rusum
 *
 */

public interface CarteBuilder {
	public void buildTitlu();
	public void buildGen();
	public void buildAutor();
	public void buildEditura();
	public void buildPret();
	public void buildNrpag();
	public void buildNrvolum();
	
	/**metoda ce returneaza obiectul Carte final
	 * dupa constructie
	 * @return
	 */
	
	public Carte getCarte();
	

}
