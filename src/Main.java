// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio 1:");


        int numeroIF = 0;
        if (numeroIF == 0) {
            System.out.println("El número es neutro");
        } else if (numeroIF < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }


        System.out.println("Ejercicio 2:");

        int numeroWhile = 1;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;

        }
            System.out.println("Ejercicio 3:");

            int Numerowhile = 3;
            do {
                System.out.println(Numerowhile);
                Numerowhile = Numerowhile + 1;
            } while (Numerowhile < 3);


        System.out.println("Ejercicio 4:");


        for (int numeroFor = 0; numeroFor <=3 ; numeroFor= numeroFor +1)
        {
            System.out.println(numeroFor);
        }

        System.out.println("Ejercicio 5:");

        var estacion="OTOÑO";

        switch (estacion){

            case "VERANO":
                System.out.println("Es verano");
                break;

            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;

            default:
                System.out.println("Estacion no disponible");
        }




        }


    }


