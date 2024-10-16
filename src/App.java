
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Metodo m = new Metodo();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas:" );
        int cantidad = teclado.nextInt();

        Persona[] personas = new Persona[cantidad];
        for (int i = 0; i<cantidad;i++){
            System.out.println("Ingrese el nombre de la persona: "+(i+1));
            String nombre=teclado.next();
            System.out.println("Ingrese la edada de la persona: " + (i+1));
            int edad =teclado.nextInt();
            personas[i]= new Persona(edad, nombre);

        }
        System.out.println("Ingrese la edad a buscar: ");
        int dx= teclado.nextInt();
        m.inserccion(personas);
        m.metodo(personas, cantidad);

        teclado.close();
    }
}
