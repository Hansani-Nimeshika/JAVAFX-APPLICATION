package lk.exam.JAVAFX.controller;

import lk.exam.JAVAFX.model.Item;
import lk.exam.JAVAFX.utils.CrudUtil;

import java.sql.SQLException;

public class ItemController {
    public boolean saveItem(Item item) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("INSERT INTO Item VALUES (?,?,?,?)",item.getItemcode(),item.getDescription(),item.getUnitprice(),item.getQtyonhand());

    }
}
