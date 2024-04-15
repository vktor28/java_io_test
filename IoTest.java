import java.util.Scanner;

public class IoTest {
    //clase principal con el nombre del archivo. Le puedes llamar como queireas


    //va a buscar el metodo main
    public static void main(String[] args) {
        //aquí va el código principal

        // scanner (entrada de datos). Hay que importarlo
        //queda a la escucha de la entrada del teclado
        Scanner teclado = new Scanner(System.in);//se genera objeto escicha
        System.out.println("Cuál es tu nombre? ");//Salida de información
        String nombre = teclado.nextLine();
        //entrada de información. Se guarda un valor del objeto escuha enla variable país.
        
        System.out.println("Cuál es tu apellido? ");//Salida de información
        String apellido = teclado.nextLine();

        System.out.println("Cuál es tu edad? ");//Salida de información
        int edad = teclado.nextInt();

        teclado.close(); //cirra la escucha
        System.out.println("Te llamas " + nombre + " " + apellido + " y tienes " + edad + " años");
    }

    /*aquí se podrían añadir clases,
    pero como en css es mejor crear un cocumenteo
    para cada clase*/
}
