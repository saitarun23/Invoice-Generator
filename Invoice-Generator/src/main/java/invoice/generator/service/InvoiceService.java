package invoice.generator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import invoice.generator.model.Invoice;
import invoice.generator.repository.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	public Invoice saveInvoice(Invoice invoice) {
		return invoiceRepository.save(invoice);
	}

	public List<Invoice> getAllInvoices() {
		return invoiceRepository.findAll();
	}
}