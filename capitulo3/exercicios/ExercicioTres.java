class ExercicioTres {
    public static void main (String[] args) {
        int i = 1;
        int soma = 0;
        // Os múltiplos de 3 entre 1 e 100 vai de 3 a 99
        for (int x = 3; x <= 99; x = 3 * i) {
            soma += x;
            i++;
        }
        System.out.println(soma);
    }
}