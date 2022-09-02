package ctd.b3.java.semana5.colecciones;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1= new Cuenta(1, 50.0);
        Cuenta cuenta2= new Cuenta(2, 14.0);
        Cuenta cuenta3= new Cuenta(3, 30.0);
        Cuenta cuenta4= new Cuenta(4, 20.0);
        Cuenta cuenta5= new Cuenta(5, 10.0);

        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        listaCuentas.add(cuenta5);
        listaCuentas.add(cuenta4);
        listaCuentas.add(cuenta1);
        listaCuentas.add(cuenta2);
        listaCuentas.add(cuenta3);
        Persona persona1= new Persona("M","S",38,listaCuentas);
        persona1.mostrarCuentas();
        System.out.println("------------------------");
        persona1.mostrarCuentasDescendente();
    }
}
