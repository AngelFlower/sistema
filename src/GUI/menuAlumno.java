/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.pInicio.ContenedorInicio;
import static GUI.pInicio.MenuMain;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author angel
 */
public class menuAlumno extends javax.swing.JPanel {
    
    /**
     * Creates new form pMenuAlmno
     */
    public menuAlumno() {
        initComponents();
        InitValues();
    }
    private void InitValues(){
        btnInicio.setName("false");
        btnCambios.setName("true");
        btnAltas.setName("false");
        btnBajas.setName("false");
        btnBuscar.setName("false");
        pIniciemos iniciemos = new pIniciemos();
        ContenedorInicio.add(iniciemos,GridLayout.class);
        ContenedorInicio.revalidate();
        ContenedorInicio.repaint();
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
        btnInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAltas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCambios = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBajas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setOpaque(false);

        jPanel1.setOpaque(false);

        btnInicio.setBackground(new java.awt.Color(27, 145, 199));
        btnInicio.setOpaque(false);
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(246, 246, 246));
        jLabel1.setText("Inicio");

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setForeground(new java.awt.Color(246, 246, 246));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user(1).png"))); // NOI18N

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnAltas.setBackground(new java.awt.Color(27, 145, 199));
        btnAltas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAltas.setOpaque(false);
        btnAltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAltasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAltasMouseEntered(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(246, 246, 246));
        jLabel3.setText("Altas");

        jLabel4.setBackground(new java.awt.Color(250, 250, 250));
        jLabel4.setForeground(new java.awt.Color(246, 246, 246));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login.png"))); // NOI18N

        javax.swing.GroupLayout btnAltasLayout = new javax.swing.GroupLayout(btnAltas);
        btnAltas.setLayout(btnAltasLayout);
        btnAltasLayout.setHorizontalGroup(
            btnAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAltasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAltasLayout.setVerticalGroup(
            btnAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        btnCambios.setBackground(new java.awt.Color(27, 145, 199));
        btnCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCambiosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCambiosMouseEntered(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(246, 246, 246));
        jLabel5.setText("Cambios");

        jLabel6.setBackground(new java.awt.Color(250, 250, 250));
        jLabel6.setForeground(new java.awt.Color(246, 246, 246));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home.png"))); // NOI18N

        javax.swing.GroupLayout btnCambiosLayout = new javax.swing.GroupLayout(btnCambios);
        btnCambios.setLayout(btnCambiosLayout);
        btnCambiosLayout.setHorizontalGroup(
            btnCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCambiosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        btnCambiosLayout.setVerticalGroup(
            btnCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        btnBajas.setBackground(new java.awt.Color(27, 145, 199));
        btnBajas.setOpaque(false);
        btnBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBajasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBajasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBajasMouseEntered(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(246, 246, 246));
        jLabel7.setText("Bajas");

        jLabel8.setBackground(new java.awt.Color(250, 250, 250));
        jLabel8.setForeground(new java.awt.Color(246, 246, 246));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit(2).png"))); // NOI18N

        javax.swing.GroupLayout btnBajasLayout = new javax.swing.GroupLayout(btnBajas);
        btnBajas.setLayout(btnBajasLayout);
        btnBajasLayout.setHorizontalGroup(
            btnBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBajasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnBajasLayout.setVerticalGroup(
            btnBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        btnBuscar.setBackground(new java.awt.Color(27, 145, 199));
        btnBuscar.setOpaque(false);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(246, 246, 246));
        jLabel9.setText("Buscar");

        jLabel10.setBackground(new java.awt.Color(250, 250, 250));
        jLabel10.setForeground(new java.awt.Color(246, 246, 246));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit(2).png"))); // NOI18N

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBajas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    void PanelSelectReset(JPanel panel){
        btnInicio.setName("false");
        btnInicio.setOpaque(false);
        btnCambios.setName("false");
        btnCambios.setOpaque(false);
        btnAltas.setName("false");
        btnAltas.setOpaque(false);
        btnBajas.setName("false");
        btnBajas.setOpaque(false);
        btnBuscar.setName("false");
        btnBuscar.setOpaque(false);
        panel.setName("true");
        panel.setOpaque(true);
        this.repaint();
    }
    void EnteredMousePanel(JPanel panel){
        if(panel.getName().equals("false"))
            panel.setOpaque(true);
        this.repaint();
    }
    void ExitedMousePanel(JPanel panel){
        if(panel.getName().equals("false"))
            panel.setOpaque(false);
        this.repaint();
    }
    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        PanelSelectReset(btnInicio);
        pIniciemos usuario = new pIniciemos();
        ContenedorInicio.removeAll();
        ContenedorInicio.add(usuario,GridLayout.class);
        ContenedorInicio.revalidate();
        ContenedorInicio.repaint();
        menuInicio menu = new menuInicio();
        MenuMain.removeAll();
        MenuMain.add(menu,GridLayout.class);
        MenuMain.revalidate();
        MenuMain.repaint();
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        ExitedMousePanel(btnInicio);
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        EnteredMousePanel(btnInicio);
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnAltasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltasMouseClicked
        PanelSelectReset(btnAltas);
        pAlumnoAltas entrada = new pAlumnoAltas();
        ContenedorInicio.removeAll();
        ContenedorInicio.add(entrada,GridLayout.class);
        ContenedorInicio.revalidate();
        ContenedorInicio.repaint();
    }//GEN-LAST:event_btnAltasMouseClicked

    private void btnAltasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltasMouseExited
        ExitedMousePanel(btnAltas);
    }//GEN-LAST:event_btnAltasMouseExited

    private void btnAltasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltasMouseEntered
        EnteredMousePanel(btnAltas);
    }//GEN-LAST:event_btnAltasMouseEntered

    private void btnCambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiosMouseClicked
        PanelSelectReset(btnCambios);
        pAlumnoCambios CambiosAlumno = new pAlumnoCambios();
        ContenedorInicio.removeAll();
        ContenedorInicio.add(CambiosAlumno,GridLayout.class);
        ContenedorInicio.revalidate();
        ContenedorInicio.repaint();
    }//GEN-LAST:event_btnCambiosMouseClicked

    private void btnCambiosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiosMouseExited
        ExitedMousePanel(btnCambios);
    }//GEN-LAST:event_btnCambiosMouseExited

    private void btnCambiosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiosMouseEntered
        EnteredMousePanel(btnCambios);
    }//GEN-LAST:event_btnCambiosMouseEntered

    private void btnBajasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajasMouseClicked
        PanelSelectReset(btnBajas);
        pAlumnoBajas salida = new pAlumnoBajas();
        ContenedorInicio.removeAll();
        ContenedorInicio.add(salida,GridLayout.class);
        ContenedorInicio.revalidate();
        ContenedorInicio.repaint();
    }//GEN-LAST:event_btnBajasMouseClicked

    private void btnBajasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajasMouseExited
        ExitedMousePanel(btnBajas);
    }//GEN-LAST:event_btnBajasMouseExited

    private void btnBajasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajasMouseEntered
        EnteredMousePanel(btnBajas);
    }//GEN-LAST:event_btnBajasMouseEntered

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        PanelSelectReset(btnBuscar);
        pAlumnoAltas alumnos = new pAlumnoAltas();
        ContenedorInicio.removeAll();
        ContenedorInicio.add(alumnos,GridLayout.class);
        ContenedorInicio.revalidate();
        ContenedorInicio.repaint();
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        ExitedMousePanel(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        EnteredMousePanel(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAltas;
    private javax.swing.JPanel btnBajas;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnCambios;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
