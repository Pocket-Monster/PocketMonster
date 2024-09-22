package entity;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class KeyHandler implements KeyListener {

    // 방향 상태 플래그 (character 에서 가져옴)
    boolean moveUp = false;
    boolean moveDown = false;
    boolean moveLeft = false;
    boolean moveRight = false;


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {
            moveUp=true;
        }
        if (code == KeyEvent.VK_S) {
            moveDown=true;
        }
        if (code == KeyEvent.VK_A) {
            moveLeft=true;
        }
        if (code == KeyEvent.VK_D) {
            moveRight=true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {
            moveUp=false;
        }
        if (code == KeyEvent.VK_S) {
            moveDown=false;
        }
        if (code == KeyEvent.VK_A) {
            moveLeft=false;
        }
        if (code == KeyEvent.VK_D) {
            moveRight=false;
        }
    }
}
