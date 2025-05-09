import java.util.Scanner;

public class elevaralcuadrado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número para elevarlo al cuadrado: ");
        int numero = sc.nextInt();
        int cuadrado = numero * numero;
        System.out.println("El resultado es: " + cuadrado);

    }
}