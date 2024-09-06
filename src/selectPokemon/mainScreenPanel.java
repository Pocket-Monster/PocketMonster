package selectpokemon;

import javax.swing.*;
import java.awt.*;

public class mainScreenPanel extends JPanel {
    public mainScreenPanel() {
    //전체 패널
    setLayout(new BorderLayout());

    //패널 생성
    LabelPanel labelPanel = new LabelPanel();
    CharacterButtonPanel characterButtonPanel = new CharacterButtonPanel();
    StrengthPanel strengthPanel = new StrengthPanel();

    //메인 패널에 다른 패널들 추가
    this.add(labelPanel, BorderLayout.NORTH);
    this.add(characterButtonPanel, BorderLayout.CENTER);
    this.add(strengthPanel, BorderLayout.SOUTH);

    setVisible(true); // 가시화
    }
}