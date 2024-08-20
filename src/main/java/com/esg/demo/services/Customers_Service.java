package com.esg.demo.services;

import com.esg.demo.db.Tables;
import com.esg.demo.models.CustomersModel;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Customers_Service {
    @Autowired
    DSLContext context;

    public void createCustomer(CustomersModel customer){
        var c = context.newRecord(Tables.CUSTOMERS);
        c.setCustomerRef(customer.getCustomerRef());
        c.setCustomerName(customer.getCustomerName());
        c.setAddressLine_1(customer.getAddressLine1());
        c.setAddressLine_2(customer.getAddressLine2());
        c.setTown(customer.getTown());
        c.setCounty(customer.getCounty());
        c.setCountry(customer.getCountry());
        c.setPostcode(customer.getPostcode());
        c.store();
    }

    public CustomersModel getCustomer(String customerRef){
        var c = context
                .selectFrom(Tables.CUSTOMERS)
                .where(Tables.CUSTOMERS.CUSTOMER_REF.eq(customerRef))
                .fetchInto(CustomersModel.class);

        if(c.isEmpty()){
            return null;
        }
        else{
            return c.get(0);
        }
    }
}
