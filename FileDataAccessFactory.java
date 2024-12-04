package test.Lab8_var11;

/**
 * Concrete factory for creating file-related data access components.
 */
class FileDataAccessFactory implements DataAccessFactory {
    @Override
    public DataReader createReader() {
        return new FileReader();
    }

    @Override
    public DataWriter createWriter() {
        return new FileWriter();
    }
}
