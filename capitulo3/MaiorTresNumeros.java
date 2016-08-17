public class MaiorTresNumeros {

	public static void main(String[] args) {

		int a=5, b=3, c=1;
		int MaiorTres = 0;
		char variavel = 'z';
		if (c>b && b>a) {
			MaiorTres = c;
			variavel = 'c';
		}
		if (c<b && b<a) {
			MaiorTres = a;
			variavel = 'a';
		}
		if (b>a || b>c) {
			MaiorTres = b;
			variavel = 'b';
		}
		System.out.println("O maior número é: " + variavel + " = " + MaiorTres);

	}

}