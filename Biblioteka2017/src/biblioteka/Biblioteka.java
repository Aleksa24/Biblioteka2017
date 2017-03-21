package biblioteka;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	private LinkedList<Knjiga> knjige = new LinkedList<>();
	
	@Override
	public void dodajKnjigu(Knjiga k) {
		if (k == null){
			throw new RuntimeException("null knjiga");
		}
		
		knjige.add(k);
		
	}

	@Override
	public void brisiKnjigu(Knjiga k) {
		knjige.remove(k);
		
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(biblioteka.Autor a, long isbn, String naslov, String izdavac) {
		if(a == null || isbn == 0 || 
				naslov == null || izdavac == null){
			throw new RuntimeException("morate uneti sve");
		}
		
		LinkedList<Knjiga>	rezultat = new LinkedList<>();
		for (int i = 0; i < knjige.size(); i++) {
			if(knjige.get(i).getNaslov().contains(naslov)){
				rezultat.add(knjige.get(i));
			}
		}
		return rezultat;
	}}
