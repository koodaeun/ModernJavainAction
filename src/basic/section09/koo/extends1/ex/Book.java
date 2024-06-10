package basic.section09.koo.extends1.ex;

public class Book extends Item {
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn){
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

//    Non-static method 'print()' cannot be referenced from a static context
    @Override
    public void print(){
        super.print();
        System.out.println("- 저자:"+author+" isbn:"+isbn);
    }

}
