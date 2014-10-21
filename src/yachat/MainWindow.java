/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yachat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import org.jivesoftware.smack.Chat;  
import org.jivesoftware.smack.ChatManager;  
import org.jivesoftware.smack.ChatManagerListener;  
import org.jivesoftware.smack.ConnectionConfiguration;  
import org.jivesoftware.smack.MessageListener;  
import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.XMPPConnection;  
import org.jivesoftware.smack.XMPPException;  
import org.jivesoftware.smack.filter.PacketFilter;
import org.jivesoftware.smack.filter.PacketTypeFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Packet;

//import org.xmlpull.v1.XmlPullParser;
/**
 *
 * @author yashi
 */
public class MainWindow extends javax.swing.JFrame {
    
    public static XMPPConnection con;     
    public static Chat newChat;     
    public static ChatManager chatmanager; 
    private ChatWindow cw;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.lbl_cmd.setText(this.lbl_cmd.getText() + "\nCurrent time is " + df.format(new Date())
        + "'\nSystem.getProperty('os.name') == '" + System.getProperty("os.name")
        + "'\nSystem.getProperty('os.version') == '" + System.getProperty("os.version")
        + "'\nSystem.getProperty('os.arch') == '" + System.getProperty("os.arch")
        + "'\nSystem.getProperty('java.version') == '" + System.getProperty("java.version")
        + "'\nSystem.getProperty('java.vendor') == '" + System.getProperty("java.vendor")
        + "'\nSystem.getProperty('sun.arch.data.model') == '" + System.getProperty("sun.arch.data.model")
        + "'\n");
        
        this.lbl_cmd0.setVisible(false);
        this.showmore(false);
        cw = new ChatWindow();
        cw.mw = this;
        
        JOptionPane.showMessageDialog(null, "该软件为与雅诗聊天专用软件，不要将该软件传给别人。", "欢迎", JOptionPane.INFORMATION_MESSAGE);
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
        lbl_cmd0 = new javax.swing.JScrollPane();
        lbl_cmd = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        titleimg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_enter = new javax.swing.JButton();
        lbl_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        lbl_pname = new javax.swing.JLabel();
        txt_pname = new javax.swing.JTextField();
        btn_more = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("yaChat Launcher");
        setLocation(new java.awt.Point(50, 50));
        setName("layer"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cmd.setEditable(false);
        lbl_cmd.setColumns(20);
        lbl_cmd.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lbl_cmd.setRows(5);
        lbl_cmd.setText("YaChat started ...");
        lbl_cmd0.setViewportView(lbl_cmd);

        jPanel1.add(lbl_cmd0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setText("yaChat");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setText("与雅诗聊天专用应用");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 120, 20));

        titleimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/46014541.png"))); // NOI18N
        jPanel1.add(titleimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

        jButton1.setText("退出");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_enter.setText("继续");
        btn_enter.setFocusCycleRoot(true);
        btn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enterActionPerformed(evt);
            }
        });

        lbl_username.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_username.setText("用户名：");

        txt_username.setText("guest");

        lbl_password.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_password.setText("密码：");

        txt_password.setText("guest");

        lbl_pname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_pname.setText("联系人：");

        txt_pname.setText("cyshope");

        btn_more.setText("自定义");
        btn_more.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(btn_more, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbl_username)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbl_password)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbl_pname)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_pname, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addComponent(btn_enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(82, 82, 82))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(724, 724, 724)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_enter)
                    .addComponent(lbl_password)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pname)
                    .addComponent(txt_pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_username)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_more))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exit();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exit() {
        if (con != null && con.isConnected()) {
            try {
                con.disconnect();
            } catch (Exception e) {
                System.exit(0);
            }
        }
        //System.exit(0);
        dispose();
        System.exit(-1);
    }
    
    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed
        this.lbl_cmd0.setVisible(true);
        this.btn_enter.setEnabled(false);
        this.btn_more.setSelected(false);
        this.btn_more.setEnabled(false);
        showmore(false);
        this.btn_enter.setText("处理中...");
        Thread thread = new InitThread(this);
        thread.start();
        
        
    }//GEN-LAST:event_btn_enterActionPerformed

    private void btn_moreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moreActionPerformed
        showmore(this.btn_more.isSelected());
    }//GEN-LAST:event_btn_moreActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exit();
    }//GEN-LAST:event_formWindowClosing

    private void showmore(Boolean sw) {
        this.lbl_username.setVisible(sw);
        this.txt_username.setVisible(sw);
        this.lbl_password.setVisible(sw);
        this.txt_password.setVisible(sw);
        this.lbl_pname.setVisible(sw);
        this.txt_pname.setVisible(sw);
    }
    
    public void changelblcmd(String txt) {
        this.lbl_cmd.setText(this.lbl_cmd.getText() + "\n" + txt);
    }
    
    public void threadok(Boolean isOK) {
        if (isOK) {
            startchat();
            this.btn_enter.setText("已运行");
        } else {
            this.btn_enter.setEnabled(true);
            this.btn_more.setEnabled(true);
            this.btn_enter.setText("重试");
        }
        
    }
    
    public void startchat() {
        changelblcmd("Connect chat.uuu.moe ...");
        String user = this.txt_pname.getText() + "@uuu.moe";
        String host = "118.193.146.52";
        int port = 5222;
        String username = this.txt_username.getText();
        String password = this.txt_username.getText();
        Boolean isOK = true;
        try {
            changelblcmd("Create a connection to server...");
            ConnectionConfiguration config = new ConnectionConfiguration(     
                    host, port);
            //config.setCompressionEnabled(true);
            //config.setSASLAuthenticationEnabled(true);
            con = new XMPPConnection(config);
            changelblcmd("Connect and login with the username and pwd on server...");
            con.connect();     
            con.login(username, password);     
            changelblcmd("Authenticated = " + con.isAuthenticated());
            changelblcmd("Add a listener to receive all messages. \n");
            addListener();
            chatmanager = con.getChatManager();
            newChat = chatmanager.createChat(user,     
                    new MessageListener() {     
                        public void processMessage(Chat chat, Message message) {     
                            //System.out.println("I'm sending: " + message.getBody());     
                        }
                    });
            String msg = "(YACHAT-%LINK%)" + username + "正在使用yaChat聊天。";
            changelblcmd(">> " + msg); 
            newChat.sendMessage(msg);
        } catch (Exception e) {     
            isOK = false;
            changelblcmd("Error: " + e); 
            con.disconnect();
            threadok(false);
        } finally { 
            //Thread.sleep(3600000);     
            //con.disconnect();
        }
        if (isOK) {
            cw.setTitle("yaChat | Server: chat.uuu.moe | Login User: " + username + " | Chat: " + user + " | Encryption: disabled");
            cw.setVisible(true);
        }
    }
    
    public void outMsg(String msg) {
        changelblcmd(">> " + msg); 
        try {
            newChat.sendMessage(msg);
        } catch (XMPPException ex) {
            changelblcmd("Error: " + ex);
        }
    }
    
    private void addListener() { //static 
        // just need Messages 
        PacketFilter filterMessage = new PacketTypeFilter(Message.class);
        PacketListener myListener = new PacketListener() {     
            //@Override
            public void processPacket(Packet packet) {     
                String message = ((Message) packet).getBody();
                changelblcmd("<< " + packet.getFrom() + ": " + message);   
                cw.inMsg(message);
                // when receiving prc's Message, just say something else again     
                // and again, robot     
//                try {     
//                    newChat.sendMessage("hi again");     
//                } catch (XMPPException e) {     
//                    changelblcmd("Error: " + e);      
//                }     
            }     

        };
        // register the listener to the connection     
        con.addPacketListener(myListener, filterMessage);   
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enter;
    private javax.swing.JToggleButton btn_more;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea lbl_cmd;
    private javax.swing.JScrollPane lbl_cmd0;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_pname;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel titleimg;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_pname;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
