package ctd.b3.java.semana5.colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Cuenta> cuentas;

    public Persona(String nombre, String apellido, int edad, ArrayList<Cuenta> cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuentas = cuentas;
    }

    public String getNombreCompleto(){
        return "Mi nombre es "+nombre+" "+apellido;
    }
    public boolean esMayorEdad(){
        return edad>60;
    }
    public double getSaldoTotal(){
        double resultado = 0;
        for (Cuenta c: cuentas
             ) { resultado += c.getSaldo();
        }
        return resultado;
    }
    public void mostrarCuentas(){
        Collections.sort(cuentas,Cuenta::compareTo);
        for (Cuenta c: cuentas
             ) {
            System.out.println(c.toString());

        }
    }
    public void mostrarCuentasDescendente(){
        Collections.reverse(cuentas);
        for (Cuenta c: cuentas
        ) {
            System.out.println(c.toString());

        }
    }
    //



}
