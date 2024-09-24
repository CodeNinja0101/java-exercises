package src.exceptions.custom;


public class VoterAgeException extends Exception {                      // Custom exception class that extends the built-in Exception class

    public VoterAgeException(String message) {                          // Constructor that accepts a custom message
        super(message);
    }
}
