import java.util.Scanner;

public class EjercicioTelefonia {
    public static void main(String[] args) {
        int estandar = 100;
        boolean quierescontratar, telefono, internet50mb, internet, escliente, renovarpack, personamayor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quieres contratar la tarifa estandar?");
        quierescontratar = teclado.nextBoolean();
        System.out.println("Quieres contratar teléfono y 2GB de datos?");
        telefono = teclado.nextBoolean();
        System.out.println("Quieres contratar internet 50mb sin datos?");
        internet50mb = teclado.nextBoolean();
        System.out.println("Quieres telefono con llamadas ilimitadas y internet 100 mb y television?");
        internet = teclado.nextBoolean();
        System.out.println("Eres ya cliente nuestro?");
        escliente = teclado.nextBoolean();
        System.out.println("Tienes 80 años o más");
        personamayor = teclado.nextBoolean();

        if (quierescontratar == true && telefono == true && internet50mb == true && internet == true && escliente = false && personamayor == false){

        }

    }
}
