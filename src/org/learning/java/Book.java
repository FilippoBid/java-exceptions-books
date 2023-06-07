/*
Un libro è composto da :
        - titolo
        - numero pagine
        - autore
        - editore
        Scrivere un programma che inserisce n libri in un array.
        Chiede i dati di un libro (titolo, numero pagine, autore, editore), istanzia un nuovo oggetto della classe Book e lo inserisce nell’array.
        Lo fa per il numero di elementi previsti nell’array.
        Quando vengono inseriti i dati, verificare che siano corretti (es. non accettare titolo o autore o editore vuoto, numero pagine ≤ 0). Se ci sono errori, lanciare un’eccezione e gestirla mostrando a video il tipo di errore.
        Implementare i getter e setter di tutti gli attributi del libro gestendo anche in questo caso eventuali errori di dati non corretti (che generano quindi eccezione).
        Al termine dell’inserimento mostrare a video l’array di libri
        BONUS: scrivere tutti i dati dei libri in un file (.txt) e in seguito rileggerli dal file e mostrarli a video.


*/


package org.learning.java;

public class Book {

    String title;
    String author;
    String publisher;
    int page;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title!=null) {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    /*costrutt*/
    public Book(String title,String author,String publisher, int page) throws InvalidBookException {

        if (!title.isEmpty() && !author.isEmpty() && !publisher.isEmpty() && page > 0) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;

            this.page = page;
        } else {
            throw new InvalidBookException();
        }

    }

    @Override
    public String toString() {
        return "Book:" +
                "title='" + title + '\n' +
                ", author='" + author + '\n' +
                ", publisher='" + publisher + '\n' +
                ", page=" + page + '\n'
                ;
    }
}
