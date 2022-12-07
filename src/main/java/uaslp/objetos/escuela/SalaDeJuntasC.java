package uaslp.objetos.escuela;

public class SalaDeJuntasC implements SalaDeJuntas{
    private static SalaDeJuntas salaDeJuntasAInstance;
    @Override
    public String getNombre() {
        return "Sala C";
    }
    public static SalaDeJuntas getInstance() {
        if (salaDeJuntasAInstance != null) return salaDeJuntasAInstance;

        salaDeJuntasAInstance = new SalaDeJuntasC();

        return salaDeJuntasAInstance;
    }
}
