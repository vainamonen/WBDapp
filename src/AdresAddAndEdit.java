
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehehe
 */
public class AdresAddAndEdit extends javax.swing.JFrame {

    /**
     * Creates new form AdresAddAndEdit
     */
    public AdresAddAndEdit() {
        initComponents();
        Zacznij();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBCzynnosc = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jBCWybierzKod = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBAdresAddEdit = new javax.swing.JButton();
        jBCWybierzAdres = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adres - Dodaj lub Edytuj");
        setResizable(false);

        jCBCzynnosc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dodaj", "Edytuj" }));
        jCBCzynnosc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCzynnoscActionPerformed(evt);
            }
        });

        jLabel1.setText("Wybierz czynność");

        jBCWybierzKod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jBCWybierzKod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCWybierzKodActionPerformed(evt);
            }
        });

        jLabel2.setText("Ulica");

        jLabel3.setText("Nr domu");

        jLabel4.setText("Nr lokalu(może być puste)");

        jLabel5.setText("Wybierz kod pocztowy");

        jBAdresAddEdit.setText("Wstaw nowe/wyedytowane");
        jBAdresAddEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdresAddEditActionPerformed(evt);
            }
        });

        jBCWybierzAdres.setEnabled(false);
        jBCWybierzAdres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCWybierzAdresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBCWybierzKod, 0, 188, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBCzynnosc, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCWybierzAdres, 0, 149, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(jBAdresAddEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCBCzynnosc)
                        .addComponent(jBCWybierzAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jBCWybierzKod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBAdresAddEdit))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCWybierzKodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCWybierzKodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCWybierzKodActionPerformed

    private void jCBCzynnoscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCzynnoscActionPerformed
        if(jCBCzynnosc.getSelectedIndex()==0)//dodaj
        {
            jBCWybierzAdres.setEnabled(false);
            jBCWybierzAdres.removeAllItems();
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
        }
        else if(jCBCzynnosc.getSelectedIndex()==1)//edytuj
        {
            String query = "from Adres";
            {
                try 
                {
                    Session session = HibernateUtil.getSessionFactory().openSession();
                    session.beginTransaction();
                    Query q = session.createQuery(query);
                    List resultList = q.list();
                    //displayResult(resultList);
                    session.getTransaction().commit();
                    //List<KodPocztowy> kody = new ArrayList<>();
                    session.close();
                    jBCWybierzAdres.removeAllItems();
                    jBCWybierzAdres.setEnabled(true);
                    for(Object o : resultList) 
                    {
                        Adres adr = (Adres)o;
                        //kody.add(kod);
                        jBCWybierzAdres.addItem(adr);
                    }
                    



                } 
                catch (HibernateException he) 
                {
                    he.printStackTrace();
                }
           }
        }
    }//GEN-LAST:event_jCBCzynnoscActionPerformed

    private void jBCWybierzAdresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCWybierzAdresActionPerformed
        
        Adres adr = (Adres)jBCWybierzAdres.getSelectedItem();
        if(adr==null)
            return;
        jTextField1.setText(adr.getUlica());
        jTextField2.setText(String.valueOf(adr.getNrDomu()));
        jTextField3.setText(String.valueOf(adr.getNrLokalu()));
        KodPocztowy kp = adr.getKodPocztowy();
        for(int i=0; i<jBCWybierzKod.getItemCount();i++)
        {
            KodPocztowy kp2= (KodPocztowy)jBCWybierzKod.getItemAt(i);
            if(kp2.getIdKoduPoczt()==kp.getIdKoduPoczt())
                jBCWybierzKod.setSelectedIndex(i);
        }
    }//GEN-LAST:event_jBCWybierzAdresActionPerformed

    private void jBAdresAddEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdresAddEditActionPerformed
        try
        {
            Adres adr=new Adres();
            if(!Adres.verify(jTextField1.getText(), jTextField2.getText(), jTextField3.getText()))
                return;
            if(jCBCzynnosc.getSelectedIndex()==1 && null!=jBCWybierzAdres.getSelectedItem())//jeśli edycja
            {
                adr = (Adres)jBCWybierzAdres.getSelectedItem();
                adr.setUlica(jTextField1.getText());
                short nrd = Short.parseShort(jTextField2.getText());
                short nrl = Short.parseShort(jTextField3.getText());
                adr.setNrDomu(nrd);
                adr.setNrLokalu(nrl);
                adr.setKodPocztowy((KodPocztowy)jBCWybierzKod.getSelectedItem());
            }
            else if(jCBCzynnosc.getSelectedIndex()==0)//dodawanie
            {
                
                adr.setUlica(jTextField1.getText());
                short nrd = Short.parseShort(jTextField2.getText());
                adr.setNrDomu(nrd);
                if(jTextField3.getText()!=null)
                {
                    short nrl = Short.parseShort(jTextField3.getText());
                    adr.setNrLokalu(nrl);
                }
                
                adr.setKodPocztowy((KodPocztowy)jBCWybierzKod.getSelectedItem());
            }
            
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            session.saveOrUpdate(adr);
            session.getTransaction().commit();
            session.close();

            
        }
        catch(HibernateException ex)
        {
            JOptionPane.showMessageDialog(null, "Jakiś błąd hibernate\n"+ex.toString());
            return;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Jakiś błąd inny\n"+ex.toString());
            return;
        }
        JOptionPane.showMessageDialog(null,"Transakcja przebiegła pomyślnie");
    }//GEN-LAST:event_jBAdresAddEditActionPerformed

   public void Zacznij()
   {
        String query = "from KodPocztowy";
        {
            try 
            {
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                Query q = session.createQuery(query);
                List resultList = q.list();
                //displayResult(resultList);
                session.getTransaction().commit();
                //List<KodPocztowy> kody = new ArrayList<>();
                session.close();
                jBCWybierzKod.removeAllItems();
                for(Object o : resultList) 
                {
                    KodPocztowy kod = (KodPocztowy)o;
                    //kody.add(kod);
                    jBCWybierzKod.addItem(kod);
                }
                
                

            } 
            catch (HibernateException he) 
            {
                he.printStackTrace();
            }
       }
        
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdresAddEdit;
    private javax.swing.JComboBox jBCWybierzAdres;
    private javax.swing.JComboBox jBCWybierzKod;
    private javax.swing.JComboBox jCBCzynnosc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
