public class Animal {

    private int age;
    protected String name;
    public int getAge() {    //age is marked as private, so its not directly accessible. You have to access is
        // through a getter and return the private variable
        return age;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
}
