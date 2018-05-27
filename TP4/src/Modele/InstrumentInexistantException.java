/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Quiterie
 */
public class InstrumentInexistantException extends Exception {
    
    public InstrumentInexistantException ()
    {
        System.out.println("La clé de cet instrument recherché n'existe pas dans le portefeuille ! ");
    }
}
