
// Generated 2014-02-01 15:20:17 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Kontrahent generated by hbm2java
 */
public class Kontrahent  implements java.io.Serializable {


     private long idKontrahenta;
     private Adres adres;
     private long nip;
     private long regon;
     private String nazwa;
     private String telefon;
     private String EMail;
     private String opis;
     private Set zlecenies = new HashSet(0);

    public Kontrahent() {
    }

	
    public Kontrahent(long idKontrahenta, Adres adres, long nip, long regon, String nazwa, String telefon, String EMail) {
        this.idKontrahenta = idKontrahenta;
        this.adres = adres;
        this.nip = nip;
        this.regon = regon;
        this.nazwa = nazwa;
        this.telefon = telefon;
        this.EMail = EMail;
    }
    public Kontrahent(long idKontrahenta, Adres adres, long nip, long regon, String nazwa, String telefon, String EMail, String opis, Set zlecenies) {
       this.idKontrahenta = idKontrahenta;
       this.adres = adres;
       this.nip = nip;
       this.regon = regon;
       this.nazwa = nazwa;
       this.telefon = telefon;
       this.EMail = EMail;
       this.opis = opis;
       this.zlecenies = zlecenies;
    }
   
    public long getIdKontrahenta() {
        return this.idKontrahenta;
    }
    
    public void setIdKontrahenta(long idKontrahenta) {
        this.idKontrahenta = idKontrahenta;
    }
    public Adres getAdres() {
        return this.adres;
    }
    
    public void setAdres(Adres adres) {
        this.adres = adres;
    }
    public long getNip() {
        return this.nip;
    }
    
    public void setNip(long nip) {
        this.nip = nip;
    }
    public long getRegon() {
        return this.regon;
    }
    
    public void setRegon(long regon) {
        this.regon = regon;
    }
    public String getNazwa() {
        return this.nazwa;
    }
    
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getTelefon() {
        return this.telefon;
    }
    
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public String getEMail() {
        return this.EMail;
    }
    
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }
    public String getOpis() {
        return this.opis;
    }
    
    public void setOpis(String opis) {
        this.opis = opis;
    }
    public Set getZlecenies() {
        return this.zlecenies;
    }
    
    public void setZlecenies(Set zlecenies) {
        this.zlecenies = zlecenies;
    }




}

