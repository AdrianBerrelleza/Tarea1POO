import java.util.Random;

/**
 * Write a description of class Dado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dado
{
    private int caras;
    private String colorDado;
    private String colorPuntos;
    private int caraActual;

    public Dado(){
        caras = 6;
    }
    public Dado(int cantidadDeCaras){
        caras = cantidadDeCaras;
    }
    public int getCaras(){
        return caras;
    }
    public int getCaraActual(){
        return caraActual;
    }

    public int lanzar(){
        Random rnd = new Random();
        caraActual = rnd.nextInt(6)+1;
        return caraActual;
    }
    
    public String toString(){
        return "Caro Actual: " + caraActual;
    }

}
