package test.Lab8_var11;

/**
 * Client class that uses abstract factories to perform data access operations.
 */
class Client {
    private final DataReader reader;
    private final DataWriter writer;

    /**
     * Constructs a Client with a specified factory.
     * 
     * @param factory the factory to use for creating data access components
     */
    public Client(DataAccessFactory factory) {
        this.reader = factory.createReader();
        this.writer = factory.createWriter();
    }

    /**
     * Performs a read operation using the provided DataReader.
     */
    public void performRead() {
        reader.read();
    }

    /**
     * Performs a write operation using the provided DataWriter.
     * 
     * @param data the data to write
     */
    public void performWrite(String data) {
        writer.write(data);
    }
}

