package invoice.generator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import invoice.generator.model.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

}
