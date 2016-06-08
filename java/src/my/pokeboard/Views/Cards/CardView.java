/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.pokeboard.Views.Cards;

import my.pokeboard.Models.*;

import java.awt.*;

/**
 * A class for define the essential behavior of a card in the UI
 * @author Michael
 */
public class CardView
{
	private static final String IMAGE_EXTENSION = ".png";
	private static final String ZOOM_SUFFIX = "ZOOM";
	private static final String DEFAULT_ZOOM = "/my/pokeboard/images/Back" + IMAGE_EXTENSION;
    private final String iconPath;
    private final Card cardModel;
    
    public CardView(Card cardModel, String iconPath)
    {
        this.cardModel = cardModel;
        this.iconPath = iconPath;
    }
    
    @Override
    public String toString()
    {
        return cardModel.getTitle();
    }
    
    public String getTitle()
    {
        return cardModel.getTitle();
    }
        
    private javax.swing.ImageIcon _Icon;
    public javax.swing.ImageIcon getIcon()
    {
        if(_Icon == null)
        {
            _Icon = new javax.swing.ImageIcon(System.class.getResource(iconPath + IMAGE_EXTENSION));
        }
        return _Icon;
    }
    
    private javax.swing.ImageIcon _ZoomIcon;
    public javax.swing.ImageIcon getZoomIcon()
    {
    	if(_ZoomIcon == null)
    	{
    		String url = iconPath + ZOOM_SUFFIX + IMAGE_EXTENSION;
    		java.net.URL resource = getClass().getResource(url);
            if(resource == null)
            {
                url = iconPath + "Zoom" + IMAGE_EXTENSION;
                resource = getClass().getResource(url);
            }
            if(resource == null)
            {
                url = iconPath + "Zoom" + ".jpg";
                resource = getClass().getResource(url);
            }
            if(resource == null) //If we're still not getting anything, we just default our image
    		{
    			url = DEFAULT_ZOOM;
    			resource = getClass().getResource(url);
    		}
    		_ZoomIcon = new javax.swing.ImageIcon(resource);
    	}
		return _ZoomIcon;
    }
}
