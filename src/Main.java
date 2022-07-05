import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static Usuario user = new Usuario();
    public static Productos productos = new Productos();

    public static void main(String[] args) {

        System.out.println("Bienvenido a la farmacia Mi Salud");
        System.out.println("Recuerda que prestamos servicio en la localidad de suba");
        System.out.println("Antes de continuar dinos tu nombre y apellido");
        System.out.println("(Recuerda enviar tu nombre y despues tu apellido)");

        user.nombre = scan.next();
        user.apellido = scan.next();

        System.out.println("Hola " + user.nombre + " " + user.apellido);

        System.out.println("Que producto deseas retirar?");
        System.out.println("1. Hidroxicloroquina. Valor: " + productos.precioProducto2);
        System.out.println("2. Pregabalina. Valor: " + productos.precioProducto1);
        System.out.println("3. Tramadol. Valor: " + productos.precioProducto3);
        System.out.println("4. Acetaminofen. Valor: " + productos.precioProducto4);

        productos.seleccionProducto = scan.nextInt();

        if (productos.seleccionProducto >= 1 && productos.seleccionProducto <= 4){

            System.out.println("Retire el producto en la farmacia, Gracias");
        }
        else {

            System.out.println("Opcion invalida");
        }
    }
}
