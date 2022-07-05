import java.util.Scanner;

public class Main {

    public static int opcion;
    public static String queja;

    public static Scanner scan = new Scanner(System.in);
    public static Usuario user = new Usuario();

    public static void main(String[] args) {

        System.out.println("Bienvenido a la viedotienda" +
                "Antes de empezar digite su nombre y despues su apellido \n" +
                "(Enviar primero el nombre antes de ingresar el apellido)");

        user.nombre = scan.next();
        user.apellido = scan.next();

        System.out.println("Bienvenido " + user.nombre + " " + user.apellido);
        System.out.println("Que pelicula deseas rentar?");
        System.out.println("1. " + "Boku No Hero Academia world Heroes Mision");
        System.out.println("2. " + "Encanto");
        System.out.println("3. " + "Spiderman No Way Home");
        System.out.println("4. " + "Kymetsu No Yaiba Mugen Train");
        System.out.println("5. " + "Cruela");

        opcion = scan.nextInt();

        if (opcion >= 1 && opcion <= 5) {

            System.out.println("Pelicula apartada");
            System.out.println("Retire en una de nuestras sucursales");
        }
        else {

            System.out.println("opcion invalida");
        }
    }
}
