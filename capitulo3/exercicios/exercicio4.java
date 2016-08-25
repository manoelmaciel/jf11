class ExercicioQuatro {

    public static void main (String[] args) {

        long fatorial = 1;
        System.out.println("FATORIAL: ");
        System.out.println("");
        System.out.println("O fatoria de 0 é (0!) = 1");
        System.out.println("");
        for (int f = 1; f <= 900000; f++) {

            if (f == 1) {
                System.out.println("O fatorial de  1 é (0!)  *  1 = 1");
            } else {
                if (f == 10) {
                    System.out.println("O fatorial de " + f + " é (" + (f - 1) + "!)  * " + f + " = " + (fatorial * f));
                } else {
                    if (f > 10) {
                        System.out.println("O fatorial de " + f + " é (" + (f - 1) + "!) * " + f + " = " + (fatorial * f));
                    } else {
                        System.out.println("O fatorial de  " + f + " é (" + (f - 1) + "!)  *  " + f + " = " + (fatorial * f));
                        fatorial *= f;
                    }
                }
            }

        }
    }

}