/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7_GuillermoEspinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() throws FileNotFoundException {
        initComponents();
        CargarBebidas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_add = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rb_azul = new javax.swing.JRadioButton();
        rb_rojo = new javax.swing.JRadioButton();
        rb_blanco = new javax.swing.JRadioButton();
        rb_verde = new javax.swing.JRadioButton();
        rb_amarillo = new javax.swing.JRadioButton();
        tf_nombre = new javax.swing.JTextField();
        rb_no = new javax.swing.JRadioButton();
        rb_si = new javax.swing.JRadioButton();
        tf_precio = new javax.swing.JTextField();
        tf_alcohol = new javax.swing.JTextField();
        tf_codigo = new javax.swing.JTextField();
        tf_marca = new javax.swing.JTextField();
        tf_cant = new javax.swing.JTextField();
        tf_azucar = new javax.swing.JTextField();
        tf_num = new javax.swing.JTextField();
        bt_agregar = new javax.swing.JButton();
        tf_fecha = new javax.swing.JFormattedTextField();
        bg_nacional = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_op = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("Nombre :");

        jLabel2.setText("Numero de Lote:");

        jLabel3.setText("Nombre de la marca :");

        jLabel4.setText("Cantidad");

        jLabel5.setText("Fecha de vencimiento: ");

        jLabel6.setText("Nacional: ");

        jLabel7.setText("Precio: ");

        jLabel8.setText("Colorantes :");

        jLabel9.setText("Codigo:");

        jLabel10.setText("Cantidad de azucar: ");

        jLabel11.setText("Cantidad de alcohol: ");

        rb_azul.setText("Azul-4");

        rb_rojo.setText("Rojo-69");

        rb_blanco.setText("Blanco-07");

        rb_verde.setText("Verde-420");

        rb_amarillo.setText("Amarillo -77");

        bg_nacional.add(rb_no);
        rb_no.setText("No");

        bg_nacional.add(rb_si);
        rb_si.setText("Si");

        bt_agregar.setText("Agregar");
        bt_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarMouseClicked(evt);
            }
        });

        try {
            tf_fecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jd_addLayout = new javax.swing.GroupLayout(jd_add.getContentPane());
        jd_add.getContentPane().setLayout(jd_addLayout);
        jd_addLayout.setHorizontalGroup(
            jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_addLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_addLayout.createSequentialGroup()
                        .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_addLayout.createSequentialGroup()
                                .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_addLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jd_addLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_num, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jd_addLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_si)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_no)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_addLayout.createSequentialGroup()
                                .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jd_addLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_addLayout.createSequentialGroup()
                                        .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jd_addLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jd_addLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jd_addLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(174, 174, 174))
                    .addGroup(jd_addLayout.createSequentialGroup()
                        .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jd_addLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_alcohol))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_addLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rb_azul)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rb_verde)))
                            .addGroup(jd_addLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_azucar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_addLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_amarillo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_blanco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_rojo)
                                .addContainerGap(174, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_addLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))))))
        );
        jd_addLayout.setVerticalGroup(
            jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_addLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_no)
                    .addComponent(rb_si))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_azul)
                    .addComponent(rb_verde)
                    .addComponent(rb_amarillo)
                    .addComponent(rb_blanco)
                    .addComponent(rb_rojo))
                .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_addLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_azucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_alcohol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_addLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        mn_op.setText("OPciones");

        jMenuItem1.setText("Agregar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mn_op.add(jMenuItem1);

        jMenu1.setText("Modificar");
        mn_op.add(jMenu1);

        jMenuItem2.setText("Eliminar");
        mn_op.add(jMenuItem2);

        jMenuBar1.add(mn_op);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarMouseClicked
     
        try {
            int codigo = Integer.parseInt(tf_codigo.getText());
            String marca = tf_marca.getText();
            String nombre = tf_marca.getText();
            String fecha = tf_fecha.getText();
            double precio = Double.parseDouble(tf_precio.getText());
            int cant = Integer.parseInt(tf_cant.getText());
            String nacional = "";
            if (rb_si.isSelected()) {
                nacional = "si";
            } else if (rb_no.isSelected()) {
                nacional = "no";
            }
            
            int lote = Integer.parseInt(tf_num.getText());
            
            String colorantes = "";
            if (rb_azul.isSelected()) {
                colorantes += "Azul-4 ";
            }
            if (rb_amarillo.isSelected()) {
                colorantes += "Amarillo-77 ";
            }
            if (rb_blanco.isSelected()) {
                colorantes += "Blanco-07 ";
            }
            if (rb_rojo.isSelected()) {
                colorantes += "Rojo-69 ";
            }
            if (rb_verde.isSelected()) {
                colorantes += "Verde-420 ";
            }
            int azucar = Integer.parseInt(tf_azucar.getText());
            Double alcohol = Double.parseDouble(tf_alcohol.getText());
            
            boolean exist =false;
            for (int i = 0; i < bebidas.size(); i++) {
                if (bebidas.get(i).getCodigo()==codigo) {
                    exist=true;
                }
            }
            if (exist == true) {
                JOptionPane.showMessageDialog(this, "Nose puede crear la bebida porque ya existe un producto con ese codigo");
            }
            if (exist==false){
                SimpleDateFormat sf=new SimpleDateFormat("dd/MM/yyyy");
                    Date date = sf.parse(fecha);
                
                Bebida bebida = new Bebida(codigo, marca, nombre, azucar, alcohol, nacional, lote, colorantes, precio, cant, date);
                JOptionPane.showMessageDialog(this, "Se creo la bebida");
                FileWriter fw = new FileWriter("./bebidas.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(codigo+";"+marca+";"+nombre+";"+azucar+";"+alcohol+";"+nacional+";"+lote+";"+colorantes+";"+precio+";"+cant+";"+date+";");
                /*bw.write(nombre+";");
                bw.write(contra+";");
                bw.write(roll+";");*/
                bw.flush();
            }
            
            
            
            
            
            
            
            
            
        } catch (NumberFormatException numberFormatException) {
            
        } catch (ParseException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bt_agregarMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       jd_add.setModal(true);
       jd_add.pack();
       jd_add.setEnabled(true);
       jd_add.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
 public   void CargarBebidas() throws FileNotFoundException{
        try {
            File file =new File("./bebidas.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
           // Scanner sc = new Scanner(file);
            String linea="";
            System.out.println("estoy aqui antes del while");
            //de que forma metemos los usuarios?? well opino que sea tipo "id;nombre;contra;tipo
            while ((linea = br.readLine()) != null){
                System.out.println("Linea "+linea);
                String[] datos = linea.split(";");
                //System.out.println(datos.length);
                for (int i = 0; i < datos.length; i++) {
                System.out.println(datos[i]);
                }
                 SimpleDateFormat sf=new SimpleDateFormat("dd/MM/yy");
                 Date date = sf.parse(datos[10]);
                
                Bebida bebida = new Bebida(Integer.parseInt(datos[0]),datos[1],datos[2], Integer.parseInt(datos[3]), (Double.parseDouble(datos[4])), datos[5],Integer.parseInt(datos[6]),datos[7], Double.parseDouble(datos[8]), Integer.parseInt(datos[9]),date);
                bebidas.add(bebida);
            }
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_nacional;
    private javax.swing.JButton bt_agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JDialog jd_add;
    private javax.swing.JMenu mn_op;
    private javax.swing.JRadioButton rb_amarillo;
    private javax.swing.JRadioButton rb_azul;
    private javax.swing.JRadioButton rb_blanco;
    private javax.swing.JRadioButton rb_no;
    private javax.swing.JRadioButton rb_rojo;
    private javax.swing.JRadioButton rb_si;
    private javax.swing.JRadioButton rb_verde;
    private javax.swing.JTextField tf_alcohol;
    private javax.swing.JTextField tf_azucar;
    private javax.swing.JTextField tf_cant;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JFormattedTextField tf_fecha;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_num;
    private javax.swing.JTextField tf_precio;
    // End of variables declaration//GEN-END:variables
ArrayList<Bebida> bebidas = new ArrayList();
    
    
}
