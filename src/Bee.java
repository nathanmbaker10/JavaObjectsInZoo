public class Bee extends Animal {
    public Bee(String name) {
        super(name, "pollen");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if (food == this.favoriteFood) {
            System.out.println("Yum!!! " + this.name + " wants more " this.favoriteFood);
            this.sleep();
        } else {
            System.out.println("Yuck!! " + this.name + " will not eat " + food);
        }
    }
}
