package test.Lab8_var11;

/**
 * Main class to demonstrate the Abstract Factory pattern.
 */
public class Main {
    public static void main(String[] args) {
        // Using DB API
        DataAccessFactory dbFactory = new DBDataAccessFactory();
        Client dbClient = new Client(dbFactory);
        dbClient.performRead();
        dbClient.performWrite("DB Data");

        // Using File API
        DataAccessFactory fileFactory = new FileDataAccessFactory();
        Client fileClient = new Client(fileFactory);
        fileClient.performRead();
        fileClient.performWrite("File Data");

        // Using WebService API
        DataAccessFactory wsFactory = new WebServiceDataAccessFactory();
        Client wsClient = new Client(wsFactory);
        wsClient.performRead();
        wsClient.performWrite("WebService Data");
    }
}
