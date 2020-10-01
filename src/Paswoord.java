import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Paswoord {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Vul je username en password in (Je hebt drie pogingen)");
        var poging = 1;
        do {
            System.out.println();
            System.out.print("Voer je gebruikersnaam in: ");
            var s = new Scanner(System.in);
            var user = s.nextLine();
            System.out.print("Voer je paswoord in: ");
            var pass = s.nextLine();

            var user1 = "Alex";
            var pass1 = "123";
            var user2 = "Janet";
            var pass2 = "321";
            var user3 = "Simon";
            var pass3 = "112233";

            if (user.equals(user1) & pass.equals(pass1)) {
                poging = 5;
            } else if (user.equals(user2) & pass.equals(pass2)) {
                poging = 5;
            } else if (user.equals(user3) & pass.equals(pass3)) {
                poging = 5;
            } else {
                System.out.println("Fout");
                poging++;
            }
        } while (poging < 4);

        if (poging == 5) {
            System.out.println("Je bent ingelogd!");
        } else {
            System.out.println("Je hebt 3 pogingen gedaan. Probeer het over 3 minuten nog een keer.");
        }
    }
}




