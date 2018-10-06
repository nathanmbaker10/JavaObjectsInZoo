import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        Unicorn rarity = new Unicorn("Rarity");
        Girraffe gemma = new Girraffe("Gemma");
        Bee stinger = new Bee("Stinger");

        /* Test code for earlier inheritance
        tigger.eat("meat");
        pooh.eat("fish");
        pooh.eat("meat");
        rarity.eat("marshmallows");
        rarity.sleep();
        gemma.eat("meat");
        gemma.eat("leaves");
        gemma.sleep();
        stinger.eat("ice cream");
        stinger.eat("pollen");
        */

        ArrayList<Animal> animals = new ArrayList<Animal>(Arrays.asList(tigger, pooh, rarity, gemma, stinger));
        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "pizza");

    }
}
