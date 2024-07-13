import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		
		//saida de dados sem quebra de linha
		System.out.print("Bom dia");
		System.out.println("Olá mundo!");
		System.out.println("------------");
		//saida de dados com quebra de linha
		System.out.println("Bom Dia");
		System.out.println("Olá mundo!");
		System.out.println("------------");
		//saida do valor da variavel
		int y = 32;
		System.out.println(y);
		System.out.println("------------");
		double x = 10.35784;
		System.out.println(x);
		System.out.println("------------");
		//controlando as casas decimais(printf -> formata)
		System.out.printf("%.2f%n" , x);
		System.out.printf("%.4f%n" , x);
		Locale.setDefault(Locale.US);//configura separador padrão estados unidos
		System.out.printf("%.4f%n" , x);
		//concatenar varios elementos no mesmo comando de escrita
		System.out.println("RESULTADO = " + x + " METROS");
		//concatenar varios elementos no mesmo comando de escrita usando o printf
		System.out.printf("RESULTADO %.2f METROS%n", x);
		//concatenar varios elementos em um mesmo comando de escrita
		System.out.println("---------------------------------");
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
