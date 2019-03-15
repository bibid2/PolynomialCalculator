package Pol;
import java.util.ArrayList;
//import java.util.Collections;

import javax.swing.JOptionPane;


public class Polinom {

	public ArrayList<Monom> listaMonom=new ArrayList<Monom>();
	
	public Polinom() {
		listaMonom.clear();
	}
	
	public Polinom(String s)
	{
		try {
		String[] sir = s.split(" ");
		for (int i = 0; i < sir.length; i++) 
		{
			int putere = 0;
			int coeficient = 0;
			if (!(sir[i].equals("+"))) {
				if (sir[i].indexOf('x') > 0) {  //daca exist coef
					String[] aux = sir[i].split("x");
					coeficient=Integer.parseInt(aux[0]);
					if (aux.length != 1)
						putere = Integer.parseInt(aux[1].substring(1, aux[1].length())); //exemplu : 4x^2
					else {
						putere = 1;
					}
				} else {  
					if (sir[i].indexOf('x') == -1) { //doar coeficient
						coeficient=Integer.parseInt(sir[i]);
						putere = 0;
					} else {
						if (sir[i].indexOf('x') == 0 && sir[i].length() == 1) { //exemplu : x
							coeficient = 1;
							putere = 1;
						} else if (sir[i].indexOf('x') == 0 && sir[i].length() > 1) { //exemplu : x^2
							coeficient = 1;
							putere = Integer.parseInt(sir[i].substring(2, sir[i].length()));
						}
					}
				}
				Monom monom = new Monom(coeficient, putere);
				listaMonom.add(monom);
			}
		}
	} catch (NumberFormatException ex) {
		JOptionPane.showMessageDialog(null, "Formatul polinomul nu este corect!");
	}

}
	
	public void removeMonom(Monom monom) {
		listaMonom.remove(monom);
	}

	public void addMonom(Monom monom) {
		listaMonom.add(monom);
	}

	public void negat() {
		for (Monom m : listaMonom)
			m.setCoeficient(-m.getCoeficient());
	}

	public int grad() {
		int max = 0;
		for (Monom m : listaMonom)
			if (m.getPutere() > max)
				max = m.getPutere();
		return max;
	}
	
	public Polinom copy() {
		Polinom newP = new Polinom();
		for (Monom m : this.listaMonom)
			newP.addMonom(m);
		return newP;
	}
	
	
	@Override
	public String toString() {
		String x = "";
		for (Monom monom : listaMonom) {
			if (listaMonom.indexOf(monom) != listaMonom.size() - 1)
				x = x + monom.toString() + " + ";
			else
				x = x + monom.toString();
		}
		return x;
	}
}
