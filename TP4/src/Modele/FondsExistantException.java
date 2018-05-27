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
public class FondsExistantException extends Exception{

    public FondsExistantException() {
         System.out.println("La clé de ce fond recherché existe déjà dans le portefeuille ! Nous ne pouvons pas donc pas ajouter ce fond ");
    }
    
}
