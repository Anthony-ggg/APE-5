import java.util.Scanner;

public class Suma {
    private int a;
    private int b;
    private int c;


    public void realizarSuma()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
    int a = sc.nextInt();
    System.out.println("Ingrese el segundo numero");
    int b = sc.nextInt();
    int c = a + b;
    System.out.println("La suma es: " + c);

}
}
