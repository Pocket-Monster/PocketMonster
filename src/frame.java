import mainScreen.mainScreenPanel;

import javax.swing.*;

public class frame extends JFrame {

    public frame() {
        setTitle("PocketMonster Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        frame frame = new frame();

        mainScreenPanel mainScreenPanel = new mainScreenPanel(frame);
        frame.add(mainScreenPanel);

        // Frame의 사이즈를 Panel의 사이즈에 맞춰 자동 설정, Panel클래스에서 PreferredSize가 설정되어있아야 함.
        frame.pack();

        //프레임 중앙 고정
        frame.setLocationRelativeTo(null);

        //프레임 보이기
        frame.setVisible(true);
    }
}
