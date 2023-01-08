package exceptions;

public class ActionException extends RuntimeException{
    private String context;
    public ActionException(String context){
        this.context = context;
    }
    public String getContext(){
        return context;
    }
}
