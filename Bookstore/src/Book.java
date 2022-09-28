public class Book extends Shop{



    @Override
    public int getBooks(){
        return 4;

    }

    @Override
    public String getBookName(){
        return super.getBookName()+"Samodhi";
    }
}
