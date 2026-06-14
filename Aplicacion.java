import clases.Persona;
import clases.CuentaBancaria;

public class Aplicacion {
    public static void main(String[] args) {
        // 3 Instancias de persona
        Persona mia = new Persona("Mia", 30);
        Persona vera = new Persona("Vera", 40);
        Persona javi = new Persona("Javier", 50);

        // 3 instancias de cuenta bancaria
        CuentaBancaria cuentaMia = new CuentaBancaria(1000, mia);
        CuentaBancaria cuentaVera = new CuentaBancaria(2500, vera);
        CuentaBancaria cuentaJavi = new CuentaBancaria(3000, javi );

        // Movimientos cuenta Mia
        System.out.println("\nMovimientos de Mia");
        cuentaMia.depositar(500);
        System.out.println("Saldo de la cuenta: " + cuentaMia.getSaldo());
        cuentaMia.retirar(1500);
        System.out.println("Saldo de la cuenta: " + cuentaMia.getSaldo());

        // Movientos en la cuenta de Vera
        System.out.println("\nMovimientos de Jake");
        cuentaVera.depositar(1000);
        System.out.println("Saldo de la cuenta: " + cuentaVera.getSaldo());
        cuentaVera.retirar(2000);
        System.out.println("Saldo de la cuenta: " + cuentaVera.getSaldo());


        // Movimientos cuenta Javi
        System.out.println("\nMovimientos de Javi");
        cuentaJavi.depositar(2000);
        System.out.println("Saldo de la cuenta: " + cuentaJavi.getSaldo());
        cuentaJavi.retirar(5000);
        System.out.println("Saldo de la cuenta: " + cuentaJavi.getSaldo());

        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
