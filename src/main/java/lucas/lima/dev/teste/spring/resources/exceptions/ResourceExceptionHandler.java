package lucas.lima.dev.teste.spring.resources.exceptions;

import com.sun.net.httpserver.HttpsServer;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import lucas.lima.dev.teste.spring.services.excepions.ResourceNotFountException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler( ResourceNotFountException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFountException e, HttpServletRequest request){
        String error = "Resource not fount";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError er = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(er);

    }
}
