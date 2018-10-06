public class Girraffe extends Animal{
    public Girraffe(String name) {
        super(name, "leaves");
    }

    public void eat(String food) {
        if(food == this.favoriteFood) {
            super.eat(food);
        } else {
            System.out.println("Yuck!! " + this.name + " will not eat " + food);
        }
    }
}
