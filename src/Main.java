import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static Menu menu = new Menu();
    public static Moto moto = new Moto();

    public static void main(String[] args) {

        System.out.println("Bienvenido al taller de motos");
        System.out.println("desea registrar su veiculo?");
        System.out.println("1. Si");
        System.out.println("2. No");
        menu.menu = scan.nextInt();

        if (menu.menu == 1) {

            System.out.println("Ates de continuar nesesitamos que registre su vehiculo:");
            System.out.println("(Primero digite las letras y envie, y despues los numeros y envie)");
            moto.placaMotoLetras = scan.next();
            moto.placaMotoNumeros = scan.nextInt();

            System.out.println("Que nesesidad tiene usted?");
            System.out.println("Escriba la tareea que nesesita que realizemos");
            moto.tareaARealizar = scan.next();

            System.out.println("Su turno para: " + moto.tareaARealizar +" Ya ha sido asignado, acerquese a nuestra sucursal" +
                    " para poder atenderlo");
        } else if (menu.menu == 2) {

            System.out.println("Si usted tiene un vehiculo ya registrado"
            + "Por favor digite su placa del modo en que la registro");
            moto.placaMotoLetras = scan.next();
            moto.placaMotoNumeros = scan.nextInt();

            System.out.println("Vehiculo encontrado, retirelo en el taller, gracias");
        }


    }
}
