package test.Lab8_var11;

/**
 * Concrete implementation of DataReader for database.
 */
class DBReader implements DataReader {
    @Override
    public void read() {
        System.out.println("Reading data from database...");
    }
}