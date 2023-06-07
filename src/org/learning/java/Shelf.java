package org.learning.java;

import java.util.Arrays;
import java.util.Scanner;

public class Shelf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how may book you want to put on the shelf ?");
        int bookN = Integer.parseInt(scan.nextLine());
        Book[] books = new Book[bookN];
        for (int i = 0; i < bookN; i++) {
            // dati
            Book b = null;
            boolean validBook = false;
            do {
                try {
                    System.out.print("Title of the book: ");
                    String title = scan.nextLine();
                    System.out.print("Author of the book: ");
                    String author = scan.nextLine();
                    System.out.print("Publisher of the book: ");
                    String publisher = scan.nextLine();
                    System.out.print("number of pages: ");
                    int page = Integer.parseInt(scan.nextLine());

                    b = new Book(title,author,publisher,page);
                    validBook = true;

                } catch (InvalidBookException e) {
                    System.out.println("Book title ,author, publisher must not be null and page can't be >=0");

                } catch (NumberFormatException ne) {
                    System.out.println("Invalid number");
                }

            } while (!validBook);

            books[i] = b;
            System.out.println("book n"+i+ "aggiunto inserisci dati del libro n"+ (i+1));

        }
        /*FINE CICLO STAMPA*/
        System.out.println("libri correttamente inseriti");
        System.out.println(Arrays.toString(books));
        scan.close();



    }
}
