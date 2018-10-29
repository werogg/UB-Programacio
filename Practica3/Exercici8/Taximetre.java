public class Taximetre {

    double zonaA;
    double zonaB;
    double zonaC;
    final double BANDERA = 5;

    Taximetre(double preuZonaA, double preuZonaB, double preuZonaC) {
        zonaA = preuZonaA;
        zonaB = preuZonaB;
        zonaC = preuZonaC;
    }

    double calcularPreuAB(Zonas zona, int minuts) {

        switch (zona) {
            default:
            case A:
                return BANDERA + (zonaA / 60 * minuts);
            case B:
                return BANDERA + (zonaB / 60 * minuts);
        }

        /*switch (zona) {
            default:
            case 'a':
            case 'A':
                return BANDERA + (zonaA / 60 * minuts);
            case 'b':
            case 'B':
                return BANDERA + (zonaB / 60 * minuts);
        }*/
    }

    double calcularPreuC(double km) {
        return km * zonaC;
    }
}
