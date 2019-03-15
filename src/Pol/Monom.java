package Pol;

public class Monom {

	private int putere;
	private double coeficient;
	
	public Monom() 
	{
		this(0, 0);
	}
	public Monom(double a, int b)
	{
		this.coeficient=a;
		this.putere=b;
	}
	public double getCoeficient() {
		return coeficient;
	}

	public void setCoeficient(double coeficient) {
		this.coeficient = coeficient;
	}

	public int getPutere() {
		return putere;
	}

	public void setPutere(int putere) {
		this.putere = putere;
	}
	
	@Override
	public String toString() {
		if (coeficient == 0)
			return "0";
		else {
			if (putere == 0)
				return Double.toString(coeficient) + "";
			else {
				if (putere == 1)
					return Double.toString(coeficient) + "x";
				else
					return Double.toString(coeficient) + "x^" + Integer.toString(putere);
			}
		}
	}
}
