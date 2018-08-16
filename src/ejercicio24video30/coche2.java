
package ejercicio24video30;


public class coche2 {
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    
    String color;
    int pesototal;
    boolean asientos;
    
    public coche2(){
        
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }
    
    public String dimelargo(){ //metodo getter
        
        return "EL LARGO DEL COCHE ES " + largo; 
    }
    
    public void establecer_color(){//metodo setter
        
        color = "AZUL";
        
    }
    
    public String dime_color(){
        
        return "EL COLOR DEL AUTOMVIL ES " + color;
    }
}
