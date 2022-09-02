package ctd.b3.java.semana5.colecciones;

public class Cuenta implements  Comparable{
    private int nroCuenta;
    private double saldo;

    public Cuenta(int nroCuenta, double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Cuenta o) {
        int resultado = 0;
        if (nroCuenta > o.nroCuenta)
            resultado = 1;
        else if (nroCuenta < o.nroCuenta)
            resultado = -1;
        return resultado;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta" + "\n" +
                "Numero de Cuenta: " + nroCuenta + "\n" +
                "Saldo: " + saldo;
    }
}
