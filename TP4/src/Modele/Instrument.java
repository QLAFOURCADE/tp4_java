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
        this.num_inst = "";
        this.instru = new ArrayList();
    }
    

    /**
     * CONSTRUCTEUR : surchargé 
     * @param _instru
     * @param _num_inst 
     */
    public Instrument(ArrayList<Fonds> _instru, String _num_inst)
    {
        this.instru = _instru;
        this.num_inst = _num_inst;
    }
    
    /**
     * METHODES : Lire le tableau de fonds de l'objet instrument
     * @return arraylist_fonds
     */
    public ArrayList<Fonds> getInstru() {
        return instru;
    }
    /**
     * METHODES : Lire l'attribut numéro de l'objet instrument
     * @return 
     */
    public String getNum_inst() {
        return num_inst;
    }

    /**
     * METHODES : Modifier l'arraylist fonds
     * @param instru 
     */
    public void setInstru(ArrayList<Fonds> instru) {
        this.instru = instru;
    }
    /**
     * METHODES : Modifier le numero de l'instrument
     * @param num_inst 
     */
    public void setNum_inst(String num_inst) {
        this.num_inst = num_inst;
    }
    
     /**
     * Methodes : ajouter un fond
     * @param f 
     */
    public void ajouter(Fonds f)
    {
        this.instru.add(f);
    }

    @Override
    public String toString() {
        return "Instrument{" + "instru=" + instru + ", num_inst=" + num_inst + '}';
    }

    
    
    
}
