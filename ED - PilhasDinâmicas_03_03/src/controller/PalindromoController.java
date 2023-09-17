package controller;

import model.PilhaString;

public class PalindromoController {

	public PalindromoController() {
		super();
	}
	
	public void TesteString (String palavra) {
		if(palavra.contains(" ")) {
			String []str = palavra.split(" ");
			int tvet =str.length;
			palavra = "";
			for(int i = 0; i < tvet; i++) {
				palavra +=str[i]; 
			}
			String [] word = palavra.split("");
			tvet = word.length;
			TestePalindromo(word, tvet, palavra);
		}else {
			String [] word = palavra.split("");
			int tvet = word.length;
			TestePalindromo(word, tvet,palavra);
		}
	}
	
	public void TestePalindromo(String[]Word, int tam,String Palavra) {
		PilhaString ps = new PilhaString();
		for(int i = 0; i < tam; i++){
			ps.push(Word[i]);
		}
		
		StringBuffer buffer = new StringBuffer();
		while(!ps.isEmpty()) {
			try {
				buffer.append(ps.pop());
			} catch (Exception e) {
				System.err.println(e);
			}
		}
		String teste = buffer.toString();
		if(teste.equals(Palavra)){
			System.out.println("A palavra inserida é um palíndromo!");
			System.out.println("Teste = "+teste);
			System.out.println("Palavra = "+Palavra);
		}else {
			System.out.println("A palavra inserida não é um palindromo :(");
			System.out.println("Teste = "+teste);
			System.out.println("Palavra = "+Palavra);
		}
	}
}
