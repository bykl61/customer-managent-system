package service.impl;

import base.BaseAbstractCustomerService;
import entities.Customer;

public class NeroAbstractCustomerServiceImpl extends BaseAbstractCustomerService {
    @Override
    public void save(Customer customer) {
        System.out.println(customer.getFirstName()+" saved to nero");
    }
}
