package Database;


public interface DatabaseConnector {
    public String getConnectionLink();
    public void setDataBaseName(String databaseName);
    public void setUserName(String userName);
    public void setPassword(String password);
    public void connectToDatabase();
    public String getUserName();
    public String getPassword();
    public String getProductTableLink();
    public void setProductTableLink(String tableLink);
    public void setStoreTableLink(String tableLink);
    public String getStoreTableLink();
}
