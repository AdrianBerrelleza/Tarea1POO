import java.util.Random;

/**
 * Write a description of class AplicacionInformaiconDeCirculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AplicacionInformaiconDeCirculo
{
    // Atributos
    String[] colores = {"blue", "green", "red", "magenta", "black", "azulCielo"};

    
    // 3 instancias de clase de Circulo
    private Circulo circulo1;
    private Circulo circulo2;
    private Circulo circulo3;
    
    // Constructor 1
    // Crear 3 circulos con valores random
    public AplicacionInformaiconDeCirculo(){
        Random rmd = new Random();
        
        circulo1 = new Circulo(rmd.nextDouble(40), colores[rmd.nextInt(6)], rmd.nextInt(600), rmd.nextInt(600));
        circulo2 = new Circulo(rmd.nextDouble(40), colores[rmd.nextInt(6)], rmd.nextInt(600), rmd.nextInt(600));
        circulo3 = new Circulo(rmd.nextDouble(40), colores[rmd.nextInt(6)], rmd.nextInt(600), rmd.nextInt(600));
    }
    
    // Constructo 2 - Recibe int n
    // Crear circulos y asignar sus atributo
    
    // Metodos
    
    // boolean Recibe - Circulo:
    // Verificar posicion del circulo y si esta dentro del canva
    
    // Recibe - void:
    // Obtener los atributos de cada circulo
    public void mostrarInformacion(){
        System.out.println("Circulo 1:\n" + circulo1);
        System.out.println("Circulo 2:\n" + circulo2);
        System.out.println("Circulo 3:\n" + circulo3);
    }
    
    public Circulo obtenerCirculoMayor(){
        Circulo mayor = null;
        if(circulo1.getRadio() >= circulo2.getRadio()){
           if(circulo1.getRadio() >= circulo3.getRadio()){
               mayor = circulo1;
            } else{
                mayor = circulo3;
            }
            
        }else{
            if(circulo2.getRadio() >= circulo3.getRadio()){
                mayor = circulo2;
            }else{
                mayor = circulo3;
            }
            
        }
        return mayor;
    }
    
    public void dibujarCirculos(){
        circulo1.dibujar();
        circulo2.dibujar();
        circulo3.dibujar();
        
    }
    
    // Recibe:
    // Calcula el area de todos los circulos
    
    // Recibe:
    // Comparar el area de todos los circulos para guardar el mas grande 
    // el mas grande y retornar el mas grande
    
    // Recibe:
    // Recibe el ciruculo mas grande y le dibuja un circulo rojo en el centro
}
