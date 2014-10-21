/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yachat;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



//import java.net.ServerSocket;
//import java.net.Socket;
//import java.net.SocketException;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;

/**
 *
 * @author yashi
 */
public class InitThread extends Thread {
    
    private final MainWindow mw;
    
    public InitThread(MainWindow mwobj) {
        this.mw = mwobj;
    }
    
    public synchronized void startThread() {
        String nowver = "0.1";
        this.mw.changelblcmd("Looking for update...\nConnect to: uuu.moe");
        String olver = "";
        try {
            String getURL = "http://uuu.moe/yachat.txt";
            // URLEncoder.encode("http://uuu.moe/yachat.txt", "utf-8");
            URL getUrl = new URL(getURL);
            HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
            connection.connect();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lines;
            while ((lines = reader.readLine()) != null) { 
                this.mw.changelblcmd("Load data.");
                olver = lines;
            }
            reader.close();
            connection.disconnect();
            this.mw.changelblcmd("Disconnect.");
        } catch(Exception e) {
            String errmsg = "" + e;
            this.mw.changelblcmd("Error: " + e);
            JOptionPane.showMessageDialog(null, errmsg, "失败", JOptionPane.ERROR_MESSAGE);
        }
        this.mw.changelblcmd("Now Version: "+nowver+"\nLatest Version: " + olver);
        if (olver.equals(nowver)) {
            this.mw.threadok(true);
        } else {
            String errmsg = "你使用的客户端版本已经过期，需要更新的版本才能登录。";
            this.mw.changelblcmd(errmsg);
            JOptionPane.showMessageDialog(null, errmsg, "失败", JOptionPane.ERROR_MESSAGE);
            this.mw.threadok(false);
        }
    }
    
    public void connect() {
        
    }
    
    @Override
    public void run() {
        startThread();
    }
}
