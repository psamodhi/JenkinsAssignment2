package pond.goose;

import pond.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
//        DuckTeacher teacher = new DuckTeacher();
//        teacher.swim();
        DuckTeacher.swim();
        DuckTeacher.name();
        System.out.println("Thanks" + DuckTeacher.name);
        a = d = c;
    }

    int a = 1;
    int d;
    int c;
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(6));
        System.out.println(~1236546536);

        LostDuckling l = new LostDuckling();
        l.swim();

        Boolean b = (Boolean) true;



        //DuckTeacher.count(new String[0]);
    }

}