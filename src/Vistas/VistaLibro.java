package Vistas;

import Modelo.Libro;
import Modelo.export_excel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class VistaLibro extends javax.swing.JFrame {
    private final DefaultTableModel  modelo1;

    private final String Datos[][] = {};
    private final String[] Encabezado1 = {"Editorial", "Título", "Precio", "Unidad", "SubTotal"};

    private JFileChooser FileChooser = new JFileChooser();
    private Vector columna = new Vector();
    private Vector filas = new Vector();
    private static int tabla_ancho = 0;
    private static int tabla_alto = 0;
    
    public VistaLibro() {
        initComponents();
        modelo1 = new DefaultTableModel(Datos, Encabezado1);
        jTable1.setModel(modelo1);
    
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnEliminar = new javax.swing.JButton();
        BtnTotal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();
        ExportarTabla = new javax.swing.JButton();
        ImportarTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Editorial");

        jLabel2.setText("Título");

        jLabel3.setText("Precio");

        txtEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialActionPerformed(evt);
            }
        });

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Agregar Libro");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnTotal.setText("Calcular Total");
        BtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTotalActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad");

        txtUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadActionPerformed(evt);
            }
        });

        ExportarTabla.setText("Exportar");
        ExportarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarTablaActionPerformed(evt);
            }
        });

        ImportarTabla.setText("Importar");
        ImportarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtTitulo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtEditorial))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 74, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)
                                .addComponent(txtUnidad)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnTotal)
                        .addGap(18, 18, 18)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExportarTabla)
                        .addGap(18, 18, 18)
                        .addComponent(ImportarTabla)
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnGuardar)
                            .addComponent(BtnEliminar)
                            .addComponent(BtnTotal)
                            .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExportarTabla)
                            .addComponent(ImportarTabla)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        Libro libro = new Libro(txtEditorial.getText(), txtTitulo.getText(), Double.parseDouble(txtPrecio.getText()), Integer.parseInt(txtUnidad.getText()));
        String[] Datos = {libro.getEditorial(), libro.getTitulo(), String.valueOf(libro.getPrecio()), String.valueOf(libro.getUnidad()), String.valueOf(libro.getPrecio()*libro.getUnidad())};
        modelo1.addRow(Datos);
        txtEditorial.setText("");
        txtTitulo.setText("");
        txtPrecio.setText("");
        txtUnidad.setText("");
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void txtEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialActionPerformed
        
    }//GEN-LAST:event_txtEditorialActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int s = jTable1.getSelectedRow();
        if(s==-1) 
           JOptionPane.showMessageDialog(this,"Por favor seleccione una fila."); 
        else modelo1.removeRow(s); 
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void txtUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadActionPerformed

    private void BtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTotalActionPerformed
        double precio = 0;
        for(int i=0; i<modelo1.getRowCount(); ++i)
            precio += Double.parseDouble( (String) modelo1.getValueAt(i, 2) ) * Double.parseDouble( (String) modelo1.getValueAt(i, 3) );
        lbl.setText(precio+"");
    
    }//GEN-LAST:event_BtnTotalActionPerformed

    private void ExportarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarTablaActionPerformed
        JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(VistaLibro.this);

        if (opcion == JFileChooser.APPROVE_OPTION) {

            File dir = dialog.getSelectedFile();

            try {
                List<JTable> tb = new ArrayList<JTable>();
                tb.add(jTable1);
                //-------------------
                export_excel excelExporter = new export_excel(tb, new File(dir.getAbsolutePath() + ".xls"));
                if (excelExporter.export()) {
                    JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_ExportarTablaActionPerformed

    private void ImportarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportarTablaActionPerformed
         FileChooser.showDialog(null, "Importar Hoja ");
        File file = FileChooser.getSelectedFile();
        if (!file.getName().endsWith("xls")) {

            JOptionPane.showMessageDialog(null, "Seleccione un archivo excel...", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                CrearTabla(file); //a nuestro metodo CrearTabla le enviamos el file
            } catch (IOException ex) {
                Logger.getLogger(VistaLibro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ImportarTablaActionPerformed
    
    public void CrearTabla(File file) throws IOException {

        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(file);

            Sheet sheet = workbook.getSheet(0);
            columna.clear();

            for (int i = 0; i < sheet.getColumns(); i++) {
                Cell cell1 = sheet.getCell(i, 0);
                columna.add(cell1.getContents());
            }
            filas.clear();

            for (int j = 1; j < sheet.getRows(); j++) {

                Vector d = new Vector();

                for (int i = 0; i < sheet.getColumns(); i++) {

                    Cell cell = sheet.getCell(i, j);
                    d.add(cell.getContents());
                }
                d.add("\n");
                //filas.add(d);
                modelo1.addRow(d);
            }

        } catch (BiffException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VistaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnTotal;
    private javax.swing.JButton ExportarTabla;
    private javax.swing.JButton ImportarTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUnidad;
    // End of variables declaration//GEN-END:variables
}
