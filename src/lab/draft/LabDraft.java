/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.draft;




/**
 *
 * @author Santi Mercado
 */
public class LabDraft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        game j = new game();
        j.setBounds(0, 0, 1200, 1000);
        j.setVisible(true);
        j.setResizable(false);
        j.setTitle("Space Invaders");
        j.setFocusable(true);
    }
    
}
