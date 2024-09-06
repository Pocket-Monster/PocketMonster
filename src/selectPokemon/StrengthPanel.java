package selectPokemon;

import javax.swing.*;

public class StrengthPanel extends JPanel {
    public StrengthPanel(){
        //능력치 패널
        JPanel strenghtPanel = new JPanel();
        ImageIcon strenghtIcon = new ImageIcon("C:/Users/skyye/OneDrive/바탕 화면/서경대 3-2/JAVA/포켓몬/능력치.png");
        JLabel strenghtLabel = new JLabel(strenghtIcon);
        strenghtPanel.add(strenghtLabel);

        this.add(strenghtPanel);
    }
}