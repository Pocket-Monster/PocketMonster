package selectPokemon;

import javax.swing.*;
import java.awt.*;

public class MapPanel extends JPanel {

    public MapPanel() {
        // 지도 이미지 로드 (Tiled에서 저장한 PNG 파일 경로)
        ImageIcon mapIcon = new ImageIcon("src/map/지도.png");  // 수정된 파일 경로
        JLabel mapLabel = new JLabel(mapIcon);

        // 지도 이미지를 패널에 추가
        this.setLayout(new BorderLayout());
        this.add(mapLabel, BorderLayout.CENTER);
    }
}
