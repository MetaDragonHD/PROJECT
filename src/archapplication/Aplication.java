/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package archapplication;

import java.awt.BorderLayout;
import java.awt.PopupMenu;
import javax.swing.JPanel;

/**
 *
 * @author loslo
 */
public class Aplication extends javax.swing.JFrame {


    /**
     * Creates new form Aplication
     */
    public Aplication() {
        initComponents();
        
       proyects pro = new proyects();
       pro.setSize(598, 403);
       pro.setLocation(0, 0);
       
       contenet.removeAll();
       contenet.add(pro, BorderLayout.CENTER);
       contenet.revalidate();
       contenet.repaint();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        proyectos = new javax.swing.JLabel();
        empleados = new javax.swing.JLabel();
        facturas = new javax.swing.JLabel();
        sub_con = new javax.swing.JLabel();
        servicios = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        contenet = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        proyectos.setForeground(new java.awt.Color(255, 255, 255));
        proyectos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proyectos.setText("Proyects ");
        proyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proyectosMouseClicked(evt);
            }
        });
        getContentPane().add(proyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 190, -1));

        empleados.setForeground(new java.awt.Color(255, 255, 255));
        empleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empleados.setText("Employees ");
        empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empleadosMouseClicked(evt);
            }
        });
        getContentPane().add(empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, -1));

        facturas.setForeground(new java.awt.Color(255, 255, 255));
        facturas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facturas.setText("Invoices");
        facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturasMouseClicked(evt);
            }
        });
        getContentPane().add(facturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 190, -1));

        sub_con.setBackground(new java.awt.Color(255, 255, 255));
        sub_con.setForeground(new java.awt.Color(255, 255, 255));
        sub_con.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub_con.setText("Subcontractor");
        sub_con.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sub_conMouseClicked(evt);
            }
        });
        getContentPane().add(sub_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 190, -1));

        servicios.setForeground(new java.awt.Color(255, 255, 255));
        servicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        servicios.setText("Services");
        servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviciosMouseClicked(evt);
            }
        });
        getContentPane().add(servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backGround6.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("StoneBrickManager");

        javax.swing.GroupLayout contenetLayout = new javax.swing.GroupLayout(contenet);
        contenet.setLayout(contenetLayout);
        contenetLayout.setHorizontalGroup(
            contenetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenetLayout.setVerticalGroup(
            contenetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(729, Short.MAX_VALUE))
                    .addComponent(contenet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 960, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void proyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proyectosMouseClicked
      proyects pro = new proyects();
       pro.setSize(948, 484);
       pro.setLocation(0, 0);
       
       contenet.removeAll();
       contenet.add(pro, BorderLayout.CENTER);
       contenet.revalidate();
       contenet.repaint();
      
    }//GEN-LAST:event_proyectosMouseClicked

    private void empleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosMouseClicked
       Employees em = new Employees();
       em.setSize(948, 484);
       em.setLocation(0, 0);
       
       contenet.removeAll();
       contenet.add(em, BorderLayout.CENTER);
       contenet.revalidate();
       contenet.repaint();
    }//GEN-LAST:event_empleadosMouseClicked

    private void facturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasMouseClicked
       Invoices in = new Invoices();
       in.setSize(948, 484);
       in.setLocation(0, 0);
       
       contenet.removeAll();
       contenet.add(in, BorderLayout.CENTER);
       contenet.revalidate();
       contenet.repaint();
    }//GEN-LAST:event_facturasMouseClicked

    private void sub_conMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub_conMouseClicked
       Subcontractor sub = new Subcontractor();
       sub.setSize(948, 484);
       sub.setLocation(0, 0);
       
       contenet.removeAll();
       contenet.add(sub, BorderLayout.CENTER);
       contenet.revalidate();
       contenet.repaint();
    }//GEN-LAST:event_sub_conMouseClicked

    private void serviciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviciosMouseClicked
        Services ser = new Services();
       ser.setSize(948, 484);
       ser.setLocation(0, 0);
       
       contenet.removeAll();
       contenet.add(ser, BorderLayout.CENTER);
       contenet.revalidate();
       contenet.repaint();
    }//GEN-LAST:event_serviciosMouseClicked

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
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenet;
    private javax.swing.JLabel empleados;
    private javax.swing.JLabel facturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel proyectos;
    private javax.swing.JLabel servicios;
    private javax.swing.JLabel sub_con;
    // End of variables declaration//GEN-END:variables
}
