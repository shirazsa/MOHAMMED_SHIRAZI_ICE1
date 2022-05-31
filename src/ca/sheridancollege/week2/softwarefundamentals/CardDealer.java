/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Modifier : Mohammed Sajjad Shirazi
 * Student Number : 991479455
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        Card tenClubs = new Card("Clbs", 10);
        tenClubs.setSuit("diamonds");
    }
}
