public class Bat extends Mama {
    String type = "bat";
    public String getType() {
        return super.type + ":" + this.type;  //hier is die this optional
    }
    public static void main(String... zoo) {
        System.out.print(new Bat().getType());
    }
}
