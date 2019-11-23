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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {

    public Login() throws FileNotFoundException {
        CargarBebidas();
        initComponents();

        Cargarbebidastabla();
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
        tf_marca = new javax.swing.JTextField();
        tf_cant = new javax.swing.JTextField();
        tf_azucar = new javax.swing.JTextField();
        tf_num = new javax.swing.JTextField();
        bt_agregar = new javax.swing.JButton();
        tf_fecha = new javax.swing.JFormattedTextField();
        tf_codigo = new javax.swing.JFormattedTextField();
        bg_nacional = new javax.swing.ButtonGroup();
        jd_mod = new javax.swing.JDialog();
        rb_no1 = new javax.swing.JRadioButton();
        rb_si1 = new javax.swing.JRadioButton();
        tf_precio1 = new javax.swing.JTextField();
        tf_alcohol1 = new javax.swing.JTextField();
        tf_marca1 = new javax.swing.JTextField();
        tf_cant1 = new javax.swing.JTextField();
        tf_azucar1 = new javax.swing.JTextField();
        tf_num1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_fecha1 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rb_azul1 = new javax.swing.JRadioButton();
        rb_rojo1 = new javax.swing.JRadioButton();
        rb_blanco1 = new javax.swing.JRadioButton();
        rb_verde1 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        rb_amarillo1 = new javax.swing.JRadioButton();
        tf_nombre1 = new javax.swing.JTextField();
        tf_codigo1 = new javax.swing.JFormattedTextField();
        cb_mod = new javax.swing.JComboBox<>();
        bt_mod = new javax.swing.JButton();
        jd_factura = new javax.swing.JDialog();
        cb_factura = new javax.swing.JComboBox<>();
        bt_fact = new javax.swing.JButton();
        spi_cant = new javax.swing.JSpinner();
        bt_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_op = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

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

        tf_codigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########"))));

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
                        .addGap(0, 487, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_addLayout.createSequentialGroup()
                        .addGroup(jd_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_addLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
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
                    .addComponent(jLabel3)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        bg_nacional.add(rb_no1);
        rb_no1.setText("No");

        bg_nacional.add(rb_si1);
        rb_si1.setText("Si");

        jLabel12.setText("Nacional: ");

        try {
            tf_fecha1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setText("Precio: ");

        jLabel14.setText("Colorantes :");

        jLabel15.setText("Codigo:");

        jLabel16.setText("Cantidad de azucar: ");

        jLabel17.setText("Cantidad de alcohol: ");

        rb_azul1.setText("Azul-4");

        rb_rojo1.setText("Rojo-69");

        rb_blanco1.setText("Blanco-07");

        rb_verde1.setText("Verde-420");

        jLabel18.setText("Nombre :");

        jLabel19.setText("Numero de Lote:");

        jLabel20.setText("Nombre de la marca :");

        jLabel21.setText("Cantidad");

        jLabel22.setText("Fecha de vencimiento: ");

        rb_amarillo1.setText("Amarillo -77");

        try {
            tf_codigo1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cb_mod.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_modItemStateChanged(evt);
            }
        });

        bt_mod.setText("Hacer los cambios");
        bt_mod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_modLayout = new javax.swing.GroupLayout(jd_mod.getContentPane());
        jd_mod.getContentPane().setLayout(jd_modLayout);
        jd_modLayout.setHorizontalGroup(
            jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_cant1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_marca1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(tf_codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modLayout.createSequentialGroup()
                        .addComponent(cb_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(358, 358, 358))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modLayout.createSequentialGroup()
                        .addComponent(bt_mod)
                        .addGap(100, 100, 100))))
            .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modLayout.createSequentialGroup()
                    .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_modLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(188, 188, 188))
                .addGroup(jd_modLayout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_modLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_modLayout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_modLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rb_si1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rb_no1))
                        .addGroup(jd_modLayout.createSequentialGroup()
                            .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jd_modLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_alcohol1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_modLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_azul1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_verde1)))
                                .addGroup(jd_modLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_azucar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rb_amarillo1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rb_blanco1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rb_rojo1)))
                    .addGap(153, 153, 153)))
        );
        jd_modLayout.setVerticalGroup(
            jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modLayout.createSequentialGroup()
                .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(tf_codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cb_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(tf_marca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(tf_cant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(bt_mod)
                .addGap(94, 94, 94))
            .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_modLayout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(83, 83, 83)
                    .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(tf_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rb_no1)
                        .addComponent(rb_si1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rb_azul1)
                        .addComponent(rb_verde1)
                        .addComponent(rb_amarillo1)
                        .addComponent(rb_blanco1)
                        .addComponent(rb_rojo1))
                    .addGap(26, 26, 26)
                    .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_azucar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jd_modLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_alcohol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(63, Short.MAX_VALUE)))
        );

        bt_fact.setText("Generar factura");
        bt_fact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_factMouseClicked(evt);
            }
        });

        spi_cant.setModel(new javax.swing.SpinnerNumberModel());

        bt_add.setText("Adicionar");
        bt_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_facturaLayout = new javax.swing.GroupLayout(jd_factura.getContentPane());
        jd_factura.getContentPane().setLayout(jd_facturaLayout);
        jd_facturaLayout.setHorizontalGroup(
            jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_facturaLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(cb_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(spi_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_facturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_facturaLayout.createSequentialGroup()
                        .addComponent(bt_fact)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_facturaLayout.createSequentialGroup()
                        .addComponent(bt_add)
                        .addGap(158, 158, 158))))
        );
        jd_facturaLayout.setVerticalGroup(
            jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_facturaLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spi_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(bt_add)
                .addGap(60, 60, 60)
                .addComponent(bt_fact)
                .addGap(126, 126, 126))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Azucar", "Alcohol", "Nacional", "Numero de Lote", "Colorantes", "Precio", "Cantidad en almacen", "Fecha de vencimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
        }

        mn_op.setText("OPciones");

        jMenuItem1.setText("Agregar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mn_op.add(jMenuItem1);

        jMenuItem3.setText("Modificar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mn_op.add(jMenuItem3);

        jMenuItem4.setText("Hacer Factura");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mn_op.add(jMenuItem4);

        jMenuBar1.add(mn_op);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarMouseClicked

        try {
            int codigo = Integer.parseInt(tf_codigo.getText());
            String marca = tf_marca.getText();
            String nombre = tf_nombre.getText();
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

            boolean exist = false;
            for (int i = 0; i < bebidas.size(); i++) {
                if (bebidas.get(i).getCodigo() == codigo) {
                    exist = true;
                }
            }
            if (exist == true) {
                JOptionPane.showMessageDialog(this, "Nose puede crear la bebida porque ya existe un producto con ese codigo");
            } else if (exist == false) {
                //SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
                //Date date = sf.parse(fecha);

                Bebida bebida = new Bebida(codigo, nombre, marca, azucar, alcohol, nacional, lote, colorantes, precio, cant, fecha);

                FileWriter fw = new FileWriter("./bebidas.txt", true);

                BufferedWriter bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(bebida.getCodigo() + ";" + bebida.getNombre() + ";" + bebida.getMarca() + ";" + bebida.getCant_azucar() + ";" + bebida.getAlcohol() + ";" + bebida.getNacional() + ";" + bebida.getNumero_lote() + ";" + bebida.getColorantes() + ";" + bebida.getPrecio() + ";" + bebida.getCantidad() + ";" + fecha);

                bw.flush();

                //  tabla.setModel(modeloinicial);
                bebidas.add(bebida);
                Cargarbebidatabla(bebida);

                //Cargarbebidastabla();
                JOptionPane.showMessageDialog(this, "Se creo la bebida");
            }

        } catch (NumberFormatException numberFormatException) {

        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception s) {
            s.printStackTrace();
        }

    }//GEN-LAST:event_bt_agregarMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jd_add.setModal(true);
        jd_add.pack();
        jd_add.setEnabled(true);
        jd_add.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cb_modItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_modItemStateChanged
        Bebida mod = (Bebida) cb_mod.getSelectedItem();
        tf_alcohol1.setText("" + mod.getAlcohol());
        tf_azucar1.setText("" + mod.getCant_azucar());
        tf_cant1.setText("" + mod.getCantidad());
        //tf_codigo1.setText("" + mod.getCodigo());
        tf_codigo1.setText("1");
        tf_codigo1.setToolTipText("" + mod.getCodigo());
        tf_marca1.setText("" + mod.getMarca());
        tf_num1.setText("" + mod.getNumero_lote());
        tf_fecha1.setText("" + mod.getFechavencimiento());/////
        tf_precio1.setText("" + mod.getPrecio());
        tf_nombre1.setText("" + mod.getNombre());

        if (mod.getNacional().equals("si")) {
            rb_si1.setSelected(true);
        } else {
            rb_no1.setSelected(true);
        }
    }//GEN-LAST:event_cb_modItemStateChanged

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        try {
            cb_mod.setModel(new DefaultComboBoxModel<>());
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_mod.getModel();
            for (int i = 0; i < bebidas.size(); i++) {
                modelo.addElement(bebidas.get(i));
            }
            cb_mod.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        jd_mod.setModal(true);
        jd_mod.pack();
        jd_mod.setVisible(true);
        jd_mod.setEnabled(true);


    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void bt_modMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modMouseClicked
       /////////////////

        try {
            bebida_global = (Bebida) cb_mod.getSelectedItem();
            boolean exist = false;
            if (tf_codigo1.getText().equals("1       ")) {
                bebida_global.setCodigo(((Bebida) cb_mod.getSelectedItem()).getCodigo());
            } else {
                int codigo = Integer.parseInt(tf_codigo1.getText());
                for (int i = 0; i < bebidas.size(); i++) {
                    if (bebidas.get(i).getCodigo() == codigo) {
                        exist = true;
                    }
                }
                if (exist == true) {
                    JOptionPane.showMessageDialog(this, "Ese codigo ya existe");
                } else if (exist == false) {
                    bebida_global.setCodigo(codigo);
                }
            }

            bebida_global.setAlcohol(Double.parseDouble(tf_alcohol1.getText()));
            bebida_global.setCant_azucar(Integer.parseInt(tf_azucar1.getText()));
            bebida_global.setCantidad(Integer.parseInt(tf_cant1.getText()));

            String colorantes = "";
            if (rb_azul1.isSelected()) {
                colorantes += "Azul-4 ";
            }
            if (rb_amarillo1.isSelected()) {
                colorantes += "Amarillo-77 ";
            }
            if (rb_blanco1.isSelected()) {
                colorantes += "Blanco-07 ";
            }
            if (rb_rojo1.isSelected()) {
                colorantes += "Rojo-69 ";
            }
            if (rb_verde1.isSelected()) {
                colorantes += "Verde-420 ";
            }
            bebida_global.setColorantes(colorantes);
            bebida_global.setFechavencimiento(tf_fecha1.getText());
            bebida_global.setMarca(tf_marca1.getText());

            String nacional = "";
            if (rb_si.isSelected()) {
                nacional = "si";
            } else if (rb_no.isSelected()) {
                nacional = "no";
            }
            bebida_global.setNacional(nacional);
            bebida_global.setNombre(tf_nombre1.getText());
            bebida_global.setNumero_lote(Integer.parseInt(tf_num1.getText()));
            bebida_global.setPrecio(Double.parseDouble(tf_precio1.getText()));

            escribirArchivo();
            
            Cargarbebidastabla();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Nose pudo crear la bebida vuelva a intentarlo");
        }


    }//GEN-LAST:event_bt_modMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
     try {
            cb_factura.setModel(new DefaultComboBoxModel<>());
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_factura.getModel();
            for (int i = 0; i < bebidas.size(); i++) {
                modelo.addElement(bebidas.get(i));
            }
            cb_factura.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        jd_factura.setModal(true);
        jd_factura.pack();
        jd_factura.setVisible(true);
        jd_factura.setEnabled(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void bt_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addMouseClicked
        lleva.add((Bebida)cb_factura.getSelectedItem());
        cantidades.add((Integer)spi_cant.getValue());
        
        
        
    }//GEN-LAST:event_bt_addMouseClicked

    private void bt_factMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_factMouseClicked
         File archivo = new File("./Factura"+cont+".text");
        FileWriter fw = null;
        BufferedWriter bw = null;
        int total = 0;
        try {

            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            bw.write(" Super mercado El Barrio ");
                bw.newLine();
                bw.write("  Factura #"+cont+"      "+(new Date()));
                 bw.newLine();
                bw.write("Produc."+"     Cant"+"    Precio");
                bw.newLine();
            for (int i = 0; i < lleva.size(); i++) {
                bw.write(" "+((Bebida)lleva.get(i)).getNombre()+"     "+cantidades.get(i)+"    "+((Bebida)lleva.get(i)).getPrecio());
                bw.newLine();
                total+=(cantidades.get(i)*((Bebida)lleva.get(i)).getPrecio());
            }
            bw.write("                                      "+"Total: ");
            bw.newLine();
            bw.write("                                         "+total);
            
            bw.flush();
            cont++;
            
             bw.close();
            fw.close();
        } catch (Exception e) {
        }
        
        
        
    }//GEN-LAST:event_bt_factMouseClicked
    public void CargarBebidas() throws FileNotFoundException {
        try {
            File file = new File("./bebidas.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            // Scanner sc = new Scanner(file);
            String linea = "";
            System.out.println("estoy aqui antes del while");
            //de que forma metemos los usuarios?? well opino que sea tipo "id;nombre;contra;tipo
            while ((linea = br.readLine()) != null) {
                System.out.println("Linea " + linea);
                String[] datos = linea.split(";");
                //System.out.println(datos.length);
                for (int i = 0; i < datos.length; i++) {
                    System.out.println(datos[i]);
                }
                /* SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yy");
                Date date = sf.parse(datos[10]);*/

                Bebida bebida = new Bebida(Integer.parseInt(datos[0]), datos[1], datos[2], Integer.parseInt(datos[3]), (Double.parseDouble(datos[4])), datos[5], Integer.parseInt(datos[6]), datos[7], Double.parseDouble(datos[8]), Integer.parseInt(datos[9]), datos[10]);
                bebidas.add(bebida);

            }
        } catch (Exception e) {
        }

    }

    public void Cargarbebidastabla() {
        //
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Azucar", "Alcohol", "Nacional", "Numero de Lote", "Colorantes", "Precio", "Cantidad en almacen", "Fecha de vencimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        for (int i = 0; i < bebidas.size(); i++) {
            Object[] newrow = {bebidas.get(i).getCodigo(),
                bebidas.get(i).getNombre(),
                bebidas.get(i).getMarca(),
                bebidas.get(i).getCant_azucar(),
                bebidas.get(i).getAlcohol(),
                bebidas.get(i).getNacional(),
                bebidas.get(i).getNumero_lote(),
                bebidas.get(i).getColorantes(),
                bebidas.get(i).getPrecio(),
                bebidas.get(i).getCantidad(),
                bebidas.get(i).getFechavencimiento()
            };
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(newrow);
            tabla.setModel(modelo);

        }

    }

    public void Cargarbebidatabla(Bebida bebida) {
        Object[] newrow = {bebida.getCodigo(),
            bebida.getNombre(),
            bebida.getMarca(),
            bebida.getCant_azucar(),
            bebida.getAlcohol(),
            bebida.getNacional(),
            bebida.getNumero_lote(),
            bebida.getColorantes(),
            bebida.getPrecio(),
            bebida.getCantidad(),
            bebida.getFechavencimiento()
        };
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.addRow(newrow);
        tabla.setModel(modelo);

    }

    public void escribirArchivo() throws IOException {
        File archivo = new File("./bebidas.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {

            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Bebida bebida : bebidas) {
                bw.write(bebida.getCodigo() + ";" + bebida.getNombre() + ";" + bebida.getMarca() + ";" + bebida.getCant_azucar() + ";" + bebida.getAlcohol() + ";" + bebida.getNacional() + ";" + bebida.getNumero_lote() + ";" + bebida.getColorantes() + ";" + bebida.getPrecio() + ";" + bebida.getCantidad() + ";" + bebida.getFechavencimiento());
                bw.newLine();
            }
            bw.flush();
            
             bw.close();
            fw.close();
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
    public void act (){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_nacional;
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_fact;
    private javax.swing.JButton bt_mod;
    private javax.swing.JComboBox<String> cb_factura;
    private javax.swing.JComboBox<String> cb_mod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jd_add;
    private javax.swing.JDialog jd_factura;
    private javax.swing.JDialog jd_mod;
    private javax.swing.JMenu mn_op;
    private javax.swing.JRadioButton rb_amarillo;
    private javax.swing.JRadioButton rb_amarillo1;
    private javax.swing.JRadioButton rb_azul;
    private javax.swing.JRadioButton rb_azul1;
    private javax.swing.JRadioButton rb_blanco;
    private javax.swing.JRadioButton rb_blanco1;
    private javax.swing.JRadioButton rb_no;
    private javax.swing.JRadioButton rb_no1;
    private javax.swing.JRadioButton rb_rojo;
    private javax.swing.JRadioButton rb_rojo1;
    private javax.swing.JRadioButton rb_si;
    private javax.swing.JRadioButton rb_si1;
    private javax.swing.JRadioButton rb_verde;
    private javax.swing.JRadioButton rb_verde1;
    private javax.swing.JSpinner spi_cant;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tf_alcohol;
    private javax.swing.JTextField tf_alcohol1;
    private javax.swing.JTextField tf_azucar;
    private javax.swing.JTextField tf_azucar1;
    private javax.swing.JTextField tf_cant;
    private javax.swing.JTextField tf_cant1;
    private javax.swing.JFormattedTextField tf_codigo;
    private javax.swing.JFormattedTextField tf_codigo1;
    private javax.swing.JFormattedTextField tf_fecha;
    private javax.swing.JFormattedTextField tf_fecha1;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_marca1;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_num;
    private javax.swing.JTextField tf_num1;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_precio1;
    // End of variables declaration//GEN-END:variables
ArrayList<Bebida> bebidas = new ArrayList();
    Bebida bebida_global;
    ArrayList<Bebida> lleva = new ArrayList();
    ArrayList<Integer> cantidades = new ArrayList();
    int cont = 1;
}
