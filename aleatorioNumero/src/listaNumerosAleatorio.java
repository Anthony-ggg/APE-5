import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class listaNumerosAleatorio {

    Scanner scanner = new Scanner(System.in);


    public void pedirLimite(){
        System.out.print("Ingresa la cantidad de números aleatorios que deseas generar: ");
        int cantidadNumeros = scanner.nextInt();

        List<Integer> numerosAleatorios = generarNumerosAleatorios(cantidadNumeros);
        System.out.println("Lista de números aleatorios generados: " + numerosAleatorios);

        List<Integer> numerosPares = obtenerNumerosPares(numerosAleatorios);
        System.out.println("Números pares encontrados: " + numerosPares);
    }

    public static List<Integer> generarNumerosAleatorios(int cantidad) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = random.nextInt(100); // Genera números aleatorios entre 0 y 99
            numeros.add(numeroAleatorio);
        }

        return numeros;
    }

    public static List<Integer> obtenerNumerosPares(List<Integer> numeros) {
        List<Integer> numerosPares = new ArrayList<>();

        for (Integer numero : numeros) {
            if (numero % 2 == 0) { // Verifica si el número es par
                numerosPares.add(numero);
            }
        }

        return numerosPares;
    }
}
