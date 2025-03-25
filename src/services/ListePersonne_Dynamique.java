package services;

import models.Personne;

public class ListePersonne_Dynamique {

    private Personne[] personnes;

    public ListePersonne_Dynamique() {
        this.personnes = new Personne[0];
    }

    public int getNombre() {
        return this.personnes.length;
    }

    public void vider() {
        this.personnes = new Personne[0];
    }

    public boolean ajouter(Personne p) {
        boolean existe = false;
        Personne[] nouvelleListe = new Personne[this.personnes.length + 1];
        for (int i = 0; i < this.personnes.length; i++) {
            nouvelleListe[i] = this.personnes[i];
        }
        nouvelleListe[nouvelleListe.length - 1] = p;
        existe = true;
        this.personnes = nouvelleListe;
        return existe;
    }

    public boolean supprimer(Personne p) {
        boolean existe = false;
        Personne[] nouvelleListe = new Personne[this.personnes.length -1];
        
        for (int i = 0; i < this.personnes.length; i++) {
            if (this.personnes[i] == p) {
                personne[i] = null;
                existe = true;
            } else {
                nouvelleListe[i] = this.personnes[i];
            }   
            nouvelleListe[i] = this.personnes[i];
            existe = true;
        }
        
        this.personnes = nouvelleListe;
        return existe;
    }

    public void afficher() {
        for (int i = 0; i < personnes.length; i++) {
            System.out.println(personnes[i]);
        }
    }
}



