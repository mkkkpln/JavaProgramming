package exceptions;

//checked exception
public class NoPhoneOnTable extends Exception {
    public NoPhoneOnTable(String message){
        super(message);
    }
}
