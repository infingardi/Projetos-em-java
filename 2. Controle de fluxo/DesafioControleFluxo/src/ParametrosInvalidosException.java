public class ParametrosInvalidosException extends Exception{

    public ParametrosInvalidosException() {
        super("Erro: Parametros invalidos");
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
