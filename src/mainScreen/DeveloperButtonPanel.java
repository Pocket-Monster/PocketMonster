package mainScreen;

import funtions.SwitchPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeveloperButtonPanel extends JPanel {
    public DeveloperButtonPanel(JFrame frame, PlayMusic backgroundMusic, PlayMusic buttonClickMusic) {
        this.setLayout(null);
        this.setOpaque(false);

        // 직접 위치 조정 (배치관리자 사용 X)
        JButton button_developer = new JButton("개발자들");
        button_developer.setBounds(570, 50, 128, 48);
        this.add(button_developer);

        button_developer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backgroundMusic.stopBackgroundMusic();
                JPanel switchToDeveloperScreen = new developerScreen.mainScreenPanel(frame);
                SwitchPanel.switchPanel(frame, switchToDeveloperScreen);
                new Thread(()->{
                    buttonClickMusic.playEffectSound("sounds/buttonClick.wav");
                }).start();
            }
        });

    }
}