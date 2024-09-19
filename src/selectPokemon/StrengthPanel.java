package selectPokemon;

import javax.swing.*;

public class StrengthPanel extends JPanel {
    public StrengthPanel(){
        //능력치 패널
        JPanel strenghtPanel = new JPanel();
        ImageIcon strenghtIcon = new ImageIcon("src/img/능력치.png");
        JLabel strenghtLabel = new JLabel(strenghtIcon);
        strenghtPanel.add(strenghtLabel);

        this.add(strenghtPanel);
    }
}