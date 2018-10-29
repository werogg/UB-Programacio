import java.util.concurrent.TimeUnit;

public class Cronometre {

    long tempsInicial, tempsFinal;

    Cronometre() {
        tempsInicial = System.currentTimeMillis();
    }

    public void updateTime() {
        tempsFinal = System.currentTimeMillis();
    }

    long tempsTranscorregut() {
        return tempsFinal - tempsInicial;
    }

    double msToMin(double ms) {
        return (ms/1000/60);
    }

}
