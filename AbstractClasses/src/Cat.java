
// you can extend only one class
public class Cat extends Animal implements AnimalStuff, Birthdate{
    @Override
    public void makeNoise() {
        System.out.println("Meow meow");
    }

    @Override
    public void walk() {
        System.out.println("Catwalk");
    }

    @Override
    public void printBirthday() {
        System.out.println("My animal was born on");
    }
}
