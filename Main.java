import java.util.Locale;

public class Main {
	

	//ponto de entrada
	public static void main(String[] args) { 
		System.out.println("Ol� mundo!");
		System.out.println("Bom dia!");
		
		
		
		// Declara��o de variavel 
		//Formata��o do n�mero para 2 casas decimais 
		//Formata��o do n�mero para 4 casas decimais 
		//Concatena��o 
		
		//%f = ponto flutuante
		//%d = numero inteiro
		//%s = texto
		//%n = quebra de linha
		
		
		int y = 32;
		System.out.println(y);
		
		double x = 10.521456;
		System.out.printf("%.2f%n", x);
		System.out.println(x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " Metros.");
		System.out.printf("Resultado = %.2f metros%n", x);
		
		String nome = "Wesley";
		int idade = 27;
		double renda = 5000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n ", nome, idade, renda);
		
		
		
	}

}
