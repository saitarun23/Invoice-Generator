package invoice.generator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import invoice.generator.model.Invoice;
import invoice.generator.service.InvoiceService;

@Controller
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;
	
	@GetMapping("/invoice/new")
	public String createInvoiceForm(Model model)
	{
		model.addAttribute("invoice",new Invoice());
		return "create_invoice";
	}
	
	@PostMapping("/invoice")
	public String saveInvoice(@ModelAttribute Invoice invoice)
	{
		invoiceService.saveInvoice(invoice);
		return "redirect:/invoices";
	}
	
	@GetMapping("/invoices")
	public String listInvoices(Model model)
	{
		model.addAttribute("invoices", invoiceService.getAllInvoices());
		return "invoices";
	}

}