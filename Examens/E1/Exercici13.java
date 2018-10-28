import java.util.Scanner;

class Exercici13 {

    public static void main(String[] args) {

        // Definim variables
        String nom;
        double notaExamenTeoria1, notaExamenTeoria2, notaExamenTeoria3;
        double notaExamenPract1, notaExamenPract2, notaExamenPract3;

        // Instanciem un objecte Scanner
        Scanner sc = new Scanner(System.in);

        // Demanem el nom de l'alumne
        System.out.println("Introdueix el nom de l'alumne que vols crear:");
        nom = sc.next();

        // Introduïm les notes de teoria
        System.out.println("Introdueix les 3 notes de teoria de " + nom + ", separats per espais:");
        notaExamenTeoria1 = sc.nextDouble();
        notaExamenTeoria2 = sc.nextDouble();
        notaExamenTeoria3 = sc.nextDouble();

        // Introduïm les notes de practiques
        System.out.println("Introdueix les 3 notes de pràctiques de " + nom + ", separats per espais:");
        notaExamenPract1 = sc.nextDouble();
        notaExamenPract2 = sc.nextDouble();
        notaExamenPract3 = sc.nextDouble();

        // Instanciem un nou objecte Alumne anomenat alumne1 amb tots els paràmetres
        Alumne alumne1 = new Alumne(nom, notaExamenTeoria1, notaExamenTeoria2, notaExamenTeoria3, notaExamenPract1, notaExamenPract2, notaExamenPract3, Alumne.maxPuntsExtra);

        // Preguntem com vol la nota Final, amb punts extra o sense
        System.out.println("Vols calcular la nota Final amb o sense Punts extra: Amb/Sense");
        if (sc.next().equals("Amb")) {
            alumne1.calcularNotaFinal(true);
            alumne1.imprimirNotaFinalEscala(10);
            alumne1.imprimirNotaFinalEscala(5);
        } else {
            alumne1.calcularNotaFinal(false);
            alumne1.imprimirNotaFinalEscala(10);
            alumne1.imprimirNotaFinalEscala(5);
        }
    }
}