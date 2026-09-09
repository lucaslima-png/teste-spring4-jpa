package lucas.lima.dev.teste.spring.services.excepions;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg){
        super(msg);
    }
}
