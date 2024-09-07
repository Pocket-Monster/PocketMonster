package selectDataScreen;

import javax.swing.*;

public class ButtonsPanel extends JPanel {
    public ButtonsPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setOpaque(false); // 투명 배경으로 설정

        // 버튼 생성
        JButton button1 = new JButton("저장된 게임 1");
        JButton button2 = new JButton("저장된 게임 2");
        JButton button3 = new JButton("저장된 게임 3");

        // 버튼 중앙 정렬
        button1.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        button2.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        button3.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        this.add(Box.createVerticalGlue()); // 상단에 빈 공간 추가
        this.add(button1);
        this.add(Box.createVerticalStrut(30)); // 버튼 사이에 빈 공간 생성
        this.add(button2);
        this.add(Box.createVerticalStrut(30)); // 버튼 사이에 빈 공간 생성
        this.add(button3);
        this.add(Box.createVerticalGlue()); // 하단에 빈 공간 추가
    }
}
