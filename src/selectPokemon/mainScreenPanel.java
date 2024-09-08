package selectPokemon;

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

    public mainScreenPanel(JFrame frame) {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        //전체 패널
        setLayout(new BorderLayout());

        //패널 생성
        CharacterButtonPanel characterButtonPanel = new CharacterButtonPanel();
        StrengthPanel strengthPanel = new StrengthPanel();
        ReturnButtonWithLabelPanel returnButtonWithLabelPanel = new ReturnButtonWithLabelPanel(frame);

        //메인 패널에 다른 패널들 추가
        this.add(returnButtonWithLabelPanel, BorderLayout.NORTH);
        //this.add(labelPanel, BorderLayout.NORTH);
        this.add(characterButtonPanel, BorderLayout.CENTER);
        this.add(strengthPanel, BorderLayout.SOUTH);

        setVisible(true); // 가시화
    }
}