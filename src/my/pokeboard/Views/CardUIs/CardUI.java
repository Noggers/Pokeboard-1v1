/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.pokeboard.Views.CardUIs;
import my.pokeboard.Models.*;
/**
 * A class for define the essential behavior of a card in the UI
 * @author Michael
 */
public class CardUI
{    
    private String iconPath;
    private String title;
    private CardBase cardModel;
    
    public CardUI(CardBase cardModel, String iconPath, String title)
    {
        this.cardModel = cardModel;
        this.iconPath = iconPath;
        this.title = title;
    }
    
    @Override
    public String toString()
    {
        return title;
    }
    
    public String getTitle()
    {
        return title;
    }
        
    private javax.swing.ImageIcon _Icon;
    public javax.swing.ImageIcon getIcon()
    {
        if(_Icon == null)
        {
            _Icon = new javax.swing.ImageIcon(getClass().getResource(iconPath));
        }
        return _Icon;
    }
}
