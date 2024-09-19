package mainScreen;

import funtions.SwitchPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerticalButtonPanel extends JPanel {

    public VerticalButtonPanel(JFrame frame) {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setOpaque(false); // 투명 배경으로 설정

        // 버튼 생성
        JButton button_new = new JButton("새게임");
        JButton button_load = new JButton("불러오기");

        // 버튼 중앙 정렬
        button_new.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        button_load.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        this.add(Box.createVerticalGlue()); // 상단에 빈 공간 추가
        this.add(button_new);
        this.add(Box.createVerticalStrut(30)); // 버튼 사이에 빈 공간 생성
        this.add(button_load);
        this.add(Box.createVerticalGlue()); // 하단에 빈 공간 추가

        // 이벤트 처리

        button_load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel switchToSelectDatePanel = new selectDataScreen.mainScreenPanel(frame);
                SwitchPanel.switchPanel(frame, switchToSelectDatePanel);
            }
        });

        button_new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel switchToSelectDatePanel = new selectPokemon.mainScreenPanel(frame);
                SwitchPanel.switchPanel(frame, switchToSelectDatePanel);
            }
        });
    }
}
