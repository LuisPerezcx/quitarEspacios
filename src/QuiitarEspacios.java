import java.util.Scanner;

public class QuiitarEspacios {
    public void quitar(Scanner scanner) {
        System.out.print("Ingrese una cadena: ");
        String texto = scanner.nextLine();
        // Quita los espacios de la cadena de texto
        String textoSinEspacios = texto.replaceAll("\\s", "");
        System.out.println("Texto sin espacios: " + textoSinEspacios);
    }
}
