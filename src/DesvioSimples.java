import java.util.Scanner;

public class DesvioSimples {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		System.out.println("Por favor, digite a sua idade!");
		idade = leitor.nextInt();
		System.out.println("Deixe-me verificar sua idade...");
		if (idade > 12) {
			System.out.println("Voc� pode jogar!");
		} else  {
			System.out.println("Voc� n�o tem a idade minima para jogar!");
		}
		
		leitor.close();

	}

}