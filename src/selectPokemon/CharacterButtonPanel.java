package selectpokemon;

import javax.swing.*;
import java.awt.*;

// 포켓몬 영어 이름 : Pikachu(피카츄), Squirtle(꼬부기), Bulbasaur(이상해씨)

public class CharacterButtonPanel extends JPanel {
    public CharacterButtonPanel() {

        //피카츄 버튼
        ImageIcon pikachuIcon = new ImageIcon("C:/Users/skyye/OneDrive/바탕 화면/서경대 3-2/JAVA/포켓몬/피카츄.png");
        JButton pikachuButton = new JButton(pikachuIcon);
        pikachuButton.setBorderPainted(false); // 버튼 테두리 제거
        pikachuButton.setContentAreaFilled(false); // 버튼 배경 제거
        pikachuButton.setFocusPainted(false); // 버튼 클릭 시 표시 제거
        pikachuButton.setOpaque(true);

        //꼬부기 버튼
        ImageIcon squirtleIcon = new ImageIcon("C:/Users/skyye/OneDrive/바탕 화면/서경대 3-2/JAVA/포켓몬/꼬부기.png");
        JButton squirtlebutton = new JButton(squirtleIcon);
        squirtlebutton.setBorderPainted(false);
        squirtlebutton.setContentAreaFilled(false);
        squirtlebutton.setFocusPainted(false);
        squirtlebutton.setOpaque(true);

        //이상해씨 버튼
        ImageIcon bulbasaurIcon = new ImageIcon("C:/Users/skyye/OneDrive/바탕 화면/서경대 3-2/JAVA/포켓몬/이상해씨.png");
        JButton bulbasaurButton = new JButton(bulbasaurIcon);
        bulbasaurButton.setBorderPainted(false);
        bulbasaurButton.setContentAreaFilled(false);
        bulbasaurButton.setFocusPainted(false);
        bulbasaurButton.setOpaque(true);

        this.add(pikachuButton);
        this.add(squirtlebutton);
        this.add(bulbasaurButton);
    }

}
