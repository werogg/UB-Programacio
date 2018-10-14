import java.util.Scanner;

class Exercici13 {

    public static void main(String[] args) {
        String nom;
        double notaExamen1, notaExamen2, notaExamen3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nom de l'alumne:");
        nom = sc.next();

        System.out.println("Nota primer examen:");
        notaExamen1 = sc.nextDouble();
        while (0 > notaExamen1 || notaExamen1 > 10)
            notaExamen1 = sc.nextDouble();

        System.out.println("Nota segon examen:");
        notaExamen2 = sc.nextDouble();
        while (0 > notaExamen2 || notaExamen2 > 10)
            notaExamen2 = sc.nextDouble();

        System.out.println("Nota tercer examen:");
        notaExamen3 = sc.nextDouble();
        while (0 > notaExamen3 || notaExamen3 > 10)
            notaExamen3 = sc.nextDouble();

        Alumne alumne1 = new Alumne(nom, notaExamen1, notaExamen2, notaExamen3, 0);

        System.out.println(alumne1.calcularNotaFinal());
        System.out.println(alumne1.veureNotaFinalFormatText());
    }
}
