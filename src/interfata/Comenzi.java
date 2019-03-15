package interfata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Pol.Operatii;
import Pol.Polinom;

public class Comenzi {
	
	menu view;
	public Comenzi(menu v) {

		this.view = v;

	}

	void setEvents() {
		view.btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operatii op = new Operatii();
				Polinom polinom1 = new Polinom(view.textField.getText());
				Polinom polinom2 = new Polinom(view.textField1.getText());
				Polinom rezultat = new Polinom();
				rezultat = op.adunare(polinom1, polinom2);
				view.rezultat.setText(rezultat.toString());
			}
		});
		
		view.btnDiferenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operatii op = new Operatii();
				Polinom polinom1 = new Polinom(view.textField.getText());
				Polinom polinom2 = new Polinom(view.textField1.getText());
				Polinom rezultat = new Polinom();
				rezultat = op.scadere(polinom1, polinom2);
				view.rezultat.setText(rezultat.toString());
			}
		});
		
		view.btnInmultire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operatii op = new Operatii();
				Polinom polinom1 = new Polinom(view.textField.getText());
				Polinom polinom2 = new Polinom(view.textField1.getText());
				Polinom rezultat = new Polinom();
				rezultat = op.inmultire(polinom1, polinom2);
				view.rezultat.setText(rezultat.toString());
			}
		});
		
		view.btnDerivare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operatii op = new Operatii();
				Polinom polinom1 = new Polinom(view.textField.getText());
				Polinom rezultat = new Polinom();
				rezultat = op.derivare(polinom1);
				view.rezultat.setText(rezultat.toString());
			}
		});
		
		view.btnIntegrare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operatii op = new Operatii();
				Polinom polinom1 = new Polinom(view.textField.getText());
				Polinom rezultat = new Polinom();
				rezultat = op.integrare(polinom1);
				view.rezultat.setText(rezultat.toString());
			}
		});
}
	public static void main(String[] args) {
		menu view = new menu();
		Comenzi controller = new Comenzi(view);
		controller.setEvents();
	}
}