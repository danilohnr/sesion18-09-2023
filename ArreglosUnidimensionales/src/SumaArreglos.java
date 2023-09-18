import java.util.Scanner;

public class SumaArreglos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Tamano de los arreglos: ");
        int tamano = lector.nextInt();
        int[] arregloA = new int[tamano];
        int[] arregloB = new int[tamano];
        int[] arregloSuma = new int[tamano];
        System.out.println("Ingrese los elementos del arreglo A");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print("ArregloA[" + (i+1) + "] = ");
            arregloA[i] = lector.nextInt();
        }
        System.out.println("Ingrese los elementos del arreglo B");
        for (int i = 0; i < arregloB.length; i++) {
            System.out.print("ArregloB[" + (i+1) + "] = ");
            arregloB[i] = lector.nextInt();
        }
        for (int i = 0; i < arregloSuma.length; i++) {
            arregloSuma[i] = arregloA[i] + arregloB[i];
        }
        System.out.println("La suma de Arreglo A y Arreglo B");
        for (int i = 0; i < arregloSuma.length; i++) {
            System.out.print("ArregloSuma[" + (i+1) + "] = " + arregloSuma[i] + "\t");
        }
    }
}
