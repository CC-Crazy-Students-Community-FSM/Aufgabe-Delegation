package main;
import java.util.*;
import source.*;

public class SchulungsManager<T extends Teilnehmer, K extends Kurs, D extends Dozent> {

    private List<T> teilnehmer;
    private List<K> kurse;
    private List<D> dozenten;

    public SchulungsManager(List<T> teilnehmer, List<K> kurse, List<D> dozenten) {
        this.teilnehmer = teilnehmer;
        this.kurse = kurse;
        this.dozenten = dozenten;
    }

    public String getKursuebersicht() {
        StringBuilder kursstring = new StringBuilder();
        for (K kurs : kurse) {
        	kursstring.append(kurs.getStart() + " - " + kurs.getEnde() + " " + kurs.getRaum() + " " + kurs.getThema() + " " + kurs.getDozent().getName() + "\n");
        }
        return kursstring.toString();
    }

    public List<T> getTeilnehmer(K kurs) {
        List<T> result = new ArrayList<>();
        for (T tn : teilnehmer) {
            if (tn.getKurse().contains(kurs)) {
                result.add(tn);
            }
        }
        return result;
    }

    public Dozent getDozent(K kurs) {
    	return kurs.getDozent();
    }

    public List<String> getPersonenInfo() {
        List<String> result = new ArrayList<>();
        for (T tn : teilnehmer) {
            result.add(tn.getInfo());
        }
        for (D d : dozenten) {
            result.add(d.getInfo());
        }
        return result;
    }
    
}