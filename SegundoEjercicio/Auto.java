import java.util.*;

public class Auto{
    
    public String marca;
    public String modelo;
    public String anho;

    private Motor motor;
    private  CinturonSeguridad cinto;
    private Llantas llantas;
    private Luces luces;
    
    public Auto(Motor motor, CinturonSeguridad cinturon, Llantas llantas, Luces luces){
        this.motor = motor;
        this.cinto = cinturon;
        this.llantas = llantas;
        this.luces = luces;
    }

    public static void main(String[] args){
        
    }

    public void Encender(){
        System.out.println(cinto.Abrochar());
        System.out.println(motor.Arrancar());
        System.out.println(luces.Prender());
        System.out.println(llantas.Rodar());
        System.out.println(motor.Apagar());
        System.out.println(luces.Apagar());
        System.out.println(cinto.Desabrochar());    
    }
}