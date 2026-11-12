
package cajero;

/**
 *
 * @author ASUS
 */

import javax.swing.table.DefaultTableModel;
import javax.swing.*;
//descargar librería JDBC en https://www.mysql.com/products/connector/
import java.sql.*;

public class interfaz extends javax.swing.JFrame {

    DefaultTableModel modelo;
    DefaultTableModel modeloCajeros;
    
    public interfaz() {
        initComponents();
        
        modelo = (DefaultTableModel) tabla.getModel();
        
        tabla.setShowHorizontalLines(true);
        tabla.setShowVerticalLines(true);
        tabla.setGridColor(java.awt.Color.BLACK);
        
        modeloCajeros = (DefaultTableModel) table1.getModel();

        table1.setShowHorizontalLines(true);
        table1.setShowVerticalLines(true);
        table1.setGridColor(java.awt.Color.BLACK);

        consultar1ActionPerformed(null);
    }

    public Connection conectar(){
       String usuario="sara";
       String contrasena= "#3Programacion3"; 
       String url= "jdbc:mysql://72.167.84.254:3306/banco"; //"jdbc:mysql://localhost:3306/agenda"; 
       Connection con=null;
       try{         
          con= DriverManager.getConnection(url,usuario,contrasena);
          salida.setText("Conexión correcta");
          return con;
       }catch (Exception e){
          salida.setText("Conexión incorrecta: " + e.getMessage()); 
          return null;
       }
   }

    public void limpiarCampos() {
        nombres.setText("");
        apellidos.setText("");
        telefono.setText("");
        ciudad.setText("");
        ncuenta.setText("");
        saldo.setText("");
        id.setText("");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ncuenta = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        lnombres3 = new javax.swing.JLabel();
        lnombres1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salida = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        lnombres = new javax.swing.JLabel();
        lnDireccion = new javax.swing.JLabel();
        lnombres2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        nombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        estadisticas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        diez = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        veinte = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cincuenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cien = new javax.swing.JTextField();
        editar1 = new javax.swing.JButton();
        eliminar1 = new javax.swing.JButton();
        agregar1 = new javax.swing.JButton();
        consultar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        buscar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        id2 = new javax.swing.JTextField();
        buscar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lnombres3.setText("Teléfono:");

        lnombres1.setText("Apellidos:");

        salida.setColumns(20);
        salida.setRows(5);
        jScrollPane2.setViewportView(salida);

        jLabel1.setForeground(new java.awt.Color(64, 224, 208));
        jLabel1.setText("Administración");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        lnombres.setText("Nombres:");

        lnDireccion.setText("Ciudad:");

        lnombres2.setText("Número de cuenta:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "apellidos", "telefono", "ciudad", "ncuenta", "saldo", "estado"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel2.setText("Saldo:");

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar cliente");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar por id: ");

        buscar.setText("Buscar ");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        estadisticas.setText("Estadísticas");
        estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticasActionPerformed(evt);
            }
        });

        jLabel4.setText("Cajero");

        jLabel5.setText("Cliente");

        jLabel6.setText("N° diez");

        jLabel7.setText("N°veinte");

        jLabel8.setText("N° cincuenta");

        jLabel9.setText("N° cien");

        editar1.setText("Editar");
        editar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar1ActionPerformed(evt);
            }
        });

        eliminar1.setText("Eliminar cajero");
        eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar1ActionPerformed(evt);
            }
        });

        agregar1.setText("Agregar");
        agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar1ActionPerformed(evt);
            }
        });

        consultar1.setText("Consultar");
        consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar1ActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "ndiez", "nveinte", "ncincuenta", "ncien", "estado"
            }
        ));
        jScrollPane3.setViewportView(table1);

        jLabel10.setText("Buscar por id: ");

        buscar1.setText("Buscar ");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Buscar por nombre: ");

        buscar2.setText("Buscar ");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lnombres2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ncuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lnombres1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lnombres3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lnDireccion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(consultar)
                                .addGap(38, 38, 38)
                                .addComponent(eliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agregar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(consultar1)
                                .addGap(38, 38, 38)
                                .addComponent(eliminar1))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(diez, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(veinte, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cincuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cien, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(577, 577, 577)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar)
                            .addComponent(estadisticas)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar2)
                        .addGap(19, 19, 19)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscar1)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnombres)
                            .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnombres1)
                            .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnombres3)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnDireccion)
                            .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnombres2)
                            .addComponent(ncuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar)
                            .addComponent(consultar)
                            .addComponent(editar)
                            .addComponent(eliminar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(diez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(veinte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cincuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar1)
                            .addComponent(consultar1)
                            .addComponent(editar1)
                            .addComponent(eliminar1))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buscar2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buscar))
                                .addGap(18, 18, 18)
                                .addComponent(estadisticas))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(salir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscar1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
    modelo.setRowCount(0); 
        Connection con = conectar();
        if (con == null) return;
        
        String query = "SELECT * FROM clientes;";
        try { 
             PreparedStatement preparar = con.prepareStatement(query);
             ResultSet resultado = preparar.executeQuery();
             
             while(resultado.next()){
                 modelo.addRow(new Object[]{
                     resultado.getInt("id"),
                     resultado.getString("nombre"), 
                     resultado.getString("apellido"), 
                     resultado.getString("telefono"), 
                     resultado.getString("ciudad"), 
                     resultado.getInt("ncuenta"), 
                     resultado.getDouble("saldo"),
                     resultado.getInt("estado")
                 });
             }
             resultado.close();
             preparar.close();
             con.close();
             salida.setText("Consulta realizada con éxito.");
        } catch (SQLException ex){
             salida.setText("Error en el sql: " + ex.getMessage());
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (nombres.getText().trim().isEmpty() || 
            apellidos.getText().trim().isEmpty() || 
            telefono.getText().trim().isEmpty() || 
            ciudad.getText().trim().isEmpty() || 
            ncuenta.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Error: No se pueden dejar campos vacíos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Connection con = conectar();
        if (con == null) return;

        String query = "INSERT INTO clientes(nombre, apellido, telefono, ciudad, ncuenta, saldo, estado) VALUES (?, ?, ?, ?, ?, ?, 0)";
        try {
            PreparedStatement preparar = con.prepareStatement(query);
            preparar.setString(1, nombres.getText());
            preparar.setString(2, apellidos.getText());
            preparar.setString(3, telefono.getText());
            preparar.setString(4, ciudad.getText());
            preparar.setInt(5, Integer.parseInt(ncuenta.getText().trim())); 
            preparar.setDouble(6, Double.parseDouble(saldo.getText().trim()));
            
            preparar.executeUpdate();
            salida.setText("¡Cliente agregado correctamente a la nube!");
            limpiarCampos();
            con.close();
            consultarActionPerformed(null); 
        } catch (SQLException ex) {
            salida.setText("Error en la inserción: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            salida.setText("Error: El número de cuenta (Email) debe ser un valor numérico.");
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
    String textoId = id.getText().trim();
        
        if (textoId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa primero el ID de la persona que deseas editar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Connection con = conectar();
        if (con == null) return;

        try {
            if (nombres.getText().trim().isEmpty() && apellidos.getText().trim().isEmpty()) {
                String queryEstado = "UPDATE clientes SET estado = 1 WHERE id = ?";
                PreparedStatement estado = con.prepareStatement(queryEstado);
                estado.setInt(1, Integer.parseInt(textoId));
                estado.executeUpdate();
                estado.close();

                String querySelect = "SELECT * FROM clientes WHERE id = ?";
                PreparedStatement Seleccion = con.prepareStatement(querySelect);
                Seleccion.setInt(1, Integer.parseInt(textoId));
                ResultSet res = Seleccion.executeQuery();

                if (res.next()) {
                    nombres.setText(res.getString("nombre"));
                    apellidos.setText(res.getString("apellido"));
                    telefono.setText(res.getString("telefono"));
                    ciudad.setText(res.getString("ciudad"));
                    ncuenta.setText(String.valueOf(res.getInt("ncuenta")));
                    saldo.setText(String.valueOf(res.getDouble("saldo")));
                    
                    salida.setText("¡Datos cargados con éxito! El estado cambió a 1. Modifica y haz clic en Editar para guardar.");
                } else {
                    salida.setText("No se encontró ningún cliente con ese ID en la nube.");
                }
                res.close();
                Seleccion.close();
                consultarActionPerformed(null); 
                
            } else {
                if (nombres.getText().trim().isEmpty() || 
                    apellidos.getText().trim().isEmpty() || 
                    telefono.getText().trim().isEmpty() || 
                    ciudad.getText().trim().isEmpty() || 
                    ncuenta.getText().trim().isEmpty() ||
                    saldo.getText().trim().isEmpty()) {
                    
                    JOptionPane.showMessageDialog(this, "Error: No se pueden dejar campos vacíos para guardar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    con.close();
                    return;
                }

                // Al guardar de forma exitosa, el estado regresa a 0
                String queryUpdate = "UPDATE clientes SET nombre = ?, apellido = ?, telefono = ?, ciudad = ?, ncuenta = ?, saldo = ?, estado = 0 WHERE id = ?";
                PreparedStatement actualizarRegistro = con.prepareStatement(queryUpdate);
                actualizarRegistro.setString(1, nombres.getText().trim());
                actualizarRegistro.setString(2, apellidos.getText().trim());
                actualizarRegistro.setString(3, telefono.getText().trim());
                actualizarRegistro.setString(4, ciudad.getText().trim());
                actualizarRegistro.setInt(5, Integer.parseInt(ncuenta.getText().trim()));
                actualizarRegistro.setDouble(6, Double.parseDouble(saldo.getText().trim()));
                actualizarRegistro.setInt(7, Integer.parseInt(textoId));
                
                int filasAfectadas = actualizarRegistro.executeUpdate();
                if (filasAfectadas > 0) {
                    salida.setText("¡Cliente modificado y actualizado con éxito en la nube!");
                    limpiarCampos();
                    id.setText(""); 
                    consultarActionPerformed(null); 
                } else {
                    salida.setText("No se pudo actualizar el registro.");
                }
                
                actualizarRegistro.close();
            }
            
            con.close();
        } catch (SQLException ex) {
            salida.setText("Error en la base de datos: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            salida.setText("Error: El ID, número de cuenta y saldo deben ser valores numéricos válidos.");
        }
    }//GEN-LAST:event_editarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (ncuenta.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, indique el Número de Cuenta del cliente que desea eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está segura de que desea eliminar este cliente?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
    if (confirmacion != JOptionPane.YES_OPTION) {
        return;
    }

    Connection con = conectar();
    if (con == null) return;

    String query = "DELETE FROM clientes WHERE ncuenta = ?";
    try {
        PreparedStatement preparar = con.prepareStatement(query);
        preparar.setInt(1, Integer.parseInt(ncuenta.getText().trim()));
        
        int filasAfectadas = preparar.executeUpdate();
        if (filasAfectadas > 0) {
            salida.setText("¡Cliente eliminado correctamente de la nube!");
            limpiarCampos();
            consultarActionPerformed(null); // Actualiza la tabla automáticamente
        } else {
            salida.setText("No se encontró ningún cliente con ese Número de Cuenta para eliminar.");
        }
        
        preparar.close();
        con.close();
    } catch (SQLException ex) {
        salida.setText("Error al eliminar: " + ex.getMessage());
    } catch (NumberFormatException ex) {
        salida.setText("Error: El número de cuenta debe ser un valor numérico.");
    }
    }//GEN-LAST:event_eliminarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
    String textoBusqueda = id.getText().trim(); 
    
    if (textoBusqueda.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID o nombre para buscar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Connection con = conectar();
    if (con == null) return;

    String query = "SELECT * FROM clientes WHERE id = ? OR nombre LIKE ?";
    try {
        PreparedStatement preparar = con.prepareStatement(query);

        try {
            preparar.setInt(1, Integer.parseInt(textoBusqueda));
        } catch (NumberFormatException e) {
            preparar.setInt(1, -1); 
        }
        
        preparar.setString(2, "%" + textoBusqueda + "%");
        ResultSet resultado = preparar.executeQuery();

        modelo.setRowCount(0);
        boolean encontrado = false;
        
        while (resultado.next()) {
            encontrado = true;
            modelo.addRow(new Object[]{
                resultado.getInt("id"),
                resultado.getString("nombre"),
                resultado.getString("apellido"),
                resultado.getString("telefono"),
                resultado.getString("ciudad"),
                resultado.getInt("ncuenta"),
                resultado.getDouble("saldo"),
                resultado.getInt("estado")
            });
            
            nombres.setText(resultado.getString("nombre"));
            apellidos.setText(resultado.getString("apellido"));
            telefono.setText(resultado.getString("telefono")); 
            ciudad.setText(resultado.getString("ciudad")); 
            ncuenta.setText(String.valueOf(resultado.getInt("ncuenta"))); 
            saldo.setText(String.valueOf(resultado.getDouble("saldo"))); 
        }

        if (!encontrado) {
            salida.setText("No se encontró ningún cliente con ese criterio.");
        } else {
            salida.setText("¡Cliente(s) encontrado(s) con éxito!");
        }

        resultado.close();
        preparar.close();
        con.close();

    } catch (SQLException ex) {
        salida.setText("Error en la búsqueda: " + ex.getMessage());
    }
    }//GEN-LAST:event_buscarActionPerformed

    private void estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticasActionPerformed
    Connection con = conectar();
    if (con == null) return;

    String query = "SELECT COUNT(id) AS total_clientes, AVG(saldo) AS saldo_promedio FROM clientes;";
    
    try {
        PreparedStatement preparar = con.prepareStatement(query);
        ResultSet resultado = preparar.executeQuery();
        
        if (resultado.next()) {
            int total = resultado.getInt("total_clientes");
            double promedio = resultado.getDouble("saldo_promedio");
            
            salida.setText("REPORTE DEL SISTEMA BANCARIO:\n" +
                           " Número total de clientes: " + total + "\n" +
                           " Dinero promedio en cuentas: $" + String.format("%.2f", promedio));
        }
        
        resultado.close();
        preparar.close();
        con.close();
        
    } catch (SQLException ex) {
        salida.setText("Error al obtener estadísticas: " + ex.getMessage());
    }
    }//GEN-LAST:event_estadisticasActionPerformed

    private void editar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar1ActionPerformed
    String textoId = id1.getText().trim();
    if (textoId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Busca primero el ID del cajero que vas a editar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Connection con = conectar();
    if (con == null) return;

    try {
        String queryUpdate = "UPDATE cajeros SET ndiez = ?, nveinte = ?, ncincuenta = ?, ncien = ? WHERE id = ?";
        PreparedStatement actualizarRegistro = con.prepareStatement(queryUpdate);
        actualizarRegistro.setInt(1, Integer.parseInt(diez.getText().trim()));
        actualizarRegistro.setInt(2, Integer.parseInt(veinte.getText().trim()));
        actualizarRegistro.setInt(3, Integer.parseInt(cincuenta.getText().trim()));
        actualizarRegistro.setInt(4, Integer.parseInt(cien.getText().trim()));
        actualizarRegistro.setInt(5, Integer.parseInt(textoId));

        int filas = actualizarRegistro.executeUpdate();
        if (filas > 0) {
            salida.setText("¡Cajero actualizado con éxito!");
            consultar1ActionPerformed(null);
        } else {
            salida.setText("No se pudo actualizar el cajero.");
        }
        actualizarRegistro.close();
        con.close();
    } catch (SQLException ex) {
        salida.setText("Error al actualizar cajero: " + ex.getMessage());
    } catch (NumberFormatException ex) {
        salida.setText("Error: Todos los campos deben ser numéricos.");
    }
    }//GEN-LAST:event_editar1ActionPerformed

    private void eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar1ActionPerformed
        String textoId = id1.getText().trim();
    if (textoId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingresa el ID del cajero que deseas eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está segura de eliminar este cajero?", "Confirmar", JOptionPane.YES_NO_OPTION);
    if (confirmacion != JOptionPane.YES_OPTION) return;

    Connection con = conectar();
    if (con == null) return;

    String query = "DELETE FROM cajeros WHERE id = ?";
    try {
        PreparedStatement preparar = con.prepareStatement(query);
        preparar.setInt(1, Integer.parseInt(textoId));
        
        int filas = preparar.executeUpdate();
        if (filas > 0) {
            salida.setText("¡Cajero eliminado correctamente!");
            consultar1ActionPerformed(null);
        } else {
            salida.setText("No se encontró el cajero con ese ID.");
        }
        preparar.close();
        con.close();
    } catch (SQLException ex) {
        salida.setText("Error al eliminar cajero: " + ex.getMessage());
    } catch (NumberFormatException ex) {
        salida.setText("Error: El ID del cajero debe ser numérico.");
    }
    }//GEN-LAST:event_eliminar1ActionPerformed

    private void agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar1ActionPerformed
    if (diez.getText().trim().isEmpty() || 
        veinte.getText().trim().isEmpty() || 
        cincuenta.getText().trim().isEmpty() || 
        cien.getText().trim().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, "Error: No se pueden dejar campos de billetes vacíos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Connection con = conectar();
    if (con == null) return;

    String query = "INSERT INTO cajeros(ndiez, nveinte, ncincuenta, ncien, estado) VALUES (?, ?, ?, ?, 0)";
    try {
        PreparedStatement preparar = con.prepareStatement(query);
        preparar.setInt(1, Integer.parseInt(diez.getText().trim()));
        preparar.setInt(2, Integer.parseInt(veinte.getText().trim()));
        preparar.setInt(3, Integer.parseInt(cincuenta.getText().trim()));
        preparar.setInt(4, Integer.parseInt(cien.getText().trim()));
        
        preparar.executeUpdate();
        salida.setText("¡Cajero agregado correctamente a la nube!");
        diez.setText(""); veinte.setText(""); cincuenta.setText(""); cien.setText("");
        con.close();
        consultar1ActionPerformed(null);
    } catch (SQLException ex) {
        salida.setText("Error al agregar cajero: " + ex.getMessage());
    } catch (NumberFormatException ex) {
        salida.setText("Error: Los billetes deben ser valores numéricos.");
    }
    }//GEN-LAST:event_agregar1ActionPerformed

    private void consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar1ActionPerformed
    modeloCajeros.setRowCount(0);
    Connection con = conectar();
    if (con == null) return;

    String query = "SELECT * FROM cajeros;";
    try {
        PreparedStatement preparar = con.prepareStatement(query);
        ResultSet resultado = preparar.executeQuery();

        while (resultado.next()) {
            modeloCajeros.addRow(new Object[]{
                resultado.getInt("id"),
                resultado.getInt("ndiez"),
                resultado.getInt("nveinte"),
                resultado.getInt("ncincuenta"),
                resultado.getInt("ncien"),
                resultado.getInt("estado")
            });
        }
        resultado.close();
        preparar.close();
        con.close();
        salida.setText("Cajeros consultados con éxito.");
    } catch (SQLException ex) {
        salida.setText("Error al consultar cajeros: " + ex.getMessage());
    }
    }//GEN-LAST:event_consultar1ActionPerformed

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
    String textoId = id1.getText().trim();
    if (textoId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingresa el ID del cajero a buscar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Connection con = conectar();
    if (con == null) return;

    String query = "SELECT * FROM cajeros WHERE id = ?";
    try {
        PreparedStatement preparar = con.prepareStatement(query);
        preparar.setInt(1, Integer.parseInt(textoId));
        ResultSet resultado = preparar.executeQuery();

        modeloCajeros.setRowCount(0);
        if (resultado.next()) {
            modeloCajeros.addRow(new Object[]{
                resultado.getInt("id"),
                resultado.getInt("ndiez"),
                resultado.getInt("nveinte"),
                resultado.getInt("ncincuenta"),
                resultado.getInt("ncien"),
                resultado.getInt("estado")
            });
            
            diez.setText(String.valueOf(resultado.getInt("ndiez")));
            veinte.setText(String.valueOf(resultado.getInt("nveinte")));
            cincuenta.setText(String.valueOf(resultado.getInt("ncincuenta")));
            cien.setText(String.valueOf(resultado.getInt("ncien")));
            
            salida.setText("¡Cajero encontrado con éxito!");
        } else {
            salida.setText("No se encontró ningún cajero con ese ID.");
        }
        resultado.close();
        preparar.close();
        con.close();
    } catch (SQLException ex) {
        salida.setText("Error al buscar cajero: " + ex.getMessage());
    } catch (NumberFormatException ex) {
        salida.setText("Error: El ID del cajero debe ser numérico.");
    }
    }//GEN-LAST:event_buscar1ActionPerformed

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed
    String nombreBuscado = id2.getText().trim();
    if (nombreBuscado.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un nombre para buscar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Connection con = conectar();
    if (con == null) return;

    String query = "SELECT * FROM clientes WHERE nombre LIKE ?";
    try {
        PreparedStatement preparar = con.prepareStatement(query);
        preparar.setString(1, "%" + nombreBuscado + "%");
        ResultSet resultado = preparar.executeQuery();

        modelo.setRowCount(0);
        boolean encontrado = false;
        while (resultado.next()) {
            encontrado = true;
            modelo.addRow(new Object[]{
                resultado.getInt("id"),
                resultado.getString("nombre"),
                resultado.getString("apellido"),
                resultado.getString("telefono"),
                resultado.getString("ciudad"),
                resultado.getInt("ncuenta"),
                resultado.getDouble("saldo"),
                resultado.getInt("estado")
            });
        }

        if (!encontrado) {
            salida.setText("No se encontraron clientes con ese nombre.");
        } else {
            salida.setText("¡Búsqueda por nombre realizada con éxito!");
        }
        resultado.close();
        preparar.close();
        con.close();
    } catch (SQLException ex) {
        salida.setText("Error en búsqueda por nombre: " + ex.getMessage());
    }
    }//GEN-LAST:event_buscar2ActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton agregar1;
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton buscar;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JTextField cien;
    private javax.swing.JTextField cincuenta;
    private javax.swing.JTextField ciudad;
    private javax.swing.JButton consultar;
    private javax.swing.JButton consultar1;
    private javax.swing.JTextField diez;
    private javax.swing.JButton editar;
    private javax.swing.JButton editar1;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminar1;
    private javax.swing.JButton estadisticas;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id1;
    private javax.swing.JTextField id2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lnDireccion;
    private javax.swing.JLabel lnombres;
    private javax.swing.JLabel lnombres1;
    private javax.swing.JLabel lnombres2;
    private javax.swing.JLabel lnombres3;
    private javax.swing.JTextField ncuenta;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField saldo;
    private javax.swing.JTextArea salida;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla;
    private javax.swing.JTable table1;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField veinte;
    // End of variables declaration//GEN-END:variables
}
