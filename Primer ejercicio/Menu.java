import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.util.*;

public class Menu {
    private static int opc;

    public Menu() {
    }

    public static void main(String[] args){
        MenuPrincipal();
    }

    public static void MenuPrincipal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Seleccione el numero de la accion que desea usar.");
        System.out.println("1. Ip");
        System.out.println("2. Listar archivos de carpeta");
        System.out.println("3. Salir de la terminal");
        System.out.println("4. Mostrar fecha actual");
        System.out.println("5. Limpiar pantalla");
        opc = scan.nextInt();
        switch(opc){
            case 1:
                Command("ipconfig");    
                Pregunta();            
                break;
            case 2:
                Command("dir");
                Pregunta();
                break;
            case 3:
                Command("exit");
                Pregunta();
                break;
            case 4:
                Command("date");
                Pregunta();
                break;
            case 5:
                Command("cls");
                Pregunta();
                break;
            default:
                System.out.println("Opcion incorrecta");
                Pregunta();
                break;
            }

    }

    public static void Command(String cmd){
        try{
            String salida;

            Runtime terminal = Runtime.getRuntime();
            Process process = terminal.exec(cmd);
            InputStreamReader inputStream = new InputStreamReader(process.getInputStream());
            BufferedReader bufferedinput = new BufferedReader(inputStream);
            while ((salida = bufferedinput.readLine()) != null){
                System.out.println(salida);
            }
        }
        catch(IOException ex){
            System.out.println("Excepcion: ");
            ex.printStackTrace();
        }
    }
    public static void Pregunta(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quiere regresar al menu anterior. Responde con numero");
        System.out.println("1. Si");
        System.out.println("2. No");
        opc = scan.nextInt();
        switch(opc){
            case 1:
                MenuPrincipal();
                break;
            default:
                System.out.println("Adios.");
                break;
        }
    }
}