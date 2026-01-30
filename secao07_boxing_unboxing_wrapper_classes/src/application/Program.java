package application;

public class Program {

	public static void main(String[] args) {
		
		// BOXING -> É o processo de conversão de um objeto tipo valor para um 
		// objeto tipo referencia compatível
		
		int x = 20;
		Object obj = x;
		System.out.println(obj);
		
		System.out.println("----------------------");
		// UNBOXING -> É o processo de conversão de um objeto tipo referência para um
		// objeto tipo valor compatível
		int y = (int) obj;
		System.out.println(y);
		
		
		// WRAPPER CLASSES 
		// • São classes equivalentes aos tipos primitivos
		// • Boxing e unboxing é natural na linguagem
		// • Uso comum: campos de entidades em sistemas de informação (IMPORTANTE!)
		// •• Pois tipos referência (classes) aceitam valor null e usufruem dos recursos OO
		
		// boolean ->   Boolean
		// char    ->   Character
		// byte    ->   Byte
		// short   ->   Short
		// int     ->   Integer
		// long    ->   Long
		// float   ->   Float
		// double  ->   Double
	}

}
