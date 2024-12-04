package test.Lab8_var11;

/**
 * Concrete implementation of DataWriter for file.
 */
class FileWriter implements DataWriter {
    @Override
    public void write(String data) {
        System.out.println("Writing data to file: " + data);
    }
}
