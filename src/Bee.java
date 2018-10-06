public class Bee extends Animal {
    public Bee(String name) {
        super(name, "pollen");
    }

    public void eat(String food) {
        if (food == this.favoriteFood) {
            super.eat(food);
            this.sleep();
        } else {
            System.out.println("Yuck!! " + this.name + " will not eat " + food);
        }
    }

    public void sleep() {
        System.out.println(this.name + " never sleeps");
    }
}
