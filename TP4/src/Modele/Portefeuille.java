/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Quiterie et Clara
 */
public class Portefeuille {
    
    /**
     * Attributs
     */
    private Map<String, Fonds> hfonds;
    private Map<String, Instrument> hinstru;
    
    /**
     * CONCTRUCTEUR : par défaut 
     */
    public Portefeuille()
    {
        hfonds = new HashMap<String, Fonds>();
        hinstru = new HashMap<String, Instrument>();
    }
    
    /**
     * CONSTRUCTEUR : surchargé 
     * @param _hfonds
     * @param _hinstru 
     */
    public Portefeuille(Map<String, Fonds> _hfonds , Map<String, Instrument> _hinstru)
    {
        hfonds = _hfonds;
        hinstru = _hinstru;   
    }
    
    
    public double rechercher_fond (String num)
    {
        double m = 0.0f;
        
        try
        {
            
        }
        catch()
          
       
        return m;
    }
   
    
}
