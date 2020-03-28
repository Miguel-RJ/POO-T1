import java.util.*;

import jdk.nashorn.internal.scripts.JD;

public class Asteriscos{
    static int altura;
    public static void main(String[] args){
        altura = PreguntaAltura();
        Centrado();
        JIzquierda();
        JDerecha();
        Volteado();
    }

    public static int PreguntaAltura(){
        Scanner scane = new Scanner(System.in);
        System.out.println("Introduzca la altura: ");
        int alt =Integer.parseInt(scane.next());
        scane.close();
        return alt;
    }

    public static void JIzquierda(){
        for(int i = 1; i <= altura; i++){
            for(int n = i; n <= (2 * (i - 1)) + 1; n++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void JDerecha(){
        for(int i = 1; i <= altura; i++){
            for(int m = 1; m <= altura - i; m++){
                System.out.print(" ");
            }
            for(int n = i; n <= (2 * (i - 1)) + 1; n++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void Centrado(){
        for(int i = 1; i <= altura; i++){
            for(int m = 1; m <= altura - i; m++){
                System.out.print(" ");
            }
            for(int n = 1; n <= (2 * i - 1); n++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void Volteado(){
        for(int i = 1; i <= altura; i++){
            for(int m = 0; m < (i - 1); m++){
                System.out.print(" ");
            }
            for(int n = 1; n <= altura * 2 - (i * 2) + 1; n++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}