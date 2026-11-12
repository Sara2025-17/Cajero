
package cajero;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;
//descargar librería JDBC en https://www.mysql.com/products/connector/
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class interfaz4 extends javax.swing.JFrame {
    
     
    public java.util.HashMap<Integer, Integer> inventarioBilletes;
    
    public int idCajeroActual = 1; 
    public int cuentaClienteActual = 0;
    private String inputActual = "";
    private int pasoActual = 0;

    public interfaz4() {
        initComponents();
        Pantalla.setText("Ingrese el ID del Cajero del que desea retirar: ");
        this.inventarioBilletes = new java.util.HashMap<>();
        this.inventarioBilletes.put(10000, 100);
        this.inventarioBilletes.put(20000, 100);
        this.inventarioBilletes.put(50000, 100);
        this.inventarioBilletes.put(100000, 100);
        
    }
    
    public Connection conectar(){
       String usuario="sara";
       String contrasena= "#3Programacion3"; 
       String url= "jdbc:mysql://72.167.84.254:3306/banco"; //"jdbc:mysql://localhost:3306/agenda"; 
       Connection con=null;
       try{         
          con= DriverManager.getConnection(url,usuario,contrasena);
          Pantalla.setText("Conexión correcta");
          return con;
       }catch (Exception e){
          Pantalla.setText("Conexión incorrecta: " + e.getMessage()); 
          return null;
       }
   }



    public void setInventario(java.util.HashMap<Integer, Integer> billete) {
        this.inventarioBilletes = billete;
        cargarDatosTabla();
    }

    public void cargarDatosTabla() {
        Connection con = conectar();
        if (con == null) return;
        
        try {
            String sql = "SELECT ndiez, nveinte, ncincuenta, ncien FROM cajeros WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idCajeroActual);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                int ndiez = rs.getInt("ndiez");
                int nveinte = rs.getInt("nveinte");
                int ncincuenta = rs.getInt("ncincuenta");
                int ncien = rs.getInt("ncien");
                
                DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
                modelo.setRowCount(0);
                modelo.addRow(new Object[]{10000, ndiez, 10000 * ndiez});
                modelo.addRow(new Object[]{20000, nveinte, 20000 * nveinte});
                modelo.addRow(new Object[]{50000, ncincuenta, 50000 * ncincuenta});
                modelo.addRow(new Object[]{100000, ncien, 100000 * ncien});
            }
            rs.close();
            pst.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar inventario: " + e.getMessage());
        }
    }
    
    public void liberarSistema(Connection con) {
        try {
            PreparedStatement pst1 = con.prepareStatement("UPDATE cajeros SET estado = 0 WHERE id = ?");
            pst1.setInt(1, idCajeroActual);
            pst1.executeUpdate();
            pst1.close();

            PreparedStatement pst2 = con.prepareStatement("UPDATE clientes SET estado = 0 WHERE ncuenta = ?");
            pst2.setInt(1, cuentaClienteActual);
            pst2.executeUpdate();
            pst2.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al liberar el sistema: " + e.getMessage());
        }
    }
    public void agregarNumero(String numero) {
    inputActual += numero;
    if (pasoActual == 0) {
        Pantalla.setText("Ingrese el ID del Cajero (1 - 7):\n> " + inputActual);
    } else if (pasoActual == 1) {
        Pantalla.setText("Ingrese el No. de CUENTA:\n> " + inputActual);
    } else {
        Pantalla.setText("Ingrese el MONTO:\n> " + inputActual);
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pantalla = new javax.swing.JTextArea();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnCorreccion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        jButton4.setText("3");

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
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pantalla.setColumns(20);
        Pantalla.setRows(5);
        jScrollPane1.setViewportView(Pantalla);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(119, 221, 119));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCorreccion.setBackground(new java.awt.Color(255, 238, 140));
        btnCorreccion.setText("<");
        btnCorreccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorreccionActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(11, 60, 93));
        jLabel1.setText("Cajero Electrónico");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setIconTextGap(5);
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 16));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Billete", "Billetes Disponibles", "Total"
            }
        ));
        jScrollPane4.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setHeaderValue("Billete");
            Tabla.getColumnModel().getColumn(1).setHeaderValue("Billetes Disponibles");
            Tabla.getColumnModel().getColumn(2).setHeaderValue("Total");
        }

        btnCancelar.setBackground(new java.awt.Color(255, 105, 97));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(64, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn7)
                            .addComponent(btn4)
                            .addComponent(btn1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn2)
                                .addGap(18, 18, 18)
                                .addComponent(btn3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn5)
                                .addGap(18, 18, 18)
                                .addComponent(btn6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn8)
                                .addGap(18, 18, 18)
                                .addComponent(btn9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0)
                                .addGap(18, 18, 18)
                                .addComponent(btnCorreccion)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1)
                            .addComponent(btn2)
                            .addComponent(btn3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4)
                            .addComponent(btn5)
                            .addComponent(btn6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7)
                            .addComponent(btn8)
                            .addComponent(btn9)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresar)
                        .addGap(14, 14, 14)
                        .addComponent(btnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btnCorreccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        agregarNumero("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        agregarNumero("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        agregarNumero("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        agregarNumero("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        agregarNumero("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        agregarNumero("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        agregarNumero("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        agregarNumero("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        agregarNumero("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        agregarNumero("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
    if (inputActual.isEmpty()) {
            Pantalla.setText("Por favor, ingrese un valor usando el teclado.");
            return;
        }

        Connection con = conectar();
        if (con == null) return;

        try {
            if (pasoActual == 0) {
            idCajeroActual = Integer.parseInt(inputActual);
    
            PreparedStatement pstCajTest = con.prepareStatement("SELECT * FROM cajeros WHERE id = ?");
            pstCajTest.setInt(1, idCajeroActual);
            ResultSet rsCajTest = pstCajTest.executeQuery();
    
            if (!rsCajTest.next()) {
                Pantalla.setText("El Cajero con ID " + idCajeroActual + " no existe.\nIngrese ID de Cajero (1 - 7):\n> ");
                rsCajTest.close();
                pstCajTest.close();
                con.close();
                inputActual = ""; 
                return;
            }
            rsCajTest.close();
            pstCajTest.close();
            con.close();

            cargarDatosTabla();

            pasoActual = 1;
            inputActual = "";
            Pantalla.setText("Cajero #" + idCajeroActual + " seleccionado.\nIngrese el No. de CUENTA:\n> ");
            } else if (pasoActual == 1) {

                cuentaClienteActual = Integer.parseInt(inputActual);
                
                PreparedStatement pstCli = con.prepareStatement("SELECT nombre, saldo FROM clientes WHERE ncuenta = ?");
                pstCli.setInt(1, cuentaClienteActual);
                ResultSet rsCli = pstCli.executeQuery();
                
                if (!rsCli.next()) {
                    Pantalla.setText("La cuenta bancaria no existe.\nIngrese el No. de CUENTA:");
                    rsCli.close();
                    pstCli.close();
                    con.close();
                    inputActual = "";
                    return;
                }
                
                String nombreCliente = rsCli.getString("nombre");
                rsCli.close();
                pstCli.close();
                con.close();

                pasoActual = 2;
                inputActual = "";
                Pantalla.setText("Cliente: " + nombreCliente + "\nIngrese el MONTO a retirar:");

            } else if (pasoActual == 2) {
                int monto = Integer.parseInt(inputActual);
                
                if (monto % 10 != 0 || monto % 10000 != 0) {
                    Pantalla.setText("Ingrese monto válido (múltiplos de 10k)");
                    inputActual = "";
                    con.close();
                    return;
                }
                if (monto < 10000 || monto > 1000000) {
                    Pantalla.setText("Monto fuera de rango ($10k - $1M)");
                    inputActual = "";
                    con.close();
                    return;
                }

                PreparedStatement pstBloqCajero = con.prepareStatement("UPDATE cajeros SET estado = 1 WHERE id = ?");
                pstBloqCajero.setInt(1, idCajeroActual);
                pstBloqCajero.executeUpdate();
                pstBloqCajero.close();

                PreparedStatement pstBloqCliente = con.prepareStatement("UPDATE clientes SET estado = 1 WHERE ncuenta = ?");
                pstBloqCliente.setInt(1, cuentaClienteActual);
                pstBloqCliente.executeUpdate();
                pstBloqCliente.close();

                PreparedStatement pstCli = con.prepareStatement("SELECT nombre, saldo FROM clientes WHERE ncuenta = ?");
                pstCli.setInt(1, cuentaClienteActual);
                ResultSet rsCli = pstCli.executeQuery();
                rsCli.next();
                String nombreCliente = rsCli.getString("nombre");
                double saldoCliente = rsCli.getDouble("saldo");
                rsCli.close();
                pstCli.close();

                if (saldoCliente < monto) {
                    Pantalla.setText("Saldo insuficiente. Su saldo es: $" + saldoCliente);
                    liberarSistema(con);
                    inputActual = "";
                    pasoActual = 1; // Vuelve a pedir cuenta
                    con.close();
                    return;
                }

                PreparedStatement pstCaj = con.prepareStatement("SELECT ndiez, nveinte, ncincuenta, ncien FROM cajeros WHERE id = ?");
                pstCaj.setInt(1, idCajeroActual);
                ResultSet rsCaj = pstCaj.executeQuery();
                rsCaj.next();
                int stock10 = rsCaj.getInt("ndiez");
                int stock20 = rsCaj.getInt("nveinte");
                int stock50 = rsCaj.getInt("ncincuenta");
                int stock100 = rsCaj.getInt("ncien");
                rsCaj.close();
                pstCaj.close();

                int cienk = 0, cincuentak = 0, veintek = 0, diesk = 0;
                int temp = monto;
                
                if (monto == 50000){
                    veintek = 2; diesk = 1;
                } else if (monto == 100000){
                    cincuentak = 1; veintek = 2; diesk = 1;
                } else {
                    if (monto > 100000) {
                        cincuentak += 1; veintek += 2; diesk += 1; temp -= 100000;
                    }
                    if (temp >= 100000) { cienk += temp / 100000; temp %= 100000; }
                    if (temp >= 50000) { cincuentak += temp / 50000; temp %= 50000; }
                    if (temp >= 20000) { veintek += temp / 20000; temp %= 20000; }
                    if (temp >= 10000) { diesk += temp / 10000; temp %= 10000; }
                }

                if (stock100 < cienk || stock50 < cincuentak || stock20 < veintek || stock10 < diesk) {
                    Pantalla.setText("No hay fondo suficiente de billetes en este cajero.");
                    liberarSistema(con);
                    inputActual = "";
                    pasoActual = 1;
                    con.close();
                    return;
                }

                double nuevoSaldo = saldoCliente - monto;
                PreparedStatement pstUpCli = con.prepareStatement("UPDATE clientes SET saldo = ? WHERE ncuenta = ?");
                pstUpCli.setDouble(1, nuevoSaldo);
                pstUpCli.setInt(2, cuentaClienteActual);
                pstUpCli.executeUpdate();
                pstUpCli.close();

                PreparedStatement pstUpCaj = con.prepareStatement("UPDATE cajeros SET ndiez = ?, nveinte = ?, ncincuenta = ?, ncien = ? WHERE id = ?");
                pstUpCaj.setInt(1, stock10 - diesk);
                pstUpCaj.setInt(2, stock20 - veintek);
                pstUpCaj.setInt(3, stock50 - cincuentak);
                pstUpCaj.setInt(4, stock100 - cienk);
                pstUpCaj.setInt(5, idCajeroActual);
                pstUpCaj.executeUpdate();
                pstUpCaj.close();

                liberarSistema(con);

                String mensaje = "¡Retiro exitoso en Cajero #" + idCajeroActual + "!\nCliente: " + nombreCliente + "\nRetiro: $" + monto + "\nBilletes:";
                if (cienk > 0) mensaje += "\n- 100k: " + cienk;
                if (cincuentak > 0) mensaje += "\n- 50k: " + cincuentak;
                if (veintek > 0) mensaje += "\n- 20k: " + veintek;
                if (diesk > 0) mensaje += "\n- 10k: " + diesk;
                mensaje += "\nSaldo restante: $" + nuevoSaldo;
                
                Pantalla.setText(mensaje);
                cargarDatosTabla(); 

                inputActual = "";
                pasoActual = 0; 
                con.close();
            }

        } catch (NumberFormatException e) {
            Pantalla.setText("Ingrese solo números válidos");
            inputActual = "";
        } catch (SQLException e) {
            Pantalla.setText("Error SQL: " + e.getMessage());
            inputActual = "";
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCorreccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorreccionActionPerformed
        if (inputActual.length() > 0) {
        inputActual = inputActual.substring(0, inputActual.length() - 1);
        Pantalla.setText("> " + inputActual);
        }
    }//GEN-LAST:event_btnCorreccionActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Connection con = conectar();
        if (con != null) {
            liberarSistema(con);
        }
        inputActual = "";
        pasoActual = 0;
        Pantalla.setText("Ingrese el ID del Cajero (1 - 7):\n> ");
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Pantalla;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCorreccion;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
