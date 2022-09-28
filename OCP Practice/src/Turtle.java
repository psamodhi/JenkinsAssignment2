public class Turtle {
    double age = 7;
    int i ;
    String name;
    double weight;



    public Turtle(String name) {
        this.name = "John Doe";

    }
    public Turtle(int i) {
        this.i = 2;

    }

    public Turtle(double weight){

        this.weight = age;
    }


    public Turtle(long age) {}
    public Turtle(String newName,  int hello) {
        name = newName;
        i = hello;
    }

    public static void main (String [] args){
        System.out.println(new Turtle(5).i);
        System.out.println(new Turtle("Hey").name);
        System.out.println(new Turtle(1.1).weight);
    }
}

