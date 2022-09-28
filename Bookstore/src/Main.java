public class Main {

    public static void main(String[] args){

        Book b = new Book();

        b.setBooks(50);

        System.out.println(b.getBooks());            //uit parent class
        System.out.println(b.shelves);              //uit child class

        System.out.println(new Shop().getBookName());    //wanneer mag je new Shop() niet gebruiken?
        System.out.println(new Book().getBookName());

    }
}
