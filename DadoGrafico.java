
/**
 * Write a description of class Puntos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DadoGrafico
{
    private Circle punto1, punto2, punto3, punto4, punto5, punto6, punto7;
    private Square base;
    private int xposition = 100;
    private int yposition = 100;
    private int margin;

    
    public DadoGrafico(){
        base = new Square();
        base.changeSize(60);
        base.changeColor("blue");
        
        punto1 = new Circle();
        punto1.changeSize(20);
        punto1.changeColor("white");
        punto2 = new Circle();
        punto2.changeSize(20);
        punto2.changeColor("white");
        
        punto3 = new Circle();
        punto3.changeSize(20);
        punto3.changeColor("white");
        
        punto4 = new Circle();
        punto4.changeSize(20);
        punto4.changeColor("white");
        
        punto5 = new Circle();
        punto5.changeSize(20);
        punto5.changeColor("white");
        
        punto6 = new Circle();
        punto6.changeSize(20);
        punto6.changeColor("white");
        
        punto7 = new Circle();
        punto7.changeSize(20);
        punto7.changeColor("white");
        acomodar();
        
    }

    
    public void acomodar(){
        int size = punto1.getSize();
        base.moveTo(xposition, yposition);
        punto1.moveTo(xposition, yposition);
        punto2.moveTo(xposition+(size*2), yposition);
        punto3.moveTo(xposition, yposition + size);
        punto4.moveTo(xposition+size, yposition + size);
        punto5.moveTo(xposition+(size*2), yposition + size);
        punto6.moveTo(xposition, yposition+(size*2));
        punto7.moveTo(xposition+(size*2), yposition+(size*2));
        
    }
    
    public void mostrarCara(int valor){
        base.makeVisible();
        switch(valor){
            case 1:
                makeInvisible();
                punto4.makeVisible();
                break;
                
            case 2:
                makeInvisible();
                punto1.makeVisible();
                punto7.makeVisible();
                break;
                
            case 3:
                makeInvisible();
                punto1.makeVisible();
                punto4.makeVisible();
                punto7.makeVisible();
                break;
            case 4:
                makeInvisible();
                punto1.makeVisible();
                punto2.makeVisible();
                punto6.makeVisible();
                punto7.makeVisible();
                break;
                
            case 5:
                makeInvisible();
                punto1.makeVisible();
                punto2.makeVisible();
                punto4.makeVisible();
                punto6.makeVisible();
                punto7.makeVisible();
                break;
                
            case 6:
                makeInvisible();
                punto1.makeVisible();
                punto2.makeVisible();
                punto3.makeVisible();
                punto5.makeVisible();
                punto6.makeVisible();
                punto7.makeVisible();
                break;
                
        }
    }
    
    public void moveTo(int xposition, int yposition){
        this.xposition = xposition;
        this.yposition = yposition;
        acomodar();
    }
    
    public void makeVisible(){
        punto1.makeVisible();
        punto2.makeVisible();
        punto3.makeVisible();
        punto4.makeVisible();
        punto5.makeVisible();
        punto6.makeVisible();
        punto7.makeVisible();
    }
    
    public void makeInvisible(){
        punto1.makeInvisible();
        punto2.makeInvisible();
        punto3.makeInvisible();
        punto4.makeInvisible();
        punto5.makeInvisible();
        punto6.makeInvisible();
        punto7.makeInvisible();
    }
    
    public void setMargine(int margin){
        this.margin = margin;
    }
    
    public int getDadoSize(){
        return base.getSize();
    }
    
}