/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;
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
    
    
    /**
     * METHODES : recherche d'un fond dans un portefeuille 
     * @param num
     * @return
     * @throws FondsInexistantException 
     */
    public double rechercher_fond (String num) throws FondsInexistantException
    {
        // initialisation variable 
        double m = 0.0f;
        boolean i = false;
        Fonds f = new Fonds();
        
        // vérifier si la clé en paramètre appartient au portefeuille 
        i = hfonds.containsKey(num);
        
        if (i == false)
        {
            // pas trouver dans le portefeuille : Exception
            throw new FondsInexistantException();
        }
        else
        {
            // on a trouvé la clé ; on retourne le montant associé 
            f = hfonds.get(num);
            m = f.getAmount();
            return m;
        }
    }
   
    /**
     * METHODES : Rechercher un instrument dans la hashmap
     * @param numero
     * @return
     * @throws InstrumentInexistantException 
     */
    public ArrayList<Fonds> rechercher_instru (String numero) throws InstrumentInexistantException
    {
        // initialisation variable 
        ArrayList<Fonds> a = new ArrayList();
        boolean i = false;
        Instrument ii = new Instrument();
        
        // vérifier si la clé en paramètre appartient au portefeuille 
        i = hinstru.containsKey(numero);
        
        if (i == false)
        {
            // pas trouver dans le portefeuille : Exception
            throw new InstrumentInexistantException();
        }
        else
        {
            // on a trouvé la clé ; on retourne l'arraylist associé
            ii = hinstru.get(numero);
            a = ii.getInstru();
            return a;
        }

    }
    
    /**
     * METHODES : Ajouter un fonds à la hashmap
     * @param num
     * @param a
     * @throws FondsInexistantException 
     */
    public void ajouter_fonds(String num, double a) throws FondsExistantException
    {
        boolean j;
        Fonds n = new Fonds(a,num);
        
        j = hfonds.containsKey(num);
        if (j== true)
        {
            // clé deja existante
            throw new FondsExistantException();
        }
        else
        {
            // peut ajouter le nouveau fond dans la hashmap
            hfonds.put(num, n);
        }
    }
}
