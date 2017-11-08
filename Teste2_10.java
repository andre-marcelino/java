// André L. Marcelino 29/10/2017 Jandaia do Sul
// Teste 2-10.
class Teste2_10 {
	public static void main(String args[]){
		int i, j;
		boolean flag;

		System.out.println("Prime numbers from 2 to 1000:");

		for(i = 2; i <= 1000; i++) {

			flag = true;

			for(j = (i - 1); j > 1; j--) {

				if((i%j) == 0) flag = false;
			}

			if(flag) System.out.println(i + " is a prime number.");
		}
	}
}