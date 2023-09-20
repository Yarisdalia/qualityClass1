import java.util.Scanner;

public class CalculadoraSimple {
    public static void main (String[] args){
        //pedirle al usuario que ingrese dos numeros por pantlla y luego me indique la operacion.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primero numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Selecciona una operacion: ");
        System.out.println("1. Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Multiplicacion ");
        System.out.println("4. Divison ");

        int opcion = scanner.nextInt();
        double resultado = 0;

        switch (opcion){
            case 1 :
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Opcion no es valida");
                return;
        }
        System.out.println("El resultado es: " + resultado);
    }
}
