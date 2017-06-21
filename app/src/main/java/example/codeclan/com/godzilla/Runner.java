package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Runner {

    public static void main(String[] args) {
        Godzilla godzilla = new Godzilla("Godzilla", 100, 50);
        Skyscraper skyscraper = new Skyscraper("Shard", 80);
        Cthulhu cthulhu = new Cthulhu("Cthulhu", 100, 70);
        Museum museum = new Museum("Louvre", 50);

        System.out.println("Watch out " + godzilla.getName() + " is gonna stomp on the " + museum.getType());
        System.out.println(godzilla.roar());
        System.out.println(godzilla.attack(museum));

        System.out.println("The " + museum.getType() + " Has been destroyed!");

        System.out.println(cthulhu.getName() + " is smashing up the " + skyscraper.getType());

        System.out.println(cthulhu.attack(skyscraper));
        System.out.println(cthulhu.roar());

        System.out.println("Watch out " + godzilla.getName() + " is gonna stomp on the " + skyscraper.getType());

        System.out.println(godzilla.attack(skyscraper));
        System.out.println(godzilla.roar());

        System.out.println("Nooooo " + skyscraper.getType() + " Has been destroyed!");

    }
}
