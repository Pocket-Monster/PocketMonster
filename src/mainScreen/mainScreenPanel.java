package mainScreen;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class mainScreenPanel extends JPanel {
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3;

    final int tileSize = originalTileSize * scale; // 48x48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    private Image backgroundImg;

    // Panel의 초기 설정, 컴포넌트 추가
    public mainScreenPanel(JFrame frame) {

        // JFrame의 크기를 이 사이즈에 맞추게 됨
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        //프레임 사이즈 조절 못하도록 설정
        frame.setResizable(false);

        // 배경화면으로 사용할 이미지 read
        try {
            backgroundImg = ImageIO.read((getClass().getClassLoader().getResourceAsStream("img/3Pocketmon_background.png")));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        VerticalButtonPanel verticalButtonPanel = new VerticalButtonPanel(frame);
        DeveloperButtonPanel developerButtonPanel = new DeveloperButtonPanel(frame);

        // 메인 패널에 버튼 패널들 추가
        this.setLayout(new BorderLayout());
        this.add(verticalButtonPanel, BorderLayout.CENTER);
        this.add(developerButtonPanel, BorderLayout.SOUTH);
        // 개발자들 버튼이 화면에서 안 보이는 이슈
        // 높이를 지정함으로써 해결
        developerButtonPanel.setPreferredSize(new Dimension(screenWidth, 100));
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
