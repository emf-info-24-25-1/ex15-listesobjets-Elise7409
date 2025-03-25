package services;

import models.Personne;

public class ListePersonne_Dynamique {

    private Personne[] personnes;

    public ListePersonne_Dynamique() {
<<<<<<< HEAD
        Personne[] personnes = new Personne[0];
=======
        this.personnes = new Personne[0];
>>>>>>> 89d0120391c94843f3185cd1e0c896de6f42d75a
    }

    public int getNombre() {
        return this.personnes.length;
    }

    public void vider() {
        this.personnes = new Personne[0];
    }

    public boolean ajouter(Personne p) {
        boolean aReussi = false;
        Personne[] nouvelleListe = new Personne[this.personnes.length + 1];
        for (int i = 0; i < this.personnes.length; i++) {
            nouvelleListe[i] = this.personnes[i];
        }
        nouvelleListe[nouvelleListe.length - 1] = p;
        aReussi = true;
        this.personnes = nouvelleListe;
        return aReussi;
    }

    public boolean supprimer(Personne p) {
        boolean aReussi = false;
        Personne[] nouvelleListe = new Personne[this.personnes.length -1];
        
        for (int i = 0; i < this.personnes.length; i++) {
            if (this.personnes[i] == p) {
<<<<<<< HEAD
                aReussi = true;
                i--;
            } else{
                personnes[i] = nouvelleListe[i];
            }
=======
                personne[i] = null;
                existe = true;
            } else {
                nouvelleListe[i] = this.personnes[i];
            }   
            nouvelleListe[i] = this.personnes[i];
            existe = true;
>>>>>>> 89d0120391c94843f3185cd1e0c896de6f42d75a
        }
        
        this.personnes = nouvelleListe;
        return aReussi;
    }

    public void afficher() {
        for (int i = 0; i < personnes.length; i++) {
            System.out.println(personnes[i]);
        }
    }
}



