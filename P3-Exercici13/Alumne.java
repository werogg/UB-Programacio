public class Alumne {

    //Inicialitzem les vaiables necesaries pel funcionament mínim de la classe Alumne
    static double  maxPuntsExtra = 1.5;
    String nom;
    double notaExamen1;
    double notaExamen2;
    double notaExamen3;
    double puntsExtra;
    double notaFinal;

    //Constructor d'Alumne per instanciar un nou objecte Alumne amb un nom i les demes variables a 0.0
    Alumne(String nom) {
        this.nom = nom;
    }

    //Constructor d'Alumne per instanciar un nou objecte Alumne amb totes les variables
    Alumne(String nom, double notaExamen1, double notaExamen2, double notaExamen3, double puntsExtra) {
        this.nom = nom;
        this.notaExamen1 = notaExamen1;
        this.notaExamen2 = notaExamen2;
        this.notaExamen3 = notaExamen3;
        this.puntsExtra = puntsExtra;
    }

    //Funció per calcular la nota final
    double calcularNotaFinal() {

        notaFinal = ((notaExamen1 + notaExamen2 + notaExamen3)/3) + puntsExtra;

        return notaFinal;
    }

    //Funció per veure la nota final en format text
    String veureNotaFinalFormatText() {
        notaFinal = ((notaExamen1 + notaExamen2 + notaExamen3) / 3) + puntsExtra;
        String notaText = null;


        if (5 <= notaFinal && notaFinal < 6)
            notaText = "Suficient";
        else if (6 <= notaFinal && notaFinal < 7)
            notaText = "Notable Baix";
        else if (7 <= notaFinal && notaFinal < 9)
            notaText = "Notable Alt";
        else if (9 <= notaFinal && notaFinal <= 10)
            notaText = "Excel·lent";

        if (notaFinal < 5) {
            notaText = "Insuficient";
            return "L'alumne " + nom + " ha tret un " + notaText +  " amb una qualificació de: " + notaFinal;
        } else {
            return "L'alumne " + nom + " ha tret un " + notaText;
        }
    }
}
