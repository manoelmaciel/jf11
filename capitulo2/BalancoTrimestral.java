class BalancoTrimestral {

	public static void main(String[] args) {

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

		System.out.println("Gastos total no trimestre: " + gastosTrimestre);

		System.out.println("Valor da m�dia mensal: " + gastosTrimestre/3);

	}

}