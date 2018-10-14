class Alumne {

    // Inicialitzem les vaiables necesaries pel funcionament mínim de la classe Alumne
    private static double maxPuntsExtra = 1.5;
    private String nom;
    private double notaExamen1;
    private double notaExamen2;
    private double notaExamen3;
    private double puntsExtra;
    private double notaFinal;

    // Constructor d'Alumne per instanciar un nou objecte Alumne amb un nom i les demes variables a 0.0
    Alumne(String nom) {
        this.nom = nom;
    }

    // Constructor d'Alumne per instanciar un nou objecte Alumne amb totes les variables
    Alumne(String nom, double notaExamen1, double notaExamen2, double notaExamen3, double puntsExtra) {
        this.nom = nom;
        this.notaExamen1 = notaExamen1;
        this.notaExamen2 = notaExamen2;
        this.notaExamen3 = notaExamen3;
        this.puntsExtra = puntsExtra;
    }

    // Funció per modificar la quantitat màxima de punts extra.
    static void modificarMaxPuntsExtra(double max) {
        maxPuntsExtra = max;
    }

    // Funció per calcular la nota final
    double calcularNotaFinal() {

        if (puntsExtra > maxPuntsExtra)
            puntsExtra = maxPuntsExtra;

        notaFinal = ((notaExamen1 + notaExamen2 + notaExamen3) / 3) + puntsExtra;

        return notaFinal;
    }

    // TODO Añadir la tabla de testeo de calcularNotaFinal()

    // Funció per veure la nota final en format text
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
            return "L'alumne " + nom + " ha tret un " + notaText + " amb una qualificació de: " + notaFinal;
        } else {
            return "L'alumne " + nom + " ha tret un " + notaText;
        }
    }

    // TODO Añadir la tabla de testeo de veureNotaFinalFormatText()

    // TODO Pregunta 13.e i 13.f

}
