package Univers;

import java.util.*;
import java.io.IOException;

/**
 *
 *@author Jordi Farran
 */


public class Controlador_Domini_Univers{
		
		

	//Atributs
	private ArrayList<Univers> u;
	private ArrayList<ArrayList<Planeta>> p;

	//Instanciacio de la estructura de dades
	public Controlador_Domini_Univers {
		u = new ArrayList<Univers>();
		p = new ArrayList<ArrayList<Planeta>>();
	}

	//Constructor
	public void altaUnivers(string nom){
		//Busca repetits
		if(buscar_univers(nom) >= 0)throw new IllegalArgumentException(msg_univers_repetit);
		else{
			Univers aux = new Univers(nom);
			u.add(aux);
		}

	}

	public void baixaUnivers(String nom){
		int pos = buscar_univers(nom);
		if(pos < 0) throw new IllegalArgumentException(msg_recurs_no_exists);
	}	else r.remove(pos);

	public void modificacioNomUnivers(String nomUnivers, String newnomUnivers){
		int pos = buscar_univers(newnomUnivers);
		if(pos >= 0)throw new IllegalArgumentException(msg_univers_repetit);
		else{
			pos = buscar_univers(nomUnivers);
			if(pos < 0)throw new IllegalArgumentException(msg_recurs_no_exists);
			else u.get(pos).modificacioNomUnivers(newnomUnivers);
		}
	}

	public int obtenirIdUnivers(String nom){
		int pos = buscar_univers(nom);
		if(pos < 0) throw new IllegalArgumentException(msg_recurs_no_exists);
		else return u.get(pos).obtenirIdUnivers();
	}

	public String obtenirNomUnivers(int id){
		int pos = buscar_univers_nom(id);
		if (pos < 0)throw new IllegalArgumentException(msg_recurs_no_exists);
		else return u.get(pos).obtenirNomUnivers();
	}
	

	public void Array<Univers> llistarUniversos(){}

	

	private int buscar_univers(String nom){
		for(int i = 0; i < u.size(); ++i){
			if(u.get(i).obtenirNomUnivers().equals(nom)) return i;
		}
		return -1;
	}

	private int buscar_univers_nom(int id){
		for(int i = 0; i < u.size(); ++i){
			if(u.get(i).obtenirIdUnivers() == id)return i;
		}
		return -1;
	}

}
