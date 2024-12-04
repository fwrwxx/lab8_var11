package test.Lab8_var11;

/**
 * Concrete factory for creating database-related data access components.
 */
class DBDataAccessFactory implements DataAccessFactory {
    @Override
    public DataReader createReader() {
        return new DBReader();
    }

    @Override
    public DataWriter createWriter() {
        return new DBWriter();
    }
}
