// André L. Marcelino 07/11/2017 Blumenau
// Teste 3-10.
class Teste3_10 {
	public static void main(String args[]) throws java.io.IOException {
		char x, ignore;
		int i = 0;
		do {
			System.out.print("Entre com um caractere: ");
			x = (char) System.in.read();
			
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
			
			
			if(65 <= x && x <= 90){
				x += 32;
				i++;
				System.out.println(x);
			} else if(97 <= x && x <= 122) {
				x -= 32;
				i++;
				System.out.println(x);
			} else System.out.println(x);

		} while(x != '.');

		System.out.println("O número de alterações foi: " + i);
	}
}