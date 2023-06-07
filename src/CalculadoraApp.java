import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicación Calculadora ****");
            //Mostramos el Menú
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las opciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    //Ejecutamos la operacion
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción errónea: " + operacion);
                }
                System.out.println(); //Imprime un salto de línea antes de repetir el ciclo
            } //fin try
            catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage() + "\n");
            }
        } //fin while
    } //fin main

    private static void mostrarMenu(){
        //Mostramos el Menú
        System.out.println("""
                    1.Suma
                    2.Resta
                    3.Multiplicación
                    4.División
                    5.Salir
                    """);
        System.out.print("¿Operación a realizar? ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
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
    }
} //fin clase
