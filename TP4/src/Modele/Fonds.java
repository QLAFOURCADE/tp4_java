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
public class Fonds {
    
    /**
     * Attributs :
     */
    private double amount;
    private String num_fond;
    
    /**
     * CONSTRUCTEUR : par défaut
     */
    public Fonds()
    {
        amount = 0.0f;
        num_fond = "";
    }
    
    /**
     * CONSTRUCTEUR : surchargé
     * @param _amount
     * @param _num_fond 
     */
    public Fonds(double _amount, String _num_fond)
    {
        amount = _amount;
        num_fond = _num_fond;
    }

    /**
     * METHODES : Lire le montant de l'objet
     * @return amount
     */
    public double getAmount() {
        return amount;
    }
    /**
     * METHODES : Lire le numéro associé à l'objet
     * @return numero_fond
     */
    public String getNum_fond() {
        return num_fond;
    }

    /**
     * METHODES : Modifier le montant de l'objet
     * @param amount 
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    /**
     * METHODES ! Modifier le numero associé à l'objet fond
     * @param num_fond 
     */
    public void setNum_fond(String num_fond) {
        this.num_fond = num_fond;
    }
   
    
    
    
}
