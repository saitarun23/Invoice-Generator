package invoice.generator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import invoice.generator.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
