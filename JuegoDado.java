
/**
 * Write a description of class JuegoDado here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class JuegoDado
{
    private Dado dado1, dado2, dado3;
    private DadoGrafico dadoGrafico1, dadoGrafico2, dadoGrafico3;
    private int xPosition = 100;
    private int yPosition = 100;
    
    public JuegoDado(){
        dado1 = new Dado();
        dadoGrafico1 = new DadoGrafico();
        dadoGrafico1.moveTo(xPosition, yPosition);
        
        dado2 = new Dado();
        dadoGrafico2 = new DadoGrafico();
        dadoGrafico2.moveTo(xPosition+dadoGrafico1.getDadoSize()+10, yPosition);
        
        dado3 = new Dado();
        dadoGrafico3 = new DadoGrafico();
        dadoGrafico3.moveTo(xPosition+((dadoGrafico1.getDadoSize()+10)*2), yPosition);
    }
    
    public void jugar(){
        lanzar3Dados();
        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);
        ganador();
    }
    
    public void lanzar3Dados(){
        dadoGrafico1.mostrarCara(dado1.lanzar());
        dadoGrafico2.mostrarCara(dado2.lanzar());
        dadoGrafico3.mostrarCara(dado3.lanzar());
    }
    
    public boolean son3Iguales(){
        if(dado1.getCaraActual() == dado2.getCaraActual() && dado2.getCaraActual() == dado3.getCaraActual()){
            System.out.println("Los 3 dados son iguales");
            return true;
    
        }
        System.out.println("Los 3 dados NO son iguales");
        return false;
    }
    
    public int suma3Dados(){
        int total = dado1.getCaraActual() + dado2.getCaraActual() + dado3.getCaraActual();
        System.out.println("La suma de los 3 es: " + total);
        return total;
    }
    
    public boolean ganador(){
        if(suma3Dados() > 14 || son3Iguales()){
            System.out.println("GANASTE");
            return true;
        }else{
            System.out.println("PERDISTE");
            return false;
        }
    }
    
}
