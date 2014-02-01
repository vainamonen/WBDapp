
// Generated 2014-02-01 15:20:17 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Status generated by hbm2java
 */
public class Status  implements java.io.Serializable {


     private long stan;
     private String opis;
     private Set zlecenies = new HashSet(0);

    public Status() {
    }

	
    public Status(byte stan, String opis) {
        this.stan = stan;
        this.opis = opis;
    }
    public Status(byte stan, String opis, Set zlecenies) {
       this.stan = stan;
       this.opis = opis;
       this.zlecenies = zlecenies;
    }
   
    public long getStan() {
        return this.stan;
    }
    
    public void setStan(byte stan) {
        this.stan = stan;
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


