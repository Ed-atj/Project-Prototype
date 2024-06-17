package conexaosql;

import java.sql.*;

public class Conexao{
    private static final String url = "jdbc:mysql://localhost:3306/dbteste";
    private static final String user = "root";
    private static final String password = "start";

    private static Connection connection;
    public  static Connection getConexao(){
        try{
            if(connection == null){
                connection = DriverManager.getConnection(url, user, password);
            }   
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
        return connection;
    }
}