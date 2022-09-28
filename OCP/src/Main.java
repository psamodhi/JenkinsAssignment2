public class Main {

    public static void main (String [] args){

        Vehicle v = new Vehicle();
        //v = new Bicycle();
        System.out.println(v.ColorName("red"));
        System.out.println(new Bicycle().ColorName("t"));


       new Mammal("p");
        new Platypus();
       Car car = new Car ();
        car.go();

        Bicycle b = new Bicycle();
        b.stop();

        System.out.println(car.doors);
        System.out.println(b.pedals);


        Flowers flower = new Flowers();
        flower.orchids();

        Flowershop flowershop = new Flowershop();

        //bij static hoef je geen nieuwe object aan te maken, mag gelijk oproepen in jou class name
        Flowershop.orchids();

        System.out.println(flowershop.testHidden);





        Super s = new Super();

        System.out.println(s.color);
        System.out.println(new Super().getColor());
        System.out.println(new Super().color);

    }

    static int add(int a, int b) {
        return a + b;   //overloading
    }

    static int add(int a, int b, int c) {
        return a + b + c;    //overloading, parameters aanpassen, method name blijft
    }

    }

