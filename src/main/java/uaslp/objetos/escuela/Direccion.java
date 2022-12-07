package uaslp.objetos.escuela;

public class Direccion {
    private static Direccion uniqueInstance;

    public static Direccion getInstance() {
        if (uniqueInstance != null) {
            return uniqueInstance;
        }
        return uniqueInstance = new Direccion();
    }

    private Direccion() {}
}
