/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Quiterie et Clara
 */
public class FondsInexistantException extends Exception {
    
    public FondsInexistantException()
    {
        System.out.println("La clé de ce fond recherché n'existe pas dans le portefeuille ! ");
    }
}
