package mainScreen;

import javax.swing.*;

public class VerticalButtonPanel extends JPanel {
    public VerticalButtonPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setOpaque(false);

        // 버튼 생성
        JButton button_new = new JButton("새게임");
        JButton button_load = new JButton("불러오기");

        button_new.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        button_load.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        this.add(Box.createVerticalGlue()); // 상단에 빈 공간 추가
        this.add(button_new);
        this.add(Box.createVerticalStrut(30)); // 버튼 사이에 빈 공간 생성
        this.add(button_load);
        this.add(Box.createVerticalGlue()); // 하단에 빈 공간 추가
    }
}
