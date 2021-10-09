package lk.exam.JAVAFX.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static DataBaseConnection dataBaseConnection;
    private Connection connection;


    private DataBaseConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/JAVAFX_APPLICATION",
                "root","1121"
        );

    }

    public static DataBaseConnection getInstance() throws SQLException, ClassNotFoundException {
        if(dataBaseConnection ==null){
            dataBaseConnection=new DataBaseConnection();
        }
        return dataBaseConnection;
    }

    public Connection getConnection(){
        return connection;
    }
}
