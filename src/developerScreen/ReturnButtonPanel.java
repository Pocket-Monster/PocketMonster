package developerScreen;

import javax.swing.*;

public class ReturnButtonPanel extends JPanel {
    public ReturnButtonPanel() {
        this.setLayout(null);
        this.setOpaque(false);

        // 직접 위치 조정 (배치관리자 사용 X)
        JButton button_developer = new JButton("돌아가기");
        button_developer.setBounds(570, 50, 128, 48);
        this.add(button_developer);
    }
}
