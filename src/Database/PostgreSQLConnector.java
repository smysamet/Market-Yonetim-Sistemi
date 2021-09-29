package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQLConnector implements DatabaseConnector {
    private String storeTableLink;
    private String connectionLink;
    private String userName;
    private String dataBaseName;
    private String password;
    private String productTableLink;
    
    public PostgreSQLConnector(String databaseName, String userName, String password){
        this.dataBaseName = databaseName;
        this.userName = userName;
        this.password = password;
        this.connectionLink = "jdbc:postgresql://localhost:5432/"+this.dataBaseName;
    }
    
    @Override
    public void setDataBaseName(String databaseName) {
        this.dataBaseName = databaseName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void connectToDatabase() {
        Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/"+this.dataBaseName,
            this.userName, this.password);
         c.setAutoCommit(false);
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
    @Override
    public String getConnectionLink() {
        return this.connectionLink;
    }

    @Override
    public String getProductTableLink() {
        return this.productTableLink;
    }

    @Override
    public void setProductTableLink(String tableLink) {
        this.productTableLink = tableLink;
    }

    @Override
    public void setStoreTableLink(String tableLink) {
        this.storeTableLink = tableLink;;
    }

    @Override
    public String getStoreTableLink() {
        return this.storeTableLink;
    }
}
