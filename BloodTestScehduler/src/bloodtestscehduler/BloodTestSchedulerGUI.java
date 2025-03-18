/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestscehduler;

/**
 *
 * @author edvin
 */
public class BloodTestSchedulerGUI extends javax.swing.JFrame {

    /**
     * Creates new form BloodTestSchedulerGUI
     */
    public BloodTestSchedulerGUI() {
        initComponents();
        //initialize the ADTs
        queue = new MyPriorityQueue();
        noShows = new MyStack();
        waitingQueue = new MyQueue();

        //initialize hard coded patients
        initializePatients();
        simulateNoShows();

    }
    //declaring as class level variables 
    private MyPriorityQueue queue;
    private MyStack noShows;
    private MyQueue waitingQueue;

    private void initializePatients() {
        Patient patient1 = new Patient("John Doe", 30, "High", "Dr. Smith", true);
        Patient patient2 = new Patient("Jane Doe", 25, "Medium", "Dr. Johnson", false);
        Patient patient3 = new Patient("Alice", 40, "Low", "Dr. Brown", true);
        Patient patient4 = new Patient("Bob Johnson", 50, "High", "Dr. Lee", true);
        Patient patient5 = new Patient("Emily Davis", 22, "Low", "Dr. Patel", false);
        Patient patient6 = new Patient("Michael Brown", 35, "Medium", "Dr. Wilson", true);
        Patient patient7 = new Patient("Sarah Wilson", 28, "High", "Dr. Taylor", false);
        Patient patient8 = new Patient("David Miller", 45, "Low", "Dr. Anderson", true);

        queue.enqueue(patient1);
        queue.enqueue(patient2);
        queue.enqueue(patient3);
        queue.enqueue(patient4);
        queue.enqueue(patient5);
        queue.enqueue(patient6);
        queue.enqueue(patient7);
        queue.enqueue(patient8);

        //Add patients to the waiting queue
        waitingQueue.enqueue(patient1);
        waitingQueue.enqueue(patient2);
        waitingQueue.enqueue(patient3);
        waitingQueue.enqueue(patient4);
        waitingQueue.enqueue(patient5);
        waitingQueue.enqueue(patient6);
        waitingQueue.enqueue(patient7);
        waitingQueue.enqueue(patient8);
    }

    private void simulateNoShows() {
        Patient noShow1 = new Patient("No-Show 1", 30, "High", "Dr. Smith", true);
        Patient noShow2 = new Patient("No-Show 2", 25, "Medium", "Dr. Johnson", false);
        Patient noShow3 = new Patient("No-Show 3", 40, "Low", "Dr. Brown", true);
        Patient noShow4 = new Patient("No-Show 4", 50, "High", "Dr. Lee", true);
        Patient noShow5 = new Patient("No-Show 5", 22, "Low", "Dr. Patel", false);
        Patient noShow6 = new Patient("No-Show 6", 35, "Medium", "Dr. Wilson", true);

        addNoShow(noShow1);
        addNoShow(noShow2);
        addNoShow(noShow3);
        addNoShow(noShow4);
        addNoShow(noShow5);
        addNoShow(noShow6); //This will remove the oldest no-show (No-Show 1)
    }

    //Method to display the waiting queue
    private String displayWaitingQueue() {
        return waitingQueue.toString();
    }

    //Method to count patients in the waiting queue using recursion
    private int countPatientsInQueue() {
        return waitingQueue.countPatients();
    }

    //Method to add a no-show patient to the stack
    private void addNoShow(Patient patient) {
        if (noShows.size() >= 5) {
            noShows.pop(); // Remove the oldest no-show if the stack is full
        }
        noShows.push(patient); // Add the new no-show
    }

    //Method to display the last 5 no-shows
    private String displayNoShows() {
        return "Last 5 No-Shows:\n" + noShows.toString();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTa = new javax.swing.JTextArea();
        displayQBtn = new javax.swing.JButton();
        displayNoShowsBtn = new javax.swing.JButton();
        nextPatientBtn = new javax.swing.JButton();
        nuPatientsBtn = new javax.swing.JButton();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        displayTa.setColumns(20);
        displayTa.setRows(5);
        jScrollPane1.setViewportView(displayTa);

        displayQBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayQBtn.setText("Display Queue");
        displayQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayQBtnActionPerformed(evt);
            }
        });

        displayNoShowsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayNoShowsBtn.setText("Display No Shows");
        displayNoShowsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayNoShowsBtnActionPerformed(evt);
            }
        });

        nextPatientBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nextPatientBtn.setText("Next Patient");
        nextPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPatientBtnActionPerformed(evt);
            }
        });

        nuPatientsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nuPatientsBtn.setText("Display No. Patients");
        nuPatientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuPatientsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(displayQBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayNoShowsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextPatientBtn)
                        .addGap(18, 18, 18)
                        .addComponent(nuPatientsBtn)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayQBtn)
                    .addComponent(displayNoShowsBtn)
                    .addComponent(nextPatientBtn)
                    .addComponent(nuPatientsBtn))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayQBtnActionPerformed

        displayTa.setText(queue.printPQueue());
    }//GEN-LAST:event_displayQBtnActionPerformed

    private void nextPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPatientBtnActionPerformed
        //Dequeue the next patient and display their details
        if (!queue.isEmpty()) {
            Patient nextPatient = (Patient) queue.dequeue();
            displayTa.setText("Next Patient:\n" + nextPatient.toString());
        } else {
            displayTa.setText("No patients in the queue.");
        }
    }//GEN-LAST:event_nextPatientBtnActionPerformed

    private void displayNoShowsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayNoShowsBtnActionPerformed
        // TODO add your handling code here:
        displayTa.setText(displayNoShows());


    }//GEN-LAST:event_displayNoShowsBtnActionPerformed

    private void nuPatientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuPatientsBtnActionPerformed
        int count = countPatientsInQueue();
        displayTa.setText("Number of patients in the waiting queue: " + count);
    }//GEN-LAST:event_nuPatientsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodTestSchedulerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton displayNoShowsBtn;
    private javax.swing.JButton displayQBtn;
    private javax.swing.JTextArea displayTa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton nextPatientBtn;
    private javax.swing.JButton nuPatientsBtn;
    // End of variables declaration//GEN-END:variables
}
