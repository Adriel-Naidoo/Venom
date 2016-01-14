/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Adriel Naidoo
 * 11 December 2015
 * Version 1.0
 * 
 * This class represents a Single Playing card Blueprint that contains
 *  standard playing card attributes
 * 
 * Version History
 * Version 1.0- Initial Build
 */

public class PlayingCard 
{
    private SuitEnum TYPE;
    
    //Adriel Naidoo - Represents the pathway to a graphical image if needed !
    private String imagePath="";
    
    private FaceEnum FACE;
    
    public PlayingCard(SuitEnum type, String imagePath, FaceEnum face)
    {
        this.TYPE=type;
        this.imagePath=imagePath;
        this.FACE=face;
    }
    
    //Adriel Naidoo - returns the suit of the card
    public SuitEnum getSuit()
    {
        return this.TYPE;
    }
    
    //Adriel Naidoo - returns the pathway to the graphical presentation of the card
    public String getImagePath()
    {
        return this.imagePath;
    }
    
    //Adriel Naidoo - returns the Face of a card
    public FaceEnum getFace()
    {
        return this.FACE;
    }
}
