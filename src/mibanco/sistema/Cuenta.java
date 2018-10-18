package mibanco.sistema;

public class Cuenta {

    //Definimos algunas propiedades
    String tipoDeCuenta;
    double saldo;

    //Sobrescribimos el contructor
    public Cuenta(){
        System.out.println(
                "Instancia de Cuenta creada");
    }

    /*
        Este metodo sirve para hacer retiros
        regresa el saldo final,
        si no tiene fondos regresa el saldo
        actual
     */
    public double retirar(double monto){
        if(monto > saldo){
            System.out.println(
                    "Fondos insuficientes");
            return saldo;
        }
        saldo = saldo - monto;
        System.out.println("Retiro correcto");
        return saldo;
    }

    public double abonar(double monto){
        saldo = saldo + monto;
        return saldo;
    }
}
