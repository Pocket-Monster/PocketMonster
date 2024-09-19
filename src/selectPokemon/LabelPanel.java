package selectPokemon;

import javax.swing.*;
import java.awt.*;

public class LabelPanel extends JPanel {
    public LabelPanel() {
        //내부 패널 생성, 설정
        JPanel labelPanel = new JPanel(new FlowLayout()); // 기본 설정값이 FlowLayout()으로, 작성 생략 가능
        JLabel label = new JLabel("사용할 포켓몬을 선택하세요", JLabel.CENTER);
        //폰트 설정
        label.setFont(new Font("Malgun Godhic", Font.PLAIN, 20));

        labelPanel.add(label);

        //레이블 패널을 현재 패널에 추가
        this.add(labelPanel);
    }
}