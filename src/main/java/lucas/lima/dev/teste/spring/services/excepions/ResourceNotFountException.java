package lucas.lima.dev.teste.spring.services.excepions;

public class ResourceNotFountException extends RuntimeException{

    public ResourceNotFountException(Object id){
        super("Resource not found. Id " + id);
    }
}
