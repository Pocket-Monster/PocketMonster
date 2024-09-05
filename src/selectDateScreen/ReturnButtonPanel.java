package selectDateScreen;

import javax.swing.*;

// 개발자들 화면에서의 돌아가기 버튼과 동일
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
