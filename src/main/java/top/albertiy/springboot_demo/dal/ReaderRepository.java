package top.albertiy.springboot_demo.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import top.albertiy.springboot_demo.po.Reader;

public interface ReaderRepository extends JpaRepository<Reader,String> {

}
