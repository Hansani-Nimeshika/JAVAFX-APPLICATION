package lk.exam.JAVAFX.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.exam.JAVAFX.model.Item;

import java.sql.SQLException;

public class ItemSaveFormController {
    public TextField txtCode;
    public TextField txtDes;
    public TextField txtUprice;
    public TextField txtQty;

    public void SaveItemOnAction(ActionEvent actionEvent) {
        Item item = new Item(
                txtCode.getText(),
                txtDes.getText(),
               Double.parseDouble(txtUprice.getText()),
                Integer.parseInt(txtQty.getText())
        );
        try {

            if (new ItemController().saveItem(item))
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
