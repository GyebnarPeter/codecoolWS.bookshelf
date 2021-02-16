package com.codecool.bookshelf.dao;

import com.codecool.bookshelf.model.user.Customer;

public interface CustomerDao {

    public void addCustomer(Customer customer);
    public Customer findById(long id);
    public Customer findCustomerByNameAndEmail(String name, String email);
    public Customer findByEmail(String email);

}
