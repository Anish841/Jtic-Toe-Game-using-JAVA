/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tick.tak.toe;

import javax.swing.UIManager;
/**
 *
 * @author Anish Ratnawat
 */
public class TickTakToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
            String cn = UIManager.getSystemLookAndFeelClassName();
            UIManager.setLookAndFeel(cn); // Use the native L&F
        } catch (Exception cnf) {
        }
         ticktoe t=new ticktoe();
         t.setVisible(true);
    }
}
