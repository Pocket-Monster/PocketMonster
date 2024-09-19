package developerScreen;

import funtions.SwitchPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 데이터 선택 화면에서의 돌아가기 버튼과 동일
public class ReturnButtonPanel extends JPanel {
    public ReturnButtonPanel(JFrame frame) {
        this.setLayout(null);
        this.setOpaque(false);

        // 직접 위치 조정 (배치관리자 사용 X)
        JButton button_return = new JButton("돌아가기");
        button_return.setBounds(570, 50, 128, 48);
        this.add(button_return);

        button_return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel switchToMainScreenPanel = new mainScreen.mainScreenPanel(frame);
                SwitchPanel.switchPanel(frame, switchToMainScreenPanel);
            }
        });
    }
}
