class ExercicioTresPlus {
    public static void main (String[] args) {
        int i = 1;
        int soma = 0;
        for (int x = 3; x < 100; x = 3 * i) {
            soma += x;
            i++;
        System.out.println(x);
        System.out.println(i);
        System.out.println(soma);
        }
        System.out.println(soma);
    }
}