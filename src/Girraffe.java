public class Girraffe extends Animal{
    public Girraffe(String name) {
        super(name, "leaves");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if(food == this.favoriteFood) {
            System.out.println("Yum!!! " + " wants more " + food);
        } else {
            System.out.println("Yuck!! " + this.name + " will not eat " + food);
        }
    }
}
