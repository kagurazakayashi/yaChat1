/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yachat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
        this.mw.changelblcmd("Looking for IP update...\nConnect to: uuu.moe");
        String yashiIP = "";
        try {
            String getURL = "http://uuu.moe/yachat.txt";
            // URLEncoder.encode("http://uuu.moe/yachat.txt", "utf-8");
            URL getUrl = new URL(getURL);
            HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
            connection.connect();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lines;
            while ((lines = reader.readLine()) != null) { 
                this.mw.changelblcmd(lines);
                yashiIP = lines;
            }
            reader.close();
            connection.disconnect();
            this.mw.changelblcmd("Disconnect.");
            sleep(1000);
        } catch(Exception e) {
            this.mw.changelblcmd("Error: " + e);
        }
        
        if (!yashiIP.equals("")) {
            this.mw.changelblcmd("\nStart chat...\nConnect to: " + yashiIP);
            
            this.mw.threadok(true);
        } else {
            this.mw.changelblcmd("\n\n雅诗当前不在线哦～");
            this.mw.threadok(false);
        }
    }
    
    @Override
    public void run() {
        startThread();
    }
}
