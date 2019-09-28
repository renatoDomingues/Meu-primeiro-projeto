
package desafiocarro;


public class DesafioCarro {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instancia por atributos:
        Carro c1 = new Carro();
        c1.modelo = " Ford ";
        c1.cor = "cinza";
        c1.pneus = 15;
        c1.motor = 1.0;
        c1.vidroEletricos = true;
        c1.combustivel = true;
        
        Carro c2 = new Carro();
        c2.modelo = " GM ";
        c2.cor = " Preto";
        c2.pneus = 14;
        c2.vidroEletricos = false;
        c2.motor = 1.5;
        c2.combustivel = false;
        
        //Chamada por metodo:
        c1.status();
        c1.andar();
        
        c2.status();
        c2.andar();
        
        
    }
    
}
