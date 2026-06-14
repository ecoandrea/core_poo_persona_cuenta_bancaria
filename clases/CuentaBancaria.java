package clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {

    // Atributos
    private double saldo;
    private Persona titular;
    private int numeroCuenta;

    // Atributo solamente de la clase, no del constructor
    public static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    // Constructor
    public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;

        // Generamos número aleatorio de 6 dígitos
        Random numAleatoreo = new Random();
        this.numeroCuenta = 100000 + numAleatoreo.nextInt(900000); // asegura 6 dígitos entre 100000 y 999999

        // Se crea cuenta y se agrega a la lista de cuentas bancarias
        listaDeCuentasBancarias.add(this);
    }

    // Getters & Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) { // no se utilizará porque será identificador de la cuenta y no se
                                                    // cambia
        this.numeroCuenta = numeroCuenta;
    }

    // Lista de cuenta bancaria no se genera como getter y setter pq es info
    // estatico, no es atributo de la instancia sino de la clase

    // Depositar dinero
    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Depósito de: " + monto + "se ha realizado con éxito");

    }

    // Retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println("Retiro de: " + monto + " se ha realizado con éxito");
        } else if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor que 0.");
        } else {
            System.out.println("Fondos insuficientes para retirar: " + monto);
        }

    }

    // Metodo que despliega información

    public void despliegaInformacion() {
        System.out.println("\n===Datos de la Cuenta===");
        System.out.println("Numero de cuenta: " + this.numeroCuenta);
        System.out.println("Saldo de la cuenta: " + this.saldo);
        System.out.println("Titular de la cuenta: " + this.titular.getNombre());
        System.out.println("============");
        // this.titular.despliegaInformacion(); //aqui solo se llama todo
    }

    // Metodo estatico que imprimir informacion de las cuentas bancarias
    public static void imprimeInformacionDeTodasLasCuentas() {
        System.out.println("Informacion de todas las cuentas bancarias");
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion(); //muestra los datos de la cuenta
        }
    }
}
