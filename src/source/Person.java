package source;

public class Person {
	
  // private vars
    private String name;
    private String adresse;
    private String telefon;
    private String email;
    
  // constructor method
    public Person(String name, String adresse, String telefon, String email) {
        this.name = name;
        this.adresse = adresse;
        this.telefon = telefon;
        this.email = email;
    }
    
  // getter method
    public String getName() {return name;}
    public String getAdresse() {return adresse;}
    public String getTelefon() {return telefon;}
    public String getEmail() {return email;}
    
  // setter method
    public void setName(String name) {this.name = name;}
    public void setAdresse(String adresse) {this.adresse = adresse;}
    public void setTelefon(String telefon) {this.telefon = telefon;}
    public void setEmail(String email) {this.email = email;}
    
  // getter method for whole string information
    public String getInfo() {return name + " - " + adresse + " ( " + telefon + " ) [ " + email + " ]";}
    
}