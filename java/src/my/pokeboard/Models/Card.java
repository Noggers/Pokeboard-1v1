/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.pokeboard.Models;

/**
 *
 * @author Michael
 * A basis for all cards inside the game.
 */
public abstract class Card
{
    protected Card(String title)
    {
    	this.title = title;
    }
    
    private final String title;
    public String getTitle()
    {
    	return title;
    }
}
