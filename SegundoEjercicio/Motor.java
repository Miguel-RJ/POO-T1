import java.util.*;

public class Motor{

    public int tuercas;
    public int tornillos;
    public String nombre;
    public String modelo;

    public Motor(){
        tuercas = 200;
        tornillos = 200;
        nombre = "XERG";
        modelo = "4a";
    }

    public String Arrancar(){
        return "Run Run Run";
    }

    public String Apagar(){
        return "Motor apagado";
    }
}