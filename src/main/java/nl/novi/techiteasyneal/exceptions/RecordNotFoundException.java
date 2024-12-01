package nl.novi.techiteasyneal.exceptions;

public class RecordNotFoundException extends RuntimeException {

    // een default exception
    public RecordNotFoundException() {
        super();
    }

    // een exception met message
    public RecordNotFoundException(String message) {
        super(message);
    }
}