package funtions;

import javax.swing.*;
import java.awt.event.ActionListener;

public class SwitchPanel extends JFrame{
    // 패널을 전환하는 메서드
    public static ActionListener switchPanel(JFrame frame, JPanel newPanel) {
        // 현재 패널 제거
        frame.getContentPane().removeAll();
        // 새로운 패널 추가
        frame.add(newPanel);

        // 화면 갱신
        frame.revalidate();
        frame.repaint();
        return null;
    }
}
