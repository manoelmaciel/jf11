class ExercicioCinco {

    public static void main (String[] args) {

        int fatorial = 1;
        System.out.println("FATORIAL: ");
        System.out.println("");
        System.out.println("O fatoria de 0 é (0!) = 1");
        System.out.println("");
        /* últimno valor válido para int: 5917 ...
           A partir de 5918, o resultado fica negativo! */
        for (int f = 1; f <= 5917; f++) {

            if (f == 1) {
                System.out.println("O fatorial de  1 é (0!)  *  1 = 1");
            } else {
                if (f < 10) {
                    System.out.println("O fatorial de   " + f + " é (" + (f - 1) + "!)  * " + f + " = " + (fatorial * f));
                } else {
                    if (f >= 10) {
                        System.out.println("O fatorial de   " + f + " é (" + (f - 1) + "!)  * " + f + " = " + (fatorial * f));
                    } else {
                        if (f >= 100) {
                            System.out.println("O fatorial de   " + f + " é (" + (f - 1) + "!)   * " + f + " = " + (fatorial * f));
                        } else {
                            if (f = 1000) {
                                System.out.println("O fatorial de " + f + " é  (" + (f - 1) + "!)  * " + f + " = " + (fatorial * f));
                            } else {
                                if (f > 1000) {
                                System.out.println("O fatorial de " + f + " é (" + (f - 1) + "!)  * " + f + " = " + (fatorial * f));
                            }
                        }
                        fatorial *= f;
                    }
                     
                }
               
            }
            
        }
    }
}