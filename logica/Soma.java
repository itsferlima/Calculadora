package logica;

public class Soma extends Operacoes {
    private double n1;
    private double n2;


    public Soma (double n1, double n2) {
    this.n1 = n1;
    this.n2 = n2;
    }
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    @Override
    public double operacao() {
        return n1 + n2;
    }
}