class Alumne {

    // Inicialitzem les vaiables necesaries pel funcionament mínim de la classe Alumne
    static double maxPuntsExtra = 2;
    String nom;
    double notaExamenTeoria1, notaExamenTeoria2, notaExamenTeoria3;
    double notaExamenPract1, notaExamenPract2, notaExamenPract3;
    double notaFinalTeoria, notaFinalPractiques;
    double puntsExtra;
    double notaFinal;

    // Constructor d'Alumne per instanciar un nou objecte Alumne amb totes les variables
    Alumne(String nom, double notaT1, double notaT2, double notaT3, double notaP1, double notaP2, double notaP3, double puntsExtra) {
        this.nom = nom;

        this.notaExamenTeoria1 = notaT1;
        this.notaExamenTeoria2 = notaT2;
        this.notaExamenTeoria3 = notaT3;

        this.notaExamenPract1 = notaP1;
        this.notaExamenPract2 = notaP2;
        this.notaExamenPract3 = notaP3;

        this.puntsExtra = puntsExtra;
    }


    // Métode per modificar la quantitat màxima de punts extra.
    static void modificarMaxPuntsExtra(double max) {
        maxPuntsExtra = max;
    }

    // Métode per calcular la nota final
    void calcularNotaFinal(boolean ambPuntsExtra) {

        // Fem la mitjana de les notes teoriques i la guardem
        notaFinalTeoria = (notaExamenTeoria1 + notaExamenTeoria2 + notaExamenTeoria3) / 3;

        // Fem la mjitjana de les notes practiques i la guardem
        notaFinalPractiques = (notaExamenPract1 + notaExamenPract2 + notaExamenPract3) / 3;

        // Calculem la nota final amb les correspondents ponderacions
        notaFinal = notaFinalTeoria * 0.6 + notaFinalPractiques * 0.4;

        // Comprovem si l'usuari vol afegir els punts extra o no
        if (ambPuntsExtra) {
            if (notaFinal < 8) {
                if (puntsExtra > maxPuntsExtra)
                    puntsExtra = maxPuntsExtra;

                notaFinal = notaFinal + puntsExtra;
            }
        }
    }

    // Métode per imprimir la nota final amb l'escala que introdueixi l'usuari
    public void imprimirNotaFinalEscala(double escala) {
        notaFinal = (notaFinal * escala) / 10;

        System.out.println("La nota final de " + nom + ", sobre " + escala + " es: " + notaFinal);
    }

    /*RESPOSTA PREGUNTA int escala: No hauríem de canviar el codi, pero només podríem introduïr escales de valors enters, i si introduïm un flotant, els decimals els eliminaria.*/
}
