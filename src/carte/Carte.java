package carte;

//clasa ce defineste obiectul complex ce este construit

public final class Carte {
	private String titlu;
	private String gen;
	private String autor;
	private String editura;
	private String pret;
	private String nrpag;
	private String nrvolum;
	
//setteri (campuri private - acces doar in clasa)
	
	public Carte setTitlu(String titlu){
		this.titlu=titlu;
		return this;
	}
	
	public Carte setGen(String gen){
		this.gen=gen;
		return this;
	}

	public Carte setAutor(String autor){
		this.autor=autor;
		return this;
	}
	
	public Carte setEditura(String editura){
		this.editura=editura;
		return this;
	}
	
	public Carte setPret(String pret){
		this.pret=pret;
		return this;
	}
	
	public Carte setNrpag(String nrpag){
		this.nrpag=nrpag;
		return this;
	}
	
	public Carte setNrvolum(String nrvolum){
		this.nrvolum=nrvolum;
		return this;
	}
// supraincarcare toString() pentru afisare
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("\n----------"+titlu+"--------\n");
		sb.append(" Genul: ");
		sb.append(gen);
		sb.append("\n Autorul: ");
		sb.append(autor);
		sb.append("\n Editura: ");
		sb.append(editura);
		sb.append("\n Pretul: ");
		sb.append(pret);
		sb.append("\n Numar pagini: ");
		sb.append(nrpag);
		sb.append("\n Numar Volume: ");
		sb.append(nrvolum);
		sb.append("\n");
		
		return sb.toString();
	}
}

