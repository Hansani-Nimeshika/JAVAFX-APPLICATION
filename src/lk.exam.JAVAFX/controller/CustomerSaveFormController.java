package lk.exam.JAVAFX.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.exam.JAVAFX.model.Customer;

import java.sql.SQLException;

public class CustomerSaveFormController {
    public TextField txtID;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtSalary;

    public void customerSaveOnAction(ActionEvent actionEvent) {
        Customer c1 = new Customer(
                txtID.getText(),
                txtName.getText(),
                txtAddress.getText(),
                Double.parseDouble(txtSalary.getText())
        );
        try {

            if (new CustomerController().saveCustomer(c1))
                new Alert(Alert.AlertType.CONFIRMATION, "Saved").show();
            else
                new Alert(Alert.AlertType.WARNING, "Try Again").show();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
