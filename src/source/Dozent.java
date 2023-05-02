package source;

public class Dozent extends Person {
	
  // private vars
    private String fachgebiet;
    
  // constructor method
    public Dozent(String name, String adresse, String telefon, String email, String fachgebiet) {
        super(name, adresse, telefon, email);
        this.fachgebiet = fachgebiet;
    }
    
  // getter method
    public String getFachgebiet() {return fachgebiet;}
    
  // setter method
    public void setFachgebiet(String fachgebiet) {this.fachgebiet = fachgebiet;}
    
  // getter method for whole string information
    public String getInfo() {return super.getInfo() + " - " + fachgebiet;}
    
}