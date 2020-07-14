/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Akif2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author AKIF
 */
public class computerVSuser extends javax.swing.JFrame {
    private Gamer machine;
    private Gamer user;
    List<Pokemon> cards;
    boolean first;
    int index1;
    int index2;
    boolean game_over;
    /**
     * Creates new form computerVSuser
     */
    public computerVSuser() throws IOException {
        initComponents();
        initComponents2();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jFrame1.setTitle("Deal Cards");
        jFrame1.setPreferredSize(new java.awt.Dimension(850, 642));
        jFrame1.setResizable(false);
        jFrame1.setSize(new java.awt.Dimension(850, 642));
        jFrame1.getContentPane().setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/cards.png"))); // NOI18N
        jFrame1.getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 850, 642);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton3);
        jButton3.setBounds(220, 390, 440, 80);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pokémon Card Game");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/new.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 151, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/new.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 151, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 38, 90, 23));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Computer");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 39, 80, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/user (3).png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 29, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/learning.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/score.png"))); // NOI18N
        jLabel7.setText(":");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 80, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("0");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 110, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/score.png"))); // NOI18N
        jLabel9.setText(":");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 98, 80, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("0");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 95, 90, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/btl.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 11, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your Card" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 523, 160, 31));

        jButton1.setBackground(new java.awt.Color(102, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/pn.png"))); // NOI18N
        jButton1.setText("Choose Computer Card");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 523, 220, 31));

        jButton2.setBackground(new java.awt.Color(255, 204, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Turn Them Over");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 536, 139, 36));

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Get 1 Card from Deck");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 458, 170, 36));

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Choose Card");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 399, 148, 41));

        jButton6.setBackground(new java.awt.Color(255, 153, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Start New Game!");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 313, 148, 42));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/last.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        List<Pokemon> list;
        machine.getCard(cards, first);
        cards.removeAll(machine.getCards());
        list = user.getCard(cards, first);
        cards.removeAll(user.getCards());
        if (!first) {
            jComboBox1.removeItemAt(index1+1);    
        }
        if (first)
            first =false;
        for (Pokemon card : list) {
            if (!card.isCardUsed()) {
                jComboBox1.addItem(card.getPokemonName());
            }
        }
        this.setVisible(true);
        jFrame1.setVisible(false);
        jButton4.setVisible(false);
        jButton2.setVisible(false);
        jComboBox1.setVisible(true);
        jButton1.setVisible(true);
        jButton4.setVisible(false);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/new.png")));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/new.png")));
        index1 = -1;
        index2 = -1;
        if (!isThereCard()) {
            JOptionPane.showMessageDialog(this,
                    "There is no left Card in the deck!",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE);
                
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        index1 = jComboBox1.getSelectedIndex()-1;
        if (index1+1!=0) {
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/back.jpg")));
        }
        else
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/new.png")));
        if (index1+1 != 0 && index2 != -1) {
            jButton2.setVisible(true);
        }
        else
            jButton2.setVisible(false);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        index2 = 0;
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/back.jpg")));
        if (index1+1!=0 && index2 != -1) {
            jButton2.setVisible(true);
        }
        else
            jButton2.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    private boolean isThereCard(){
        if (cards.size()<=0) {
            return false;
        }
        else
            return true;
    }
    private boolean getGameOver(){
        if (machine.getSize()==0&&user.getSize()==0) {
            return true;
        }
        else
            return false;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setVisible(false);
        jComboBox1.setVisible(false);
        jButton1.setVisible(false);
        Pokemon userCard = user.chooseCard(jComboBox1.getItemAt(index1+1));
        Pokemon compCard = machine.chooseCard("default");
        index2 = machine.getIndex();
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(getPath(userCard.getPokemonName()))));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(getPath(compCard.getPokemonName()))));
        user.setScore(user.showScore()+userCard.showDamagePoint());
        machine.setScore(machine.showScore()+compCard.showDamagePoint());
        jLabel8.setText(String.valueOf(user.showScore()));
        jLabel10.setText(String.valueOf(machine.showScore()));
        userCard.setCardUsed(true);
        compCard.setCardUsed(true);
        user.setCardUsed(index1, userCard);
        machine.setCardUsed(index2, compCard);
        if (isThereCard()) {
           jButton4.setVisible(true);       
        }
        else{
            if (getGameOver()) {
                //custom title, custom icon
                String winner;
                if (machine.showScore()>user.showScore()) {
                    winner = "Computer";
                }
                else if (machine.showScore()<user.showScore()) {
                    winner = "User";
                }
                else
                    winner = "No winner";
                ImageIcon icon = new ImageIcon(getClass().getResource("/com/Akif2/img/icon.png"));
                JOptionPane.showMessageDialog(this,
                    String.format("Congratulations! %s win the Game",winner),
                    "Game Over",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon);
                jButton6.setVisible(true);
            }
            else{
                jButton5.setVisible(true);
            }
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        jFrame1.setVisible(true);
        jButton4.setVisible(true);
        jButton2.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jFrame1.setVisible(false);
        jButton4.setVisible(false);
        jButton2.setVisible(false);
        jComboBox1.setVisible(true);
        jButton1.setVisible(true);
        jButton4.setVisible(false);
        jComboBox1.removeItemAt(index1+1); 
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/new.png")));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Akif2/img/new.png")));
        index1 = -1;
        index2 = -1;
        jButton5.setVisible(false);  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            jComboBox1.removeItemAt(1);
            initComponents2();
            setVisible(false);
            
        } catch (IOException ex) {
            Logger.getLogger(computerVSuser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    private String getPath(String pokemonName){
        switch(pokemonName){
            case "Pikachu":
                return "/com/Akif2/img/pikachu.png";
            case "Meowth":
                return "/com/Akif2/img/meomth.png";
            case "Bulbasaur":
                 return "/com/Akif2/img/balbasor.png";
                
            case "Charmander":
                return "/com/Akif2/img/charmander.png";
            case "Squirtle":
                 return "/com/Akif2/img/sqirtle.png";
                
            case "Zubat":
                return "/com/Akif2/img/zubat.png";
            case "Psyduck":
                 return "/com/Akif2/img/psyduck.png";
                
            case "Snorlax":
                return "/com/Akif2/img/snorlax.png";
            case "Butterfree":
                 return "/com/Akif2/img/butterfree.png";
                
            case "Jigglypuff":
                return "/com/Akif2/img/jiggly.png";
             default:
                 return "/com/Akif2/img/new.png";
        }
                
                    
    }
    private void initComponents2() throws IOException{
        jFrame1.setVisible(true);
        jFrame1.setIconImage(ImageIO.read(getClass().getResource("/com/Akif2/img/instinct.png")));
        this.setIconImage(ImageIO.read(getClass().getResource("/com/Akif2/img/pk.png")));
        machine = new Computer();
        user = new User();
        cards = new ArrayList<>();
        cards.add(new Bulbasaur());
        cards.add(new Butterfree());
        cards.add(new Charmander());
        cards.add(new Squirtle());
        cards.add(new Zubat());
        cards.add(new Psyduck());
        cards.add(new Snorlax());
        cards.add(new Jigglypuff());
        cards.add(new Pikachu());
        cards.add(new Meowth());
        first =true;
        index1 = -1;
        index2 = -1;
        jButton2.setVisible(false);
        jButton4.setVisible(false);
        jLabel8.setText(String.valueOf(user.showScore()));
        jLabel10.setText(String.valueOf(machine.showScore()));
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        
    }
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
            java.util.logging.Logger.getLogger(computerVSuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(computerVSuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(computerVSuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(computerVSuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new computerVSuser().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(computerVSuser.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
    
}
