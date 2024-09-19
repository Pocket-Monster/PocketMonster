package selectDataScreen;

import funtions.SwitchPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReturnButtonPanel extends JPanel {
    private JFrame frame;

    // JFrame을 인자로 받는 생성자
    public ReturnButtonPanel(JFrame frame) {
        this.frame = frame;  // 전달된 frame을 멤버 변수로 저장

        // 이미지 아이콘 설정
        ImageIcon returnIcon = new ImageIcon("src/img/뒤로가기_화살표.png");

        // 버튼 생성
        JButton returnButton = new JButton();

        // 버튼에 아이콘 지정
        returnButton.setIcon(returnIcon);

        // 버튼 테두리 없애기
        returnButton.setBorderPainted(false);
        returnButton.setFocusPainted(false);
        returnButton.setContentAreaFilled(false);  // 배경을 투명하게 설정

        // 패널에 버튼 추가
        this.add(returnButton);

        // 버튼 클릭 시 화면 전환
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel switchToMain = new mainScreen.mainScreenPanel(frame);  // mainScreen의 패널로 전환
                SwitchPanel.switchPanel(frame, switchToMain);  // 패널 전환 함수 호출
            }
        });
    }
}
