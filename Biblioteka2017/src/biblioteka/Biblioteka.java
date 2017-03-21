package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	private LinkedList<Knjiga> knjige = new LinkedList<>();
	
	@Override
	public void dodajKnjigu(Knjiga k) {
		knjige.add(k);
		
	}

	@Override
	public void brisiKnjigu(Knjiga k) {
		knjige.remove(k);
		
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov) {
	
		LinkedList<Knjiga>	rezultat = new LinkedList<>();
		for (int i = 0; i < knjige.size(); i++) {
			if(knjige.get(i).getNaslov().contains(naslov)){
				rezultat.add(knjige.get(i));
			}
		}
		return rezultat;
	}
	
	

}
