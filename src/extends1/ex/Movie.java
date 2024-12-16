package extends1.ex;

public class Movie extends Item {
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
//        System.out.println("이름: " + super.name + ", 가격: " + super.price);
        super.print();
        System.out.println("- 감독: " + this.director + ", 배우: " + this.actor);
    }
}
