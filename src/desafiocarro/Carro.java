
package desafiocarro;


public class Carro {
    
    //Atributos
    String modelo;
    String cor;
    boolean vidroEletricos;
    int pneus;
    double motor;
    boolean portas;
    boolean combustivel;
    
    //Estado:
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Pneus: " + this.pneus);
        System.out.println("Tem vidros elétricos? " + this.vidroEletricos);
        System.out.println("Potência do motor: " + this.motor);
        
    }
    
    //Metodos:
    void andar(){
        if (this.combustivel == false){
            System.out.println("DESCULPA, sem combustível no carro!");
        }else{
            System.out.println("Combustível cheio!");
        }
        
    }
    void ligado(){
        this.combustivel = true;
        
    }
    void desligado(){
        this.combustivel = false;
        
    }
    
    
}
