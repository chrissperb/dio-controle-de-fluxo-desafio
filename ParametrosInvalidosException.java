import java.lang.Exception;

// Defina sua própria classe de exceção personalizada estendendo Exception.
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Esta é uma exceção personalizada!");
    }

    public ParametrosInvalidosException(String mensagem) {
        System.out.println(mensagem);
    }
}