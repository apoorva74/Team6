package Database;

import base.CommonAPI;

import java.io.IOException;
import java.sql.SQLException;

public class DBreader extends ConnectDB{

    public void dbConnection() throws SQLException, IOException, ClassNotFoundException {
        ConnectDB.connectToMySql();
    }

}