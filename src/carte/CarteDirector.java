package carte;

/**clasa concreta ce construieste obiectul complex utilizand
 * interfata de tip Builder
 * @author rusum
 *
 */

public class CarteDirector {

private CarteBuilder carteBuilder;
	
	/**
	 * setare tip Carte
	 * @param carteBuilder
	 */
	
	public CarteDirector (CarteBuilder carteBuilder){
		this.carteBuilder = carteBuilder;
	}
	
	/**
	 * returnare Carte 
	 * @return
	 */
	
	public Carte getCarte()
	{
		return this.carteBuilder.getCarte();
	}
	
	//rulare metode specifice implementarii MeniuBuilderului
	
	public void buildCarte(){
		this.carteBuilder.buildTitlu();
		this.carteBuilder.buildGen();
		this.carteBuilder.buildAutor();
		this.carteBuilder.buildEditura();
		this.carteBuilder.buildPret();
		this.carteBuilder.buildNrpag();
		this.carteBuilder.buildNrvolum();
	}

}
