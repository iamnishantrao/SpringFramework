package org.example.webapp.bootstrap;

import org.example.webapp.model.Author;
import org.example.webapp.model.Book;
import org.example.webapp.repositories.AuthorRepository;
import org.example.webapp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Autowired
    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author janeDoe = new Author("Jane", "Doe");
        Book springBoot = new Book("Spring Boot", "12345");
        janeDoe.getBooks().add(springBoot);
        springBoot.getAuthors().add(janeDoe);

        authorRepository.save(janeDoe);
        bookRepository.save(springBoot);

        Author dolores = new Author("Dolores", "Abernathy");
        Book westworld = new Book("West World", "98765");
        dolores.getBooks().add(westworld);
        westworld.getAuthors().add(dolores);

        authorRepository.save(dolores);
        bookRepository.save(westworld);

        System.out.println("Bootstrapping Test Data!");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Number of authors: " + authorRepository.count());
    }
}
