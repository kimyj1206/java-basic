package extends1.ex;

public class Book extends Item {
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
//        System.out.println("이름: " + super.name + ", 가격: " + super.price);
        super.print();
        System.out.println("- 저자: " + this.author + ", isbn: " + this.isbn);

    }
}
