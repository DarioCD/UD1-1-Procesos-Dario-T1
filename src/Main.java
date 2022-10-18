import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        Process p = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de ventanas: ");

        int numeroVentanas = sc.nextInt();

        ArrayList<Process> lista = new ArrayList<Process>();
        sc.nextLine();
        for (int i = 0; i < numeroVentanas; i++) {
            p = pb.start();
            lista.add(p);
        }
        for (Process nuevoP : lista) {
            while (nuevoP.isAlive()) {
                System.out.println("El proceso esta alive ...");
            }
        }

    }
}