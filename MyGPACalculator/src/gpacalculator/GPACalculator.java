/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gpacalculator;

/**
 *
 * @author ruther frith
 */
public class GPACalculator extends javax.swing.JFrame {

    double biologyGrade = 0,
           englishGrade = 0,
           mathGrade = 0,
           progGrade = 0, 
           HCIGrade = 0;

    public GPACalculator() {
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

        courseL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        courseL1 = new javax.swing.JLabel();
        courseL2 = new javax.swing.JLabel();
        courseL3 = new javax.swing.JLabel();
        courseL4 = new javax.swing.JLabel();
        courseL5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chBiologyTF = new javax.swing.JTextField();
        chEnglishTF = new javax.swing.JTextField();
        chProgTF = new javax.swing.JTextField();
        chMathTF = new javax.swing.JTextField();
        chHCITF = new javax.swing.JTextField();
        gpa = new javax.swing.JLabel();
        calculateB = new javax.swing.JButton();
        clearB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        biologyCBox = new javax.swing.JComboBox<>();
        englishCBox = new javax.swing.JComboBox<>();
        mathCBox = new javax.swing.JComboBox<>();
        progCBox = new javax.swing.JComboBox<>();
        HCICBox = new javax.swing.JComboBox<>();
        gpaL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GPA Calculator");

        courseL.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        courseL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courseL.setText("COURSE");
        courseL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("CREDIT HOURS");

        courseL1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        courseL1.setText("BIOLOGY");
        courseL1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        courseL2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        courseL2.setText("ENGLISH");
        courseL2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        courseL3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        courseL3.setText("MATHEMATICS");
        courseL3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        courseL4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        courseL4.setText("PROGRAMMING 2");
        courseL4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        courseL5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        courseL5.setText("HCI");
        courseL5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("GRADE");

        gpa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gpa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        calculateB.setText("CALCULATE");
        calculateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBActionPerformed(evt);
            }
        });

        clearB.setText("CLEAR");
        clearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GPA");

        biologyCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));
        biologyCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biologyCBoxActionPerformed(evt);
            }
        });

        englishCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));
        englishCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishCBoxActionPerformed(evt);
            }
        });

        mathCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));
        mathCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathCBoxActionPerformed(evt);
            }
        });

        progCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));
        progCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progCBoxActionPerformed(evt);
            }
        });

        HCICBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));
        HCICBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HCICBoxActionPerformed(evt);
            }
        });

        gpaL.setBackground(new java.awt.Color(204, 204, 204));
        gpaL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gpaL.setText("[  ?  ]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(courseL, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(courseL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseL4, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(courseL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chBiologyTF)
                    .addComponent(chEnglishTF)
                    .addComponent(chProgTF)
                    .addComponent(chMathTF)
                    .addComponent(chHCITF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(progCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HCICBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(englishCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mathCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(biologyCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clearB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gpaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calculateB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(gpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chBiologyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(biologyCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(gpaL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculateB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearB)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(courseL2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chEnglishTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(englishCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(courseL1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseL3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chMathTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mathCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseL4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chProgTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(progCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseL5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chHCITF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HCICBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(gpa))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBActionPerformed
        // GRADE POINTS
        double chBiology, chEnglish, chMath, chProg, chHCI;
        double totalCH, totalGP, GPA = 0;

        chBiology = Double.parseDouble(chBiologyTF.getText());
        chEnglish = Double.parseDouble(chEnglishTF.getText());
        chMath = Double.parseDouble(chMathTF.getText());
        chProg = Double.parseDouble(chProgTF.getText());
        chHCI = Double.parseDouble(chHCITF.getText());

        totalCH = chBiology + chEnglish + chMath + chProg + chHCI;
        
        biologyCBoxActionPerformed(evt);
        englishCBoxActionPerformed(evt);
        mathCBoxActionPerformed(evt);
        progCBoxActionPerformed(evt);
        HCICBoxActionPerformed(evt);

        // Grade Points
        biologyGrade *= chBiology;
        englishGrade *= chEnglish;
        mathGrade *= chMath;
        progGrade *= chProg;
        HCIGrade *= chHCI;

        totalGP = biologyGrade + englishGrade + mathGrade + progGrade + HCIGrade;
        GPA = totalGP / totalCH;

        gpaL.setText(String.format("%.2f", GPA));
                


    }//GEN-LAST:event_calculateBActionPerformed

    private void biologyCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biologyCBoxActionPerformed
        if(biologyCBox.getSelectedItem().equals("A")){
          biologyGrade = 4.00; }
        else if(biologyCBox.getSelectedItem().equals("A-")){
          biologyGrade = 3.70; }
        else if(biologyCBox.getSelectedItem().equals("B+")){
          biologyGrade = 3.33; }
        else if(biologyCBox.getSelectedItem().equals("B")){
          biologyGrade = 3.00; }
        else if(biologyCBox.getSelectedItem().equals("B-")){
          biologyGrade = 2.70; }
        else if(biologyCBox.getSelectedItem().equals("C+")){
          biologyGrade = 2.30; }
        else if(biologyCBox.getSelectedItem().equals("C")){
          biologyGrade = 2.00; }
        else if(biologyCBox.getSelectedItem().equals("C-")){
          biologyGrade = 1.70; }
        else if(biologyCBox.getSelectedItem().equals("D+")){
          biologyGrade = 1.30; }
        else if(biologyCBox.getSelectedItem().equals("D")){
          biologyGrade = 1.00; }
        else if(biologyCBox.getSelectedItem().equals("D-")){
          biologyGrade = 0.70; }
        else
          biologyGrade = 0; 
    }//GEN-LAST:event_biologyCBoxActionPerformed

    private void englishCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishCBoxActionPerformed
        if(englishCBox.getSelectedItem().equals("A")){
          englishGrade = 4.00; }
        else if(englishCBox.getSelectedItem().equals("A-")){
          englishGrade = 3.70; }
        else if(englishCBox.getSelectedItem().equals("B+")){
          englishGrade = 3.33; }
        else if(englishCBox.getSelectedItem().equals("B")){
          englishGrade = 3.00; }
        else if(englishCBox.getSelectedItem().equals("B-")){
          englishGrade = 2.70; }
        else if(englishCBox.getSelectedItem().equals("C+")){
          englishGrade = 2.30; }
        else if(englishCBox.getSelectedItem().equals("C")){
          englishGrade = 2.00; }
        else if(englishCBox.getSelectedItem().equals("C-")){
          englishGrade = 1.70; }
        else if(englishCBox.getSelectedItem().equals("D+")){
          englishGrade = 1.30; }
        else if(englishCBox.getSelectedItem().equals("D")){
          englishGrade = 1.00; }
        else if(englishCBox.getSelectedItem().equals("D-")){
          englishGrade = 0.70; }
        else
          englishGrade = 0; 
    }//GEN-LAST:event_englishCBoxActionPerformed

    private void mathCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathCBoxActionPerformed
        if(mathCBox.getSelectedItem().equals("A")){
          mathGrade = 4.00; }
        else if(mathCBox.getSelectedItem().equals("A-")){
          mathGrade = 3.70; }
        else if(mathCBox.getSelectedItem().equals("B+")){
          mathGrade = 3.33; }
        else if(mathCBox.getSelectedItem().equals("B")){
          mathGrade = 3.00; }
        else if(mathCBox.getSelectedItem().equals("B-")){
          mathGrade = 2.70; }
        else if(mathCBox.getSelectedItem().equals("C+")){
          mathGrade = 2.30; }
        else if(mathCBox.getSelectedItem().equals("C")){
          mathGrade = 2.00; }
        else if(mathCBox.getSelectedItem().equals("C-")){
          mathGrade = 1.70; }
        else if(mathCBox.getSelectedItem().equals("D+")){
          mathGrade = 1.30; }
        else if(mathCBox.getSelectedItem().equals("D")){
          mathGrade = 1.00; }
        else if(mathCBox.getSelectedItem().equals("D-")){
          mathGrade = 0.70; }
        else
          mathGrade = 0; 
    }//GEN-LAST:event_mathCBoxActionPerformed

    private void progCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progCBoxActionPerformed
        if(progCBox.getSelectedItem().equals("A")){
          progGrade = 4.00; }
        else if(progCBox.getSelectedItem().equals("A-")){
          progGrade = 3.70; }
        else if(progCBox.getSelectedItem().equals("B+")){
          progGrade = 3.33; }
        else if(progCBox.getSelectedItem().equals("B")){
          progGrade = 3.00; }
        else if(progCBox.getSelectedItem().equals("B-")){
          progGrade = 2.70; }
        else if(progCBox.getSelectedItem().equals("C+")){
          progGrade = 2.30; }
        else if(progCBox.getSelectedItem().equals("C")){
          progGrade = 2.00; }
        else if(progCBox.getSelectedItem().equals("C-")){
          progGrade = 1.70; }
        else if(progCBox.getSelectedItem().equals("D+")){
          progGrade = 1.30; }
        else if(progCBox.getSelectedItem().equals("D")){
          progGrade = 1.00; }
        else if(progCBox.getSelectedItem().equals("D-")){
          progGrade = 0.70; }
        else
          progGrade = 0; 
    }//GEN-LAST:event_progCBoxActionPerformed

    private void HCICBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HCICBoxActionPerformed
        if(HCICBox.getSelectedItem().equals("A")){
          HCIGrade = 4.00; }
        else if(HCICBox.getSelectedItem().equals("A-")){
          HCIGrade = 3.70; }
        else if(HCICBox.getSelectedItem().equals("B+")){
          HCIGrade = 3.33; }
        else if(HCICBox.getSelectedItem().equals("B")){
          HCIGrade = 3.00; }
        else if(HCICBox.getSelectedItem().equals("B-")){
          HCIGrade = 2.70; }
        else if(HCICBox.getSelectedItem().equals("C+")){
          HCIGrade = 2.30; }
        else if(HCICBox.getSelectedItem().equals("C")){
          HCIGrade = 2.00; }
        else if(HCICBox.getSelectedItem().equals("C-")){
          HCIGrade = 1.70; }
        else if(HCICBox.getSelectedItem().equals("D+")){
          HCIGrade = 1.30; }
        else if(HCICBox.getSelectedItem().equals("D")){
          HCIGrade = 1.00; }
        else if(HCICBox.getSelectedItem().equals("D-")){
          HCIGrade = 0.70; }
        else
          HCIGrade = 0; 
    }//GEN-LAST:event_HCICBoxActionPerformed

    private void clearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBActionPerformed
        // Reset Credit Hour Text Field
        chBiologyTF.setText(" ");
        chEnglishTF.setText(" ");
        chMathTF.setText(" ");
        chProgTF.setText(" ");
        chHCITF.setText(" ");
        // Reset Label Field GPA
        gpaL.setText(" ");
        // Reset Combo Box Grades
        biologyCBox.setSelectedIndex(0);
        englishCBox.setSelectedIndex(0);
        mathCBox.setSelectedIndex(0);
        progCBox.setSelectedIndex(0);
        HCICBox.setSelectedIndex(0);
    }//GEN-LAST:event_clearBActionPerformed

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
            java.util.logging.Logger.getLogger(GPACalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GPACalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GPACalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GPACalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GPACalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> HCICBox;
    private javax.swing.JComboBox<String> biologyCBox;
    private javax.swing.JButton calculateB;
    private javax.swing.JTextField chBiologyTF;
    private javax.swing.JTextField chEnglishTF;
    private javax.swing.JTextField chHCITF;
    private javax.swing.JTextField chMathTF;
    private javax.swing.JTextField chProgTF;
    private javax.swing.JButton clearB;
    private javax.swing.JLabel courseL;
    private javax.swing.JLabel courseL1;
    private javax.swing.JLabel courseL2;
    private javax.swing.JLabel courseL3;
    private javax.swing.JLabel courseL4;
    private javax.swing.JLabel courseL5;
    private javax.swing.JComboBox<String> englishCBox;
    private javax.swing.JLabel gpa;
    private javax.swing.JLabel gpaL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> mathCBox;
    private javax.swing.JComboBox<String> progCBox;
    // End of variables declaration//GEN-END:variables
}
