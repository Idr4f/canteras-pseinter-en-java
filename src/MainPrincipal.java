import java.lang.ref.Cleaner;
import java.util.Scanner;

public class MainPrincipal {

    public static void main(String[] args) {

        PadreYMadreYElPibe los3 = new PadreYMadreYElPibe();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        los3.nombre = scanner.next();
        System.out.println("Cual es su apellido?");
        los3.apellido = scanner.next();
        System.out.println("Cual es el nombre de su madre?");
        los3.nombreMadre = scanner.next();
        System.out.println("Cual es el nombre de su padre?");
        los3.nombrePadre = scanner.next();


        System.out.println("Yo: " + los3.nombre + " " + los3.apellido  + " soy hijo de: " + los3.nombreMadre + ", Y " + los3.nombrePadre);

    }
}
