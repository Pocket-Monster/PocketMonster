package mainScreen;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class mainScreenPanel extends JPanel {
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 2;

    final int tileSize = originalTileSize * scale; // 32x32 tile
    final int maxScreenCol = 30;
    final int maxScreenRow = 20;
    final int screenWidth = tileSize * maxScreenCol; // 640 pixels
    final int screenHeight = tileSize * maxScreenRow; // 480 pixels

    private Image backgroundImg;

    // Panel의 초기 설정, 컴포넌트 추가
    public mainScreenPanel(JFrame frame) {

        // JFrame의 크기를 이 사이즈에 맞추게 됨
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));

        // 배경화면으로 사용할 이미지 read
        try {
            backgroundImg = ImageIO.read((getClass().getClassLoader().getResourceAsStream("img/Title Screen Background.png")));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        BackgroundMusic backgroundMusic = new BackgroundMusic();

        VerticalButtonPanel verticalButtonPanel = new VerticalButtonPanel(frame, backgroundMusic);
        DeveloperButtonPanel developerButtonPanel = new DeveloperButtonPanel(frame, backgroundMusic);

        // 메인 패널에 버튼 패널들 추가
        this.setLayout(new BorderLayout());
        this.add(verticalButtonPanel, BorderLayout.CENTER);
        this.add(developerButtonPanel, BorderLayout.SOUTH);
        // 개발자들 버튼이 화면에서 안 보이는 이슈
        // 높이를 지정함으로써 해결
        developerButtonPanel.setPreferredSize(new Dimension(screenWidth, 100));

        //배경 음악
        backgroundMusic.playBackgroundMusic("src/sounds/On My Way.wav");
    }

    // 패널 배경화면에 이미지 삽입
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if (backgroundImg != null) {
            // 그릴 이미지, x좌표, y좌표, 이미지 가로크기, 이미지 세로크기, 옵저버
            // getWidth, getHeight : 패널의 너비와 높이에 맞게 이미지 스케일링
            g.drawImage(backgroundImg, 0, 0, getWidth(), getHeight(), this);
        }
    }
}