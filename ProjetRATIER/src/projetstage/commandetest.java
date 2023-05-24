/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetstage;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author solto
 */
public class commandetest extends javax.swing.JFrame {

    /**
     * Creates new form commandetest
     */
    public commandetest() {
        initComponents();

        // SERT A EFFECTUER DES TESTS.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selec_prenom = new javax.swing.JTextField();
        ref = new javax.swing.JTextField();
        selec_adresse = new javax.swing.JTextField();
        prenom1 = new javax.swing.JLabel();
        selec_mail = new javax.swing.JTextField();
        mail1 = new javax.swing.JLabel();
        selec_tel = new javax.swing.JTextField();
        adresse1 = new javax.swing.JLabel();
        selec_date = new javax.swing.JTextField();
        enregistrer = new javax.swing.JButton();
        colis = new javax.swing.JButton();
        bouteille = new javax.swing.JTextField();
        prix = new javax.swing.JTextField();
        nom = new javax.swing.JLabel();
        selec_nom = new javax.swing.JTextField();
        prenom = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        adresse = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        pourle = new javax.swing.JLabel();
        commande_panel = new javax.swing.JScrollPane();
        commande = new javax.swing.JTable();
        carton = new javax.swing.JTextField();
        nom1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mail_client = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selec_prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selec_prenomActionPerformed(evt);
            }
        });

        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });

        selec_adresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selec_adresseActionPerformed(evt);
            }
        });

        prenom1.setText("Nombre de bouteille : ");

        selec_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selec_mailActionPerformed(evt);
            }
        });

        mail1.setText("Nombre de carton :");

        selec_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selec_telActionPerformed(evt);
            }
        });

        adresse1.setText("Prix unitaire :");

        selec_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selec_dateActionPerformed(evt);
            }
        });

        enregistrer.setText("Enregistrer un client");
        enregistrer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enregistrerMouseClicked(evt);
            }
        });
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });

        colis.setText("Fichecolis");

        bouteille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouteilleActionPerformed(evt);
            }
        });

        prix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prixActionPerformed(evt);
            }
        });

        nom.setText("Nom :");

        selec_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selec_nomActionPerformed(evt);
            }
        });

        prenom.setText("Prénom : ");

        mail.setText("mail :");

        adresse.setText("adresse :");

        tel.setText("tel :");

        pourle.setText("date :");

        commande.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Référence", "Bouteilles", "Cartons", "Prix"
            }
        ));
        commande_panel.setViewportView(commande);

        carton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartonActionPerformed(evt);
            }
        });

        nom1.setText("Référence :");

        jLabel1.setText("Mail du client");

        mail_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mail_clientActionPerformed(evt);
            }
        });

        jButton1.setText("enregistrer commande");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prenom)
                                    .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(selec_nom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(selec_prenom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(selec_mail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(selec_adresse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(selec_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pourle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(selec_date, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(prenom1)
                                            .addComponent(adresse1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mail1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nom1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bouteille, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(carton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mail_client, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(90, 90, 90))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enregistrer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(524, Short.MAX_VALUE)
                        .addComponent(commande_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(colis, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mail_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenom1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouteille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mail1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresse1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pourle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selec_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addComponent(colis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selec_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selec_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selec_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selec_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selec_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enregistrer)
                    .addComponent(jButton1))
                .addGap(46, 46, 46)
                .addComponent(commande_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selec_prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selec_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selec_prenomActionPerformed

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refActionPerformed

    private void selec_adresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selec_adresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selec_adresseActionPerformed

    private void selec_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selec_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selec_mailActionPerformed

    private void selec_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selec_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selec_telActionPerformed

    private void selec_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selec_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selec_dateActionPerformed

    private void enregistrerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enregistrerMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_enregistrerMouseClicked

    Connection con;
    PreparedStatement pst;
    Connection cont;
    PreparedStatement pstt;

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) commande.getModel();

        String nom = selec_nom.getText();
        String prenom = selec_prenom.getText();
        String mail = selec_mail.getText();
        String tel = selec_tel.getText();
        String adresse = selec_adresse.getText();
        String ref_vin, bouteille, carton, prix_unit;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/stage", "root", "");

            pst = con.prepareStatement("insert into commande_perso(NOM,PRENOM,MAIL,TEL,ADRESSE)values(?,?,?,?,?)");
            pst.setString(1, nom);
            pst.setString(2, prenom);
            pst.setString(3, mail);
            pst.setString(4, tel);
            pst.setString(5, adresse);
            pst.executeUpdate();

            /*for (int i = 0; i < tblModel.getRowCount(); i++) {
                    
                    ref_vin = tblModel.getValueAt(i, 0).toString();
                    bouteille = tblModel.getValueAt(i, 1).toString();
                    carton = tblModel.getValueAt(i, 2).toString();
                    prix_unit = tblModel.getValueAt(i, 3).toString();
                    
                    String query = "insert into commande(NOM,REF_VINS,BOUTEILLE,CARTON,PRIX_UNIT)values(?,?,?,?,?)";
                    
                    pstt = con.prepareStatement(query);
                
                    pstt.setString(1, nom);
                    pstt.setString(2, ref_vin);
                    pstt.setString(3, bouteille);
                    pstt.setString(4, carton);
                    pstt.setString(5, prix_unit);
                    pstt.execute();
                
                }*/
            JOptionPane.showMessageDialog(this, "Enregistrer");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(commandes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "non");

        } catch (SQLException ex) {
            Logger.getLogger(commandes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Vérifier que les informations sont du bon type");
        }

        this.setVisible(false);
        new bonCommande().setVisible(true);


    }//GEN-LAST:event_enregistrerActionPerformed

    private void bouteilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouteilleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bouteilleActionPerformed

    private void prixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prixActionPerformed

    private void selec_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selec_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selec_nomActionPerformed

    private void cartonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartonActionPerformed

    private void mail_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mail_clientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mail_clientActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tblModel = (DefaultTableModel) commande.getModel();

        String ref_vin = ref.toString();
        String bouteilles = bouteille.toString();
        String cartons = carton.toString();
        String prix_unit = prix.toString();
        String date_co = selec_date.toString();

        try {
            cont = JavaBDConnect.getCo();
            con = JavaBDConnect.getCo();
            
            String query_select="SELECT MAIL FROM personne where mail_client=?";
            pst = cont.prepareStatement(query_select);
            
            pst.setString(1,mail_client.getText());

            String query_insert = "insert into commande(REF_VINS,BOUTEILLE,CARTON,PRIX_UNIT,DATE_COMMANDE)values(?,?,?,?,?) INNER JOIN personnes on personnes.ID=commande.ID where MAIL = mail_client";

            
            pstt = con.prepareStatement(query_insert);

            pstt.setString(1, ref_vin);
            pstt.setString(2, bouteilles);
            pstt.setString(3, cartons);
            pstt.setString(4, prix_unit);
            pstt.setString(5, date_co);
            pstt.execute();

            /*for (int i = 0; i < tblModel.getRowCount(); i++) {
                    
                    ref_vin = tblModel.getValueAt(i, 0).toString();
                    bouteille = tblModel.getValueAt(i, 1).toString();
                    carton = tblModel.getValueAt(i, 2).toString();
                    prix_unit = tblModel.getValueAt(i, 3).toString();
                    
                    String query = "insert into commande(NOM,REF_VINS,BOUTEILLE,CARTON,PRIX_UNIT)values(?,?,?,?,?)";
                    
                    pstt = con.prepareStatement(query);
                
                    pstt.setString(1, nom);
                    pstt.setString(2, ref_vin);
                    pstt.setString(3, bouteille);
                    pstt.setString(4, carton);
                    pstt.setString(5, prix_unit);
                    pstt.execute();
                
                }*/
            JOptionPane.showMessageDialog(this, "Enregistrer");

        } catch (Exception ex) {
            Logger.getLogger(commandes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "non");

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(commandetest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(commandetest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(commandetest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(commandetest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new commandetest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresse;
    private javax.swing.JLabel adresse1;
    private javax.swing.JTextField bouteille;
    private javax.swing.JTextField carton;
    private javax.swing.JButton colis;
    private javax.swing.JTable commande;
    private javax.swing.JScrollPane commande_panel;
    private javax.swing.JButton enregistrer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel mail1;
    private javax.swing.JTextField mail_client;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel nom1;
    private javax.swing.JLabel pourle;
    private javax.swing.JLabel prenom;
    private javax.swing.JLabel prenom1;
    private javax.swing.JTextField prix;
    private javax.swing.JTextField ref;
    private javax.swing.JTextField selec_adresse;
    private javax.swing.JTextField selec_date;
    private javax.swing.JTextField selec_mail;
    private javax.swing.JTextField selec_nom;
    private javax.swing.JTextField selec_prenom;
    private javax.swing.JTextField selec_tel;
    private javax.swing.JLabel tel;
    // End of variables declaration//GEN-END:variables
}