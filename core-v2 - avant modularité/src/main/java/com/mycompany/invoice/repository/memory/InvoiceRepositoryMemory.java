package com.mycompany.invoice.repository.memory;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {

    public static List<Invoice> invoices = new ArrayList<>();

    @Override
    public void createInvoice(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice added with number " + invoice.getNumber() + " for customer : " + invoice.getCustomerInvoice());
    }

    @Override
    public List<Invoice> list() {
        throw new UnsupportedOperationException();
    }

}
