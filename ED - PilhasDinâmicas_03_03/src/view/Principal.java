package view;

import javax.swing.JOptionPane;

import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		PalindromoController pc = new PalindromoController();
		String Palavra;
		Palavra = JOptionPane.showInputDialog("Insira a palavra a ser testada");
		pc.TesteString(Palavra);

	}

}
