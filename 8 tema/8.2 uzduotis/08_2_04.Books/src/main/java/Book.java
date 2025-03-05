public class Book {

    private String title;
    private int pages;
    private int years;

    public Book(String title, int pages, int years) {
        this.title = title;
        this.pages = pages;
        this.years = years;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.years;
    }
}