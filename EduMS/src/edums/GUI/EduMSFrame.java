/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums.GUI;

import edums.DB;
import edums.School;
import edums.Student;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diogo
 */
public class EduMSFrame extends javax.swing.JFrame {

    private edums.School s1;
    /**
     * Creates new form Frame
     */
    public EduMSFrame() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        StudentsList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        AddStudentButton = new javax.swing.JButton();
        EditStudentButton = new javax.swing.JButton();
        RemoveStudentButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ClassesList = new javax.swing.JTable();
        AddClassButton = new javax.swing.JButton();
        editClassButton = new javax.swing.JButton();
        removeClassButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setResizable(false);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane1.setName(""); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        StudentsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Birth Date", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentsList.setColumnSelectionAllowed(true);
        StudentsList.setFillsViewportHeight(true);
        StudentsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(StudentsList);
        StudentsList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Students Management");

        AddStudentButton.setText("Add Student");
        AddStudentButton.setBorderPainted(false);
        AddStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentButtonActionPerformed(evt);
            }
        });

        EditStudentButton.setText("Edit Student");
        EditStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditStudentButtonActionPerformed(evt);
            }
        });

        RemoveStudentButton.setText("Remove Student");
        RemoveStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveStudentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addGap(46, 46, 46)
                                .addComponent(EditStudentButton)
                                .addGap(44, 44, 44)
                                .addComponent(RemoveStudentButton))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddStudentButton)
                    .addComponent(EditStudentButton)
                    .addComponent(RemoveStudentButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Students", jPanel1);

        ClassesList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Denomination", "Type", "Curricular Unit", "ID", "Hours/Class", "Classes/Week"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ClassesList);

        AddClassButton.setText("Add Class");
        AddClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassButtonActionPerformed(evt);
            }
        });

        editClassButton.setText("Edit Class");
        editClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditClassButtonActionPerformed(evt);
            }
        });

        removeClassButton.setText("Remove Class");
        removeClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeClassButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Classes Management");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(AddClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(74, 74, 74)
                            .addComponent(editClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeClassButton))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddClassButton)
                    .addComponent(editClassButton)
                    .addComponent(removeClassButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Classes", jPanel2);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Hello, Jon Doe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public School getSchool() {
        return s1;
    }
    
    private void RemoveStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        s1.removeStudent(s1.getStudents().get(StudentsList.getSelectedRow()));
        DB tempDB = new DB("teste.bin");
        tempDB.exportData(s1);
        updateList();
    } 
    
    private void EditStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStudentButtonActionPerformed
        Student st = s1.getStudents().get(StudentsList.getSelectedRow());
        EditStudentFrame ed = new EditStudentFrame(st);
        ed.setVisible(true);
    }//GEN-LAST:event_EditStudentButtonActionPerformed

    private void AddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        AddStudentFrame ad = new AddStudentFrame();
        ad.setVisible(true);
    }
    
    private void AddClassButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        AddClassFrame ad = new AddClassFrame();
        ad.setVisible(true);
    }  
    private void removeClassButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        s1.removeClass(s1.getClasses().get(ClassesList.getSelectedRow()));
        DB tempDB = new DB("teste.bin");
        tempDB.exportData(s1);
        updateList();
    } 
  
    private void EditClassButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        edums.Class c1 = s1.getClasses().get(ClassesList.getSelectedRow());
        EditClassFrame edc = new EditClassFrame(c1);
        edc.setVisible(true);
    }     
    
/*
    private void AddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentButtonActionPerformed
    }//GEN-LAST:event_AddStudentButtonActionPerformed
    private void RemoveStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveStudentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveStudentButtonActionPerformed

    private void AddClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddClassButtonActionPerformed

    private void removeClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeClassButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeClassButtonActionPerformed

    private void EditClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditClassButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditClassButtonActionPerformed
*/
    
    
    
    public void updateList() {
        edums.DB db1 = new edums.DB("teste.bin");
       // edums.Class c = new edums.Class("A", "B", "C", 1, 2);
        s1 = db1.importData();
        Student.setIdTotal(s1.getStudents().size());
        edums.Class.setTotal(s1.getClasses().size());
        //CLASSES
        DefaultTableModel ClassesModel = (DefaultTableModel) ClassesList.getModel();
        ClassesModel.setRowCount(0);
        
        for(int i = 0; i < s1.getClasses().size();i++){
            Vector v = new Vector(6);
            
            v.addElement(s1.getClasses().get(i).getUnitDenomination());
            v.addElement(s1.getClasses().get(i).getTypeClass());
            v.addElement(s1.getClasses().get(i).getCurricularUnit());
            v.addElement(s1.getClasses().get(i).getId());
            v.addElement(s1.getClasses().get(i).getHoursPerClass());
            v.addElement(s1.getClasses().get(i).getClassesPerWeek());
            ClassesModel.addRow(v);
        }
        //STUDENTS
        DefaultTableModel StudentsModel = (DefaultTableModel) StudentsList.getModel();
        StudentsModel.setRowCount(0);
        /*for (int i = StudentsList.getRowCount();i>=0 ; i--) {
            System.out.println(""+StudentsList.getRowCount());
            StudentsModel.removeRow(i);
            
        }*/
        for(int i = 0; i < s1.getStudents().size();i++){
            Vector v = new Vector(3);
            
            v.addElement(s1.getStudents().get(i).getName());
            v.addElement(s1.getStudents().get(i).getBirthday());
            v.addElement(s1.getStudents().get(i).getId());
            StudentsModel.addRow(v);
        }
        
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
            java.util.logging.Logger.getLogger(EduMSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EduMSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EduMSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EduMSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EduMSFrame f = new EduMSFrame();
                f.setVisible(true);
                f.updateList();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClassButton;
    private javax.swing.JButton AddStudentButton;
    private javax.swing.JTable ClassesList;
    private javax.swing.JButton EditStudentButton;
    private javax.swing.JButton RemoveStudentButton;
    private javax.swing.JTable StudentsList;
    private javax.swing.JButton editClassButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton removeClassButton;
    // End of variables declaration//GEN-END:variables

    
}