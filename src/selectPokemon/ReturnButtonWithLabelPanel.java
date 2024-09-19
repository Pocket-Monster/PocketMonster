package selectPokemon;

import javax.swing.*;
import java.awt.*;

public class ReturnButtonWithLabelPanel extends JPanel {
    public ReturnButtonWithLabelPanel(JFrame frame) {
        // 레이아웃 설정 (FlowLayout을 사용하여 나란히 배치)
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        // ReturnButtonPanel과 LabelPanel 생성
        ReturnButtonPanel returnButtonPanel = new ReturnButtonPanel(frame);  // 화살표 버튼 패널
        LabelPanel labelPanel = new LabelPanel();  // 라벨 패널

        // 상위 패널에 두 개의 패널을 추가하여 나란히 배치
        this.add(returnButtonPanel);  // 왼쪽에 버튼 패널
        this.add(labelPanel);  // 오른쪽에 라벨 패널
    }
}
