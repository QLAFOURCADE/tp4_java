/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quiterie et Clara
 */
public class Console {
    
    /**
     * Attributs pour les questions 
     */
    private Portefeuille p1;
    private Fonds f_tampon;
    private Instrument i_tampon;
    
    /**
     * CONSTRUCTEUR : de notre console avec un près enregistrement de donnees 
     */
    public Console ()
    {
        /**
         * Appeler la méthode de recherche d’un fonds avec la clé saisie en paramètre
         */
        // ajout dans le portefeuille
            ////// map de fonds 
        Map<String, Fonds> m1 = new HashMap<String, Fonds>();
        Fonds f2 = new Fonds(150.26, "02018");
        Fonds f3 = new Fonds(140.3, "02010");
        Fonds f4 = new Fonds(12.5, "02011");
        m1.put("02018", f2);
        m1.put("02010", f3);
        m1.put("02011", f4);
            ///// map d'intruments
        Map<String, Instrument> m2 = new HashMap<String, Instrument>();
                    //// création 1er instrument
        ArrayList<Fonds> a1 = new ArrayList();
        a1.add(f2);
        a1.add(f3);
        Instrument i1 = new Instrument(a1, "01");
                    /// création 2eme instrument
        ArrayList<Fonds> a2 = new ArrayList();
        a2.add(f4);
        Instrument i2 = new Instrument(a2, "02");
        
        m2.put("01", i1);
        m2.put("02", i2);
        
        // création portefeuille
        this.p1 = new Portefeuille(m1,m2);
    }
    
    /**
     * METHODES : Question 1.5 - application méthode ajout fond dans portefeuille
     */
    public void q1_5 ()
    {
        /**
         * QUESTION 1.5 : Lire au clavier la valeur de clé d’un fonds et son montant
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entré la valeur de clé du fond : ");
        String cle_f = sc.nextLine();
        System.out.println("Veuillez entré le montant du fond : ");
        String clavier = sc.nextLine();
        double montant_f = Double.parseDouble(clavier);
        
        // création d'un fond avec les données
        this.f_tampon = new Fonds(montant_f, cle_f);
        System.out.println(f_tampon.toString());
        
        
        // recherche existance du montant tapé au clavier
        try {
            System.out.println("Cle déjà utilisé , montant associé à cette clé de fond : " + this.p1.rechercher_fond(cle_f));
            
            this.f_tampon.setNum_fond(cle_f+1);
            
        } catch (FondsInexistantException ex) {
            try {
                //  Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                this.p1.ajouter_fonds(cle_f, montant_f);
            } catch (FondsExistantException ex1) {
                //Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } 
        
    }
    
    /**
     * METHODES : Question 1.6 - appplication méthode ajout instrument dans portefeuille
     */
    public void q1_6()
    {
        /**
         * QUESTION 1.6 : Lire au clavier la valeur de clé d’un instrument
         * pour cette question le nouveau fond est f_tampon mis en attribut, instancié question avant
         * (qui n'existe dans aucun instrument encore)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entré la valeur de clé d'un instrument : ");
        String cle_i = sc.nextLine();
        /**
         * recherche de cet cle dans la map portefeuille 
         */
        try {
            ArrayList a = new ArrayList();
            a = this.p1.rechercher_instru(cle_i);
            System.out.println("Cle déjà utilisé, on ajout le nouveau fond à cet intrument");
            this.p1.rechercher_instru(cle_i).add(f_tampon);
            System.out.println("Liste des fonds de cet instrument :" + this.p1.rechercher_instru(cle_i));
            
        } catch (InstrumentInexistantException ex) {
                //  Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                 try {
                /**
                 * l’exception InstrumentInexistant est générée, instancier l’instrument et l’ajouter à la HashMap des instruments.
                 */
                this.p1.ajouter_instru(cle_i, f_tampon);
                }
                catch (InstrumentExistantException e){
                // Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex1);
                }
        }
        
    }
    
    /**
     * METHODES : Question 1.7 - application methode supprimer fond
     */
    public void q1_7()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer la clé du fond à supprimer : ");
        String sup = sc.nextLine();
        this.p1.supprimer_fond(sup);
        this.afficher();
        
        
        System.out.println("Veuillez entrer la clé de l'instrument à supprimer : ");
        sup = sc.nextLine();
        this.p1.supprimer_instrument(sup);
    }
    
    /**
     * METHODES : Afficher le portefeuille pour vérifier les actions réalisées
     */
    public void afficher()
    {
        System.out.println(this.p1.toString());
    }

    
}
