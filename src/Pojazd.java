
// Generated 2014-02-01 15:20:17 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * Pojazd generated by hbm2java
 */
public class Pojazd  implements java.io.Serializable {


     private long idPojazdu;
     private Model model;
     private String numerRejestracyjny;
     private Date dataPrzegladu;
     private Date dataProdukcji;
     private Set zlecenies = new HashSet(0);

    public Pojazd() {
    }

	
    public Pojazd(long idPojazdu, Model model, String numerRejestracyjny, Date dataPrzegladu, Date dataProdukcji) {
        this.idPojazdu = idPojazdu;
        this.model = model;
        this.numerRejestracyjny = numerRejestracyjny;
        this.dataPrzegladu = dataPrzegladu;
        this.dataProdukcji = dataProdukcji;
    }
    public Pojazd(long idPojazdu, Model model, String numerRejestracyjny, Date dataPrzegladu, Date dataProdukcji, Set zlecenies) {
       this.idPojazdu = idPojazdu;
       this.model = model;
       this.numerRejestracyjny = numerRejestracyjny;
       this.dataPrzegladu = dataPrzegladu;
       this.dataProdukcji = dataProdukcji;
       this.zlecenies = zlecenies;
    }
   
    public long getIdPojazdu() {
        return this.idPojazdu;
    }
    
    public void setIdPojazdu(long idPojazdu) {
        this.idPojazdu = idPojazdu;
    }
    public Model getModel() {
        return this.model;
    }
    
    public void setModel(Model model) {
        this.model = model;
    }
    public String getNumerRejestracyjny() {
        return this.numerRejestracyjny;
    }
    
    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }
    public Date getDataPrzegladu() {
        return this.dataPrzegladu;
    }
    
    public void setDataPrzegladu(Date dataPrzegladu) {
        this.dataPrzegladu = dataPrzegladu;
    }
    public Date getDataProdukcji() {
        return this.dataProdukcji;
    }
    
    public void setDataProdukcji(Date dataProdukcji) {
        this.dataProdukcji = dataProdukcji;
    }
    public Set getZlecenies() {
        return this.zlecenies;
    }
    
    public void setZlecenies(Set zlecenies) {
        this.zlecenies = zlecenies;
    }


    public static Vector getKolumny()
    {
        Vector<String> result = new Vector<>();
        result.add("ID");
        result.add("Model");
        result.add("Rejestracja");
        result.add("Data przeglądu");
        result.add("Data produkcji");
        
        return  result;
        /*private long idPojazdu;
     private Model model;
     private String numerRejestracyjny;
     private Date dataPrzegladu;
     private Date dataProdukcji;*/
    }

     @Override
    public String toString()
    {
        return model + " " + numerRejestracyjny + " " + dataPrzegladu + " " + dataProdukcji;
    }
    
    public boolean verify(String numerRejestracyjny)
    {
        try 
        {
            if (numerRejestracyjny.length() > 10) throw  new  Exception();
        }
        catch (Exception e) 
        { 
            JOptionPane.showMessageDialog
                (null, "Błąd - wprowadź poprawny numer rejestracyjny (pole nie puste, max 10 znaków)"
                    , "Błąd danych!", 3);
            return false; 
        }
        
    return true;
    }
}


