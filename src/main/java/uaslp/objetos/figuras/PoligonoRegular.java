package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura {
    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados){
        if (numeroDeLados < 5) throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado){
        if (numeroDeLados < 5) throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }


    public double getArea() {
        double ap = lado / (2 * Math.tan(Math.toRadians((360.0 / numeroDeLados) / 2)));
        return (lado * numeroDeLados * ap) / 2;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String getName() {
        return "Poligono Regular";
    }
}
