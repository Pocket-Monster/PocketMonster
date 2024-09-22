package storeScreen;

import entity.KeyHandler;
import entity.Player;

import javax.swing.*;
import java.awt.*;

public class StorePanel extends JPanel implements Runnable {
    //일단 mainScreenPanel꺼 가저옴
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 2;

    public final int tileSize = originalTileSize * scale; // 32x32 tile
    final int maxScreenCol = 30;
    final int maxScreenRow = 20;
    final int screenWidth = tileSize * maxScreenCol; // 640 pixels
    final int screenHeight = tileSize * maxScreenRow; // 480 pixels


    //FPS
    int FPS=60;
    KeyHandler keyH=new KeyHandler();

    Thread storeThread;
    Player player=new Player(this,keyH,0);

    public StorePanel() {
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);  //임시
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }
    public void startGameThread(){
        storeThread=new Thread(this);
        storeThread.start();
    }

    @Override
    public void run() {
        double drawInterval=1000000000/FPS;  //0.01666 seconds
        double nextDrawTime=System.nanoTime()+drawInterval;
        while (storeThread != null) {
            update();

            repaint();
        }
        try {  // 한 번 더 확인
            double remainingTime=nextDrawTime-System.nanoTime();
            remainingTime=remainingTime/1000000;
            if(remainingTime<0){
                remainingTime=0;
            }
            Thread.sleep((long)remainingTime);

            nextDrawTime+=drawInterval;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void update(){

        player.update();
    }
    public void paintComponent(Graphics g) {   //java 에 내장된 메소드
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        player.draw(g2);
        g2.dispose();

    }
}
