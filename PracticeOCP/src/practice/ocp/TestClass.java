package practice.ocp;


interface Flyer{
    String getName();
}

class Bird implements Flyer{
    public String name;
    public Bird(String name){
        this.name = name;
    }
    public String getName(){ return name; }
}

class Eagle extends Bird {
    public Eagle(String name){
        super(name);
    }
}

public class TestClass {
    public static void main(String[] args) throws Exception {
       // Flyer f = new Eagle("American Bald Eagle");









            Float f1 = 10.0f;
            Float f2 = 0.0f;

            Float f3 = null;

            double f = 0.0;
            try{
                f = f1/f2;
                System.out.println(f);
                f3 = f1/f2;
            }catch(Exception e){
                System.out.println("Exception");
            }
            System.out.println(f3.isInfinite());
        }

    }


