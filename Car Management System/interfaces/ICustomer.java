package interfaces;

import classes.*;


import java.lang.*;

public interface ICustomer
 {
    
    boolean insertCustomer(Customer customer);
    boolean removeCustomer(Customer customer);
    void showAllCustomers();
}
