package carte;

//implementare a interfetei CarteBuilder
//concrete Builder

public class CarteBucatariaJamilei implements CarteBuilder {
	private final Carte carte = new Carte();
	
	public void buildTitlu(){
		carte.setTitlu("Bucataria Jamilei");
	}

	@Override
	public void buildGen() {
		carte.setGen(" carte de bucate");
		
	}

	@Override
	public void buildAutor() {
		carte.setAutor("Zafira Jamila");
		
	}

	@Override
	public void buildEditura() {
		carte.setEditura("pim");
		
	}

	@Override
	public void buildPret() {
		carte.setPret("20 lei");
		
	}

	@Override
	public void buildNrpag() {
		carte.setNrpag(" 40 ");
		
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
