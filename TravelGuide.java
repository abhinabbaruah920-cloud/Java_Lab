import java.util.Scanner;

// Abstract Class
abstract class AbstractProduct {
    int product_id;
    String name;
    String description;

    AbstractProduct(int product_id, String name, String description) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
    }

    abstract void display();
}

// Product Class
class Product extends AbstractProduct {
    double price;

    Product(int product_id, String name, String description, double price) {
        super(product_id, name, description);
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
    }
}

// Book Class
class Book extends Product {
    String isbn, author, title;

    Book(int product_id, String name, String description, double price,
         String isbn, String author, String title) {
        super(product_id, name, description, price);
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
    }
}

// TravelGuide Class
class TravelGuide extends Book {
    String country;

    TravelGuide(int product_id, String name, String description, double price,
                String isbn, String author, String title, String country) {
        super(product_id, name, description, price, isbn, author, title);
        this.country = country;
    }

    void display() {
        super.display();
        System.out.println("Country: " + country);
    }
}

// CompactDisc Class
class CompactDisc extends Product {
    String artist, title;

    CompactDisc(int product_id, String name, String description, double price,
                String artist, String title) {
        super(product_id, name, description, price);
        this.artist = artist;
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println("Artist: " + artist);
        System.out.println("Title: " + title);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------- Travel Guide Input --------
        System.out.println("Enter Travel Guide Details:");

        System.out.print("Product ID: ");
        int pid1 = sc.nextInt(); sc.nextLine();

        System.out.print("Name: ");
        String name1 = sc.nextLine();

        System.out.print("Description: ");
        String desc1 = sc.nextLine();

        System.out.print("Price: ");
        double price1 = sc.nextDouble(); sc.nextLine();

        System.out.print("ISBN: ");
        String isbn = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Country: ");
        String country = sc.nextLine();

        AbstractProduct tg = new TravelGuide(pid1, name1, desc1, price1,
                isbn, author, title, country);

        // -------- CD Input --------
        System.out.println("\nEnter Compact Disc Details:");

        System.out.print("Product ID: ");
        int pid2 = sc.nextInt(); sc.nextLine();

        System.out.print("Name: ");
        String name2 = sc.nextLine();

        System.out.print("Description: ");
        String desc2 = sc.nextLine();

        System.out.print("Price: ");
        double price2 = sc.nextDouble(); sc.nextLine();

        System.out.print("Artist: ");
        String artist = sc.nextLine();

        System.out.print("Title: ");
        String cdTitle = sc.nextLine();

        AbstractProduct cd = new CompactDisc(pid2, name2, desc2, price2,
                artist, cdTitle);

        // -------- Display --------
        System.out.println("\n--- Travel Guide Details ---");
        tg.display();

        System.out.println("\n--- Compact Disc Details ---");
        cd.display();
        sc.close();
    }
}


















