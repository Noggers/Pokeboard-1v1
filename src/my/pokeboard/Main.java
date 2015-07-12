/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.pokeboard;

import java.util.Arrays;
import my.pokeboard.Views.PokeboardUI;

/**
 *
 * @author Michael
 */
public class Main
{    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        SetApplicationStyle();
        java.awt.EventQueue.invokeLater(() -> new PokeboardUI().setVisible(true));
    }
    
    private static void SetApplicationStyle()
    {
        // We search for the Nimbus look and feel
        // If it's not available, we just use the default
        try
        {
            javax.swing.UIManager.LookAndFeelInfo[] infos =  javax.swing.UIManager.getInstalledLookAndFeels();
            for (javax.swing.UIManager.LookAndFeelInfo info : infos)
            {
                if (info.getName().equals("Nimbus"))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PokeboardUI.class.getName()).log(java.util.logging.Level.INFO, null, ex);
        }
    }
}
