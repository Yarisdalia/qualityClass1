import java.util.Scanner;

public class SumaDeDosNumeros {
    public static void main (String[] args){
//pedirle al usuario que ingrese dos numeros por pantlla y sumarlos. A la suma tmb la imprima por pantalla
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;

        System.out.println("La suma es: " + suma);
    }
}
