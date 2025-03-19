package facebook;

import UserManagementClases.RegularUsu;
import UserManagementClases.AdminBinary;
import UserManagementClases.AdminPosts;
import UserManagementClases.AdminUsu;
import UserManagementClases.Chat;
import UserManagementClases.Eventos;
import UserManagementClases.Message;
import UserManagementClases.Usuario;
import UserManagementClases.post;
import UserManagementClases.post_GrupoImages;
import UserManagementClases.post_Text;
import UserManagementClases.post_Video;
import UserManagementClases.post_image;
import UserManagementClases.reminderHilo;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.media.Manager;
import javax.media.Player;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PrincipalFace extends javax.swing.JFrame {

    public PrincipalFace() {
        initComponents();
        System.setProperty("java.media.property.strict", "false");

        jPanel_Video.setVisible(false);
        jscrollpane_manyImages.setVisible(false);
        jPanel_singleImage.setVisible(false);
        jscrollpane_text.setVisible(false);
        jTextArea_caption.setEditable(false);
        jButton_principalFace_adminWindow.setVisible(false);

        this.setExtendedState(MAXIMIZED_BOTH);
        this.pack();
        this.setLocationRelativeTo(null);
//        UserfileManage.getUser().add(new AdminUsu("admin@gmail.com", "1111", "admin"));
//        try {
//                        PostsFileManage.addtoFile();
//            UserfileManage.addtoFile();
//        } catch (Exception e) {
//        }

    }

    private void createScene(File file) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                MediaPlayer oraclevid = new MediaPlayer(new Media(file.toURI().toString()));
                MediaView view = new MediaView(oraclevid);
                view.setFitWidth(580);
                view.setFitHeight(380);

                jfxPanel.setScene(new Scene(new Group(view)));
                oraclevid.setVolume(0);
                oraclevid.setCycleCount(MediaPlayer.INDEFINITE);
                oraclevid.play();
            }
        }
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_Registrarse = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextField_jdregistro_nombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_jdregistro_apellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField__jdregistro_correo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser_jdregistro_fecha = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton_Registro = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLocaleChooser__jdregistro_pais = new com.toedter.components.JLocaleChooser();
        jPasswordField__jdregistro_contra = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        buttonGroup__jdregistro_sexo = new javax.swing.ButtonGroup();
        jDialog_PrincipalFace = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel_principalface_chat = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_chat_UserList = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_chat_chat = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_chat_textmessage = new javax.swing.JTextArea();
        jButton_chat_send = new javax.swing.JButton();
        jButton_chat_update = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jPanel_principal_posts = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList_principal_posts = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea_caption = new javax.swing.JTextArea();
        jButton_post_like = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        Jlabel_likescounter = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel_sharecounter = new javax.swing.JLabel();
        jButton_showcomments = new javax.swing.JButton();
        jPanel_Video = new javax.swing.JPanel();
        jLabel_singleImage1 = new javax.swing.JLabel();
        jTextField_post_comment = new javax.swing.JTextField();
        jPanel_singleImage = new javax.swing.JPanel();
        jLabel_singleImage = new javax.swing.JLabel();
        jButton_post_newPost = new javax.swing.JButton();
        jscrollpane_manyImages = new javax.swing.JScrollPane();
        jPanel_posts_manyImages = new javax.swing.JPanel();
        jLabel_multiImage_1 = new javax.swing.JLabel();
        jLabel_multiImage_2 = new javax.swing.JLabel();
        jLabel_multiImage_3 = new javax.swing.JLabel();
        jLabel_multiImage_4 = new javax.swing.JLabel();
        jscrollpane_text = new javax.swing.JScrollPane();
        jTextArea_postText = new javax.swing.JTextArea();
        jLabel52 = new javax.swing.JLabel();
        jButton_recargar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton_MusicPlayer = new javax.swing.JButton();
        jButton_principalFace_adminWindow = new javax.swing.JButton();
        jPanel_principalface_cuenta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_ceunta_nombreCuentaOficial = new javax.swing.JLabel();
        jButton_cuentaPanel_editar = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        JLabel_nickname = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel_nombreCom = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel_descripción = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel_cuenta_perfil = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jDialog_amigos = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jButton_amigos_consulta = new javax.swing.JButton();
        jButton_amigos_regresar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList_amigos_listaAmigos = new javax.swing.JList<>();
        jLabel40 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList_amigos_request = new javax.swing.JList<>();
        jLabel21 = new javax.swing.JLabel();
        jButton_amigos_accept = new javax.swing.JButton();
        jButton_amigos_rechazar = new javax.swing.JButton();
        jButton_regresarsolicitudes = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_amigos_allUsers = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jDialog_eventos = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jDateChooser_eventos_fecha = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        jTextField_eventos_nombre = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField_eventos_des = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList_eventos_listaE = new javax.swing.JList<>();
        jButton9 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton_si = new javax.swing.JRadioButton();
        jRadioButton_no = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        jTextField_eventos_retraso = new javax.swing.JTextField();
        jTextField_eventos_recordarDes = new javax.swing.JTextField();
        jPopupMenu_Chat_options = new javax.swing.JPopupMenu();
        jMenuItem_chat_edit = new javax.swing.JMenuItem();
        jMenuItem_chat_refreshTXTA = new javax.swing.JMenuItem();
        jDialog_newpost = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea_newpost_txtpost = new javax.swing.JTextArea();
        jButton_newpost_newTXTPOST = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField_newpost_titulo_textpost = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton_newpost_upload_MultipleImages = new javax.swing.JButton();
        jSpinner_newpost_ammout = new javax.swing.JSpinner();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea_newpost_Collage_descripcion = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField_newpost_titulo_Collage = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea_newpost_videopost_descripcion = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        jButton_newpost_upload_SingleVideo = new javax.swing.JButton();
        jTextField_newpost_titulo_Video = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton_newpost_upload_SingleImage = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea_newpost_imagepost_descripcion = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jTextField_newpost_titulo_Image = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        buttonGroup_eventos_recordar = new javax.swing.ButtonGroup();
        jDialog_musicPlayer = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jButton_mmusicplayer_choose = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextField_musicPlayer_playing = new javax.swing.JTextField();
        jButton_musicPlayer_Pause = new javax.swing.JButton();
        jButton_musicPlayer_stop = new javax.swing.JButton();
        jButton_musicPlayer_start = new javax.swing.JButton();
        jDialog_adminWindow = new javax.swing.JDialog();
        jTabbedPane_adminMenu = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jButton_adminWindow_crear = new javax.swing.JButton();
        jTextField_adminWindow_Nombre = new javax.swing.JTextField();
        jTextField_adminWindow_correo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jPasswordField_adminWindow_Contraseña = new javax.swing.JPasswordField();
        jLabel32 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jList_adminWindow_PostList = new javax.swing.JList<>();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jList_adminWindow_UserList = new javax.swing.JList<>();
        jPopupMenu_adminWindow_UserAdmin = new javax.swing.JPopupMenu();
        jMenuItem_adminWindow_banear = new javax.swing.JMenuItem();
        jPopupMenu_adminWindow_PostAdmin = new javax.swing.JPopupMenu();
        jMenuItem_adminWindow_deletePost = new javax.swing.JMenuItem();
        jDialog_comments = new javax.swing.JDialog();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea_comments = new javax.swing.JTextArea();
        jButton_comentarios_cerrar = new javax.swing.JButton();
        jPanel_Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Principal_correo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField_Principal_password = new javax.swing.JPasswordField();
        jButton_registrar = new javax.swing.JButton();
        jButton_Principal_iniciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jDialog_Registrarse.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Registrarse");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Es rápido y fácil.");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Apellido");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Correo Electrónico");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Contraseña");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Fecha de Naciemiento");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Sexo");

        buttonGroup__jdregistro_sexo.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Femenino");

        buttonGroup__jdregistro_sexo.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Masculino");

        buttonGroup__jdregistro_sexo.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("Personalizado");

        jButton_Registro.setBackground(new java.awt.Color(0, 204, 51));
        jButton_Registro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Registro.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Registro.setText("Registrarse");
        jButton_Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RegistroMouseClicked(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Idioma y País");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/iconox.jpg"))); // NOI18N

        javax.swing.GroupLayout jDialog_RegistrarseLayout = new javax.swing.GroupLayout(jDialog_Registrarse.getContentPane());
        jDialog_Registrarse.getContentPane().setLayout(jDialog_RegistrarseLayout);
        jDialog_RegistrarseLayout.setHorizontalGroup(
            jDialog_RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_RegistrarseLayout.createSequentialGroup()
                .addGroup(jDialog_RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_RegistrarseLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jButton_Registro))
                    .addGroup(jDialog_RegistrarseLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jDialog_RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog_RegistrarseLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog_RegistrarseLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(37, 37, 37)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3))
                            .addGroup(jDialog_RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField__jdregistro_correo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLocaleChooser__jdregistro_pais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPasswordField__jdregistro_contra, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser_jdregistro_fecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDialog_RegistrarseLayout.createSequentialGroup()
                                    .addGroup(jDialog_RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_jdregistro_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jDialog_RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_jdregistro_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 65, Short.MAX_VALUE))
        );
        jDialog_RegistrarseLayout.setVerticalGroup(
            jDialog_RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_RegistrarseLayout.createSequentialGroup()
                .addGroup(jDialog_RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_RegistrarseLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_RegistrarseLayout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog_RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_jdregistro_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_jdregistro_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField__jdregistro_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField__jdregistro_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser_jdregistro_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog_RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLocaleChooser__jdregistro_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 510));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_principalface_chat.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_principalface_chat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Chat");
        jPanel_principalface_chat.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 50));

        jList_chat_UserList.setModel(new DefaultListModel());
        jList_chat_UserList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList_chat_UserList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_chat_UserListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList_chat_UserList);

        jPanel_principalface_chat.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 350));

        jTextArea_chat_chat.setEditable(false);
        jTextArea_chat_chat.setColumns(20);
        jTextArea_chat_chat.setRows(5);
        jTextArea_chat_chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea_chat_chatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea_chat_chat);

        jPanel_principalface_chat.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 560, 330));

        jTextArea_chat_textmessage.setColumns(20);
        jTextArea_chat_textmessage.setRows(5);
        jScrollPane3.setViewportView(jTextArea_chat_textmessage);

        jPanel_principalface_chat.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 460, 50));

        jButton_chat_send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/message.png"))); // NOI18N
        jButton_chat_send.setText("send");
        jButton_chat_send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_chat_sendMouseClicked(evt);
            }
        });
        jPanel_principalface_chat.add(jButton_chat_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 90, 50));

        jButton_chat_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/update.png"))); // NOI18N
        jButton_chat_update.setText("update");
        jButton_chat_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_chat_updateMouseClicked(evt);
            }
        });
        jPanel_principalface_chat.add(jButton_chat_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 160, 30));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/messenger.png"))); // NOI18N
        jPanel_principalface_chat.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 60, 50));

        jPanel2.add(jPanel_principalface_chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 750, 520));

        jPanel_principal_posts.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_principal_posts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList_principal_posts.setModel(new DefaultListModel()
        );
        jList_principal_posts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_principal_postsMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jList_principal_posts);

        jPanel_principal_posts.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 135, 380));

        jTextArea_caption.setEditable(false);
        jTextArea_caption.setColumns(20);
        jTextArea_caption.setLineWrap(true);
        jTextArea_caption.setRows(5);
        jTextArea_caption.setWrapStyleWord(true);
        jTextArea_caption.setBorder(null);
        jTextArea_caption.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane9.setViewportView(jTextArea_caption);

        jPanel_principal_posts.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 410, 50));

        jButton_post_like.setText(">");
        jButton_post_like.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_post_likeMouseClicked(evt);
            }
        });
        jPanel_principal_posts.add(jButton_post_like, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 70, 30));

        jButton11.setText("♡");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel_principal_posts.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 40, 50));

        Jlabel_likescounter.setText("0");
        jPanel_principal_posts.add(Jlabel_likescounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 10, 50));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FacebookServer/compartir.png"))); // NOI18N
        jButton13.setText("share");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel_principal_posts.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, 30));

        jLabel_sharecounter.setText("0");
        jPanel_principal_posts.add(jLabel_sharecounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 20, 30));

        jButton_showcomments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FacebookServer/com.png"))); // NOI18N
        jButton_showcomments.setText("commentarios");
        jButton_showcomments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_showcommentsMouseClicked(evt);
            }
        });
        jPanel_principal_posts.add(jButton_showcomments, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        javax.swing.GroupLayout jPanel_VideoLayout = new javax.swing.GroupLayout(jPanel_Video);
        jPanel_Video.setLayout(jPanel_VideoLayout);
        jPanel_VideoLayout.setHorizontalGroup(
            jPanel_VideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VideoLayout.createSequentialGroup()
                .addComponent(jLabel_singleImage1)
                .addGap(0, 590, Short.MAX_VALUE))
        );
        jPanel_VideoLayout.setVerticalGroup(
            jPanel_VideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VideoLayout.createSequentialGroup()
                .addComponent(jLabel_singleImage1)
                .addGap(0, 390, Short.MAX_VALUE))
        );

        jPanel_principal_posts.add(jPanel_Video, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 8, 590, 390));
        jPanel_principal_posts.add(jTextField_post_comment, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 510, 30));

        javax.swing.GroupLayout jPanel_singleImageLayout = new javax.swing.GroupLayout(jPanel_singleImage);
        jPanel_singleImage.setLayout(jPanel_singleImageLayout);
        jPanel_singleImageLayout.setHorizontalGroup(
            jPanel_singleImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_singleImageLayout.createSequentialGroup()
                .addComponent(jLabel_singleImage)
                .addGap(0, 590, Short.MAX_VALUE))
        );
        jPanel_singleImageLayout.setVerticalGroup(
            jPanel_singleImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_singleImageLayout.createSequentialGroup()
                .addComponent(jLabel_singleImage)
                .addGap(0, 390, Short.MAX_VALUE))
        );

        jPanel_principal_posts.add(jPanel_singleImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 8, 590, 390));

        jButton_post_newPost.setText("new post");
        jButton_post_newPost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_post_newPostMouseClicked(evt);
            }
        });
        jButton_post_newPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_post_newPostActionPerformed(evt);
            }
        });
        jPanel_principal_posts.add(jButton_post_newPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 135, 30));

        jPanel_posts_manyImages.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_posts_manyImages.add(jLabel_multiImage_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        jPanel_posts_manyImages.add(jLabel_multiImage_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 0));
        jPanel_posts_manyImages.add(jLabel_multiImage_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 0, 0));
        jPanel_posts_manyImages.add(jLabel_multiImage_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jscrollpane_manyImages.setViewportView(jPanel_posts_manyImages);

        jPanel_principal_posts.add(jscrollpane_manyImages, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 12, 590, 390));

        jTextArea_postText.setColumns(20);
        jTextArea_postText.setLineWrap(true);
        jTextArea_postText.setRows(5);
        jTextArea_postText.setWrapStyleWord(true);
        jscrollpane_text.setViewportView(jTextArea_postText);

        jPanel_principal_posts.add(jscrollpane_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 590, 390));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Posts:");
        jPanel_principal_posts.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton_recargar.setText("Recargar");
        jButton_recargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_recargarMouseClicked(evt);
            }
        });
        jPanel_principal_posts.add(jButton_recargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jPanel2.add(jPanel_principal_posts, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 770, 530));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jButton4.setText("Amigos");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton2.setText("Juegos");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton7.setText("Eventos");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton_MusicPlayer.setText("Musica");
        jButton_MusicPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_MusicPlayerMouseClicked(evt);
            }
        });

        jButton_principalFace_adminWindow.setText("ADMIN");
        jButton_principalFace_adminWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_principalFace_adminWindowMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_MusicPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_principalFace_adminWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addGap(52, 52, 52)
                .addComponent(jButton2)
                .addGap(54, 54, 54)
                .addComponent(jButton7)
                .addGap(65, 65, 65)
                .addComponent(jButton_MusicPlayer)
                .addGap(73, 73, 73)
                .addComponent(jButton_principalFace_adminWindow)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 520));

        jPanel_principalface_cuenta.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_principalface_cuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/fc.png"))); // NOI18N
        jPanel_principalface_cuenta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 80, 70));

        jLabel_ceunta_nombreCuentaOficial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel_principalface_cuenta.add(jLabel_ceunta_nombreCuentaOficial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 210, 40));

        jButton_cuentaPanel_editar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_cuentaPanel_editar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_cuentaPanel_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/lapiz1.png"))); // NOI18N
        jButton_cuentaPanel_editar.setText("Editar Perfil");
        jButton_cuentaPanel_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_cuentaPanel_editarMouseClicked(evt);
            }
        });
        jPanel_principalface_cuenta.add(jButton_cuentaPanel_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jButton10.setBackground(new java.awt.Color(204, 204, 255));
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("Editar Detalles");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel.setForeground(new java.awt.Color(0, 0, 0));
        jLabel.setText("Nickname:");

        JLabel_nickname.setForeground(new java.awt.Color(0, 0, 0));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Nombre Completo:");

        jLabel_nombreCom.setForeground(new java.awt.Color(0, 0, 0));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Descripción:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(86, 86, 86))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel_nickname, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel_nombreCom, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel_descripción, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabel_nickname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addComponent(jLabel_nombreCom, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_descripción, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton10)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel_principalface_cuenta.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 290, 330));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Detalles");
        jPanel_principalface_cuenta.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 70, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/ca.png"))); // NOI18N
        jPanel_principalface_cuenta.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 30, 20));
        jPanel_principalface_cuenta.add(jLabel_cuenta_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 130, 130));

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Log out");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel_principalface_cuenta.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jPanel2.add(jPanel_principalface_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 530, 520));

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 255));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu1.setText("Página Principal");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Chat");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cuenta");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jDialog_PrincipalFace.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jDialog_PrincipalFaceLayout = new javax.swing.GroupLayout(jDialog_PrincipalFace.getContentPane());
        jDialog_PrincipalFace.getContentPane().setLayout(jDialog_PrincipalFaceLayout);
        jDialog_PrincipalFaceLayout.setHorizontalGroup(
            jDialog_PrincipalFaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
        );
        jDialog_PrincipalFaceLayout.setVerticalGroup(
            jDialog_PrincipalFaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_PrincipalFaceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton_amigos_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/consultar.png"))); // NOI18N
        jButton_amigos_consulta.setText("Consultar");
        jButton_amigos_consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_amigos_consultaMouseClicked(evt);
            }
        });

        jButton_amigos_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/return.png"))); // NOI18N
        jButton_amigos_regresar.setText("Regresar");
        jButton_amigos_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_amigos_regresarMouseClicked(evt);
            }
        });

        jList_amigos_listaAmigos.setModel(new DefaultListModel()
        );
        jScrollPane6.setViewportView(jList_amigos_listaAmigos);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/amigoslista.png"))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Amigos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jButton_amigos_consulta)
                .addGap(63, 63, 63)
                .addComponent(jButton_amigos_regresar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel40)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_amigos_consulta)
                    .addComponent(jButton_amigos_regresar))
                .addGap(74, 74, 74))
        );

        jTabbedPane1.addTab("Consultar Amigos", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jList_amigos_request.setModel(new DefaultListModel());
        jScrollPane5.setViewportView(jList_amigos_request);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Solicitudes de amistad");

        jButton_amigos_accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/accept.png"))); // NOI18N
        jButton_amigos_accept.setText("Aceptar");
        jButton_amigos_accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_amigos_acceptMouseClicked(evt);
            }
        });

        jButton_amigos_rechazar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/reject.png"))); // NOI18N
        jButton_amigos_rechazar.setText("Rechazar");
        jButton_amigos_rechazar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_amigos_rechazarMouseClicked(evt);
            }
        });

        jButton_regresarsolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/return.png"))); // NOI18N
        jButton_regresarsolicitudes.setText("Regresar");
        jButton_regresarsolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_regresarsolicitudesMouseClicked(evt);
            }
        });

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/friend.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton_amigos_accept)
                        .addGap(44, 44, 44)
                        .addComponent(jButton_amigos_rechazar)
                        .addGap(47, 47, 47)
                        .addComponent(jButton_regresarsolicitudes))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel42)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel21)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_amigos_accept)
                    .addComponent(jButton_amigos_rechazar)
                    .addComponent(jButton_regresarsolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        jTabbedPane1.addTab("Friend Request", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Todos los Usuarios");

        jList_amigos_allUsers.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jList_amigos_allUsers);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/enviar.png"))); // NOI18N
        jButton3.setText("Enviar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/return.png"))); // NOI18N
        jButton6.setText("Regresar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/users.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton6))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(jLabel43)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel22)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar Usuarios", jPanel6);

        javax.swing.GroupLayout jDialog_amigosLayout = new javax.swing.GroupLayout(jDialog_amigos.getContentPane());
        jDialog_amigos.getContentPane().setLayout(jDialog_amigosLayout);
        jDialog_amigosLayout.setHorizontalGroup(
            jDialog_amigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_amigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jDialog_amigosLayout.setVerticalGroup(
            jDialog_amigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_amigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jDialog_eventos.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 255));
        jLabel23.setText("Crear Eventos");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 255));
        jLabel24.setText("Fecha");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 255));
        jLabel25.setText("Nombre");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 255));
        jLabel26.setText("Descripción");

        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/eventos.png"))); // NOI18N
        jButton8.setText("Crear");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 255));
        jLabel27.setText("Mostrar Eventos");

        jList_eventos_listaE.setModel(new DefaultListModel());
        jScrollPane7.setViewportView(jList_eventos_listaE);

        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/mostrar.png"))); // NOI18N
        jButton9.setText("Mostrar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/activities.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 153, 255));
        jLabel28.setText("Recordatorio y Mensaje");

        buttonGroup_eventos_recordar.add(jRadioButton_si);
        jRadioButton_si.setText("Si");

        buttonGroup_eventos_recordar.add(jRadioButton_no);
        jRadioButton_no.setText("No");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 153, 255));
        jLabel29.setText("Retraso");

        javax.swing.GroupLayout jDialog_eventosLayout = new javax.swing.GroupLayout(jDialog_eventos.getContentPane());
        jDialog_eventos.getContentPane().setLayout(jDialog_eventosLayout);
        jDialog_eventosLayout.setHorizontalGroup(
            jDialog_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_eventosLayout.createSequentialGroup()
                .addGroup(jDialog_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_eventosLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jDialog_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_eventosLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jDialog_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jDateChooser_eventos_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                            .addComponent(jTextField_eventos_nombre)
                            .addComponent(jTextField_eventos_des)
                            .addComponent(jLabel29)
                            .addComponent(jTextField_eventos_retraso)
                            .addComponent(jLabel28)
                            .addGroup(jDialog_eventosLayout.createSequentialGroup()
                                .addComponent(jRadioButton_si)
                                .addGap(29, 29, 29)
                                .addComponent(jRadioButton_no)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_eventos_recordarDes)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jDialog_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_eventosLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_eventosLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        jDialog_eventosLayout.setVerticalGroup(
            jDialog_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_eventosLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_eventosLayout.createSequentialGroup()
                .addGroup(jDialog_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_eventosLayout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addGroup(jDialog_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDialog_eventosLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(387, 387, 387))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDialog_eventosLayout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser_eventos_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_eventos_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_eventos_des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addGroup(jDialog_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton_si)
                                    .addComponent(jRadioButton_no)
                                    .addComponent(jTextField_eventos_recordarDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29))))
                    .addGroup(jDialog_eventosLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel45)
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_eventos_retraso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jDialog_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(27, 27, 27))
        );

        jMenuItem_chat_edit.setText("Edit");
        jMenuItem_chat_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_chat_editActionPerformed(evt);
            }
        });
        jPopupMenu_Chat_options.add(jMenuItem_chat_edit);

        jMenuItem_chat_refreshTXTA.setText("Refresh");
        jMenuItem_chat_refreshTXTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_chat_refreshTXTAActionPerformed(evt);
            }
        });
        jPopupMenu_Chat_options.add(jMenuItem_chat_refreshTXTA);

        jTextArea_newpost_txtpost.setColumns(20);
        jTextArea_newpost_txtpost.setRows(5);
        jScrollPane10.setViewportView(jTextArea_newpost_txtpost);

        jButton_newpost_newTXTPOST.setText("post");
        jButton_newpost_newTXTPOST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_newpost_newTXTPOSTMouseClicked(evt);
            }
        });

        jLabel16.setText("Caption:");

        jLabel50.setText("Titulo");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel50)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addComponent(jButton_newpost_newTXTPOST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_newpost_titulo_textpost))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_newpost_titulo_textpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_newpost_newTXTPOST)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Text Post", jPanel8);

        jButton_newpost_upload_MultipleImages.setText("upload images");
        jButton_newpost_upload_MultipleImages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_newpost_upload_MultipleImagesMouseClicked(evt);
            }
        });

        jSpinner_newpost_ammout.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));

        jTextArea_newpost_Collage_descripcion.setColumns(20);
        jTextArea_newpost_Collage_descripcion.setRows(5);
        jScrollPane11.setViewportView(jTextArea_newpost_Collage_descripcion);

        jLabel33.setText("Descripcion");

        jLabel34.setText("ammount");

        jLabel49.setText("Titulo");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_newpost_titulo_Collage, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                        .addComponent(jLabel49))
                    .addComponent(jLabel33)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton_newpost_upload_MultipleImages, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner_newpost_ammout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_newpost_titulo_Collage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addGap(4, 4, 4)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_newpost_upload_MultipleImages)
                    .addComponent(jSpinner_newpost_ammout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Multiple Images", jPanel10);

        jTextArea_newpost_videopost_descripcion.setColumns(20);
        jTextArea_newpost_videopost_descripcion.setRows(5);
        jScrollPane13.setViewportView(jTextArea_newpost_videopost_descripcion);

        jLabel46.setText("Descripcion");

        jButton_newpost_upload_SingleVideo.setText("upload video");
        jButton_newpost_upload_SingleVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_newpost_upload_SingleVideoMouseClicked(evt);
            }
        });

        jLabel48.setText("Titulo");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_newpost_titulo_Video, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel46)
                    .addComponent(jButton_newpost_upload_SingleVideo, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(jScrollPane13))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_newpost_titulo_Video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_newpost_upload_SingleVideo)
                .addGap(46, 46, 46))
        );

        jTabbedPane2.addTab("Video Post", jPanel11);

        jButton_newpost_upload_SingleImage.setText("upload image");
        jButton_newpost_upload_SingleImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_newpost_upload_SingleImageMouseClicked(evt);
            }
        });

        jTextArea_newpost_imagepost_descripcion.setColumns(20);
        jTextArea_newpost_imagepost_descripcion.setRows(5);
        jScrollPane12.setViewportView(jTextArea_newpost_imagepost_descripcion);

        jLabel35.setText("Descripcion");

        jLabel47.setText("Titulo");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel35)
                        .addComponent(jButton_newpost_upload_SingleImage, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                        .addComponent(jScrollPane12)
                        .addComponent(jTextField_newpost_titulo_Image)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_newpost_titulo_Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_newpost_upload_SingleImage)
                .addGap(48, 48, 48))
        );

        jTabbedPane2.addTab("Image Post", jPanel9);

        javax.swing.GroupLayout jDialog_newpostLayout = new javax.swing.GroupLayout(jDialog_newpost.getContentPane());
        jDialog_newpost.getContentPane().setLayout(jDialog_newpostLayout);
        jDialog_newpostLayout.setHorizontalGroup(
            jDialog_newpostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_newpostLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2))
        );
        jDialog_newpostLayout.setVerticalGroup(
            jDialog_newpostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jDialog_musicPlayer.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setToolTipText("");

        jButton_mmusicplayer_choose.setText("Choose Song");
        jButton_mmusicplayer_choose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_mmusicplayer_chooseMouseClicked(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("playing:");

        jTextField_musicPlayer_playing.setEditable(false);

        jButton_musicPlayer_Pause.setText("Pause");
        jButton_musicPlayer_Pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_musicPlayer_PauseMouseClicked(evt);
            }
        });

        jButton_musicPlayer_stop.setText("Stop");
        jButton_musicPlayer_stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_musicPlayer_stopMouseClicked(evt);
            }
        });

        jButton_musicPlayer_start.setText("Start");
        jButton_musicPlayer_start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_musicPlayer_startMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_mmusicplayer_choose, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_musicPlayer_playing)))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jButton_musicPlayer_stop)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_musicPlayer_Pause)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_musicPlayer_start)
                        .addGap(61, 61, 61))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton_mmusicplayer_choose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField_musicPlayer_playing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_musicPlayer_Pause)
                    .addComponent(jButton_musicPlayer_stop)
                    .addComponent(jButton_musicPlayer_start))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jDialog_musicPlayer.getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jDialog_adminWindow.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane_adminMenu.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane_adminMenu.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane_adminMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane_adminMenuMouseClicked(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_adminWindow_crear.setText("Crear");
        jButton_adminWindow_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_adminWindow_crearMouseClicked(evt);
            }
        });
        jPanel16.add(jButton_adminWindow_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 257, -1));
        jPanel16.add(jTextField_adminWindow_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 260, -1));

        jTextField_adminWindow_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_adminWindow_correoActionPerformed(evt);
            }
        });
        jPanel16.add(jTextField_adminWindow_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 260, -1));

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Contraseña:");
        jPanel16.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));
        jPanel16.add(jPasswordField_adminWindow_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 260, -1));

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Nombre:");
        jPanel16.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Correo:");
        jPanel16.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jTabbedPane_adminMenu.addTab("Crear admin", jPanel16);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jList_adminWindow_PostList.setModel(new DefaultListModel()
        );
        jList_adminWindow_PostList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList_adminWindow_PostList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_adminWindow_PostListMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(jList_adminWindow_PostList);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane_adminMenu.addTab("Posts", jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));

        jList_adminWindow_UserList.setModel(new DefaultListModel()
        );
        jList_adminWindow_UserList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList_adminWindow_UserList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_adminWindow_UserListMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(jList_adminWindow_UserList);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane_adminMenu.addTab("Users", jPanel15);

        jDialog_adminWindow.getContentPane().add(jTabbedPane_adminMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuItem_adminWindow_banear.setText("borrar");
        jMenuItem_adminWindow_banear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_adminWindow_banearActionPerformed(evt);
            }
        });
        jPopupMenu_adminWindow_UserAdmin.add(jMenuItem_adminWindow_banear);

        jMenuItem_adminWindow_deletePost.setText("Delete Post");
        jMenuItem_adminWindow_deletePost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_adminWindow_deletePostActionPerformed(evt);
            }
        });
        jPopupMenu_adminWindow_PostAdmin.add(jMenuItem_adminWindow_deletePost);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea_comments.setEditable(false);
        jTextArea_comments.setColumns(20);
        jTextArea_comments.setLineWrap(true);
        jTextArea_comments.setRows(5);
        jTextArea_comments.setWrapStyleWord(true);
        jScrollPane16.setViewportView(jTextArea_comments);

        jButton_comentarios_cerrar.setText("cerrar");
        jButton_comentarios_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_comentarios_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(jButton_comentarios_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_comentarios_cerrar)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_commentsLayout = new javax.swing.GroupLayout(jDialog_comments.getContentPane());
        jDialog_comments.getContentPane().setLayout(jDialog_commentsLayout);
        jDialog_commentsLayout.setHorizontalGroup(
            jDialog_commentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_commentsLayout.setVerticalGroup(
            jDialog_commentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_Principal.setBackground(new java.awt.Color(204, 204, 255));
        jPanel_Principal.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("facebook");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Facebook te ayuda a comunicarte y compartir con las personas");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("forman parte de tu vida.");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Correo Electrónico");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña");

        jButton_registrar.setBackground(new java.awt.Color(0, 204, 51));
        jButton_registrar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_registrar.setText("Crear cuenta nueva");
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });

        jButton_Principal_iniciar.setBackground(new java.awt.Color(0, 102, 204));
        jButton_Principal_iniciar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Principal_iniciar.setText("Iniciar Sesión");
        jButton_Principal_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Principal_iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField_Principal_password, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Principal_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton_Principal_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField_Principal_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(jPasswordField_Principal_password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton_Principal_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FaceImages/c-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_PrincipalLayout = new javax.swing.GroupLayout(jPanel_Principal);
        jPanel_Principal.setLayout(jPanel_PrincipalLayout);
        jPanel_PrincipalLayout.setHorizontalGroup(
            jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel18))
                    .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );
        jPanel_PrincipalLayout.setVerticalGroup(
            jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_PrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegistroMouseClicked

        //varible special
        try {
            UserfileManage.LoadFile();
            //añadir nuevo usuario
            String correo = jTextField__jdregistro_correo.getText();
            String sexo = "";
            try {
                if (UserfileManage.exists_registro(correo)) {//Verifica si no hay cuentas con el mismo correo
                    if (correctCorreoLogear(correo)) {

                        //validar radiogroup sexo
                        if (jRadioButton1.isSelected()) {
                            sexo = jRadioButton1.getText();
                        } else if (jRadioButton2.isSelected()) {
                            sexo = jRadioButton2.getText();
                        } else if (jRadioButton3.isSelected()) {
                            sexo = jRadioButton3.getText();
                        } else {
                            JOptionPane.showMessageDialog(jDialog_Registrarse, "No es valido");
                        }

                        //crear nuevo usuario
                        RegularUsu New_user = new RegularUsu(jTextField__jdregistro_correo.getText(),
                                jPasswordField__jdregistro_contra.getText(),
                                jLocaleChooser__jdregistro_pais.getSelectedItem().toString(),
                                jTextField_jdregistro_nombre.getText() + "-" + jTextField_jdregistro_apellido.getText(),
                                sexo,
                                jDateChooser_jdregistro_fecha.getDate()
                        );
                        JOptionPane.showMessageDialog(jDialog_Registrarse, "registro");
                        UserfileManage.getUser().add(New_user);
                        llenarPosts();

                        UserfileManage.addtoFile();

                        pos = UserfileManage.findUser(correo);
                        this.user = UserfileManage.getUser().get(pos);
                        jLocaleChooser__jdregistro_pais.setSelectedItem(0);
                        jTextField_jdregistro_nombre.setText("");
                        jTextField_jdregistro_apellido.setText("");
                        jDateChooser_jdregistro_fecha.setDate(new Date());
                        jTextField__jdregistro_correo.setText("");
                        jPasswordField__jdregistro_contra.setText("");
                        try {
                            connectToServer();
                            //set text a vacio

                            jDialog_Registrarse.setVisible(false);
                            jDialog_PrincipalFace.pack();
                            jDialog_PrincipalFace.setVisible(true);
                            this.setVisible(false);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "conncetion failed");
                        }

                    } else {
                        JOptionPane.showMessageDialog(jDialog_Registrarse, "Correo no valido para registrar");
                    }

                    //connectar al server
                } else {
                    JOptionPane.showMessageDialog(jDialog_Registrarse, "Use otro correo");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PrincipalFace.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException io) {
            io.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalFace.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_RegistroMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        //cuenta visible
        String cuenta = jTextField_Principal_correo.getText();
        jLabel_ceunta_nombreCuentaOficial.setText(cuenta);
        JLabel_nickname.setText("Predeterminado");
        jPanel_principalface_chat.setVisible(false);
        jPanel_principalface_cuenta.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        //principal face visible
        llenarPostsAdmin();
        jPanel_principalface_cuenta.setVisible(false);
        jPanel_principalface_chat.setVisible(false);
        jPanel_principal_posts.setVisible(true);
        jDialog_PrincipalFace.pack();
        jDialog_PrincipalFace.setLocationRelativeTo(this);
        jDialog_PrincipalFace.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        jPanel_principalface_cuenta.setVisible(false);
        jPanel_principal_posts.setVisible(false);
        jPanel_principalface_chat.setVisible(true);
        try {
            loadJlistchat();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jMenu2MouseClicked

    private void jList_chat_UserListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_chat_UserListMouseClicked
        if (jList_chat_UserList.getSelectedValue() != null) {
            if (act.getSelected() != jList_chat_UserList.getSelectedValue()) {
                act.setSelected(jList_chat_UserList.getSelectedValue());
                try {
                    loadChatArea();
                } catch (Exception e) {
                    System.out.println("exploto char area");
                }

            }
        }


    }//GEN-LAST:event_jList_chat_UserListMouseClicked

    private void jButton_chat_sendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_chat_sendMouseClicked
        // TODO add your handling code here:
        try {
            UserfileManage.LoadFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy");
            write(user.getCorreo() + ":" + jTextArea_chat_textmessage.getText() + "[" + x.format(new Date()) + "]");
            salida.println(jList_chat_UserList.getSelectedValue() + ";" + user.getCorreo() + ";" + jTextArea_chat_textmessage.getText() + ";[" + x.format(new Date()) + "]");
            UserfileManage.getUser().get(pos).getChats().get(findchat(pos, jList_chat_UserList.getSelectedValue())).getMessages().add(new Message(new Date(), jTextArea_chat_textmessage.getText(), user.getCorreo(), jList_chat_UserList.getSelectedValue()));
            (UserfileManage.getUser().get(UserfileManage.findUser(jList_chat_UserList.getSelectedValue())).getChats().get(findchat(UserfileManage.findUser(jList_chat_UserList.getSelectedValue()), user.getCorreo()))).getMessages().add(new Message(new Date(), jTextArea_chat_textmessage.getText(), user.getCorreo(), jList_chat_UserList.getSelectedValue()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton_chat_sendMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

        ///amigos botton
        jDialog_PrincipalFace.setVisible(false);
        jDialog_amigos.pack();
        jDialog_amigos.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton_amigos_consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_amigos_consultaMouseClicked

        llenarAmigos();


    }//GEN-LAST:event_jButton_amigos_consultaMouseClicked

    private void jButton_amigos_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_amigos_regresarMouseClicked
        jDialog_amigos.setVisible(false);
        jDialog_PrincipalFace.pack();
        jDialog_PrincipalFace.setLocationRelativeTo(this);
        jDialog_PrincipalFace.setVisible(true);
    }//GEN-LAST:event_jButton_amigos_regresarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //cerrar
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton_Principal_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Principal_iniciarActionPerformed

        //validar correo
        String correo = jTextField_Principal_correo.getText();
        String password = jPasswordField_Principal_password.getText();
        //Falta validar que el correo ingresado concuerde con la contraseña de ese usuario en especifico
        if ((jTextField_Principal_correo.getText().isEmpty() == false) || (jPasswordField_Principal_password.getText().isEmpty() == false)) {
            try {
                try {
                    if (UserfileManage.exists_Login(correo, password)) {
                        if (correctCorreoLogear(correo)) {

                            //connectar al server
                            pos = UserfileManage.findUser(correo);
                            user = UserfileManage.getUser().get(pos);
                            jLabel_cuenta_perfil.setIcon(UserfileManage.getUser().get(pos).getPerfil());
                            jTextField_Principal_correo.setText("");
                            jPasswordField_Principal_password.setText("");
                            try {
                                if (user instanceof AdminUsu) {
                                    jButton_principalFace_adminWindow.setVisible(true);
                                    PostsFileManage.LoadFile();
                                    llenarPosts();

                                    connectToServer();
                                    this.setVisible(false);
                                    //mandar a principal
                                    jDialog_PrincipalFace.pack();
                                    jDialog_PrincipalFace.setLocationRelativeTo(this);
                                    jPanel_principalface_chat.setVisible(false);
                                    jPanel_principalface_cuenta.setVisible(false);
                                    jDialog_PrincipalFace.setVisible(true);
                                } else if (user instanceof RegularUsu) {
                                    if (((RegularUsu) user).isBanned() == false) {

                                        PostsFileManage.LoadFile();
                                        llenarPosts();

                                        connectToServer();
                                        this.setVisible(false);
                                        //mandar a principal
                                        jDialog_PrincipalFace.pack();
                                        jDialog_PrincipalFace.setLocationRelativeTo(this);
                                        jPanel_principalface_chat.setVisible(false);
                                        jPanel_principalface_cuenta.setVisible(false);
                                        jDialog_PrincipalFace.setVisible(true);
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Usted esta baneado");
                                    }

                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(this, "Connection Failed");
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Correo no valido");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "No existe ese usuario");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PrincipalFace.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Dejo espacios vacíos");
        }
    }//GEN-LAST:event_jButton_Principal_iniciarActionPerformed

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
        jDialog_Registrarse.pack();
        jDialog_Registrarse.setModal(true);
        jDialog_Registrarse.setLocationRelativeTo(this);
        jDialog_Registrarse.setVisible(true);

    }//GEN-LAST:event_jButton_registrarActionPerformed

    private void jButton_regresarsolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_regresarsolicitudesMouseClicked
        jDialog_amigos.setVisible(false);
        jDialog_PrincipalFace.pack();
        jDialog_PrincipalFace.setLocationRelativeTo(this);
        jDialog_PrincipalFace.setVisible(true);
    }//GEN-LAST:event_jButton_regresarsolicitudesMouseClicked

    private void jButton_amigos_acceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_amigos_acceptMouseClicked

        acceptSoli();


    }//GEN-LAST:event_jButton_amigos_acceptMouseClicked

    private void jButton_amigos_rechazarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_amigos_rechazarMouseClicked
        rechazaSoli();
    }//GEN-LAST:event_jButton_amigos_rechazarMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        if (verificaramigo()) {
            enviarSoli();
        } else {
            JOptionPane.showMessageDialog(jDialog_amigos, "ya es su amigo");
        }

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        jDialog_amigos.setVisible(false);
        jDialog_PrincipalFace.pack();
        jDialog_PrincipalFace.setLocationRelativeTo(this);
        jDialog_PrincipalFace.setVisible(true);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            Runtime.getRuntime().exec("java -jar Proyecto_finalP1_SheyllaCortez.jar");
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_jButton2MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged

        if (jTabbedPane1.getSelectedIndex() == 1) {
            verSolis();
        } else if (jTabbedPane1.getSelectedIndex() == 2) {
            llenarUsu();
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton_chat_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_chat_updateMouseClicked
        // TODO add your handling code here:
        try {
            loadJlistchat();
        } catch (IOException ex) {
            Logger.getLogger(PrincipalFace.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_chat_updateMouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        //eventos
        jDialog_eventos.pack();
        jDialog_eventos.setLocationRelativeTo(jDialog_PrincipalFace);
        jDialog_eventos.setVisible(true);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jTextArea_chat_chatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea_chat_chatMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON3) {
            jPopupMenu_Chat_options.show(jDialog_PrincipalFace, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTextArea_chat_chatMouseClicked

    private void jMenuItem_chat_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_chat_editActionPerformed
        // TODO add your handling code here:
        try {
            if (UserfileManage.getUser().get(pos).getChats().get(findchat(pos, jList_chat_UserList.getSelectedValue())).getMessages().get(UserfileManage.getUser().get(pos).getChats().size() - 1).getSender().equals(user.getCorreo())) {
                //terminar metodos del menu
                int pos2 = UserfileManage.getUser().get(pos).getChats().size() - 1;
                String s = JOptionPane.showInputDialog("edit message: ");
                UserfileManage.getUser().get(pos).getChats().get(findchat(pos, jList_chat_UserList.getSelectedValue())).getMessages().get(pos2).setMessage("[edited]" + s);
                UserfileManage.getUser().get(pos2).getChats().get(findchat(pos2, user.getCorreo())).getMessages().get(UserfileManage.getUser().get(pos2).getChats().size() - 1).setMessage("[edited]" + s);
            } else {
                JOptionPane.showMessageDialog(jDialog_PrincipalFace, "No puede mensaje para editar");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jDialog_PrincipalFace, "Fallo al editar");
            e.printStackTrace();
        }

    }//GEN-LAST:event_jMenuItem_chat_editActionPerformed

    private void jMenuItem_chat_refreshTXTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_chat_refreshTXTAActionPerformed
        // TODO add your handling code here:
        try {
            loadChatArea();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jDialog_PrincipalFace, "error en recarga");
            e.printStackTrace();
        }

    }//GEN-LAST:event_jMenuItem_chat_refreshTXTAActionPerformed

    private void jButton_newpost_newTXTPOSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_newpost_newTXTPOSTMouseClicked
        // TODO add your handling code here:
        if (!jTextArea_newpost_txtpost.getText().isEmpty()) {
            try {
                PostsFileManage.LoadFile();
            } catch (Exception e) {
            }
            PostsFileManage.getPosts().add(new post_Text(jTextArea_newpost_txtpost.getText(), user.getCorreo(), jTextField_newpost_titulo_textpost.getText()));
            jTextArea_newpost_txtpost.setText("");
            llenarPosts();
            jDialog_newpost.setVisible(false);
            try {
                PostsFileManage.addtoFile();
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(jDialog_newpost, "Ingrese algo para poder subirlo");
        }

    }//GEN-LAST:event_jButton_newpost_newTXTPOSTMouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        //crear evento
        try {
            UserfileManage.LoadFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        boolean recordar = false;
        if (jRadioButton_si.isSelected()) {
            recordar = true;
        } else if (jRadioButton_no.isSelected()) {
            recordar = false;
        }
        int retraso = Integer.parseInt(jTextField_eventos_retraso.getText());
        String mensaje = jTextField_eventos_recordarDes.getText();
        reminderHilo recuerda = new reminderHilo(retraso, mensaje);

        if (recordar) {
            recuerda.start();
        }

        UserfileManage.getUser().get(pos).getEventos().add(new Eventos(jDateChooser_eventos_fecha.getDate(), jTextField_eventos_nombre.getText(), jTextField_eventos_des.getText(), recordar));
        jDateChooser_eventos_fecha.setDate(new Date());
        jTextField_eventos_nombre.setText("");
        jTextField_eventos_des.setText("");

        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        llenarEventos();
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton_post_newPostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_post_newPostMouseClicked
        // TODO add your handling code here:
        jDialog_newpost.pack();
        jDialog_newpost.setVisible(true);
    }//GEN-LAST:event_jButton_post_newPostMouseClicked

    private void jButton_newpost_upload_SingleImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_newpost_upload_SingleImageMouseClicked
        // TODO add your handling code here:
        try {
            PostsFileManage.LoadFile();
        } catch (Exception e) {
        }
        try {
            post_image newpost = new post_image(chooseImage(), user.getCorreo(), jTextArea_newpost_imagepost_descripcion.getText(), jTextField_newpost_titulo_Image.getText());
            PostsFileManage.getPosts().add(newpost);
            jDialog_newpost.setVisible(false);
            llenarPosts();
            JOptionPane.showMessageDialog(jDialog_PrincipalFace, "se a subido correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jDialog_newpost, "Favor ingrese una imagen valida");
        }

        try {
            PostsFileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_newpost_upload_SingleImageMouseClicked

    private void jButton_newpost_upload_MultipleImagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_newpost_upload_MultipleImagesMouseClicked
        // TODO add your handling code here:
        try {
            PostsFileManage.LoadFile();
        } catch (Exception e) {
        }
        try {
            post_GrupoImages newpost = new post_GrupoImages(chooseImageMultiple((Integer) jSpinner_newpost_ammout.getValue()), user.getCorreo(), jTextArea_newpost_Collage_descripcion.getText(), jTextField_newpost_titulo_Collage.getText());
            PostsFileManage.getPosts().add(newpost);
            jDialog_newpost.setVisible(false);
            llenarPosts();
            JOptionPane.showMessageDialog(jDialog_PrincipalFace, "se a subido correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jDialog_newpost, "Favor ingrese una imagen valida");
        }

        try {
            PostsFileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_newpost_upload_MultipleImagesMouseClicked

    private void jButton_cuentaPanel_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_cuentaPanel_editarMouseClicked
        try {
            UserfileManage.LoadFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        JFileChooser fc = new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Imagenes",
                "png", "jpg", "jpeg", "gif");
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(jDialog_PrincipalFace);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(130, 130, 0);
            jLabel_cuenta_perfil.setIcon(new ImageIcon(img));
            //modicar que cuando sea una persona distinta se cambie la foto de perfil
            ImageIcon icono = (ImageIcon) jLabel_cuenta_perfil.getIcon();
            UserfileManage.getUser().get(pos).setPerfil(icono);
        }

        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton_cuentaPanel_editarMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        jDialog_PrincipalFace.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton_newpost_upload_SingleVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_newpost_upload_SingleVideoMouseClicked
        // TODO add your handling code here:
        try {
            PostsFileManage.LoadFile();
        } catch (Exception e) {
        }
        try {
            post_Video newpost = new post_Video(chooseVideo(), user.getCorreo(), jTextArea_newpost_imagepost_descripcion.getText(), jTextField_newpost_titulo_Video.getText());
            PostsFileManage.getPosts().add(newpost);
            jDialog_newpost.setVisible(false);
            llenarPosts();
            JOptionPane.showMessageDialog(jDialog_PrincipalFace, "se a subido correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jDialog_newpost, "Favor ingrese un video valido");
        }

        try {
            PostsFileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_newpost_upload_SingleVideoMouseClicked

    private void jList_principal_postsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_principal_postsMouseClicked
        // TODO add your handling code here:
        try {
            PostsFileManage.LoadFile();
        } catch (Exception e) {
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
            if (jList_principal_posts.getSelectedIndex() != -1) {
                post selectedPos = PostsFileManage.getPosts().get(jList_principal_posts.getSelectedIndex());
                Jlabel_likescounter.setText(selectedPos.getLikes() + "");
                jLabel_sharecounter.setText(selectedPos.getShare() + "");
                jTextArea_caption.setText(selectedPos.getOwner() + "       " + sdf.format(selectedPos.getPosted()) + System.lineSeparator());

                if (selectedPos instanceof post_Text) {
                    jTextArea_postText.setText(((post_Text) selectedPos).getCaption());

                    jscrollpane_text.setVisible(true);
                    jPanel_singleImage.setVisible(false);
                    jscrollpane_manyImages.setVisible(false);
                    jPanel_Video.setVisible(false);

                } else if (selectedPos instanceof post_image) {
                    jTextArea_caption.append(selectedPos.getCaption());
                    jPanel_singleImage.setVisible(true);
                    jLabel_singleImage.setIcon(((post_image) selectedPos).getImageIcon());

                    jscrollpane_text.setVisible(false);

                    jscrollpane_manyImages.setVisible(false);
                    jPanel_Video.setVisible(false);

                } else if (selectedPos instanceof post_GrupoImages) {
                    jTextArea_caption.append(selectedPos.getCaption());
                    ArrayList<ImageIcon> icons = ((post_GrupoImages) selectedPos).getImageIcon();
                    ArrayList<JLabel> jlabes = new ArrayList();
                    jlabes.add(jLabel_multiImage_1);
                    jlabes.add(jLabel_multiImage_2);
                    jlabes.add(jLabel_multiImage_3);
                    jlabes.add(jLabel_multiImage_4);

                    for (int i = 0; i < icons.size(); i++) {
                        jlabes.get(i).setIcon(icons.get(i));
                    }

                    jscrollpane_text.setVisible(false);
                    jPanel_singleImage.setVisible(false);
                    jscrollpane_manyImages.setVisible(true);
                    jPanel_Video.setVisible(false);

                } else if (selectedPos instanceof post_Video) {
                    jTextArea_caption.append(selectedPos.getCaption());

                    createScene(((post_Video) selectedPos).getVideo());
                    jPanel_Video.setLayout(new BorderLayout());
                    jPanel_Video.add(jfxPanel, BorderLayout.CENTER);

                    jscrollpane_text.setVisible(false);
                    jPanel_singleImage.setVisible(false);
                    jscrollpane_manyImages.setVisible(false);
                    jPanel_Video.setVisible(true);

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jDialog_PrincipalFace, "Fallo: no se a podido cargar la post recarge la jlist");
        }

        try {
            PostsFileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jList_principal_postsMouseClicked

    private void jButton_post_newPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_post_newPostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_post_newPostActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
        try {
            PostsFileManage.LoadFile();
        } catch (Exception e) {
        }
        try {
            PostsFileManage.getPosts().get(jList_principal_posts.getSelectedIndex()).likebutton(user.getCorreo());
            Jlabel_likescounter.setText(PostsFileManage.getPosts().get(jList_principal_posts.getSelectedIndex()).getLikes() + "");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(jDialog_PrincipalFace, "No se a dado like");
        }
        try {
            PostsFileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
        try {
            PostsFileManage.LoadFile();
        } catch (Exception e) {
        }
        try {
            PostsFileManage.getPosts().get(jList_principal_posts.getSelectedIndex()).sharebutton(user.getCorreo());
            jLabel_sharecounter.setText(PostsFileManage.getPosts().get(jList_principal_posts.getSelectedIndex()).getShare() + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jDialog_PrincipalFace, "No se a dado share");
        }
        try {
            PostsFileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked

        String nick = JOptionPane.showInputDialog(jDialog_PrincipalFace, "Nickname");
        String nombre = JOptionPane.showInputDialog(jDialog_PrincipalFace, "Nombre");
        String des = JOptionPane.showInputDialog(jDialog_PrincipalFace, "Descripción");
        JLabel_nickname.setText(nick);
        jLabel_nombreCom.setText(nombre);
        jLabel_descripción.setText(des);
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton_mmusicplayer_chooseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_mmusicplayer_chooseMouseClicked
        // TODO add your handling code here:
        try {
            if (player != null) {
                player.stop();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            music = chooseMusic();
            jTextField_musicPlayer_playing.setText(music.getName());
            player = Manager.createPlayer(music.toURI().toURL());
            player.start();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(jDialog_PrincipalFace, "Music player failed");
        }

    }//GEN-LAST:event_jButton_mmusicplayer_chooseMouseClicked

    private void jButton_musicPlayer_stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_musicPlayer_stopMouseClicked
        // TODO add your handling code here:
        try {
            if (player != null) {
                player.stop();
                player = null;
                jTextField_musicPlayer_playing.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_musicPlayer_stopMouseClicked

    private void jButton_musicPlayer_PauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_musicPlayer_PauseMouseClicked
        try {
            if (player != null) {
                player.stop();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_musicPlayer_PauseMouseClicked

    private void jButton_musicPlayer_startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_musicPlayer_startMouseClicked
        // TODO add your handling code here:
        try {
            if (player != null) {
                player.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_musicPlayer_startMouseClicked

    private void jButton_MusicPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_MusicPlayerMouseClicked
        // TODO add your handling code here:
        jDialog_musicPlayer.pack();
        jDialog_musicPlayer.setVisible(true);
    }//GEN-LAST:event_jButton_MusicPlayerMouseClicked

    private void jTextField_adminWindow_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_adminWindow_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_adminWindow_correoActionPerformed

    private void jButton_adminWindow_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_adminWindow_crearMouseClicked
        // TODO add your handling code here:
        try {
            UserfileManage.LoadFile();
        } catch (Exception e) {
        }
        if (!jTextField_adminWindow_Nombre.getText().isEmpty() && !jTextField_adminWindow_correo.getText().isEmpty() && !jPasswordField_adminWindow_Contraseña.getText().isEmpty()) {
            if (correctCorreoLogear(jTextField_adminWindow_correo.getText())) {
                if (UserfileManage.findUser(jTextField_adminWindow_correo.getText()) == -1) {
                    UserfileManage.getUser().add(new AdminUsu(jTextField_adminWindow_correo.getText(), jPasswordField_adminWindow_Contraseña.getText(), jTextField_adminWindow_Nombre.getText()));
                    JOptionPane.showMessageDialog(jDialog_adminWindow, "Se a creado su usuario");
                } else {
                    JOptionPane.showMessageDialog(jDialog_adminWindow, "ese correo ya fue utilizado");
                }
            } else {
                JOptionPane.showMessageDialog(jDialog_adminWindow, "ingrese un correo valido");
            }

        }
        try {
            UserfileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_adminWindow_crearMouseClicked

    private void jList_adminWindow_UserListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_adminWindow_UserListMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON3) {
            if (jList_adminWindow_UserList.getSelectedIndex() != -1) {
                jPopupMenu_adminWindow_UserAdmin.show(jList_adminWindow_UserList, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jList_adminWindow_UserListMouseClicked

    private void jMenuItem_adminWindow_banearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_adminWindow_banearActionPerformed
        // TODO add your handling code here:
        try {
            UserfileManage.LoadFile();
            PostsFileManage.LoadFile();
        } catch (Exception e) {
        }
        int decidio = JOptionPane.showInternalConfirmDialog(jDialog_adminWindow, "esta seguro que deasea eliminar al usuario?", "borrar", JOptionPane.YES_NO_OPTION);
        if (decidio == 0) {
            int userToBan = jList_chat_UserList.getSelectedIndex();
            String Gmail = UserfileManage.getUser().get(userToBan).getCorreo();

            if (UserfileManage.getUser().get(userToBan) instanceof AdminUsu) {
                JOptionPane.showMessageDialog(jDialog_adminWindow, "no puede banear a un admin");
            } else {
                ((RegularUsu) UserfileManage.getUser().get(userToBan)).setBanned(true);

                JOptionPane.showMessageDialog(jDialog_adminWindow, "se baneo exitosamente");
            }

        }

        try {
            UserfileManage.addtoFile();
            PostsFileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem_adminWindow_banearActionPerformed

    private void jList_adminWindow_PostListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_adminWindow_PostListMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON3) {
            if (jList_adminWindow_PostList.getSelectedIndex() != -1) {
                jPopupMenu_adminWindow_PostAdmin.show(jList_adminWindow_PostList, evt.getX(), evt.getY());
            }
        }

    }//GEN-LAST:event_jList_adminWindow_PostListMouseClicked

    private void jMenuItem_adminWindow_deletePostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_adminWindow_deletePostActionPerformed
        // TODO add your handling code here:
        try {
            PostsFileManage.LoadFile();
        } catch (Exception e) {
        }
        try {
            PostsFileManage.getPosts().remove(jList_adminWindow_PostList.getSelectedIndex());
            JOptionPane.showMessageDialog(jDialog_adminWindow, "se borro exitosamente");
            llenarPostsAdmin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jDialog_adminWindow, "fallo al borrar");
        }

        try {
            PostsFileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem_adminWindow_deletePostActionPerformed

    private void jButton_principalFace_adminWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_principalFace_adminWindowMouseClicked
        // TODO add your handling code here:
        jDialog_adminWindow.pack();
        jDialog_adminWindow.setVisible(true);
    }//GEN-LAST:event_jButton_principalFace_adminWindowMouseClicked

    private void jTabbedPane_adminMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane_adminMenuMouseClicked
        // TODO add your handling code here:
        try {
            PostsFileManage.LoadFile();
            UserfileManage.LoadFile();
            llenarPostsAdmin();

            llenarUsersAdmin();
            PostsFileManage.addtoFile();
            UserfileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTabbedPane_adminMenuMouseClicked

    private void jButton_showcommentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_showcommentsMouseClicked
        // TODO add your handling code here:
        try {
            PostsFileManage.LoadFile();
            UserfileManage.LoadFile();
        } catch (Exception e) {

        }
        jDialog_comments.pack();
        jDialog_comments.setVisible(true);
        try {
            jTextArea_comments.setText("");
            for (String s : PostsFileManage.getPosts().get(jList_principal_posts.getSelectedIndex()).getComments()) {
                jTextArea_comments.append(s + System.lineSeparator());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jDialog_PrincipalFace, "No se encontraron comentarios");
            llenarPosts();

        }

        try {
            PostsFileManage.addtoFile();
            UserfileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_showcommentsMouseClicked

    private void jButton_comentarios_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_comentarios_cerrarActionPerformed
        // TODO add your handling code here:
        jDialog_comments.setVisible(false);

    }//GEN-LAST:event_jButton_comentarios_cerrarActionPerformed

    private void jButton_recargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_recargarMouseClicked
        // TODO add your handling code here:
        try {
            PostsFileManage.LoadFile();
            UserfileManage.LoadFile();
        } catch (Exception e) {
        }
        llenarPosts();
        try {
            PostsFileManage.addtoFile();
            UserfileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_recargarMouseClicked

    private void jButton_post_likeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_post_likeMouseClicked
        // TODO add your handling code here:
        try {
            PostsFileManage.LoadFile();
            UserfileManage.LoadFile();
        } catch (Exception e) {
        }
        try {
            PostsFileManage.getPosts().get(jList_principal_posts.getSelectedIndex()).getComments().add(user.getCorreo() + ":" + jTextField_post_comment.getText());
            jTextField_post_comment.setText("");
            JOptionPane.showMessageDialog(jDialog_PrincipalFace, "se a subido el comentario");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jDialog_PrincipalFace, "fallo al comentar");
            llenarPosts();
        }
        try {
            PostsFileManage.addtoFile();
            UserfileManage.addtoFile();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_post_likeMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_nickname;
    private javax.swing.JLabel Jlabel_likescounter;
    private javax.swing.ButtonGroup buttonGroup__jdregistro_sexo;
    private javax.swing.ButtonGroup buttonGroup_eventos_recordar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_MusicPlayer;
    private javax.swing.JButton jButton_Principal_iniciar;
    private javax.swing.JButton jButton_Registro;
    private javax.swing.JButton jButton_adminWindow_crear;
    private javax.swing.JButton jButton_amigos_accept;
    private javax.swing.JButton jButton_amigos_consulta;
    private javax.swing.JButton jButton_amigos_rechazar;
    private javax.swing.JButton jButton_amigos_regresar;
    private javax.swing.JButton jButton_chat_send;
    private javax.swing.JButton jButton_chat_update;
    private javax.swing.JButton jButton_comentarios_cerrar;
    private javax.swing.JButton jButton_cuentaPanel_editar;
    private javax.swing.JButton jButton_mmusicplayer_choose;
    private javax.swing.JButton jButton_musicPlayer_Pause;
    private javax.swing.JButton jButton_musicPlayer_start;
    private javax.swing.JButton jButton_musicPlayer_stop;
    private javax.swing.JButton jButton_newpost_newTXTPOST;
    private javax.swing.JButton jButton_newpost_upload_MultipleImages;
    private javax.swing.JButton jButton_newpost_upload_SingleImage;
    private javax.swing.JButton jButton_newpost_upload_SingleVideo;
    private javax.swing.JButton jButton_post_like;
    private javax.swing.JButton jButton_post_newPost;
    private javax.swing.JButton jButton_principalFace_adminWindow;
    private javax.swing.JButton jButton_recargar;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JButton jButton_regresarsolicitudes;
    private javax.swing.JButton jButton_showcomments;
    private com.toedter.calendar.JDateChooser jDateChooser_eventos_fecha;
    private com.toedter.calendar.JDateChooser jDateChooser_jdregistro_fecha;
    private javax.swing.JDialog jDialog_PrincipalFace;
    private javax.swing.JDialog jDialog_Registrarse;
    private javax.swing.JDialog jDialog_adminWindow;
    private javax.swing.JDialog jDialog_amigos;
    private javax.swing.JDialog jDialog_comments;
    private javax.swing.JDialog jDialog_eventos;
    private javax.swing.JDialog jDialog_musicPlayer;
    private javax.swing.JDialog jDialog_newpost;
    private javax.swing.JLabel jLabel;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_ceunta_nombreCuentaOficial;
    private javax.swing.JLabel jLabel_cuenta_perfil;
    private javax.swing.JLabel jLabel_descripción;
    private javax.swing.JLabel jLabel_multiImage_1;
    private javax.swing.JLabel jLabel_multiImage_2;
    private javax.swing.JLabel jLabel_multiImage_3;
    private javax.swing.JLabel jLabel_multiImage_4;
    private javax.swing.JLabel jLabel_nombreCom;
    private javax.swing.JLabel jLabel_sharecounter;
    private javax.swing.JLabel jLabel_singleImage;
    private javax.swing.JLabel jLabel_singleImage1;
    private javax.swing.JList<String> jList_adminWindow_PostList;
    private javax.swing.JList<String> jList_adminWindow_UserList;
    private javax.swing.JList<String> jList_amigos_allUsers;
    private javax.swing.JList<String> jList_amigos_listaAmigos;
    private javax.swing.JList<String> jList_amigos_request;
    private javax.swing.JList<String> jList_chat_UserList;
    private javax.swing.JList<String> jList_eventos_listaE;
    private javax.swing.JList<String> jList_principal_posts;
    private com.toedter.components.JLocaleChooser jLocaleChooser__jdregistro_pais;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_adminWindow_banear;
    private javax.swing.JMenuItem jMenuItem_adminWindow_deletePost;
    private javax.swing.JMenuItem jMenuItem_chat_edit;
    private javax.swing.JMenuItem jMenuItem_chat_refreshTXTA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_Principal;
    private javax.swing.JPanel jPanel_Video;
    private javax.swing.JPanel jPanel_posts_manyImages;
    private javax.swing.JPanel jPanel_principal_posts;
    private javax.swing.JPanel jPanel_principalface_chat;
    private javax.swing.JPanel jPanel_principalface_cuenta;
    private javax.swing.JPanel jPanel_singleImage;
    private javax.swing.JPasswordField jPasswordField_Principal_password;
    private javax.swing.JPasswordField jPasswordField__jdregistro_contra;
    private javax.swing.JPasswordField jPasswordField_adminWindow_Contraseña;
    private javax.swing.JPopupMenu jPopupMenu_Chat_options;
    private javax.swing.JPopupMenu jPopupMenu_adminWindow_PostAdmin;
    private javax.swing.JPopupMenu jPopupMenu_adminWindow_UserAdmin;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton_no;
    private javax.swing.JRadioButton jRadioButton_si;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner_newpost_ammout;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane_adminMenu;
    private javax.swing.JTextArea jTextArea_caption;
    private javax.swing.JTextArea jTextArea_chat_chat;
    private javax.swing.JTextArea jTextArea_chat_textmessage;
    private javax.swing.JTextArea jTextArea_comments;
    private javax.swing.JTextArea jTextArea_newpost_Collage_descripcion;
    private javax.swing.JTextArea jTextArea_newpost_imagepost_descripcion;
    private javax.swing.JTextArea jTextArea_newpost_txtpost;
    private javax.swing.JTextArea jTextArea_newpost_videopost_descripcion;
    private javax.swing.JTextArea jTextArea_postText;
    private javax.swing.JTextField jTextField_Principal_correo;
    private javax.swing.JTextField jTextField__jdregistro_correo;
    private javax.swing.JTextField jTextField_adminWindow_Nombre;
    private javax.swing.JTextField jTextField_adminWindow_correo;
    private javax.swing.JTextField jTextField_eventos_des;
    private javax.swing.JTextField jTextField_eventos_nombre;
    private javax.swing.JTextField jTextField_eventos_recordarDes;
    private javax.swing.JTextField jTextField_eventos_retraso;
    private javax.swing.JTextField jTextField_jdregistro_apellido;
    private javax.swing.JTextField jTextField_jdregistro_nombre;
    private javax.swing.JTextField jTextField_musicPlayer_playing;
    private javax.swing.JTextField jTextField_newpost_titulo_Collage;
    private javax.swing.JTextField jTextField_newpost_titulo_Image;
    private javax.swing.JTextField jTextField_newpost_titulo_Video;
    private javax.swing.JTextField jTextField_newpost_titulo_textpost;
    private javax.swing.JTextField jTextField_post_comment;
    private javax.swing.JScrollPane jscrollpane_manyImages;
    private javax.swing.JScrollPane jscrollpane_text;
    // End of variables declaration//GEN-END:variables

    //Variables declaradas por nosotros
    //socket related variables
    Socket socketClient = null;
    PrintWriter salida = null;
    BufferedReader entrada = null;
    Recive act = null;
    //archivos binarios
    AdminBinary UserfileManage = new AdminBinary("./ServerData/UserData.bonito");
    AdminPosts PostsFileManage = new AdminPosts("./ServerData/Posts.bonito");
    //variables importantes
    String[] dominio = {"gmail.com", "yahoo.com", "unitec.edu"};
    Usuario user = null;
    int pos = 0;
    private final JFXPanel jfxPanel = new JFXPanel();
    Player player;
    File music;

    //verifica qeu el usuario ingrese un correo electronivo correcto
    public boolean correctCorreoLogear(String correo) {
        for (int i = 0; i < dominio.length; i++) {
            String regex = "^[\\w-\\.]+@(" + dominio[i] + ")$";
            if (Pattern.matches(regex, correo)) {
                return true;
            }
        }
        return false;
    }

    public void connectToServer() throws IOException {
        socketClient = new Socket("localhost", 4444);
        salida = new PrintWriter(socketClient.getOutputStream(), true);//
        entrada = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

        act = new Recive(entrada, jTextArea_chat_chat, user.getCorreo());
        act.setEntrada(entrada);
        act.start();

    }

    public void loadJlistchat() throws IOException {

        try {
            UserfileManage.LoadFile();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        DefaultListModel model = (DefaultListModel) jList_chat_UserList.getModel();
        model.removeAllElements();
        for (Chat chat : UserfileManage.getUser().get(pos).getChats()) {
            model.addElement(chat.getName());
        }

        jList_chat_UserList.setModel(model);

        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void llenarAmigos() {
        try {
            //llenar table de amigos
            UserfileManage.LoadFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        DefaultListModel model = (DefaultListModel) jList_amigos_listaAmigos.getModel();
        model.removeAllElements();
        for (String s : UserfileManage.getUser().get(pos).getFriends()) {
            model.addElement(s);
        }
        jList_amigos_listaAmigos.setModel(model);
        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //lo escribe en el jtextArea
    public void write(String s) {
        jTextArea_chat_chat.append(s + System.lineSeparator());
    }

    //
    public void loadChatArea() {
        try {
            UserfileManage.LoadFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        jTextArea_chat_chat.setText("");
        ArrayList<Message> messages = UserfileManage.getUser().get(pos).getChats().get(findchat(pos, jList_chat_UserList.getSelectedValue())).getMessages();
        UserfileManage.getUser().get(pos).getChats().get(findchat(pos, jList_chat_UserList.getSelectedValue())).setNotificacion(0);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (Message message : messages) {
            String[] divide = message.getMessage().split("|");
            write(message.getSender() + ": " + divide[0] + "[" + sdf.format(message.getSent()) + "]");
            write(message.getSender() + ": " + message.getMessage() + "[" + sdf.format(message.getSent()) + "]");
        }
        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public int findchat(int position, String envio) {
        UserfileManage.getUser().get(position);
        for (int i = 0; i < UserfileManage.getUser().get(position).getChats().size(); i++) {
            if (UserfileManage.getUser().get(position).getChats().get(i).getName().equals(envio)) {
                return i;
            }
        }
        return -1;
    }

    public void enviarSoli() {
        try {
            UserfileManage.LoadFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        DefaultListModel model = (DefaultListModel) jList_amigos_allUsers.getModel();
        int usuSelected = jList_amigos_allUsers.getSelectedIndex();

        if (usuSelected >= 0 && verificaramigo()) {
            UserfileManage.getUser().get(usuSelected).getFriendrequest().add(user.getCorreo());
            JOptionPane.showMessageDialog(jDialog_amigos, "Solicitud enviada");
        }

        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void acceptSoli() {
        try {
            UserfileManage.LoadFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        DefaultListModel list = (DefaultListModel) jList_amigos_request.getModel();

        if (jList_amigos_request.getSelectedValue() != null) {
            int usuSelected = jList_amigos_request.getSelectedIndex();
            String newFriend = UserfileManage.getUser().get(pos).getFriendrequest().get(usuSelected);

            try {
                //add friend
                UserfileManage.getUser().get(pos).getFriends().add(newFriend);
                UserfileManage.getUser().get(UserfileManage.findUser(newFriend)).getFriends().add(user.getCorreo());
                // create chat
                UserfileManage.getUser().get(pos).getChats().add(new Chat(newFriend));
                UserfileManage.getUser().get(UserfileManage.findUser(newFriend)).getChats().add(new Chat(user.getCorreo()));
                //remove from array and list request
                UserfileManage.getUser().get(pos).getFriendrequest().remove(usuSelected);
                list.remove(usuSelected);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(jDialog_amigos, "failed to send");
            }
        }
        jList_amigos_request.setModel(list);
        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void rechazaSoli() {
        try {
            UserfileManage.LoadFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        DefaultListModel model = (DefaultListModel) jList_amigos_request.getModel();
        int usuSelected = jList_amigos_request.getSelectedIndex();

        if (usuSelected >= 0) {
            UserfileManage.getUser().get(pos).getFriendrequest().remove(usuSelected);
            JOptionPane.showMessageDialog(jDialog_amigos, "Solicitud rechazada con exito ");
        }
        model.remove(usuSelected);
        jList_amigos_request.setModel(model);

        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void verSolis() {
        try {
            UserfileManage.LoadFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        DefaultListModel model = (DefaultListModel) jList_amigos_request.getModel();
        model.removeAllElements();
        model.addAll(UserfileManage.getUser().get(pos).getFriendrequest());
        jList_amigos_request.setModel(model);

        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void llenarUsu() {
        try {
            UserfileManage.LoadFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        DefaultListModel model4 = (DefaultListModel) jList_amigos_allUsers.getModel();
        model4.removeAllElements();
        for (int i = 0; i < UserfileManage.getUser().size(); i++) {
            model4.addElement(UserfileManage.getUser().get(i).getCorreo());
        }
        jList_amigos_allUsers.setModel(model4);

        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public boolean verificaramigo() {
        try {
            UserfileManage.LoadFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        if (jList_amigos_allUsers.getSelectedValue().equals(user.getCorreo())) {
            for (String request : UserfileManage.getUser().get(pos).getFriendrequest()) {
                if (request.equals(jList_amigos_allUsers.getSelectedValue())) {
                    return false;
                }
            }
            for (String friends : UserfileManage.getUser().get(pos).getFriends()) {
                if (friends.equals(jList_amigos_allUsers.getSelectedValue())) {
                    return false;
                }
            }

        }

        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public void llenarEventos() {
        try {
            UserfileManage.LoadFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        DefaultListModel model = (DefaultListModel) jList_eventos_listaE.getModel();
        model.addAll(UserfileManage.getUser().get(pos).getEventos());
        jList_eventos_listaE.setModel(model);

        try {
            UserfileManage.addtoFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void llenarPosts() {
        DefaultListModel model = (DefaultListModel) jList_principal_posts.getModel();
        model.removeAllElements();

        ArrayList<String> posts = new ArrayList<>();

        for (post post_this : PostsFileManage.getPosts()) {
            posts.add(post_this.getOwner() + " " + post_this.getTitulo());
        }

        model.addAll(posts);
        jList_principal_posts.setModel(model);
    }

    public String chooseImage() {
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg");
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(imageFilter);
        int selection = chooser.showOpenDialog(jDialog_newpost);
        if (selection == JFileChooser.APPROVE_OPTION) {
            File selected = chooser.getSelectedFile();
            Path source = Paths.get(selected.getPath());
            Path destination = Paths.get("./ServerData/PostsFiles/" + selected.getName());

            try {
                Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                System.out.println("kaboom");
            }

            return "./ServerData/PostsFiles/" + selected.getName();
        } else {
            return null;
        }
    }

    public ArrayList<File> chooseImageMultiple(int ammount) {
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "png", "jpg");
        ArrayList<File> imagenes = new ArrayList<>();

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(imageFilter);
        for (int i = 0; i < ammount; i++) {
            int selection = chooser.showOpenDialog(jDialog_newpost);
            if (selection == JFileChooser.APPROVE_OPTION) {
                File selected = chooser.getSelectedFile();
                Path source = Paths.get(selected.getPath());
                Path destination = Paths.get("./ServerData/PostsFiles/" + selected.getName());

                try {
                    Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException ex) {
                    System.out.println("kaboom");
                }

                imagenes.add(new File("./ServerData/PostsFiles/" + selected.getName()));
            } else {
                JOptionPane.showMessageDialog(jDialog_newpost, "Archivo invalido intente denuevo");
                i--;
            }
        }
        return imagenes;
    }

    public File chooseVideo() {
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Video Files", "mp4", "avi", "mkv", "flv");
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(imageFilter);
        int selection = chooser.showOpenDialog(jDialog_newpost);
        if (selection == JFileChooser.APPROVE_OPTION) {
            File selected = chooser.getSelectedFile();
            Path source = Paths.get(selected.getPath());
            Path destination = Paths.get("./ServerData/PostsFiles/" + selected.getName());

            try {
                Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                System.out.println("kaboom");
            }
            return new File("./ServerData/PostsFiles/" + selected.getName());
        } else {
            return null;
        }
    }

    public File chooseMusic() {
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "mp3", "wav");
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(imageFilter);
        int selection = chooser.showOpenDialog(jDialog_newpost);
        if (selection == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile();
        } else {
            return null;
        }
    }

    public void llenarPostsAdmin() {
        DefaultListModel model = (DefaultListModel) jList_adminWindow_PostList.getModel();
        model.removeAllElements();

        ArrayList<String> posts = new ArrayList<>();

        for (post post_this : PostsFileManage.getPosts()) {
            posts.add(post_this.getOwner() + " " + post_this.getTitulo() + " shares:" + post_this.getShare() + " likes:" + post_this.getLikes());
        }

        model.addAll(posts);
        jList_adminWindow_PostList.setModel(model);
    }

    public void llenarUsersAdmin() {
        DefaultListModel model = (DefaultListModel) jList_adminWindow_UserList.getModel();
        model.removeAllElements();
        for (Usuario s : UserfileManage.getUser()) {
            model.addElement(s.getCorreo());
        }
        jList_adminWindow_UserList.setModel(model);
    }

}
