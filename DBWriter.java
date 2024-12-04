package test.Lab8_var11;

/**
 * Concrete implementation of DataWriter for database.
 */
class DBWriter implements DataWriter {
    @Override
    public void write(String data) {
        System.out.println("Writing data to database: " + data);
    }
}
