import java.util.Scanner;
import java.util.Random;
 class Main {

    public static void main(String [] Args) {
        String j = "1";
        while (j.equals("1")) {

            System.out.println ("\f");
            System.out.println ("Adivina el número del 1 al 1000 que hemos pensado");

            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(1000);
            int i= 0;
            while (i < 1000) {
                Scanner entrada = new Scanner (System.in);
                int primerIntento = entrada.nextInt();
                if (primerIntento == randomInt) {
                    System.out.println ("Felicitaciones, acertó el número");
                    break;
                } else if (primerIntento < randomInt) {
                    System.out.println ("Demasiado chico");
                } else {
                    System.out.println ("Demasiado grande");
                }
                i++;
            }

        }
    }
}


