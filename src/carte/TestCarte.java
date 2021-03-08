package carte;

import java.util.Scanner;

	public class TestCarte {
		
		public static void main(String[] args) {
			
			// realizare CarteBuilder de tipul CarteBucatariaJamilei
			
			CarteBuilder cartebucate = new CarteBucatariaJamilei();
		
			// trimiterea builderului Carte1 directorului
			
			CarteDirector director1 = new CarteDirector (cartebucate);
			
			// crearea obiectului de tipul cerut
			
			director1.buildCarte();
			
			// directorul returneaza obiectul pe baza
			
			Carte carte1 = director1.getCarte();
			
			//afisare
			
			System.out.println(carte1.toString());
			
			CarteBuilder carteroman = new CarteMorometii();
			CarteDirector director2 = new CarteDirector (carteroman);
			director2.buildCarte();
			Carte carte2 = director2.getCarte();
			System.out.println(carte2);
			
			CarteBuilder cartepoezii = new CartePoezii();
			CarteDirector director3 = new CarteDirector (cartepoezii);
			director3.buildCarte();
			Carte carte3 = director3.getCarte();
			System.out.println(carte3);
			
			// carte inserata de la tastatura\
			Carte userCarte = new Carte();
			
			Scanner user_input = new Scanner(System.in);
			System.out.print("Se pot introduce si alte carti direct de la tastatura\n ");
			
			System.out.print("Titlu Carte: ");
			String titlu = user_input.nextLine();
			userCarte.setTitlu(titlu);
			
			System.out.print("Genul: ");
			String gen = user_input.nextLine();
			userCarte.setGen(gen);
			
			System.out.print("Autorul: ");
			String autor = user_input.nextLine();
			userCarte.setAutor(autor);
			
			System.out.print("Editura: ");
			String editura = user_input.nextLine();
			userCarte.setEditura(editura);
			
			System.out.print("Pretul: ");
			String pret = user_input.nextLine();
			userCarte.setPret(pret);
			
			System.out.print("Numar Pagini: ");
			String nrpag = user_input.nextLine();
			userCarte.setNrpag(nrpag);
			
			System.out.print("Numar Volume: ");
			String nrvolum = user_input.nextLine();
			userCarte.setNrvolum(nrvolum);
			
			System.out.println(userCarte.toString());
			
			user_input.close();
		
			
			
	}
}
