import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Mascota mascota = new Mascota();
        Dueño dueño = new Dueño();

        System.out.println("Nombre de su mascota?");
        mascota.nombre  = scan.next();

        System.out.println("Su mascota es un@?");
        mascota.tipoDeMascota = scan.next();

        System.out.println("que edad tiene su mascota");
        mascota.edad = scan.nextInt();

        System.out.println(mascota.nombre +  " es un@ " + mascota.tipoDeMascota + ", El cual tiene"
         + mascota.edad + " años de edad" + dueño.nombre +  dueño.apellido + " es actualmente el dueño");
    }
}
