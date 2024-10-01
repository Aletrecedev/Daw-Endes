import java.util.Scanner;

// 3) El Mayor de Tres: Crea un programa que solicite tres números al usuario e indique cuál es el mayor.

public class Eercicio3ED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = sc.nextInt();

        int mayor = Math.max(num1, Math.max(num2, num3));

        System.out.println("El número mayor es: " + mayor);

    }
}