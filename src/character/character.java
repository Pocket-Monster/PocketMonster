package character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class character extends JPanel implements KeyListener, Runnable {
    private BufferedImage[] upImages = new BufferedImage[3]; // 위쪽 애니메이션 프레임
    private BufferedImage[] downImages = new BufferedImage[3]; // 아래쪽 애니메이션 프레임
    private BufferedImage[] leftImages = new BufferedImage[3]; // 왼쪽 애니메이션 프레임
    private BufferedImage[] rightImages = new BufferedImage[3]; // 오른쪽 애니메이션 프레임

    // 각 방향에 서 있는 이미지
    private BufferedImage upIdleImage;
    private BufferedImage downIdleImage;
    private BufferedImage leftIdleImage;
    private BufferedImage rightIdleImage;

    private int frameIndex = 0; // 애니메이션 프레임 인덱스
    private int x = 100, y = 100; // 캐릭터 위치
    private int speed = 10; // 이동 속도

    // 방향 상태 플래그
    private boolean moveUp = false, moveDown = false, moveLeft = false, moveRight = false;
    private BufferedImage currentImage;

    public character() {
        this.setFocusable(true);
        this.addKeyListener(this);
        loadImages();
        currentImage = downIdleImage; // 초기에는 아래쪽을 보고 있는 이미지로 시작
        new Thread(this).start(); // 게임 루프 시작
    }

    // 이미지 로드
    private void loadImages() {
        for (int i = 0; i < 3; i++) {
            upImages[i] = ImageLoader.loadImage("src/img/character/back" + (i+1) + ".png");
            downImages[i] = ImageLoader.loadImage("src/img/character/front" + (i+1) + ".png");
            leftImages[i] = ImageLoader.loadImage("src/img/character/left" + (i+1) + ".png");
            rightImages[i] = ImageLoader.loadImage("src/img/character/right" + (i+1) + ".png");
        }

        // 각 방향에 서 있는 이미지 로드
        upIdleImage = ImageLoader.loadImage("src/img/character/back2.png");
        downIdleImage = ImageLoader.loadImage("src/img/character/front2.png");
        leftIdleImage = ImageLoader.loadImage("src/img/character/left2.png");
        rightIdleImage = ImageLoader.loadImage("src/img/character/right2.png");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (currentImage != null) {
            g.drawImage(currentImage, x, y, null);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            moveUp = true;
            moveDown = moveLeft = moveRight = false;
        }
        if (key == KeyEvent.VK_DOWN) {
            moveDown = true;
            moveUp = moveLeft = moveRight = false;
        }
        if (key == KeyEvent.VK_LEFT) {
            moveLeft = true;
            moveUp = moveDown = moveRight = false;
        }
        if (key == KeyEvent.VK_RIGHT) {
            moveRight = true;
            moveUp = moveDown = moveLeft = false;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) moveUp = false;
        if (key == KeyEvent.VK_DOWN) moveDown = false;
        if (key == KeyEvent.VK_LEFT) moveLeft = false;
        if (key == KeyEvent.VK_RIGHT) moveRight = false;

        // 키가 떼어졌을 때 각 방향에 맞는 서 있는 이미지로 변경
        if (!moveUp && !moveDown && !moveLeft && !moveRight) {
            if (key == KeyEvent.VK_UP) currentImage = upIdleImage;
            if (key == KeyEvent.VK_DOWN) currentImage = downIdleImage;
            if (key == KeyEvent.VK_LEFT) currentImage = leftIdleImage;
            if (key == KeyEvent.VK_RIGHT) currentImage = rightIdleImage;
        }
    }

    @Override
    public void run() {
        while (true) {
            if (moveUp) {
                y -= speed;
                currentImage = upImages[frameIndex];
            }
            if (moveDown) {
                y += speed;
                currentImage = downImages[frameIndex];
            }
            if (moveLeft) {
                x -= speed;
                currentImage = leftImages[frameIndex];
            }
            if (moveRight) {
                x += speed;
                currentImage = rightImages[frameIndex];
            }

            // 프레임 업데이트
            frameIndex = (frameIndex + 1) % 3;

            // 화면 다시 그리기
            repaint();

            // 100ms 마다 업데이트 (10프레임/초)
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
