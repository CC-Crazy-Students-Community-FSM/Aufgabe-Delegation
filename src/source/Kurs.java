package source;
import java.util.*;

public class Kurs {
	
  // private vars
    private Date start;
    private Date ende;
    private String raum;
    private String thema;
    private Dozent dozent;
    private List<Teilnehmer> teilnehmer;
    
  // constructor method
    public Kurs(Date start, Date ende, String raum, String thema, Dozent dozent) {
        this.start = start;
        this.ende = ende;
        this.raum = raum;
        this.thema = thema;
        this.dozent = dozent;
        this.teilnehmer = new ArrayList<>();
    }
    
  // getter method
    public Date getStart() {return start;}
    public Date getEnde() {return ende;}
    public String getRaum() {return raum;}
    public String getThema() {return thema;}
    public Dozent getDozent() {return dozent;}
    public List<Teilnehmer> getTeilnehmerListe() {return teilnehmer;}
    
  // setter method
    public void setStart(Date start) {this.start = start;}
    public void setEnde(Date ende) {this.ende = ende;}
    public void setRaum(String raum) {this.raum = raum;}
    public void setThema(String thema) {this.thema = thema;}
    public void setDozent(Dozent dozent) {this.dozent = dozent;}
    public void setTeilnehmer(List<Teilnehmer> teilnehmer) {this.teilnehmer = teilnehmer;}
    
  // getter method for whole string information
    public void addTeilnehmer(Teilnehmer teilnehmer) {this.teilnehmer.add(teilnehmer);}
}