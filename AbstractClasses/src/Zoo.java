//INNER CLASSES

public class Zoo {
    //members of innerclasses can be declared with private, protected, default, public
    // only toplevel classes and interfaces should be declared with public or default
    private interface Paper {
        public String getId();
    }

    public class Ticket implements Paper {
        private String serialNumber;

        @Override
        public String getId() {
            return serialNumber;
        }
    }

    public Ticket sellTicket(String serialNumber) {
    var t = new Ticket();
    t.serialNumber = serialNumber;
    return t;

    }

    public static void main(String...unused){
        var z = new Zoo();
        var t = z.sellTicket("12345");
        System.out.println(t.getId()+ " Ticket sold!");
    }
}