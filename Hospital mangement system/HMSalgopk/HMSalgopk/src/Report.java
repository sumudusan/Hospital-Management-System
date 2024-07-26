
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Manjitha Kaluarachch
 */
public class Report extends javax.swing.JFrame {
    ArrayList<Medicine> allMedicines = new ArrayList<>();
    ArrayList<BillingInfo> allRecord = new ArrayList<>();
    ArrayList<Patient> allPatients = new ArrayList<>();
    
    public Report() {
        initComponents();
        readAllMData();
        readAllPData();
        readAllRData();
    }
    
    
    void readAllPData(){
        try{
            File pfile = new File("pdata.txt");
            Scanner scanner = new Scanner(pfile);
                while (scanner.hasNextLine()){
                    String data = scanner.nextLine();
                    String[] curData = data.split(";");
                    Patient patient = new Patient();
                    patient.setId(Integer.parseInt(curData[0]));
                    patient.setName(curData[1]);
                    patient.setAge(Integer.parseInt(curData[2]));
                    patient.setGender(curData[3]);
                    patient.setAddress(curData[4]);
                    patient.setContact(curData[5]);
                    allPatients.add(patient);
                        
                    
                }
            scanner.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ID and Age must be integer");
        }
    }
    
     void readAllMData(){
        try{
            File pfile = new File("mdata.txt");
            Scanner scanner = new Scanner(pfile);
                while (scanner.hasNextLine()){
                    
                    String data = scanner.nextLine();
                    String[] curData = data.split(";");
                    Medicine medicines = new Medicine();
                    medicines.setId(Integer.parseInt(curData[0]));
                    
                    medicines.setName(curData[1]);
                    medicines.setSellingPrice(Integer.parseInt(curData[2]));
                    medicines.setBuyingPrice(Integer.parseInt(curData[3]));
                    medicines.setQuantity(Integer.parseInt(curData[4]));
                    medicines.setDescription(curData[5]);
                    allMedicines.add(medicines);
                        
                    
                }
            scanner.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ID and Age must be integer");
        }
    }
    
    
     void readAllRData(){
        try{
            File pfile = new File("records.txt");
            Scanner scanner = new Scanner(pfile);
                while (scanner.hasNextLine()){
                    
                    String data = scanner.nextLine();
                    String[] curData = data.split(";");
                    BillingInfo record = new BillingInfo();
                    record.setPatientID(Integer.parseInt(curData[0]));
                    
                    record.setFee(Integer.parseInt(curData[1]));
                    record.setRecomendations(curData[2]);
                    record.setDate((curData[3]));
                    
                    String []mlist = curData[4].split(",");
                    for(int i=0;i<mlist.length-1;i++){
                        record.setMedicineID(Integer.parseInt(mlist[i]));
                    }
                    
                    
                    allRecord.add(record);
                        
                    
                }
            scanner.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ID and Age must be integer");
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pr = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Report Menu");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pr.setColumns(20);
        pr.setRows(5);
        jScrollPane1.setViewportView(pr);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 0));
        jButton2.setText("Get Record");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Enter ID for Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(158, 158, 158)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    Patient getPData(int cid){
        for(int i=0;i<allPatients.size();i++)
        {
            if(allPatients.get(i).getId()==cid)
            {
                return allPatients.get(i);
            }
        }
        return null;
    }
    Medicine getMData(int cid){
        for(int i=0;i<allMedicines.size();i++){
            if(allMedicines.get(i).getId()==cid){
                return allMedicines.get(i);
            }
        }
        return null;
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(id.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Pleasse Enter ID");
        }
        else{
            for(int i=0;i<allRecord.size();i++){
                if(allRecord.get(i).getPatientID()== Integer.parseInt(id.getText())){
                    pr.append("\n\nPatient Info");
                    Patient patient =  getPData(allRecord.get(i).getPatientID());
                    
                    pr.append("Patient Name = "+patient.getName()+"\n");
                    
                     pr.append("Patient Contact = "+patient.getContact()+"\n");
                     pr.append("\n All Recomended Medicines\n");
                     ArrayList<Integer> tmp = allRecord.get(i).getMedicineID();
                     for(int j=0;j<tmp.size();j++){
                         Medicine medicine =getMData(tmp.get(j));
                         
                         pr.append(medicine.getName()+"\n");
                         
                     }
                     pr.append("\n Data "+allRecord.get(i).getDate());
                     pr.append("\n recomendation "+allRecord.get(i).getRecomendations());
                     pr.append("\n*******************************************************************\n");
                     
                     
                    
                    
                }
            }
        }
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pr;
    // End of variables declaration//GEN-END:variables
}
