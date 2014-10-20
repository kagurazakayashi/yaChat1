/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yachat;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yashi
 */
public class CharShow extends Thread {
    
    javax.swing.JLabel lbl_text;
    String showText;
    int charID;
    int charAll;
    
    public synchronized void startThread() {
        charID = 0;
        charAll = showText.length();
        for (int i = 0; i <= charAll; i++) {
            String nowStr = showText.substring(0, i);
            lbl_text.setText(nowStr);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                //Logger.getLogger(CharShow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void run() {
        startThread();
    }
}
