package carte;
//implementare a interfetei CarteBuilder
//concrete Builder

public class CarteMorometii implements CarteBuilder {
	private final Carte carte = new Carte();
	
	public void buildTitlu(){
		carte.setTitlu("Morometii");
	}

	@Override
	public void buildGen() {
		carte.setGen("roman");
		
	}

	@Override
	public void buildAutor() {
		carte.setAutor("Marin Preda");
		
	}

	@Override
	public void buildEditura() {
		carte.setEditura("corint");
		
	}

	@Override
	public void buildPret() {
		carte.setPret("45 lei");
		
	}

	@Override
	public void buildNrpag() {
		carte.setNrpag(" 200 ");
		
	}

	@Override
	public void buildNrvolum() {
		carte.setNrvolum("3");
		
	}

	@Override
	public Carte getCarte() {
		return this.carte;
	}
}