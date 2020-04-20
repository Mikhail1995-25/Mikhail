package ru.mikhail.pojo;

public class Library {
    public static void main(String[] args) {
        Book number1 = new Book("CleanCode", 890);
        Book number2 = new Book("GerbertShildt", 1500);
        Book number3 = new Book("ProgramingJava", 600);
        Book number4 = new Book("JavaCore", 1000);

        Book[] books = new Book[4];

        books[0] = number1;
        books[1] = number2;
        books[2] = number3;
        books[3] = number4;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " " + book.getNumber());
        }

        System.out.println();
        System.out.println("Rearrange index 0 and 3.");

        Book b = books[0];
        books[0] = books[3];
        books[3] = b;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " " + book.getNumber());
        }

        System.out.println();
        System.out.println("Print the CleanCode book to the console.");

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName() == "CleanCode") {
                System.out.println(book.getName() + " " + book.getNumber());
            }
        }
    }
}
