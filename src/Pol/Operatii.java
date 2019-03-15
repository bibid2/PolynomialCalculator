package Pol;

public class Operatii extends Polinom {


	public Polinom adunare(Polinom p1, Polinom p2) {
		Polinom suma = new Polinom();
		if (p1.listaMonom.isEmpty()) {
			return p2;
		}
		if (p2.listaMonom.isEmpty()) {
			return p1;
		}
		
		/*if(p1.listaMonom.isEmpty() && p1.listaMonom.isEmpty())
		{
			System.out.println("nu ati dat polinoame!");
		}*/
		
		for (Monom monom1 : p1.listaMonom)
			suma.addMonom(monom1);
		for (Monom monom2 : p2.listaMonom)
			suma.addMonom(monom2);
		
		for (Monom monom1 : p1.listaMonom)
			for (Monom monom2 : p2.listaMonom) {
				double suma_coeficienti;
				if (monom1.getPutere() == monom2.getPutere()) 
				{
					suma_coeficienti = monom1.getCoeficient() + monom2.getCoeficient();
					suma.addMonom(new Monom(suma_coeficienti, monom1.getPutere()));
					suma.removeMonom(monom1);
					suma.removeMonom(monom2);
				}
			}
		return suma;
	}

	public Polinom scadere(Polinom p1, Polinom p2) 
	{
		Polinom diferenta = new Polinom();
		Polinom p3 = new Polinom();
		p3 = p2.copy();
		p3.negat();
		if (p1.listaMonom.isEmpty()) {
			return p3;
		}
		if (p2.listaMonom.isEmpty()) {
			return p1;
		}
		/*if(p1.listaMonom.isEmpty() && p1.listaMonom.isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Nu ati introdus polinoame!");
		}*/
		
		for (Monom m1 : p1.listaMonom)
			diferenta.addMonom(m1);
		for (Monom m2 : p3.listaMonom)
			diferenta.addMonom(m2);
		
		for (Monom m1 : p1.listaMonom)
			for (Monom m2 : p3.listaMonom) {
				double diferenta_coef;
				if (m1.getPutere() == m2.getPutere()) {
					diferenta_coef = m1.getCoeficient() + m2.getCoeficient();
					if (diferenta_coef != 0)
						diferenta.addMonom(new Monom(diferenta_coef, m1.getPutere()));
					diferenta.removeMonom(m1);
					diferenta.removeMonom(m2);
				}
			}
		return diferenta;
	}

	public Polinom inmultire (Polinom p1, Polinom p2)
	{
		Polinom produs=new Polinom();
		for (Monom m1 : p1.listaMonom)
			produs.addMonom(m1);
		for (Monom m2 : p2.listaMonom)
			produs.addMonom(m2);
		
		for (Monom m1 : p1.listaMonom)
			for (Monom m2 : p2.listaMonom) 
			{
				double produs_coeficienti;
				//if(m1.getPutere()==m2.getPutere())
				{
					produs_coeficienti=m1.getCoeficient()*m2.getCoeficient();
					if(produs_coeficienti!=0)
					{
						produs.addMonom(new Monom(produs_coeficienti,m1.getPutere()+m2.getPutere()));
					}
					produs.removeMonom(m1);
					produs.removeMonom(m2);
				}
			}
				
		return produs;
	}

	public Polinom derivare (Polinom p1)
	{
		Polinom derivata=new Polinom();
		for (Monom m1 : p1.listaMonom)
			derivata.addMonom(m1);
			for (Monom m1 : p1.listaMonom) 
			{
				int putere=m1.getPutere();
				double coef_deriv=m1.getCoeficient()*putere;
				if(coef_deriv!=0)
				{
					if((putere-1)!=0)
					{
						putere--;
						derivata.addMonom(new Monom(coef_deriv, putere));
					}
					if((putere-1)==0)
					{
						derivata.addMonom(new Monom(coef_deriv,0));
					}
				}
				derivata.removeMonom(m1);
			}
				
		return derivata;
	}
	
	public Polinom integrare(Polinom p1)
	{
		Polinom integrata=new Polinom();
		for(Monom m1: p1.listaMonom)
		{
			integrata.addMonom(m1);
		}
		for (Monom m1: p1.listaMonom)
		{
			int putere=m1.getPutere();
			double coeficient_interare=m1.getCoeficient()/(putere+1);
			if(putere!=0)
			{
				putere++;
				integrata.addMonom(new Monom(coeficient_interare, putere));
			}
			if(putere==0)
			{
				integrata.addMonom(new Monom(m1.getCoeficient(),1));
			}
			integrata.removeMonom(m1);
			
		}
		return integrata;
	
		
	}	


public static void main(String[] args) 
{ 
	Operatii x = new Operatii();
	//Polinom p1= new Polinom("9x + 12x^3 + 3x^8 "); 
	//Polinom p2 = new Polinom("2 + 7x^3 + 8x^8 ");
	Polinom p1= new Polinom("5x^-7 + 3x^5 + 6"); 
//	Polinom p2 = new Polinom("12x^7 + 5x ");
	
	//Polinom a=x.adunare(p1, p2);
	//Polinom a=x.inmultire(p1, p2);
	//Polinom a=x.derivare(p2);
	Polinom a=x.integrare(p1);
	 System.out.println(a.toString());
}
}