package developerScreen;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    public TextPanel () {
        this.setLayout(new BorderLayout());
        this.setOpaque(false);

        JLabel label = new JLabel("<html><div style='text-indent: 15px;'>서경대학교 전자공학과 이윤정<br><br><div style='text-indent: 15px;'>서경대학교 전자공학과 이경민<br><br>서경대학교 소프트웨어학과 이선지<br><br>서경대학교 소프트웨어학과 최민석</html>");

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        label.setForeground(Color.black);
        this.add(label, BorderLayout.CENTER);
    }
}
