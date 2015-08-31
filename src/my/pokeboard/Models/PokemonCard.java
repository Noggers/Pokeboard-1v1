/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.pokeboard.Models;

/**
 *
 * @author Michael
 * A class for defining the essential components for a creature card.
 */
public class PokemonCard extends CardBase
{
    public PokemonCard(String setName, String title)
    {
    	super(title);
    	this.setName = setName;
    }
    
    private final String setName;
    public String getSetName()
    {
    	return setName;
    }
}
