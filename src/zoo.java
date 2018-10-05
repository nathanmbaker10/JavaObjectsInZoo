public class zoo {

    String favoriteFood = "bacon";
    public static void main(String[] args) {
        zoo z = new zoo();
        z.eat("Tigger", "meat");
        z.eat("Tigger", "bacon");
    }

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


