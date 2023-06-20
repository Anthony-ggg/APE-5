import java.util.Scanner;

public class Numero {
    //Atributos
    private int numero;
    private Scanner in = new Scanner(System.in);

    //Constructor
    public Numero(){
        numero = 0;
    }

    //Metodos
    public void setNumero(){
        System.out.print("Ingrese un numero: ");
        numero = in.nextInt();
        esPar();
    }

    public int getNumero(){
        return numero;
    }

    public void esPar(){
        if(numero % 2 == 0){
            System.out.println("El numero " + numero + " es par");
        }else{
            System.out.println("El numero " + numero + " es impar");
        }
    }
}
