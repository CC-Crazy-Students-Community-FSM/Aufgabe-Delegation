package source;
import java.util.*;

public class Teilnehmer extends Person {
	
  // private vars
    private List<Kurs> kurse;
    
  // constructor method
    public Teilnehmer(String name, String adresse, String telefon, String email) {
        super(name, adresse, telefon, email);
        this.kurse = new ArrayList<>();
    }
    
  // getter method
    public List<Kurs> getKurse() {return kurse;}
    
  // setter method
    public void addKurs(Kurs kurs) {kurse.add(kurs);}
    
}