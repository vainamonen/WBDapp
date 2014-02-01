
// Generated 2014-02-01 15:20:17 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * Wydatek generated by hbm2java
 */
public class Wydatek  implements java.io.Serializable {


     private long idWydatku;
     private Oddzial oddzial;
     private BigDecimal kwota;
     private Date dataWydarzenia;
     private String opis;

    public Wydatek() {
    }

    public Wydatek(long idWydatku, Oddzial oddzial, BigDecimal kwota, Date dataWydarzenia, String opis) {
       this.idWydatku = idWydatku;
       this.oddzial = oddzial;
       this.kwota = kwota;
       this.dataWydarzenia = dataWydarzenia;
       this.opis = opis;
    }
   
    public long getIdWydatku() {
        return this.idWydatku;
    }
    
    public void setIdWydatku(long idWydatku) {
        this.idWydatku = idWydatku;
    }
    public Oddzial getOddzial() {
        return this.oddzial;
    }
    
    public void setOddzial(Oddzial oddzial) {
        this.oddzial = oddzial;
    }
    public BigDecimal getKwota() {
        return this.kwota;
    }
    
    public void setKwota(BigDecimal kwota) {
        this.kwota = kwota;
    }
    public Date getDataWydarzenia() {
        return this.dataWydarzenia;
    }
    
    public void setDataWydarzenia(Date dataWydarzenia) {
        this.dataWydarzenia = dataWydarzenia;
    }
    public String getOpis() {
        return this.opis;
    }
    
    public void setOpis(String opis) {
        this.opis = opis;
    }




}

