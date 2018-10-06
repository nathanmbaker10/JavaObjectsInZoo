import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class zoo {
    String favoriteFood = "bacon";

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours.");
    }

    public void eat(String name, String food) {
        System.out.println(name + " eats " + food + ".");
        if (food == this.favoriteFood) {
            System.out.println("Yum!!! " + name + " wants more food.");
        } else {
            this.sleep(name);
        }
    }
}


