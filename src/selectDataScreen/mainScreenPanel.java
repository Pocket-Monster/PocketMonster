package selectDataScreen;

import javax.swing.*;
import java.awt.*;

public class mainScreenPanel extends JPanel {
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 2;

    final int tileSize = originalTileSize * scale; // 32x32 tile
    final int maxScreenCol = 30;
    final int maxScreenRow = 20;
    final int screenWidth = tileSize * maxScreenCol; // 640 pixels
    final int screenHeight = tileSize * maxScreenRow; // 480 pixels

    public mainScreenPanel (JFrame frame) {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));

        ButtonsPanel buttonsPanel = new ButtonsPanel();
        ReturnButtonPanel returnButtonPanel = new ReturnButtonPanel(frame);

        // 메인 패널에 버튼 패널들 추가
        this.setLayout(new BorderLayout());
        this.add(buttonsPanel, BorderLayout.CENTER);
        this.add(returnButtonPanel, BorderLayout.NORTH);
        // 개발자들 버튼이 화면에서 안 보이는 이슈
        // 높이를 지정함으로써 해결
        returnButtonPanel.setPreferredSize(new Dimension(screenWidth, 100));
    }
}