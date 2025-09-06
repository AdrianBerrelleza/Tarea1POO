
/**
 * Esta clase servira para modelar un circulo logico
 * 
 * @author DABL
 * @version 1
 */
public class Circulo
{    
    // El radio representa la caracteristica principal del circulo
    private double radio;
    // El color es el color asignado al circulo
    private String color;
    // Valores de posicion del circulo
    private int xPosition;
    private int yPosition;
    private Circle elDibujo;
    
    // Contructores
    public Circulo(){
        radio = 10;
        color = "Verde";
    }
    public Circulo (double radio, String color){
        this.radio = radio * 2;
        this.color = color;
        
        elDibujo = new Circle();
        elDibujo.changeSize((int)radio*10);
        elDibujo.changeColor(color);
    }
    public Circulo (double radio, String color, int xPosition, int yPosition){
        this.radio = radio;
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        elDibujo = new Circle();
        elDibujo.changeSize((int)radio*10);
        elDibujo.changeColor(color);
    }
    
    // Metodos de Calculo
    public double calcularArea(){
        return radio*radio*Math.PI;
    }
    public double calcularPerimetro(){
        return radio*2*Math.PI;
    }
    
    // Setters
    public void setRadio(float radio){
        this.radio = radio;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setxPosition(int xPosition){
        this.xPosition = xPosition;
    }
    public void setYPostion(int yPosition){
        this.yPosition = yPosition;
    }
    // Getters
    public double getRadio(){
        return radio;
    }
    public String getColor(){
        return color;
    }
    public int getxPosition(){
        return xPosition;
    }
    public int getyPosition(){
        return yPosition;
    }
    
    public String toString(){
        return "Radio: " + radio + "\nColor: " + color;
    }
    
    public void dibujar(){
        elDibujo.makeVisible();
    }
    
}
