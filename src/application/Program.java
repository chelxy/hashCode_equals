package application;

public class Program {

	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		/*Regra de ouro do HashCode
		Se o hashCode de dois objetos for diferente, 
		então os dois objetos são diferentes*/
	}

}
