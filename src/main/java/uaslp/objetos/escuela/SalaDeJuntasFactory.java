package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    private static SalaDeJuntas salaDeJuntas;

    public static SalaDeJuntas get(String tipoDeSalaDeSalaDeJuntas) {
        if (tipoDeSalaDeSalaDeJuntas == "Sala A"){
            salaDeJuntas = SalaDeJuntasA.getInstance();
        }
        else if(tipoDeSalaDeSalaDeJuntas == "Sala B"){
            salaDeJuntas = SalaDeJuntasB.getInstance();
        } else if (tipoDeSalaDeSalaDeJuntas == "Sala C") {
            salaDeJuntas = SalaDeJuntasC.getInstance();
        }
        return salaDeJuntas;
    }
}
