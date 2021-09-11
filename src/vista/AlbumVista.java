/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import modelo.AlbumModelo;
import controlador.AlbumControlador;
import java.awt.Font;
import java.util.ArrayList;
import modelo.AutorModelo;
import controlador.AutorControlador;

/**
 *
 * @author Vane
 */
public class AlbumVista extends javax.swing.JFrame {

    private int initialCount = 0;
    private int initialCountList = 0;
    private boolean save = false;
    private boolean edit = false;
    private ArrayList<AutorModelo> listaAutores;
    private ArrayList<AlbumModelo> lista;
    private AlbumModelo albumSelected = null;

    /**
     * Creates new form AlbumVista
     */
    public AlbumVista() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_albumes = new javax.swing.JTable();
        input_name = new javax.swing.JTextField();
        input_genero = new javax.swing.JTextField();
        input_precio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        input_rating = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        input_autor = new javax.swing.JComboBox<>();
        input_canciones = new javax.swing.JSpinner();
        eliminar_button = new javax.swing.JButton();
        editar_button = new javax.swing.JButton();
        create_button = new javax.swing.JButton();
        toast = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 204));
        jLabel1.setText("ALBUMES");
        jLabel1.setToolTipText("");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jScrollPane1PropertyChange(evt);
            }
        });

        list_albumes.setForeground(new java.awt.Color(153, 153, 153));
        list_albumes.setModel(new javax.swing.table.DefaultTableModel(
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
        list_albumes.setGridColor(new java.awt.Color(102, 0, 204));
        list_albumes.setInheritsPopupMenu(true);
        list_albumes.setSelectionBackground(new java.awt.Color(204, 204, 255));
        list_albumes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        list_albumes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list_albumes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_albumesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list_albumes);

        input_name.setForeground(new java.awt.Color(204, 204, 204));
        input_name.setText("Escribe el nombre");
        input_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input_nameMouseClicked(evt);
            }
        });
        input_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nameActionPerformed(evt);
            }
        });

        input_genero.setForeground(new java.awt.Color(204, 204, 204));
        input_genero.setText("Escribe el género");
        input_genero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input_generoMouseClicked(evt);
            }
        });

        input_precio.setForeground(new java.awt.Color(204, 204, 204));
        input_precio.setText("Escribe el precio");
        input_precio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input_precioMouseClicked(evt);
            }
        });
        input_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_precioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 204));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 204));
        jLabel3.setText("Autor");

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 204));
        jLabel4.setText("Género");

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 204));
        jLabel5.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 204));
        jLabel6.setText("Número canciones");

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 204));
        jLabel7.setText("Rating");

        input_rating.setForeground(new java.awt.Color(204, 204, 204));
        input_rating.setText("Escribe el rating");
        input_rating.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input_ratingMouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 0, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo_circulo_pequeño.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(208, 204));
        jLabel8.setMinimumSize(new java.awt.Dimension(208, 204));
        jLabel8.setPreferredSize(new java.awt.Dimension(208, 204));

        input_autor.setForeground(new java.awt.Color(204, 204, 204));
        input_autor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un autor" }));
        input_autor.setToolTipText("");
        input_autor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                input_autorItemStateChanged(evt);
            }
        });
        input_autor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                input_autorPropertyChange(evt);
            }
        });

        input_canciones.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        input_canciones.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                input_cancionesStateChanged(evt);
            }
        });

        eliminar_button.setBackground(new java.awt.Color(255, 255, 255));
        eliminar_button.setForeground(new java.awt.Color(102, 0, 204));
        eliminar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/trash.png"))); // NOI18N
        eliminar_button.setText("Delete");
        eliminar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_buttonActionPerformed(evt);
            }
        });

        editar_button.setBackground(new java.awt.Color(255, 255, 255));
        editar_button.setForeground(new java.awt.Color(102, 0, 204));
        editar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        editar_button.setText("Editar");
        editar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editar_buttonMouseClicked(evt);
            }
        });

        create_button.setBackground(new java.awt.Color(255, 255, 255));
        create_button.setForeground(new java.awt.Color(102, 0, 204));
        create_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        create_button.setText("Crear");
        create_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_buttonMouseClicked(evt);
            }
        });

        toast.setBackground(new java.awt.Color(255, 255, 255));
        toast.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        toast.setForeground(new java.awt.Color(102, 0, 204));
        toast.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        toast.setText("Mensaje");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(input_genero, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel2)
                                        .addComponent(input_name, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(input_canciones))
                                    .addComponent(toast, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(input_rating)
                                    .addComponent(input_precio)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(118, 118, 118))
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(input_autor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(create_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editar_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminar_button)))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar_button)
                    .addComponent(editar_button)
                    .addComponent(create_button))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_rating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_canciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toast, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        input_name.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.toast.setVisible(false);
        this.save = true;
        int id = this.albumSelected != null ? this.albumSelected.getId() : 0;
        int id_album = this.albumSelected != null ? this.albumSelected.getId_album() : 0;
        int numero_canciones = Integer.parseInt(this.input_canciones.getValue().toString());
        double rating = Double.parseDouble(this.input_rating.getText());
        String autor = this.input_autor.getSelectedItem().toString();
        String nombre = this.input_name.getText();
        double precio = Double.parseDouble(this.input_precio.getText());
        String genero = this.input_genero.getText();
        AutorModelo autorO = new AutorModelo(1, autor, "Colombiana", "Grupo", false);
        for (AutorModelo autorName : listaAutores) {
            if (autorName.getNombre().equals(this.input_autor.getSelectedItem())) {
                autorO = autorName;
            }
        }
        if (this.albumSelected != null) {
            AlbumControlador.editar_album(id_album, numero_canciones, rating, id, autorO, nombre, precio, genero);
            this.toast.setText("Album editado de forma correcta");
        } else {
            this.albumSelected = AlbumControlador.crear_album(id_album, numero_canciones, rating, id, autorO, nombre, precio, genero);
            this.toast.setText("Album creado de forma correcta");
        }
        upload_table();
        clear_form();
        this.save = false;
        this.toast.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clear_form() {
        this.toast.setVisible(false);
        this.edit = true;
        this.input_autor.addItem("Selecciona un autor");
        this.input_autor.setSelectedItem("Selecciona un autor");
        this.input_autor.setForeground(new Color(204, 204, 204));
        this.input_name.setText("Escribe el nombre");
        this.input_name.setForeground(new Color(204, 204, 204));
        this.input_genero.setText("Escribe el género");
        this.input_genero.setForeground(new Color(204, 204, 204));
        this.input_precio.setText("Escribe el precio");
        this.input_precio.setForeground(new Color(204, 204, 204));
        this.input_rating.setText("Escribe el rating");
        this.input_rating.setForeground(new Color(204, 204, 204));
        this.input_canciones.setValue(0);
        this.albumSelected = null;
        this.edit = false;
    }
    private void input_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_precioActionPerformed

    private void input_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nameActionPerformed
        // TODO add your handling code here:
        System.out.println("evento");
        System.out.println(evt);
    }//GEN-LAST:event_input_nameActionPerformed

    private void input_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_nameMouseClicked
        // TODO add your handling code here:
        if (this.input_name.getText().equals("Escribe el nombre")) {
            this.input_name.setText("");
            this.input_name.setForeground(Color.black);
        }
    }//GEN-LAST:event_input_nameMouseClicked

    private void input_generoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_generoMouseClicked
        // TODO add your handling code here:
        if (this.input_genero.getText().equals("Escribe el género")) {
            this.input_genero.setText("");
            this.input_genero.setForeground(Color.black);
        }
    }//GEN-LAST:event_input_generoMouseClicked

    private void input_precioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_precioMouseClicked
        // TODO add your handling code here:
        if (this.input_precio.getText().equals("Escribe el precio")) {
            this.input_precio.setText("");
            this.input_precio.setForeground(Color.black);
        }
    }//GEN-LAST:event_input_precioMouseClicked

    private void input_ratingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_ratingMouseClicked
        // TODO add your handling code here:
        if (this.input_rating.getText().equals("Escribe el rating")) {
            this.input_rating.setText("");
            this.input_rating.setForeground(Color.black);
        }
    }//GEN-LAST:event_input_ratingMouseClicked

    private void input_cancionesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_input_cancionesStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_input_cancionesStateChanged

    private void input_autorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_input_autorItemStateChanged
        // TODO add your handling code here:
        if (!save && !edit) {
            this.input_autor.setForeground(Color.black);
            this.input_autor.removeItem("Selecciona un autor");
        }
    }//GEN-LAST:event_input_autorItemStateChanged

    private void input_autorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_input_autorPropertyChange
        // TODO add your handling code here:
        this.listaAutores = AutorControlador.lista_autores();
        this.toast.setVisible(false);
        if (this.initialCount == 0) {
            for (AutorModelo autor : listaAutores) {
                this.input_autor.addItem(autor.getNombre());
            }
        }
        this.initialCount++;
    }//GEN-LAST:event_input_autorPropertyChange

    private void jScrollPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jScrollPane1PropertyChange
        // TODO add your handling code here:
        if (this.initialCountList == 0) {
            this.list_albumes.getTableHeader().setBackground(new Color(102, 0, 204));
            this.list_albumes.getTableHeader().setForeground(Color.white);
            this.list_albumes.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 14));
            upload_table();
        }
        this.initialCountList++;

    }//GEN-LAST:event_jScrollPane1PropertyChange

    private void upload_table() {
        this.lista = AlbumControlador.lista_albumes();
        String album[][] = new String[lista.size()][11];
        for (int i = 0; i < lista.size(); i++) {
            album[i][0] = lista.get(i).getNombre();
            album[i][1] = lista.get(i).getAutor().getNombre();
            album[i][2] = lista.get(i).getGenero();
            album[i][3] = String.valueOf(lista.get(i).getPrecio());
            album[i][4] = String.valueOf(lista.get(i).getNumero_canciones());
            album[i][5] = String.valueOf(lista.get(i).getRating());
            album[i][6] = String.valueOf(lista.get(i).getId());
            album[i][7] = String.valueOf(lista.get(i).getId_album());
            album[i][8] = String.valueOf(lista.get(i).getAutor().getId_autor());
            album[i][9] = lista.get(i).getAutor().getNacionalidad();
            album[i][10] = lista.get(i).getAutor().getTipo();
        }
        this.list_albumes.setModel(new javax.swing.table.DefaultTableModel(
                album,
                new String[]{
                    "Nombre", "Autor", "Genero", "Precio", "Número canciones", "Rating"
                }
        ));
    }
    private void eliminar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_buttonActionPerformed
        // TODO add your handling code here:
        AlbumControlador.eliminar_album(this.albumSelected.getId(), this.albumSelected.getId_album());
        clear_form();
        upload_table();
        this.toast.setVisible(true);
        this.toast.setText("Album eliminado de forma correcta");
    }//GEN-LAST:event_eliminar_buttonActionPerformed

    private void list_albumesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_albumesMouseClicked
        // TODO add your handling code here:
        clear_form();
        int row = list_albumes.rowAtPoint(evt.getPoint());
        if (row >= 0) {
            this.albumSelected = this.lista.get(row);
        }
    }//GEN-LAST:event_list_albumesMouseClicked

    private void upload_form() {
        if (this.albumSelected != null) {
            this.input_autor.removeItem("Selecciona un autor");
            this.input_autor.setSelectedItem(this.albumSelected.getAutor().getNombre());
            this.input_autor.setForeground(Color.BLACK);
            this.input_name.setText(this.albumSelected.getNombre());
            this.input_name.setForeground(Color.BLACK);
            this.input_genero.setText(this.albumSelected.getGenero());
            this.input_genero.setForeground(Color.BLACK);
            this.input_precio.setText(String.valueOf(this.albumSelected.getPrecio()));
            this.input_precio.setForeground(Color.BLACK);
            this.input_rating.setText(String.valueOf(this.albumSelected.getRating()));
            this.input_rating.setForeground(Color.BLACK);
            this.input_canciones.setValue(this.albumSelected.getNumero_canciones());
        }
    }

    private void create_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_buttonMouseClicked
        // TODO add your handling code here:
        clear_form();
    }//GEN-LAST:event_create_buttonMouseClicked

    private void editar_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editar_buttonMouseClicked
        // TODO add your handling code here:
        this.toast.setVisible(false);
        edit = true;
        upload_form();
        edit = false;
    }//GEN-LAST:event_editar_buttonMouseClicked

    public void ChangeName(javax.swing.JTable table, int col_index, String col_name) {
        table.getColumnModel().getColumn(col_index).setHeaderValue(col_name);
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
            java.util.logging.Logger.getLogger(AlbumVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlbumVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlbumVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlbumVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlbumVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton create_button;
    private javax.swing.JButton editar_button;
    private javax.swing.JButton eliminar_button;
    private javax.swing.JComboBox<String> input_autor;
    private javax.swing.JSpinner input_canciones;
    private javax.swing.JTextField input_genero;
    private javax.swing.JTextField input_name;
    private javax.swing.JTextField input_precio;
    private javax.swing.JTextField input_rating;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable list_albumes;
    private javax.swing.JLabel toast;
    // End of variables declaration//GEN-END:variables
}
