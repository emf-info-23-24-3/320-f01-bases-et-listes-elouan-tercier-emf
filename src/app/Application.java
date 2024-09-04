package app;

import java.lang.reflect.Array;
import java.util.ArrayList;

import models.Personne;

public class Application {

    public static void main(String[] args) {

        ArrayList<Personne> list = new ArrayList<Personne>();

        list.add(new Personne("Elouan", "Tercier", "Rte Estevenens 94", 1687));
        list.add(new Personne("jack", "moullet", "Rte ens 94", 1677));
        list.add(new Personne("kilian", "meyaer", "afdsds 94", 2687));

        for (Personne personne : list) {
            System.out.println(personne.getNom());
        }
    }

}
