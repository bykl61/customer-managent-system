package service.impl;

import entities.Customer;
import mernis.IBSKPSPublicSoap;
import service.CustomerCheckService;

import java.util.Date;
import java.util.Locale;

public class CustomerCheckServiceImpl implements CustomerCheckService {
    private IBSKPSPublicSoap ibskpsPublicSoap = new IBSKPSPublicSoap();

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        try {
            return ibskpsPublicSoap.TCKimlikNoDogrula(customer.getTc(), customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(), customer.getBirth().getYear());

        } catch (Exception e) {
            return false;
        }


    }
}
