/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fps;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class FPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Personagem perso = new Personagem();
        
        perso.setAltura(1.60);
        perso.setResistencia(10.0);
        perso.setVida(100.0);
        perso.setDescricao("AK-47");
        perso.setGold(300.0);
        
        JOptionPane.showMessageDialog(null, perso.resumo());
        
        Armas arma = new Armas();
        JOptionPane.showMessageDialog(null, arma.resumo());
        
        Shield shi = new Shield();
        JOptionPane.showMessageDialog(null, shi.resumo());
    }
    
}