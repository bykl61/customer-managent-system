import base.BaseAbstractCustomerService;
import entities.Customer;
import service.impl.CustomerCheckServiceImpl;
import service.impl.NeroAbstractCustomerServiceImpl;
import service.impl.StarbucksAbstractCustomerServiceImpl;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer abdurrahman = new Customer("abdurrahman","osman",12345678978L,new Date(2001,12,1));
        Customer mehmet = new Customer("mehmet","baykal",12345678910L,new Date(1994,10,1));

        BaseAbstractCustomerService abdurrahmanService = new NeroAbstractCustomerServiceImpl();
        BaseAbstractCustomerService mehmetService = new StarbucksAbstractCustomerServiceImpl(new CustomerCheckServiceImpl());
        abdurrahmanService.save(abdurrahman);
        mehmetService.save(mehmet);
    }
}
