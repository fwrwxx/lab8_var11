package test.Lab8_var11;

/**
 * Abstract factory interface for creating data access components (Reader and Writer).
 */
interface DataAccessFactory {
    /**
     * Creates a data reader.
     * 
     * @return a concrete implementation of DataReader
     */
    DataReader createReader();

    /**
     * Creates a data writer.
     * 
     * @return a concrete implementation of DataWriter
     */
    DataWriter createWriter();
}
