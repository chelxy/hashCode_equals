package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		/* Nesse caso o compilador d� um tratamento
		especial para literais, o que n�o acontece com
		String s2 = new String("Test");*/
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);// comparando as referencias
		//Os objetos est�o em posi��o diferentes na mem�ria.
		
		System.out.println(s1 == s2);
	}

}
