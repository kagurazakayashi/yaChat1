/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yachat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author yashi
 */
public class ChatWindow extends javax.swing.JFrame {

    /**
     * Creates new form ChatWindow
     */
    
    public MainWindow mw;
    
    public ChatWindow() {
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

        sel_emo = new javax.swing.JComboBox();
        txt_sent = new javax.swing.JTextField();
        btn_sent = new javax.swing.JButton();
        lbl_text = new javax.swing.JLabel();
        btn_log = new javax.swing.JLabel();
        btn_save = new javax.swing.JLabel();
        btn_config = new javax.swing.JLabel();
        btn_hidemsgbox = new javax.swing.JLabel();
        img_messagebox = new javax.swing.JLabel();
        img_show = new javax.swing.JLabel();
        img_bg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sel_emo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "默认表情", "響／私服／横／嘆", "響／私服／横／照困", "響／私服／横／困", "響／私服／横／照驚", "響／私服／横／惚", "響／私服／横／緊張", "響／私服／横／睨", "響／私服／正／きょ", "響／私服／横／素", "響／私服／正／冷笑", "響／私服／横／考", "響／私服／正／微笑", "響／私服／横／驚", "響／私服／正／楽笑", "響／私服／正／怒", "響／私服／正／照怒", "響／私服／正／拗", "響／私服／正／照睨", "響／私服／正／疑", "響／私服／正／照笑", "響／私服／正／睨", "響／私服／正／真剣", "響／私服／正／笑", "響／私服／横／惚／大", "響／私服／横／寂1", "響／私服／横／驚／大", "響／私服／横／涙1", "響／私服／正／照きょ", "響／私服／横／寂2", "響／私服／正／疑／大", "響／私服／横／涙2", "響／私服／正／睨／大", "響／私服／横／嘲笑", "響／私服／横／嘲笑／大", "響／私服／横／微笑", "響／私服／正／照笑／大", "響／私服／横／楽笑" }));
        sel_emo.setEnabled(false);
        getContentPane().add(sel_emo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 650, 190, 30));

        txt_sent.setText("请在这里输入要发送的文字喵～");
        txt_sent.setToolTipText("");
        txt_sent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_sentKeyPressed(evt);
            }
        });
        getContentPane().add(txt_sent, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, 570, 30));

        btn_sent.setText("发送");
        btn_sent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sent, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 650, 100, 30));

        lbl_text.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_text.setForeground(new java.awt.Color(102, 0, 102));
        lbl_text.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_text.setText("嗯……说点什么呢？");
        lbl_text.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lbl_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 820, 100));

        btn_log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_backlog_off.png"))); // NOI18N
        btn_log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logMouseClicked(evt);
            }
        });
        getContentPane().add(btn_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 530, -1, -1));

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_save_off.png"))); // NOI18N
        btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveMouseClicked(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 580, -1, -1));

        btn_config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_config_off.png"))); // NOI18N
        btn_config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_configMouseClicked(evt);
            }
        });
        getContentPane().add(btn_config, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 630, -1, -1));

        btn_hidemsgbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_erase_off.png"))); // NOI18N
        btn_hidemsgbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hidemsgboxMouseClicked(evt);
            }
        });
        getContentPane().add(btn_hidemsgbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 500, -1, -1));

        img_messagebox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tip_meswindow_back.png"))); // NOI18N
        getContentPane().add(img_messagebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 1160, 200));

        img_show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/響/響／私服／正／微笑.png"))); // NOI18N
        getContentPane().add(img_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        img_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/社務所／主人公部屋昼.png"))); // NOI18N
        getContentPane().add(img_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sentKeyPressed
        char nowKey = evt.getKeyChar();
        if (nowKey == '\n') {
            sentMessage();
        }
//        else {
//            if (txt_sent.getText().length() > 0) {
//                btn_sent.setEnabled(true);
//            } else {
//                btn_sent.setEnabled(false);
//            }
//        }
    }//GEN-LAST:event_txt_sentKeyPressed

    private void btn_sentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sentActionPerformed
        sentMessage();
    }//GEN-LAST:event_btn_sentActionPerformed

    private void btn_hidemsgboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hidemsgboxMouseClicked
        msgboxshowhide();
    }//GEN-LAST:event_btn_hidemsgboxMouseClicked

    private void btn_logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logMouseClicked
        JOptionPane.showMessageDialog(null, "暂时不提供聊天记录功能", "失败", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_logMouseClicked

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked
        JOptionPane.showMessageDialog(null, "暂时不提供导出功能", "失败", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_saveMouseClicked

    private void btn_configMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configMouseClicked
        JOptionPane.showMessageDialog(null, "暂时不提供软件设置功能", "失败", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_configMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //mw.connection.disconnect();
    }//GEN-LAST:event_formWindowClosing

    private void sentMessage() {
        String message = txt_sent.getText();
        if (message.length() > 0) {
            String emoticon = this.sel_emo.getSelectedItem().toString();
            String outMsg = "(" + emoticon + ")" + message;
            this.mw.outMsg(outMsg);
            txt_sent.setText("");
            //btn_sent.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "输入点什么再发送吧～", "无效内容", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(ChatWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatWindow().setVisible(true);
            }
        });
    }
    
    public void inMsg(String msg) {
        //lbl_text.setText(msg);
        String emoticon = "";
        String message = "";
        String emocan = msg.substring(0, 1);
        if (emocan.equals("(")) {
            for (int i = 2; i <= msg.length(); i++) {
            String nowChar = msg.substring(i - 1, i);
            if (nowChar.equals(")")) {
                message = msg.substring(i, msg.length());
                break;
            } else {
                emoticon += nowChar;
            }
        }
        //this.img_show.setText("未读取表情立绘：" + emoticon);
            ImageIcon icon = new ImageIcon(getClass().getResource("/image/響/" + emoticon + ".png"));
            if (icon.getImage() != null) {
                this.img_show.setIcon(icon);
            }
        } else {
            message = msg;
            //this.img_show.setText("未读取表情立绘：无表情");
            
        }
        
        CharShow thread = new CharShow();
        thread.lbl_text = this.lbl_text;
        thread.showText = message;
        thread.start();
    }
    
    private void msgboxshowhide() {
        Boolean sh = !img_messagebox.isVisible();
        btn_config.setVisible(sh);
        btn_log.setVisible(sh);
        btn_save.setVisible(sh);
        btn_sent.setVisible(sh);
        img_messagebox.setVisible(sh);
        lbl_text.setVisible(sh);
        sel_emo.setVisible(sh);
        txt_sent.setVisible(sh);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_config;
    private javax.swing.JLabel btn_hidemsgbox;
    private javax.swing.JLabel btn_log;
    private javax.swing.JLabel btn_save;
    private javax.swing.JButton btn_sent;
    private javax.swing.JLabel img_bg;
    private javax.swing.JLabel img_messagebox;
    private javax.swing.JLabel img_show;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_text;
    private javax.swing.JComboBox sel_emo;
    private javax.swing.JTextField txt_sent;
    // End of variables declaration//GEN-END:variables
}
