/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;

/**
 *
 * @author Quiterie et Clara
 */
public class Instrument {
    /**
     * Attributs
     */
    private ArrayList<Fonds> instru;
    private String num_inst;
    
     /**
     * CONSTRUCTEUR : par défaut
     */
    public Instrument()
    {
        num_inst = "";
        instru = new ArrayList();
    }
    

    /**
     * CONSTRUCTEUR : surchargé 
     * @param _instru
     * @param _num_inst 
     */
    public Instrument(ArrayList<Fonds> _instru, String _num_inst)
    {
        instru = new ArrayList();
        instru = _instru;
        num_inst = _num_inst;
    }
    
    /**
     * Methodes : ajouter un fond
     * @param f 
     */
    public void ajouter(Fonds f)
    {
        instru.add(f);
    }
    
    
    
}
