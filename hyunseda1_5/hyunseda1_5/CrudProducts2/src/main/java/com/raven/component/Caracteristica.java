/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.component;

/**
 *
 * @author ACER
 */
public class Caracteristica extends javax.swing.JPanel {

    /**
     * Creates new form Caracteristica
     */
    public Caracteristica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlCategory = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        PnlCategory.setBackground(new java.awt.Color(255, 255, 255));
        PnlCategory.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PnlCategory.setMaximumSize(new java.awt.Dimension(32767, 50000));
        PnlCategory.setLayout(new java.awt.GridLayout(20, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Categorias                       ");
        PnlCategory.add(jLabel2);

        add(PnlCategory, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlCategory;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}