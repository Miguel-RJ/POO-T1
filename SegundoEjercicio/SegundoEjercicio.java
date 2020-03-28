import java.util.*;

public class SegundoEjercicio{
    public static void main(String[] args){
        Motor motor = new Motor();
        CinturonSeguridad cinto = new CinturonSeguridad();
        Llantas llantas = new Llantas();
        Luces luces = new Luces(); 
        Auto auto =  new Auto(motor,cinto, llantas, luces);
        auto.Encender();
    }
}