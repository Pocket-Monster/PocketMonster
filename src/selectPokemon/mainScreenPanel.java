package selectPokemon;

import sounds.PlayMusic;

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

    public mainScreenPanel(JFrame frame) {

        PlayMusic buttonClickMusic = new PlayMusic();
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        //전체 패널
        setLayout(new BorderLayout());

        //패널 생성
        CharacterButtonPanel characterButtonPanel = new CharacterButtonPanel(frame, buttonClickMusic);
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