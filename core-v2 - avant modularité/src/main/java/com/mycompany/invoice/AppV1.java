/*
package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import com.mycompany.invoice.service.prefix.InvoiceServicePrefix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan( basePackages = { "com.mycompany.invoice.controller.web",
        "com.mycompany.invoice.repository.memory" })
@PropertySource("classpath:application.properties")
@ImportResource("classpath:applicationContext.xml")
public class AppV1
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppV1.class);
        InvoiceControllerInterface controller = context.getBean(InvoiceControllerInterface.class);

        controller.createInvoice();

    }

    // Avec cette annotation je fourni un objet suplémentaire au conteneur léger de spring
    // Ces notre méthode qui va nous retourner notre service au conteneur léger
    @Bean
    public InvoiceServiceInterface configureInfoService() {
        return new InvoiceServicePrefix();
    }

}
*/
