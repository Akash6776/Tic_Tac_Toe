/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author niko
 */
public class tictactoe extends javax.swing.JFrame {

    private String startGame ="X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    /**
     * Creates new form tictactoe
     */
    public tictactoe() {
        initComponents();
    }
    
    //============score====================================
    private void gameScore(){
        jlbl1.setText(String.valueOf(xCount));
        jlbl2.setText(String.valueOf(oCount));
    }
   //===============choose player==========================
     private void choose_a_Player(){
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "0";
        }
        else{
            startGame = "X";
        }
    }
     
   //===================WIN====================
     private void winningGame()
     {
         String b1 = jButton2.getText();
         String b2 = jButton3.getText();
         String b3 = jButton4.getText();
         String b4 = jButton5.getText();
         String b5 = jButton6.getText();
         String b6 = jButton7.getText();
         String b7 = jButton8.getText();
         String b8 = jButton9.getText();
         String b9 = jButton10.getText();
      //=======================  1 winning=============================================
         if (b1 == ("X") && b2 == ("X") && b3 == ("X"))
         {
             jButton2.setBackground(Color.ORANGE);
             jButton3.setBackground(Color.ORANGE);
             jButton4.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 1 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton2.setBackground(Color.LIGHT_GRAY);
             jButton3.setBackground(Color.LIGHT_GRAY);
             jButton4.setBackground(Color.LIGHT_GRAY);
         }
         
         if (b4 == ("X") && b5 == ("X") && b6 == ("X"))
         {
             
             jButton5.setBackground(Color.ORANGE);
             jButton6.setBackground(Color.ORANGE);
             jButton7.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 1 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton5.setBackground(Color.LIGHT_GRAY);
             jButton6.setBackground(Color.LIGHT_GRAY);
             jButton7.setBackground(Color.LIGHT_GRAY);
         }
         if (b7 == ("X") && b8 == ("X") && b9 == ("X"))
         {
             
             jButton8.setBackground(Color.ORANGE);
             jButton9.setBackground(Color.ORANGE);
             jButton10.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 1 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton8.setBackground(Color.LIGHT_GRAY);
             jButton9.setBackground(Color.LIGHT_GRAY);
             jButton10.setBackground(Color.LIGHT_GRAY);
         }
         if (b1 == ("X") && b4 == ("X") && b7 == ("X"))
         {
             
             jButton2.setBackground(Color.ORANGE);
             jButton5.setBackground(Color.ORANGE);
             jButton8.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 1 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton2.setBackground(Color.LIGHT_GRAY);
             jButton5.setBackground(Color.LIGHT_GRAY);
             jButton8.setBackground(Color.LIGHT_GRAY);
         }
         if (b2 == ("X") && b5 == ("X") && b8 == ("X"))
         {
             
             jButton3.setBackground(Color.ORANGE);
             jButton6.setBackground(Color.ORANGE);
             jButton9.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 1 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton3.setBackground(Color.LIGHT_GRAY);
             jButton6.setBackground(Color.LIGHT_GRAY);
             jButton9.setBackground(Color.LIGHT_GRAY);
         }
         if (b3 == ("X") && b6 == ("X") && b9 == ("X"))
         {
             
             jButton4.setBackground(Color.ORANGE);
             jButton7.setBackground(Color.ORANGE);
             jButton10.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 1 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton4.setBackground(Color.LIGHT_GRAY);
             jButton7.setBackground(Color.LIGHT_GRAY);
             jButton10.setBackground(Color.LIGHT_GRAY);
         }
         if (b2 == ("X") && b5 == ("X") && b9 == ("X"))
         {
             
             jButton2.setBackground(Color.ORANGE);
             jButton6.setBackground(Color.ORANGE);
             jButton10.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 1 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton2.setBackground(Color.LIGHT_GRAY);
             jButton6.setBackground(Color.LIGHT_GRAY);
             jButton10.setBackground(Color.LIGHT_GRAY);
         }
         if (b3 == ("X") && b5 == ("X") && b7 == ("X"))
         {
             
             jButton4.setBackground(Color.ORANGE);
             jButton6.setBackground(Color.ORANGE);
             jButton8.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 1 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton4.setBackground(Color.LIGHT_GRAY);
             jButton6.setBackground(Color.LIGHT_GRAY);
             jButton8.setBackground(Color.LIGHT_GRAY);
         }
         
       //========================= 2 Winning========================
        if (b1 == ("0") && b2 == ("0") && b3 == ("0"))
         {
             
             jButton2.setBackground(Color.ORANGE);
             jButton3.setBackground(Color.ORANGE);
             jButton4.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 2 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton2.setBackground(Color.LIGHT_GRAY);
             jButton3.setBackground(Color.LIGHT_GRAY);
             jButton4.setBackground(Color.LIGHT_GRAY);
         }
         
         if (b4 == ("0") && b5 == ("0") && b6 == ("0"))
         {
             
             jButton5.setBackground(Color.ORANGE);
             jButton6.setBackground(Color.ORANGE);
             jButton7.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 2 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
              jButton5.setBackground(Color.LIGHT_GRAY);
             jButton6.setBackground(Color.LIGHT_GRAY);
             jButton7.setBackground(Color.LIGHT_GRAY);
         }
         if (b7 == ("0") && b8 == ("0") && b9 == ("0"))
         {
             
             jButton8.setBackground(Color.ORANGE);
             jButton9.setBackground(Color.ORANGE);
             jButton10.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 2 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton8.setBackground(Color.LIGHT_GRAY);
             jButton9.setBackground(Color.LIGHT_GRAY);
             jButton10.setBackground(Color.LIGHT_GRAY);
         }
         if (b1 == ("0") && b4 == ("0") && b7 == ("0"))
         {
             
             jButton2.setBackground(Color.ORANGE);
             jButton5.setBackground(Color.ORANGE);
             jButton8.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 2 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton2.setBackground(Color.LIGHT_GRAY);
             jButton5.setBackground(Color.LIGHT_GRAY);
             jButton8.setBackground(Color.LIGHT_GRAY);
         }
         if (b2 == ("0") && b5 == ("0") && b8 == ("0"))
         {
             
             jButton3.setBackground(Color.ORANGE);
             jButton6.setBackground(Color.ORANGE);
             jButton9.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 2 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton3.setBackground(Color.LIGHT_GRAY);
             jButton6.setBackground(Color.LIGHT_GRAY);
             jButton9.setBackground(Color.LIGHT_GRAY);
         }
         if (b3 == ("0") && b6 == ("0") && b9 == ("0"))
         {
             
             jButton4.setBackground(Color.ORANGE);
             jButton7.setBackground(Color.ORANGE);
             jButton10.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 2 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton4.setBackground(Color.LIGHT_GRAY);
             jButton7.setBackground(Color.LIGHT_GRAY);
             jButton10.setBackground(Color.LIGHT_GRAY);
         }
         if (b2 == ("0") && b5 == ("0") && b9 == ("0"))
         {
             
             jButton2.setBackground(Color.ORANGE);
             jButton6.setBackground(Color.ORANGE);
             jButton10.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 2 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton2.setBackground(Color.LIGHT_GRAY);
             jButton6.setBackground(Color.LIGHT_GRAY);
             jButton10.setBackground(Color.LIGHT_GRAY);
         }
         if (b3 == ("0") && b5 == ("0") && b7 == ("0"))
         {
             
             jButton4.setBackground(Color.ORANGE);
             jButton6.setBackground(Color.ORANGE);
             jButton8.setBackground(Color.ORANGE);
             JOptionPane.showMessageDialog(this,"Player 2 Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             jButton2.setText("");
             jButton3.setText("");
             jButton4.setText("");
             jButton5.setText("");
             jButton6.setText("");
             jButton7.setText("");
             jButton8.setText("");
             jButton9.setText("");
             jButton10.setText("");
             jButton4.setBackground(Color.LIGHT_GRAY);
             jButton6.setBackground(Color.LIGHT_GRAY);
             jButton8.setBackground(Color.LIGHT_GRAY);
         }
         
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlbl1 = new javax.swing.JLabel();
        jlbl2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 80));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, 80));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 80, 80));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 80));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 80, 80));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 80, 80));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, 80));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 80, 80));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 80, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, 300));

        jPanel3.setBackground(new java.awt.Color(153, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 380, 170));

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(51, 102, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 380, 170));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel1.setText("Player 2 :");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, 50));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel2.setText("Player 1 :");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 60));

        jlbl1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jlbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl1.setText("0");
        jlbl1.setOpaque(true);
        jPanel5.add(jlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 150, 50));

        jlbl2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jlbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl2.setText("0");
        jlbl2.setOpaque(true);
        jPanel5.add(jlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 150, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 140));

        jPanel7.setBackground(new java.awt.Color(102, 102, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(51, 102, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 380, 170));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton11.setText("Reset");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 50));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12.setText("Exit");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 150, 50));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton13.setText("New Game");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 50));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 360, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 380, 300));

        jPanel9.setBackground(new java.awt.Color(153, 255, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIC TAC TOE");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 390, 50));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 700, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm to Exit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jButton10.setText("");
        
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        
        jlbl1.setText("0");
        jlbl2.setText("0");
        
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jButton10.setText("");
        
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlbl1;
    private javax.swing.JLabel jlbl2;
    // End of variables declaration//GEN-END:variables
}
