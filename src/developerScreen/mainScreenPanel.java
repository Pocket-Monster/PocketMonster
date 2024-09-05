package developerScreen;

import javax.swing.*;
import java.awt.*;

public class mainScreenPanel extends JPanel {
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3;

    final int tileSize = originalTileSize * scale; // 48x48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    public mainScreenPanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));

        TextPanel textPanel = new TextPanel();
        ReturnButtonPanel returnButtonPanel = new ReturnButtonPanel();

        // 메인 패널에 버튼 패널들 추가
        this.setLayout(new BorderLayout());
        this.add(textPanel, BorderLayout.CENTER);
        this.add(returnButtonPanel, BorderLayout.SOUTH);
        // 돌아가기 버튼이 화면에서 안 보이는 이슈
        // 높이를 지정함으로써 해결
        returnButtonPanel.setPreferredSize(new Dimension(screenWidth, 100));
    }
}
