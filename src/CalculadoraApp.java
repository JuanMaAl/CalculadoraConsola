import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            //Mostramos el Menú
            System.out.println("**** Aplicación Calculadora ****");
            System.out.println("""
                    1.Suma
                    2.Resta
                    3.Multiplicación
                    4.División
                    5.Salir
                    """);
            System.out.print("¿Operación a realizar? ");
            var operacion = Integer.parseInt(consola.nextLine());
            //Revisar que este dentro de las opciones mencionadas
            if (operacion >= 1 && operacion <= 4) {
                System.out.print("Proporciona valor operando1: ");
                var operando1 = Integer.parseInt(consola.nextLine());
                System.out.print("Proporciona valor operando2: ");
                var operando2 = Integer.parseInt(consola.nextLine());
                int resultado;
                switch (operacion) {
                    case 1 -> { //Suma
                        resultado = operando1 + operando2;
                        System.out.println("Resultado suman: " + resultado);
                    }
                    case 2 -> { //Resta
                        resultado = operando1 - operando2;
                        System.out.println("Resultado resta: " + resultado);
                    }
                    case 3 -> { //Multiplicación
                        resultado = operando1 * operando2;
                        System.out.println("Resultado multiplicación: " + resultado);
                    }
                    case 4 -> { //División
                        resultado = operando1 / operando2;
                        System.out.println("Resultado división: " + resultado);
                    }
                    default -> System.out.println("Opción errónea: " + operacion);
                }
            } else if (operacion == 5) {
                System.out.println("Hasta pronto...");
                break;
            } else {
                System.out.println("Opción errónea: " + operacion);
            }
            System.out.println(); //Imprime un salto de línea antes de repetir el ciclo
        } //fin while
    } //fin main
} //fin clase
