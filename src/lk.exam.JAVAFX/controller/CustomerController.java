package lk.exam.JAVAFX.controller;

import lk.exam.JAVAFX.model.Customer;
import lk.exam.JAVAFX.utils.CrudUtil;

import java.sql.SQLException;

public class CustomerController {

    public boolean saveCustomer(Customer c) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("INSERT INTO Customer VALUES (?,?,?,?)",c.getId(),c.getName(),c.getAddress(),c.getSalary());

    }
}
