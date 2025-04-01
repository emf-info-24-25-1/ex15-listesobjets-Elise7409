package services;

import models.Personne;

public class ListePersonne_Dynamique {

    private Personne[] personnes;

    public ListePersonne_Dynamique() {
        Personne[] personnes = new Personne[0];
    }

    public int getNombre() {
        return this.personnes.length;
    }

    public void vider() {
        this.personnes = new Personne[0];
    }

    public boolean ajouter(Personne p) {
        boolean aReussi = false;
        if (p == null) {
            aReussi = false;

        } else {
            Personne[] nouvelleListe = new Personne[this.personnes.length + 1];
            for (int i = 0; i < this.personnes.length; i++) {
                nouvelleListe[i] = this.personnes[i];
            }
            nouvelleListe[nouvelleListe.length - 1] = p;
            aReussi = true;
            this.personnes = nouvelleListe;
        }

        return aReussi;
    }

    public boolean supprimer(Personne p) {
        boolean aReussi = false;
        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] == p) {

                Personne[] nouvelleListe = new Personne[this.personnes.length - 1];

                for (int j = 0; i < nouvelleListe.length; i++) {
                    if (this.personnes[j] == p) {
                        personnes[j] = null;
                        aReussi = true;
                        i--;

                    } else {
                        personnes[j] = nouvelleListe[j];
                    }
                }
                this.personnes = nouvelleListe;

            }
        }
        return aReussi;
    }

    public void afficher() {
        for (int i = 0; i < personnes.length; i++) {
            System.out.println(personnes[i]);
        }
    }
}
