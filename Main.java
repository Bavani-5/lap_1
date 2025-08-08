class LibraryBook {
    String title;
    String author;
    double price;
    int year;

    void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Year: " + year);
        System.out.println("---------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook();
        b1.title = "Data Structures in Java";
        b1.author = "Jhon";
        b1.price = 700;
        b1.year = 2022;

        LibraryBook b2 = new LibraryBook();
        b2.title = "AI Made Easy";
        b2.author = "Raj";
        b2.price = 1000;
        b2.year = 2023;

        b1.showInfo();
        b2.showInfo();
    }
}
