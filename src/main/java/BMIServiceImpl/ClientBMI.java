
package BMIServiceImpl;
import java.rmi.Naming;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
public class ClientBMI extends javax.swing.JFrame {
    private BMIService bmiService;

    public ClientBMI() {
        super("BMI Calculator");

        try {
            bmiService = (BMIService) Naming.lookup("rmi://localhost:1099/BMIService");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error connecting to the BMI server.");
            System.exit(1);
        }

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        h1 = new javax.swing.JTextField();
        h2 = new javax.swing.JTextField();
        we = new javax.swing.JTextField();
        bm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        massage = new javax.swing.JScrollPane();
        text = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BMI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 310, 140, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\lab report\\JavaApplication26\\BMI.PNG")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 220, 930, 70);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 20, 90, 0);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Your Height:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 30, 130, 40);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Your Weight:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 100, 130, 24);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Your BMI:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 170, 90, 24);

        h1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(h1);
        h1.setBounds(150, 40, 130, 30);

        h2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(h2);
        h2.setBounds(350, 40, 140, 30);

        we.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(we);
        we.setBounds(150, 100, 120, 30);

        bm.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(bm);
        bm.setBounds(150, 170, 150, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Kg");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 100, 40, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("feet");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 40, 40, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("inches");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(500, 40, 70, 30);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Kg/m^2");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(320, 170, 70, 30);

        massage.setBackground(new java.awt.Color(255, 255, 255));
        massage.setForeground(new java.awt.Color(255, 255, 255));

        text.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        massage.setViewportView(text);

        jPanel1.add(massage);
        massage.setBounds(560, 50, 380, 170);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try{
        int feet,inch;
        feet = Integer.parseInt(h1.getText());
        inch = Integer.parseInt(h2.getText());
        double  weigh = Double.parseDouble(we.getText());
       double height=(double)((feet*12)+inch)*0.0254; 
        try{
       if(height<=0||weigh<=0)
           throw new IllegalArgumentException();
       else
       {
         double bmi=weigh/Math.pow(height, 2);
        DecimalFormat df = new DecimalFormat("#.##");
        bm.setText(""+df.format(bmi));
        double nw=(24.9*Math.pow(height, 2));
        double bw=(18.5*Math.pow(height, 2));
        
        if(bmi<=18.4)
        {
            text.setText("Underweight\n BMI of less than 18.5\n" +
"A BMI of less than 18.5 indicates that you are underweight, so you may need to put on some weight. You are recommended to ask your Doctor or a dietician for advice\nYour minimun healthy weight : "+df.format(bw)+"Kg"+"\nYou need to increase your weight : "+df.format(bw-weigh)+"Kg");
        }
        else if(bmi>=18.5&&bmi<=24.9)
        {
            text.setText("Normal\n BMI of 18.5 - 24.9\n" +
"A BMI of 18.5 - 24.9 indicates that you are at a healthy weight for your height. By maintaining a healthy weight, you lower your risk of developing serious health problems.");
        }
        else if(bmi>=25.0&&bmi<=29.9)
        {
            text.setText("Overweight\nBMI of 25 - 29.9\n" +
"A BMI of 25 - 29.9 indicates that you are slightly overweight. You may be advised to lose some weight for health reasons. You are recommended to talk to your Doctor or a dietician for advice.\nYour maximum healthy weight : "+df.format(nw)+"Kg"+"\nYou need to decrease your weight : "+df.format(weigh-nw)+"Kg");
        }
        else if(bmi>=30.0&&bmi<=34.9)
        {
            text.setText("Moderately Obese\nBMI of 30 - 34.9\n" +
"A BMI of over 30 indicates that you are moderately obese (classification of class 1 obese). Your health may be at risk if you do not lose weight. You are recommended to talk to your Doctor or a dietician for advice. .\nYour maximum healthy weight : "+df.format(nw)+"Kg"+"\nYou need to decrease your weight : "+df.format(weigh-nw)+"Kg");
        }
        else if(bmi>=35.0&&bmi<=39.9)
        {
            text.setText("Severely obese\n BMI of 35 - 39.9\n" +
"A BMI of over 35 indicates that you are severely obese (classification of class 2 obese). Your health may be at risk if you do not lose weight. You are recommended to talk to your Doctor or a dietician for advice.\nYour maximum healthy weight : "+df.format(nw)+"Kg"+"\nYou need to decrease your weight : "+df.format(weigh-nw)+"Kg");
        }
        else if(bmi>=40.0)
        {
            text.setText("Morbidly Obese\nBMI of over 40\n" +
"A BMI of over 40 indicates that you are very severely obese (classification of class 3 obese). Your health may be at risk if you do not lose weight. You are recommended to talk to your Doctor or a dietician for advice.\nYour maximum healthy weight : "+df.format(nw)+"Kg"+"\nYou need to decrease your weight : "+df.format(weigh-nw)+"Kg");
        }}}
         catch(IllegalArgumentException e)
       {
           JOptionPane.showMessageDialog(rootPane, "Syntax Error", "Error!", JOptionPane.ERROR_MESSAGE);
           
       }}
       catch(IllegalArgumentException e)
       {
           JOptionPane.showMessageDialog(rootPane, "Syntax Error", "Error!", JOptionPane.ERROR_MESSAGE);
           
       }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClientBMI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bm;
    private javax.swing.JTextField h1;
    private javax.swing.JTextField h2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane massage;
    private javax.swing.JTextPane text;
    private javax.swing.JTextField we;
    // End of variables declaration//GEN-END:variables
}
