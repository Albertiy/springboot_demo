package top.albertiy.springboot_demo.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import top.albertiy.springboot_demo.po.Book;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Long>{
    List<Book> findByReader(String reader);
}
