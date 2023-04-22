package com.uca.solucionparcial1.ejercicio2.views;

import java.text.DecimalFormat;

public class CalculoSalario extends javax.swing.JFrame {
    
    private final double rawSalary;
    private enum Discounts {ISSS, AFP, Rent};
    DecimalFormat df = new DecimalFormat("#.##");
    
    public CalculoSalario(double rawSalary) {
        this.rawSalary = rawSalary;
        initComponents();
        jTextField_TotalSalary.setText(Double.toString(rawSalary));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_TotalSalary = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_FinalSalary = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_ISSSDiscount = new javax.swing.JTextField();
        jTextField_AFPDiscount = new javax.swing.JTextField();
        jTextField_RentDiscount = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Salario Total:");

        jTextField_TotalSalary.setActionCommand("<Not Set>");
        jTextField_TotalSalary.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_TotalSalary.setEnabled(false);
        jTextField_TotalSalary.setFocusable(false);
        jTextField_TotalSalary.setMinimumSize(new java.awt.Dimension(65, 25));
        jTextField_TotalSalary.setName(""); // NOI18N
        jTextField_TotalSalary.setOpaque(true);

        jLabel3.setText("Descuentos:");

        jLabel7.setText("Salario a pagar");
        jLabel7.setToolTipText("");

        jTextField_FinalSalary.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_FinalSalary.setEnabled(false);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("ISSS:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, -1, -1));

        jLabel5.setText("AFP:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, -1, -1));

        jLabel6.setText("Renta:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, -1, -1));

        jTextField_ISSSDiscount.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_ISSSDiscount.setEnabled(false);
        jPanel2.add(jTextField_ISSSDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 6, 71, -1));

        jTextField_AFPDiscount.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_AFPDiscount.setEnabled(false);
        jPanel2.add(jTextField_AFPDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 46, 71, -1));

        jTextField_RentDiscount.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_RentDiscount.setEnabled(false);
        jPanel2.add(jTextField_RentDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 86, 71, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_TotalSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(8, 8, 8)
                        .addComponent(jButton1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_FinalSalary)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_TotalSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_FinalSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField_AFPDiscount.setText(df.format(CalcDiscount(rawSalary, Discounts.AFP)));
        jTextField_ISSSDiscount.setText(df.format(CalcDiscount(rawSalary, Discounts.ISSS)));
        jTextField_RentDiscount.setText(df.format(CalcDiscount(rawSalary, Discounts.Rent)));
        jTextField_FinalSalary.setText(df.format(CalcFinalSalary()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private double CalcDiscount(double salary, Discounts concept){
        double discountPercentage;        
        discountPercentage = switch (concept) {
            case AFP -> 0.0725;
            case ISSS -> 0.03;
            case Rent -> 0.1;
            default -> 1;
        };
        return (discountPercentage * salary);
    }
    
    private double CalcFinalSalary(){
        return rawSalary - (CalcDiscount(rawSalary, Discounts.AFP)+ CalcDiscount(rawSalary, Discounts.ISSS)+ CalcDiscount(rawSalary, Discounts.Rent));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField_AFPDiscount;
    private javax.swing.JTextField jTextField_FinalSalary;
    private javax.swing.JTextField jTextField_ISSSDiscount;
    private javax.swing.JTextField jTextField_RentDiscount;
    private javax.swing.JTextField jTextField_TotalSalary;
    // End of variables declaration//GEN-END:variables
}
