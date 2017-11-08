// André L. Marcelino 07/11/2017 Blumenau
// Teste 3-1.
class Teste3_1 {
	public static void main(String args[]) throws java.io.IOException {
		char x, ignore;
		int i = 0;
		do {
			System.out.print("Entre com um caractere: ");
			x = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
			System.out.println();
			if(x == ' ') i++;
		} while(x != '.');

		System.out.println("O número de espaços foi: " + i);
	}
}