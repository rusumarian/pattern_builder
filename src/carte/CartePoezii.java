package carte;

//implementare a interfetei CarteBuilder
//concrete Builder

public class CartePoezii implements CarteBuilder {
	private final Carte carte = new Carte();
	
	public void buildTitlu(){
		carte.setTitlu("Poezii");
	}

	@Override
	public void buildGen() {
		carte.setGen("carte de poezii");
		
	}

	@Override
	public void buildAutor() {
		carte.setAutor("Mihai Eminescu");
		
	}

	@Override
	public void buildEditura() {
		carte.setEditura("nationala");
		
	}

	@Override
	public void buildPret() {
		carte.setPret("20 lei");
		
	}

	@Override
	public void buildNrpag() {
		carte.setNrpag(" 253 ");
		
	}

	@Override
	public void buildNrvolum() {
		carte.setNrvolum("1");
		
	}

	@Override
	public Carte getCarte() {
		return this.carte;
	}
}