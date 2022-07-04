package com.mycompany.invoice.service.prefix;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {

    // j'aimerais bien setter des valeurs à ces deux attributs
    // en passant par la config de mon applicationContext.xml

    @Value("${invoice.lastNumber}")
    private long lastNumber;
    @Value("${invoice.prefix}")
    private String prefix;
    @Value("${invoice.file}")
    private File file;

    @Autowired
    private InvoiceRepositoryInterface repository;

    @Override
    public void createInvoice(Invoice invoice) {
        // donner un numéro à ma facture
        invoice.setNumber(prefix + String.valueOf(++lastNumber));
        // appeler le repository pour l'enregistrer
        repository.createInvoice(invoice);
    }

    public InvoiceRepositoryInterface getRepository() {
        return repository;
    }

    public void setRepository(InvoiceRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public List<Invoice> getInvoiceList() {
        return repository.list();
    }

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
