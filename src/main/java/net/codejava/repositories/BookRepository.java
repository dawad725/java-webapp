package net.codejava.repositories;

import net.codejava.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long > {
}
