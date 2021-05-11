
package pkg2021_1_ads1an_vlb_vetor_dinamico;

import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        VetorDinamico vd1 = new VetorDinamico();
        int capacidade = Integer.parseInt(JOptionPane.showInputDialog("digite a capacidade"));
        VetorDinamico vd2 = new VetorDinamico(capacidade);
        
        vd1.inserir(15);
        vd1.inserir(27);
        vd1.inserir(9);
        
        Random gerador = new Random();
        while(true) {
            int e = 1 + gerador.nextInt(60);
            vd2.inserir(e);
            vd2.exibir();
        }
        
    }
}
