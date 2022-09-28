public abstract class Animal {
    int age;
    String name;

    //Abstract classes makes sure that every child class must have some values related to that specific method
    public abstract void makeNoise();   //you don't specify a body for an abstract method


    //child class doesn't need to override this method, since its not abstract
    public void printName(){
        System.out.println("My name is" + name);
    }

class Nonabstract{
        Nonabstract n = new Nonabstract();
        Animal a = new Animal() {

            @Override
            public void makeNoise() {

            }
        };
}
}
