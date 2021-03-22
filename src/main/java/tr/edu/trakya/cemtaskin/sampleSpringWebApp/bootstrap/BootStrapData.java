package tr.edu.trakya.cemtaskin.sampleSpringWebApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tr.edu.trakya.cemtaskin.sampleSpringWebApp.domain.Author;
import tr.edu.trakya.cemtaskin.sampleSpringWebApp.domain.Book;
import tr.edu.trakya.cemtaskin.sampleSpringWebApp.domain.Publisher;
import tr.edu.trakya.cemtaskin.sampleSpringWebApp.repositories.AuthorRepository;
import tr.edu.trakya.cemtaskin.sampleSpringWebApp.repositories.BookRepository;
import tr.edu.trakya.cemtaskin.sampleSpringWebApp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository=publisherRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Author eric=new Author("Eric","Evas");
        Book ddd=new Book("Domain Driven Design","123123");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        Publisher publisher=new Publisher();
        publisher.setName("ABC Yayinevi");
        publisher.setState("Edirne");
        publisherRepository.save(publisher);

        publisher.getBooks().add(ddd);

        ddd.setPublisher(publisher);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books :" + bookRepository.count() );
        System.out.println("Number of publishers :" + publisherRepository.count() );
    }
}
