package Database;

import com.mysql.cj.jdbc.MysqlDataSource;

public class MysqlConnector implements DatabaseConnector {
    
    private String storeTableLink;
    private String productTableLink;
    private MysqlDataSource dataSource;
    private String connectionLink;
    private String databaseName;
    private String userName;
    private String password;

    public MysqlConnector(String databaseName, String userName, String password) {
        this.databaseName = databaseName;
        this.userName = userName;
        this.password = password;
        this.connectionLink = "jdbc:mysql://localhost:3306/"+this.databaseName+"?characterEncoding=latin1&useConfigs=maxPerformance";
    }

    @Override
    public void setDataBaseName(String databaseName) {
        this.databaseName = databaseName;
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
        try {      
            dataSource = new MysqlDataSource();
            dataSource.setServerName("localhost");
            dataSource.setPort(3306);
            dataSource.setDatabaseName(this.databaseName);
            dataSource.setUser(this.userName);
            dataSource.setPassword(this.password);
            dataSource.setCharacterEncoding("latin1");
         
        }catch(Exception e){
            e.printStackTrace();
        }
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
        this.storeTableLink = tableLink;
    }

    @Override
    public String getStoreTableLink() {
        return this.storeTableLink;
    }
}
