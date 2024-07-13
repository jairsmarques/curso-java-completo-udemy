
public class ProcessamentoDeDadosECasting {

	public static void main(String[] args) {
		System.out.println("Exemplo 1");
		int x;
		double y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("----------------------");
		System.out.println("Exemplo 2");
		System.out.println("Calculo de um trapézio");
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		System.out.println("----------------------");
		System.out.println("Exemplo 3");
		int c, d;
		double resultado;
		c = 5;
		d = 2;
		
		resultado = (double)c / d;//casting
		
		System.out.println(resultado);

	}

}
