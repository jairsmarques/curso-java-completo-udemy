
public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		//Estrutura opcional ao if/else
		//(condição) ? valor_se_verdadeiro : valor_se_falso
		
		double preco = 34.5;
		double desconto = (preco < 20 ) ? preco * 0.01 : preco * 0.05;
		
		System.out.println("Valor do desconto " + desconto);

	}

}
