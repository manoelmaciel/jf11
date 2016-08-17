public class MaiorTresNumeros {

	public static void main(String[] args) {

		int a=5, b=10, c=25;
		int MaiorTres = 0;
		char variavel = 'z';
		if (a==b && b==c) { 
		  System.out.println("Tudo igual ... a = b = c = " + a + "!"); 
		} else {
		  if (c>b && c>a) {
			MaiorTres = c;
			variavel = 'c';
		  } else {
		  if (a>b && a>c) {
			MaiorTres = a;
			variavel = 'a';
			} else {
			if (b>a && b>c) {
				MaiorTres = b;
				variavel = 'b';
			}
		  }
		  
	        }
		System.out.println("O maior número é: " + variavel + " = " + MaiorTres);
	      }

	}

}