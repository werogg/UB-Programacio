import java.util.Scanner;

public class Exercici10 {

    public static void main(String[] args) {
        boolean gmoll = false;

        Scanner scanner = new Scanner(System.in);

        Cronometre crono = new Cronometre();

        System.out.println("El pastis es al forn cronometre iniciat 15min.");
        while(crono.msToMin(crono.tempsTranscorregut()) < 0.1) {
            crono.updateTime();
        }
        System.out.println("Ja han passat els 15min! Comproveu la coccio del pastis ara.");
        System.out.println("Ha sortit moll el ganivet?");

        gmoll = ((scanner.next().equalsIgnoreCase("Si")) ? true : false);

        while (gmoll) {
            System.out.println("El deixarem 10min més, cronometre iniciat");
            crono = new Cronometre();
            while(crono.msToMin(crono.tempsTranscorregut()) < 0.1) {
                crono.updateTime();
            }
            System.out.println("Ja han passat els 10min! Comproveu la coccio del pastis ara.");
            System.out.println("Ha sortit moll el ganivet?");

            gmoll = ((scanner.next().equalsIgnoreCase("Si")) ? true : false);
        }

        System.out.println("Perfecte!, deixeu-lo al forn reposar 3min, cronometre iniciat 3min.");
        crono = new Cronometre();
        while(crono.msToMin(crono.tempsTranscorregut()) < 0.1) {
            crono.updateTime();
        }
        System.out.println("Pi, pi, pi, pi ! Ja podeu treure el pastis de forn i deixar-lo refredar sobre una reixa.");

    }
}
