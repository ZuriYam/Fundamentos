import java.util.Scanner;

public class ej2 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("----- CALCULADORA DE PUNTAJE -----");

        System.out.println("Ingrese el número de respuestas correctas:");
        int correctas = sc.nextInt();

        System.out.println("Ingrese el número de respuestas incorrectas:");
        int incorrectas = sc.nextInt();

        System.out.println("Ingrese el número de respuestas en blanco:");
        int blanco = sc.nextInt();


        int puntaje = (correctas * 4) - incorrectas;

        System.out.println("\nPUNTAJE FINAL: " + puntaje);


    }
}

