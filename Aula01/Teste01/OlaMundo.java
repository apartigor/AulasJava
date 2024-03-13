import java.util.Scanner;

class OlaMundo {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String msg = ler.nextLine();
		int numero = ler.nextInt();

		System.out.println(msg);
		System.out.println(numero);
		System.out.println("Olá meu mundo Java!");
	}
}