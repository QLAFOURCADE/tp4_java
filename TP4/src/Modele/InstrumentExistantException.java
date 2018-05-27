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
public class InstrumentExistantException extends Exception {
    
    public InstrumentExistantException()
    {
        System.out.println("La clé de cet instrument recherché existe déjà dans le portefeuille");
    }
    
}
