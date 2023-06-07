import java.util.Arrays;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("**** Aplicación Calculadora ****");
        //Mostramos el Menú
        // System.out.println("1. Suma \n2. Resta \n3.Multiplicación \n4.División \n5.Salir");
        System.out.println("""
                1.Suma
                2.Resta
                3.Multiplicación
                4.División
                5.Salir
                """);
        System.out.print("¿Operación a realizar?");
        var operacion = Integer.parseInt(consola.nextLine());
        //Revisar que este dentro de las opciones mencionadas
        if (operacion >= 1 && operacion <= 4){
            System.out.print("Proporciona valor operando1: ");
            var operando1 = Integer.parseInt(consola.nextLine());
            System.out.print("Proporciona valor operando2: ");
            var operando2 = Integer.parseInt(consola.nextLine());
            int resultado;
        }


    }
}
