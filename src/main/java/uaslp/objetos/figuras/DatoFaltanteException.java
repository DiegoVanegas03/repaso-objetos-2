package uaslp.objetos.figuras;

public class DatoFaltanteException extends RuntimeException{
    DatoFaltanteException(String text){
        super(text);
    }
    DatoFaltanteException(){

    }
}
