import java.util.Scanner;

public class elevaralcuadrado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // mejor con comentarios para llevar bien el control, este es para el cuadrado
        System.out.print("Ingrese un número para elevarlo al cuadrado: ");
        int numero = sc.nextInt();
        int cuadrado = numero * numero;
        System.out.println("El resultado es: " + cuadrado);

        // este para el factorial
        System.out.print("Ingrese un número para calcular su factorial: ");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);

        // este para el promedio
        int suma = 0;
        System.out.println("Ingrese 5 números para calcular el promedio:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();
            suma = suma + num;
        }
        double promedio = (double) suma / 5;
        System.out.println("El promedio de los 5 numeros es: " + promedio);
    }
}
