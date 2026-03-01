import java.util.Scanner;

public class Ej1 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("----- CONTADOR DE PUNTOS -----");

        System.out.println("Ingrese el número de partidos ganados:");
        int win = sc.nextInt();

        System.out.println("Ingrese el número de partidos perdidos:");
        int lose = sc.nextInt();

        System.out.println("Ingrese el número de partidos empatados:");
        int empates = sc.nextInt();


        int puntaje = (win * 3) + empates;

        System.out.println("\n----- RESULTADOS -----");
        System.out.println("PUNTAJE TOTAL: " + puntaje);
        System.out.println("PARTIDOS GANADOS: " + win);
        System.out.println("PARTIDOS PERDIDOS: " + lose);
        System.out.println("PARTIDOS EMPATADOS: " + empates);


    }
    }



