/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.Math;

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
        this.hfonds = new HashMap<String, Fonds>();
        this.hinstru = new HashMap<String, Instrument>();
    }
    
    /**
     * CONSTRUCTEUR : surchargé 
     * @param _hfonds
     * @param _hinstru 
     */
    public Portefeuille(Map<String, Fonds> _hfonds , Map<String, Instrument> _hinstru)
    {
        this.hfonds = _hfonds;
        this.hinstru = _hinstru;   
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
        i = this.hfonds.containsKey(num);
        
        if (i == false)
        {
            // pas trouver dans le portefeuille : Exception
            throw new FondsInexistantException();
        }
        else
        {
            // on a trouvé la clé ; on retourne le montant associé
            f = this.hfonds.get(num);
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
        i = this.hinstru.containsKey(numero);
        
        if (i == false)
        {
            // pas trouver dans le portefeuille : Exception
            throw new InstrumentInexistantException();
        }
        else
        {
            // on a trouvé la clé ; on retourne l'arraylist associé
            ii = this.hinstru.get(numero);
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
        
        j = this.hfonds.containsKey(num);
        if (j== true)
        {
            // clé deja existante
            throw new FondsExistantException();
        }
        else
        {
            // peut ajouter le nouveau fond dans la hashmap
            this.hfonds.put(num, n);
            System.out.println("Ajout du fond dans le portefeuille ! ");
        }
    }
    
    /**
     * METHODES : Ajouter un nouveau instrument dans la map
     * @param num
     * @param f 
     */
    public void ajouter_instru(String num, Fonds f) throws InstrumentExistantException
    {
        boolean b;
        int c;
        
        b = this.hinstru.containsKey(num);
        if(b == true)
        {
            // instrument trouvé dans le portefeuille : existe déjà
            throw new InstrumentExistantException();
                
        }
        else
        {
            // l'instrument n'existe pas on l'ajoute a la map
            ArrayList<Fonds> a = new ArrayList();
            a.add(f);
            Instrument i = new Instrument(a, num);
            this.hinstru.put(num,i);
            System.out.println("Ajout de l'instrument dans le portefeuille ! ");
        }
    }
    
    /**
     * METHODES : Supprimer un fond de la map du portefeuille 
     * @param num 
     */
    public void supprimer_fond(String nume)
    {
        try{
            this.rechercher_fond(nume);
            this.hfonds.remove(nume);
            System.out.println("Ce fond a été supprimer du portefeuille");
            
        }
        catch (FondsInexistantException e)
        {
            System.out.println("Impossible d'effectuer cette demande");        
        }
    }

    @Override
    public String toString() {        
        return "\n######################## PORTEFEUILLE ###########################\n Portefeuille{" + " hfonds= " + hfonds + "\n" + ", hinstru=" + hinstru + '}';

    }
    
    
}
