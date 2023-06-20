public class Main {
    public static void main(String[] args) {
        int[] lista = {5, 6, 8, 9, 7}; // Ejemplo de una lista de valores
        PromedioLista promedioLista = new PromedioLista(lista);
        promedioLista.imprimirValores();
        System.out.println("El promedio de la lista es " + promedioLista.calcularPromedio());
    }
}