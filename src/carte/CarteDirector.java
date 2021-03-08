package carte;

//clasa concreta ce construieste obiectul complex utilizand
//interfata de tip Builder

public class CarteDirector {

private CarteBuilder carteBuilder;
	
	//setare tip Carte
	
	public CarteDirector (CarteBuilder carteBuilder){
		this.carteBuilder = carteBuilder;
	}
	
	//returnare Carte 
	
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
