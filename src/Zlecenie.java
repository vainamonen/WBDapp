
// Generated 2014-02-01 15:20:17 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * Zlecenie generated by hbm2java
 */
public class Zlecenie  implements java.io.Serializable {


     private BigDecimal idZlecenia;////////////////
     private Pojazd pojazd;
     private Adres adresByIdMety;
     private Adres adresByIdStartu;
     private Ladunek ladunek;
     private Pracownik pracownik;
     private Status status;
     private Kontrahent kontrahent;
     private BigDecimal wartosc;///////////////////
     private BigDecimal odleglosc;///////////////////
     private Date dataPrzyjZlec;
     private Date dataZakZlec;

    public Zlecenie() {
    }

	
    public Zlecenie(BigDecimal idZlecenia, Pojazd pojazd, Adres adresByIdMety, Adres adresByIdStartu, Ladunek ladunek, Pracownik pracownik, Status status, Kontrahent kontrahent, BigDecimal wartosc, BigDecimal odleglosc, Date dataPrzyjZlec) {
        this.idZlecenia = idZlecenia;
        this.pojazd = pojazd;
        this.adresByIdMety = adresByIdMety;
        this.adresByIdStartu = adresByIdStartu;
        this.ladunek = ladunek;
        this.pracownik = pracownik;
        this.status = status;
        this.kontrahent = kontrahent;
        this.wartosc = wartosc;
        this.odleglosc = odleglosc;
        this.dataPrzyjZlec = dataPrzyjZlec;
    }
    public Zlecenie(BigDecimal idZlecenia, Pojazd pojazd, Adres adresByIdMety, Adres adresByIdStartu, Ladunek ladunek, Pracownik pracownik, Status status, Kontrahent kontrahent, BigDecimal wartosc, BigDecimal odleglosc, Date dataPrzyjZlec, Date dataZakZlec) {
       this.idZlecenia = idZlecenia;
       this.pojazd = pojazd;
       this.adresByIdMety = adresByIdMety;
       this.adresByIdStartu = adresByIdStartu;
       this.ladunek = ladunek;
       this.pracownik = pracownik;
       this.status = status;
       this.kontrahent = kontrahent;
       this.wartosc = wartosc;
       this.odleglosc = odleglosc;
       this.dataPrzyjZlec = dataPrzyjZlec;
       this.dataZakZlec = dataZakZlec;
    }
   
    public BigDecimal getIdZlecenia() {
        return this.idZlecenia;
    }
    
    public void setIdZlecenia(BigDecimal idZlecenia) {
        this.idZlecenia = idZlecenia;
    }
    public Pojazd getPojazd() {
        return this.pojazd;
    }
    
    public void setPojazd(Pojazd pojazd) {
        this.pojazd = pojazd;
    }
    public Adres getAdresByIdMety() {
        return this.adresByIdMety;
    }
    
    public void setAdresByIdMety(Adres adresByIdMety) {
        this.adresByIdMety = adresByIdMety;
    }
    public Adres getAdresByIdStartu() {
        return this.adresByIdStartu;
    }
    
    public void setAdresByIdStartu(Adres adresByIdStartu) {
        this.adresByIdStartu = adresByIdStartu;
    }
    public Ladunek getLadunek() {
        return this.ladunek;
    }
    
    public void setLadunek(Ladunek ladunek) {
        this.ladunek = ladunek;
    }
    public Pracownik getPracownik() {
        return this.pracownik;
    }
    
    public void setPracownik(Pracownik pracownik) {
        this.pracownik = pracownik;
    }
    public Status getStatus() {
        return this.status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    public Kontrahent getKontrahent() {
        return this.kontrahent;
    }
    
    public void setKontrahent(Kontrahent kontrahent) {
        this.kontrahent = kontrahent;
    }
    public BigDecimal getWartosc() {
        return this.wartosc;
    }
    
    public void setWartosc(BigDecimal wartosc) {
        this.wartosc = wartosc;
    }
    public BigDecimal getOdleglosc() {
        return this.odleglosc;
    }
    
    public void setOdleglosc(BigDecimal odleglosc) {
        this.odleglosc = odleglosc;
    }
    public Date getDataPrzyjZlec() {
        return this.dataPrzyjZlec;
    }
    
    public void setDataPrzyjZlec(Date dataPrzyjZlec) {
        this.dataPrzyjZlec = dataPrzyjZlec;
    }
    public Date getDataZakZlec() {
        return this.dataZakZlec;
    }
    
    public void setDataZakZlec(Date dataZakZlec) {
        this.dataZakZlec = dataZakZlec;
    }

    public static Vector getKolumny()
    {
        Vector<String> result = new Vector<>();
        result.add("ID");
        result.add("Pojazd");
        result.add("Adres docelowy");
        result.add("Adres startowy");
        result.add("Ładunek");
        result.add("Pracownik");
        result.add("Status");
        result.add("Kontrahent");
        result.add("Wartość");
        result.add("Odległość");
        result.add("Data przyjęcia");
        result.add("Data zakończenia");
        
        return  result;
        /*private BigDecimal idZlecenia;
     private Pojazd pojazd;
     private Adres adresByIdMety;
     private Adres adresByIdStartu;
     private Ladunek ladunek;
     private Pracownik pracownik;
     private Status status;
     private Kontrahent kontrahent;
     private BigDecimal wartosc;
     private BigDecimal odleglosc;
     private Date dataPrzyjZlec;
     private Date dataZakZlec;*/
    }

     @Override
    public String toString()
    {
        /*return pojazd + " " + adresByIdMety + " " + adresByIdStartu + " " + ladunek + " " + pracownik + " " + status + 
                " " + kontrahent + " " + wartosc + " " + odleglosc + " " + dataPrzyjZlec + " " + dataZakZlec;*/
        return idZlecenia.toString();
    }

    public static boolean verify(String wartosc, String odleglosc)
    {
        
        try 
        {
            if (wartosc.length() > 15 || wartosc.isEmpty()) throw  new  Exception();
            if ((new BigDecimal(wartosc)) == null) throw new Exception();
            if(new BigDecimal(wartosc).compareTo(BigDecimal.ZERO)==-1) throw new Exception();
        }
        catch (Exception e)
        { 
            JOptionPane.showMessageDialog
                (null, "Błąd - wprowadź poprawną wartość (pole nie puste, max licza 14 znakowa)\nWartość nie może być ujemna."
                    , "Błąd danych!", 3);
            return false; 
        }
        
        try 
        {
            if (odleglosc.length() > 14 || odleglosc.isEmpty()) throw  new  Exception();
            if ((new BigDecimal(odleglosc)) == null) throw new Exception();
            if(new BigDecimal(odleglosc).compareTo(BigDecimal.ZERO)==-1) throw new Exception();
        }
        catch (Exception e) 
        { 
            JOptionPane.showMessageDialog
                (null, "Błąd - wprowadź poprawną odległość (pole nie puste, max licza 7 znakowa)\nOdległość nie może być ujemna."
                    , "Błąd danych!", 3);
            return false; 
        }
        
        return true;
    }
}


