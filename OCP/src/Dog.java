public class Dog {

    private static String name;
    private int age;
    private int weight;
    public String color ="black";



   public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }

    public void setName(String name) {
     //  name = name;  output: null
     this.name = name;  // this is alleen necessary wanneer je same name hebt
        // bij different names mag je this weglaten
        weight = age;
        // this.name ="Bruintje" mag ook

    }

    // you cannot this within a static method
    public static void Doggy(){
       Dog.name = name;
    }


    // call a constructor from another constructor


    public void setAge(int age) {
        this.age = age;
    }
public Dog (){
       this(5,"Vicky");  //there can be only one this in a constructor
 //       this(9, "Fifi");
//       this(13, "Bruintje");
    System.out.println(this.age);    //last in is first out
    System.out.println(this.name);
}

    public Dog (int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main (String [] args){
       Dog doggy = new Dog();
       doggy.setName("Tommy");
       System.out.println(doggy.getName());
    }
}
