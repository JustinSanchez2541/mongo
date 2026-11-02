package Datos;

public class RepositorioException extends RuntimeException {
    public RepositorioException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}