/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package habib_046_b;

/**
 *
 * @author Ahmad Habib
 */
import javax.swing.JOptionPane;
import java.io.*;

public class soal_pg_dan_esay extends javax.swing.JFrame {
static int benar = 0;
static int flag = 0;
public void kirimjawaban(){
String jawaban1;
String jawaban2;
String jawaban3;
String jawaban4;
String idsiswa = nama.getText();

if(umar.isSelected()){
jawaban1 ="umar";
}else if(abubakar.isSelected()){
jawaban1 = "abubakar";
}else{
jawaban1 ="";
}
if(komunisme.isSelected()){
jawaban2 = "komunisme";
}else if(kapitalisme.isSelected()){
jawaban2 = "kapitalisme";
}else{
jawaban2 = "";
}
if(sekuler.isSelected()){
jawaban3 = "sekuler";
}else if(matrealis.isSelected()){
jawaban3 = "matrealis";
}else{
jawaban3 = "";
}
if(alfatih.isSelected()){
jawaban4 = "alfatih";
}else if(thariq.isSelected()){
jawaban4 = "thariq";
}else{
jawaban4 = "";
}


jawaban aaa = new jawaban(jawaban1, jawaban2, jawaban3, jawaban4);
try{
FileOutputStream fos = new FileOutputStream("C:\\KULIAH\\PELAJARAN KULIAH SEMESTER 4\\dataujian\\"+idsiswa+".txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(aaa);
oos.flush();
}catch(Exception e){
JOptionPane.showMessageDialog(null, e);
dispose();
}
}

public class Timer1 implements Runnable{
@Override
public void run(){
try{
Thread.sleep(120000);
kirimjawaban();
if(flag == 0){
JOptionPane.showMessageDialog(null, "waktu habis ,jawaban akan dikirim ke pak habib 046");
}
}catch(InterruptedException ie){
JOptionPane.showMessageDialog(null, ie);
}
}
}

public class Timer2 implements Runnable{
@Override
public void run(){
for(int i = 1;i>-1;i--){
for(int j = 59;j >0;j--){
try{
Thread.sleep(1000);
sisawaktu.setText("waktu anda tersisa 0"+i+":"+j+" detik ");
}catch(InterruptedException ie){
JOptionPane.showMessageDialog(null, ie);
}
}
}
}
}
    /**
     * Creates new form soal_pg_dan_esay
     */
    public soal_pg_dan_esay() {
        initComponents();
Thread a = new Thread(new Timer1());
Thread b = new Thread(new Timer2());
a.start();
b.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        umar = new javax.swing.JRadioButton();
        abubakar = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        komunisme = new javax.swing.JRadioButton();
        kapitalisme = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        sekuler = new javax.swing.JRadioButton();
        matrealis = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        alfatih = new javax.swing.JRadioButton();
        thariq = new javax.swing.JRadioButton();
        finish = new javax.swing.JButton();
        sisawaktu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("kuiss sejarah");

        jLabel2.setText("nama  = ");

        jLabel3.setText("jawablah soal pilihan ganda berikut");

        jLabel4.setText("1. siapakah kholifah pertama pengganti rasulullah ? ");

        umar.setText("umar bin khatab");
        umar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umarActionPerformed(evt);
            }
        });

        abubakar.setText("abu bakar");

        jLabel5.setText("2. karl max adalah salah satu pemikir pada ide  ?");

        komunisme.setText("komunisme");

        kapitalisme.setText("kapitalisme");

        jLabel6.setText("3. ide pemisahan agama dari aturan publik ? ");

        sekuler.setText("sekulerisme");

        matrealis.setText("materialisme");

        jLabel7.setText("4. siapakah panglima muslim pembebas spanyol ? ");

        alfatih.setText("muhammad al fatih ");

        thariq.setText("thariq bin ziyad");

        finish.setText("finish");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        sisawaktu.setText("sisa waktu : 02.00 menit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(umar)
                        .addGap(40, 40, 40)
                        .addComponent(abubakar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(komunisme)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kapitalisme))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(sekuler)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(matrealis))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(alfatih)
                        .addGap(18, 18, 18)
                        .addComponent(thariq)))
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(finish)
                                .addGap(65, 65, 65))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sisawaktu)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(umar)
                    .addComponent(abubakar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(komunisme)
                    .addComponent(kapitalisme))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sekuler)
                    .addComponent(matrealis))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alfatih)
                    .addComponent(thariq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finish)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sisawaktu)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void umarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umarActionPerformed

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        // TODO add your handling code here:
flag = 1;
kirimjawaban();
JOptionPane.showMessageDialog(null,"jawaban dikirim ke pak habib ");
System.exit(0);
    }//GEN-LAST:event_finishActionPerformed

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
            java.util.logging.Logger.getLogger(soal_pg_dan_esay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(soal_pg_dan_esay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(soal_pg_dan_esay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(soal_pg_dan_esay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new soal_pg_dan_esay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abubakar;
    private javax.swing.JRadioButton alfatih;
    private javax.swing.JButton finish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton kapitalisme;
    private javax.swing.JRadioButton komunisme;
    private javax.swing.JRadioButton matrealis;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton sekuler;
    private javax.swing.JLabel sisawaktu;
    private javax.swing.JRadioButton thariq;
    private javax.swing.JRadioButton umar;
    // End of variables declaration//GEN-END:variables
}
