package ArockiaMatha;

public class NotValidIdException extends RuntimeException{

    public String message;


    public NotValidIdException(String message) {
        super(message);
        this.message = message;
    }
}
