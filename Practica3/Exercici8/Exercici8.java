import java.util.Scanner;

public class Exercici8 {

    public static void main(String[] args) {
        String zonas;


        Zonas zona = null;

        Scanner scanner = new Scanner(System.in);
        Taximetre taxisBarna;
        taxisBarna = new Taximetre(60, 90, 2);

        System.out.println("Zona:");
        zonas = scanner.next();

        if (zonas.equalsIgnoreCase("a")) {
            zona = Zonas.A;
        } else if (zonas.equalsIgnoreCase("b")) {
            zona = Zonas.B;
        } else if (zonas.equalsIgnoreCase("c")) {
            zona = Zonas.C;
        }

        switch (zona) {
            default:
            case A:
            case B:
                System.out.println("Minuts transcorreguts:");
                int minuts = scanner.nextInt();
                System.out.println("Preu a pagar: " + taxisBarna.calcularPreuAB(zona, minuts));
                break;
            case C:
                System.out.println("Kilometres recorreguts:");
                int km = scanner.nextInt();
                System.out.println("Preu a pagar: " + taxisBarna.calcularPreuC(km) + "€");
                break;
        }

        /*
        if (zona.equalsIgnoreCase("z")) {
            System.out.println("Kilometres recorreguts:");
            int km = scanner.nextInt();
            System.out.println("Preu a pagar: " + taxisBarna.calcularPreuC(km) + "€");
        } else {
            System.out.println("Minuts transcorreguts:");
            int minuts = scanner.nextInt();
            System.out.println("Preu a pagar: " + taxisBarna.calcularPreuAB(zona.charAt(0), minuts));
        }
        */
    }
    
}


