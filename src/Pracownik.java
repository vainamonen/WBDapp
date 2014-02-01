
// Generated 2014-02-01 15:20:17 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pracownik generated by hbm2java
 */
public class Pracownik  implements java.io.Serializable {


     private long idPracownika;
     private Adres adres;
     private Oddzial oddzial;
     private String pesel;
     private String imie;
     private String imie2;
     private String nazwisko;
     private Date dataUrodzenia;
     private String stanowisko;
     private String telefon;
     private String status;
     private BigDecimal pensja;
     private Set zlecenies = new HashSet(0);

    public Pracownik() {
    }

	
    public Pracownik(long idPracownika, Adres adres, Oddzial oddzial, String pesel, String imie, String nazwisko, Date dataUrodzenia, String stanowisko, String telefon, String status, BigDecimal pensja) {
        this.idPracownika = idPracownika;
        this.adres = adres;
        this.oddzial = oddzial;
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.stanowisko = stanowisko;
        this.telefon = telefon;
        this.status = status;
        this.pensja = pensja;
    }
    public Pracownik(long idPracownika, Adres adres, Oddzial oddzial, String pesel, String imie, String imie2, String nazwisko, Date dataUrodzenia, String stanowisko, String telefon, String status, BigDecimal pensja, Set zlecenies) {
       this.idPracownika = idPracownika;
       this.adres = adres;
       this.oddzial = oddzial;
       this.pesel = pesel;
       this.imie = imie;
       this.imie2 = imie2;
       this.nazwisko = nazwisko;
       this.dataUrodzenia = dataUrodzenia;
       this.stanowisko = stanowisko;
       this.telefon = telefon;
       this.status = status;
       this.pensja = pensja;
       this.zlecenies = zlecenies;
    }
   
    public long getIdPracownika() {
        return this.idPracownika;
    }
    
    public void setIdPracownika(long idPracownika) {
        this.idPracownika = idPracownika;
    }
    public Adres getAdres() {
        return this.adres;
    }
    
    public void setAdres(Adres adres) {
        this.adres = adres;
    }
    public Oddzial getOddzial() {
        return this.oddzial;
    }
    
    public void setOddzial(Oddzial oddzial) {
        this.oddzial = oddzial;
    }
    public String getPesel() {
        return this.pesel;
    }
    
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    public String getImie() {
        return this.imie;
    }
    
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getImie2() {
        return this.imie2;
    }
    
    public void setImie2(String imie2) {
        this.imie2 = imie2;
    }
    public String getNazwisko() {
        return this.nazwisko;
    }
    
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public Date getDataUrodzenia() {
        return this.dataUrodzenia;
    }
    
    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
    public String getStanowisko() {
        return this.stanowisko;
    }
    
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
    public String getTelefon() {
        return this.telefon;
    }
    
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public BigDecimal getPensja() {
        return this.pensja;
    }
    
    public void setPensja(BigDecimal pensja) {
        this.pensja = pensja;
    }
    public Set getZlecenies() {
        return this.zlecenies;
    }
    
    public void setZlecenies(Set zlecenies) {
        this.zlecenies = zlecenies;
    }




}


