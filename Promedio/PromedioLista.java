import java.util.Scanner;

public class PromedioLista {
    private int[] lista;

    public PromedioLista(int[] lista) {
        this.lista = lista;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return (double) suma / lista.length;
    }

    public void imprimirValores() {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("El valor de la posición " + i + " es " + lista[i]);
        }
    }

    public static void ingresarValores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la lista");
        int tam = sc.nextInt();
        int[] lista = new int[tam];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Ingrese el valor de la posición " + i);
            lista[i] = sc.nextInt();
        }
        PromedioLista promedioLista = new PromedioLista(lista);
        promedioLista.imprimirValores();
        System.out.println("El promedio de la lista es " + promedioLista.calcularPromedio());
    }
}





