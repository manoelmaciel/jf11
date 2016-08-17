public class Dezenove { 

	public static void main(String[] args) {

		int y = 10000000;
		int x = 0;
		for(int i = 0; i<y; i++) {

			if(i % 19 == 0) {

				x = x + 1;
				System.out.println("Encontrei o " + x + "º número divisível por 19: " + i);
				if (x == 10000000) break;

			}

		}

	}

}
