package com.mycompany.invoice.repository.database;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    @Override
    public void createInvoice(Invoice invoice) {

    }

    @Override
    public List<Invoice> list() {

        Invoice invoice1 = new Invoice();
        invoice1.setNumber("1");
        invoice1.setCustomerInvoice("Apple");

        Invoice invoice2 = new Invoice();
        invoice2.setNumber("2");
        invoice2.setCustomerInvoice("Epson");

/*        List<Invoice> myList = new ArrayList<>();
        myList.add(invoice1);
        myList.add(invoice2);*/

        return List.of(invoice1, invoice2); // je retourne une liste immuable
    }
}
