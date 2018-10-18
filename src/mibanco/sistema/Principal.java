package mibanco.sistema;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){

        //Creamos el Scanner
        Scanner s = new Scanner(System.in);
        System.out.println(
                "== Sistema mi Banco ==");
        int opcion = 0;
        //Creamos la instancia de la clase0
        //Cuenta
        Cuenta c = new Cuenta();
        do{
            System.out.println(
                    "1. Registrar");
            System.out.println(
                    "2. Abonar");
            System.out.println(
                    "3. Retirar");
            System.out.println(
                    "0. Salir");
            System.out.print(
                    "Seleccione una opcion: ");
            opcion = s.nextInt();
            switch(opcion){
                case 1:
                    s.nextLine();
                    System.out.print(
                            "Tipo de cuenta: ");
                    c.tipoDeCuenta = s.nextLine();
                    System.out.println(
                         "Cuenta Registrada");
                    break;
                case 2:
                   System.out.print(
                           "Monto a abonar: ");
                   double saldo =
                           c.abonar(s.nextDouble());
                   System.out.println(
                           "Abono correcto");
                   System.out.printf(
                           "Su saldo es de $%,.2f%n",
                           saldo);
                   break;
                case 3:
                    System.out.print(
                            "Monto a retirar: ");
                    saldo = c.retirar(s.nextDouble());
                    System.out.printf(
                            "Su saldo es de $%,.2f%n",
                            saldo);
                    break;
                case 0:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println(
                            "Opción no Válida");


            }
        }while(opcion != 0);
    }
}
