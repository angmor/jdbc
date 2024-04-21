package jm.task.core.jdbc.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {

    static String url;
    static String username;
    static String password;

    public static Connection getCon() throws IOException, SQLException {

            password = "rootadmin";
            url = "jdbc:mysql://localhost:3306/new_schema";
            username = "admin";

        return DriverManager.getConnection(url, username, password);
    }
}
