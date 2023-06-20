import java.util.Scanner;

public class Triangulo {

    //Atributos
    private final float a;
    private final float b;
    private final float c;
    private final Scanner in = new Scanner(System.in);

    //Constructor
    public Triangulo(){
        a = setA();
        b = setB();
        c = setC();
    }

    //Getters and setters

    public float setA() {
        System.out.print("Ingrese el lado A: ");
        int a = in.nextInt();
        return (float) a;
    }
    public float getA() {
        return a;
    }

    public float setB() {
        System.out.print("Ingrese el lado B:");
        int b = in.nextInt();
        return (float) b;
    }

    public float getB() {
        return b;
    }

    public float setC() {
        System.out.print("Ingrese el lado C: ");
        int c = in.nextInt();
        return (float) c;
    }

    public float getC() {
        return c;
    }



    //Metodos

    public void obtenerValores(){
        mostrarValores();
    }

    public float semiPerimetro(){
        return ((a + b + c) / 2);
    }

    public float areaHeron(){
        float s = semiPerimetro();
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public void mostrarValores(){
        System.out.print("Usted ingreso lo siguiente\n");
        System.out.println("Lado A: " + a);
        System.out.println("Lado B: " + b);
        System.out.println("Lado C: " + c);
        System.out.println("El area del triangulo es: " + areaHeron());
    }
}
