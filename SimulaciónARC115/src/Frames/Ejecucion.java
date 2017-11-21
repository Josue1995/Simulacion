/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Frames;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import Registros.*;
import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Ejecucion extends javax.swing.JFrame {

    /**
     * Creates new form Ejecucion
     */
    public Ejecucion() {
        initComponents();
        this.setLocationRelativeTo(null);
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Img/fondo.jpg"));
        JLabel label = new JLabel();
        label.setIcon(imagen);
        getLayeredPane().add(label, JLayeredPane.FRAME_CONTENT_LAYER);
        label.setBounds(0, 0, imagen.getIconWidth(), imagen.getIconHeight());
        setResizable(false);
        setSize(1400,800);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        marField1 = new javax.swing.JTextField();
        mbrField1 = new javax.swing.JTextField();
        registerIR = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        acumulador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        accion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Menú");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(java.awt.Color.white);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Memory Address Register (MAR):");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Memory Buffer Register (MBR): ");

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Instruction Register (IR):");

        marField1.setEditable(false);
        marField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marField1ActionPerformed(evt);
            }
        });

        mbrField1.setEditable(false);
        mbrField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbrField1ActionPerformed(evt);
            }
        });

        registerIR.setEditable(false);
        registerIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerIRActionPerformed(evt);
            }
        });

        jButton2.setText("Iniciar simulación");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Borrar registros");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AC:");

        acumulador.setEditable(false);
        acumulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acumuladorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Accion en ejecución:");

        accion.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jButton2)
                        .addGap(77, 77, 77)
                        .addComponent(jButton3)
                        .addGap(82, 82, 82)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mbrField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerIR, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accion, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(marField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(acumulador, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(registerIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mbrField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(marField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(acumulador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(accion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.GRAY);
        g.fillRect(500, 50, 800, 600);
        g.setColor(Color.white);
        g.fillRect(1000, 100, 35, 550);
        g.fillRect(1070, 100, 35, 550);
        g.fillRect(1140, 100, 35, 550);
        g.setColor(Color.blue);
        g.drawString("BusDi", 1000, 90);
        g.drawString("BusD", 1070, 90);
        g.drawString("BusC", 1140, 90);
        g.setColor(Color.WHITE);
        g.fillRect(1200, 90, 95, 400);
        g.setColor(Color.black);
        g.drawString("Memoria P.", 1215, 102);
    }
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu m = new menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void marField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marField1ActionPerformed

    private void mbrField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbrField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbrField1ActionPerformed

    private void registerIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerIRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerIRActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Hilo h = new Hilo();
        h.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        marField1.setText("");
        mbrField1.setText("");
        registerIR.setText("");
        Graphics g2 = getGraphics();
        g2.setColor(Color.GRAY);
        g2.fillRect(500, 50, 800, 600);
        g2.setColor(Color.white);
        g2.fillRect(1000, 100, 35, 550);
        g2.fillRect(1070, 100, 35, 550);
        g2.fillRect(1140, 100, 35, 550);
        g2.setColor(Color.blue);
        g2.drawString("BusDi", 1000, 90);
        g2.drawString("BusD", 1070, 90);
        g2.drawString("BusC", 1140, 90);
        g2.setColor(Color.WHITE);
        g2.fillRect(1200, 90, 95, 400);
        g2.setColor(Color.black);
        g2.drawString("Memoria P.", 1215, 102);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void acumuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acumuladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acumuladorActionPerformed

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
            java.util.logging.Logger.getLogger(Ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejecucion().setVisible(true);
            }
        });
    }

    private class Hilo extends Thread{
        public void run(){
            MemoryBufferRegister mbr = new MemoryBufferRegister();
            MemoryAddressRegister mar = new MemoryAddressRegister();
            InstructionRegister ir = new InstructionRegister();
            MemoriaPrincipal mp = new MemoriaPrincipal();
            mp.setN(inicializar());
            AC ac = new AC();
            ProgramCounter pc = new ProgramCounter();
            String codOp = "";
            String dir = "";
            try {
                String s = registerIR.getText();
                for(int x = 0; x <= 3; x++){
                    codOp += s.charAt(x);
                }
                for(int y = 4; y<=15; y++){
                    dir += s.charAt(y);
                }
                switch(codOp){
                    case "0000":
                        
                        marField1.setText(dir);
                        Thread.sleep(3000);
                        
                        accion.setText("Sumar a AC el operando referenciado");                      
                        Thread.sleep(3000);
                        String auxDato = mp.buscar(ac.binarioDecimal(dir));                        
                        ac.incrementar(auxDato);
                        JOptionPane.showMessageDialog(null, ac.getDato());
                        acumulador.setText(ac.getDato());
                        Thread.sleep(3000);
                        
                        break;
                    case "0001":
                        marField1.setText(dir);
                        Thread.sleep(3000);
                        
                        accion.setText("Restar a AC el operando referenciado");                      
                        Thread.sleep(3000);
                        
                        ac.setDato(mp.buscar(ac.binarioDecimal(dir)));
                        JOptionPane.showMessageDialog(null, ac.getDato());
                        break;
                    case "0010":
                        marField1.setText(dir);
                        break;
                    case "0011":
                        marField1.setText(dir);
                        break;
                    case "0100":
                        marField1.setText(dir);
                        break;
                    case "0101":
                        marField1.setText(dir);
                        break;
                    case "0110":
                        marField1.setText(dir);
                        break;
                    case "0111":
                        marField1.setText(dir);
                        break;
                    case "1000":
                        marField1.setText(dir);
                        break;
                    case "1001":
                        marField1.setText(dir);
                        break;
                    case "1010":
                        marField1.setText(dir);
                        break;
                    case "1011":
                        marField1.setText(dir);
                        break;
                    case "1100":
                        marField1.setText(dir);
                        break;
                    case "1101":
                        marField1.setText(dir);
                        break;
                    case "1110":
                        marField1.setText(dir);
                        break;
                    case "1111":
                        marField1.setText(dir);
                        break;
                      
                }
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejecucion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    //***************************************MÉTODO PARA CARGAR MEMORIA****************************************************
    private ArrayList<String> inicializar(){
        ArrayList<String> array = new ArrayList<String>();
        
        File file = null;
        FileReader read = null;
        BufferedReader buff = null;
        
        try{
            file = new File("src/Datos/datos.txt");
            read = new FileReader(file);
            buff = new BufferedReader(read);
            String linea;
            while((linea = buff.readLine()) != null ){
                array.add(linea);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (null != read){
                    read.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        return array;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accion;
    private javax.swing.JTextField acumulador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField marField1;
    private javax.swing.JTextField mbrField1;
    public javax.swing.JTextField registerIR;
    // End of variables declaration//GEN-END:variables
}
