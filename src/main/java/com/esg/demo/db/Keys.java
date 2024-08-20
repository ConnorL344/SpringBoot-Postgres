/*
 * This file is generated by jOOQ.
 */
package com.esg.demo.db;


import com.esg.demo.db.tables.Customers;
import com.esg.demo.db.tables.records.CustomersRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CustomersRecord> CUSTOMERS_PK = Internal.createUniqueKey(Customers.CUSTOMERS, DSL.name("customers_pk"), new TableField[] { Customers.CUSTOMERS.CUSTOMER_REF }, true);
}
