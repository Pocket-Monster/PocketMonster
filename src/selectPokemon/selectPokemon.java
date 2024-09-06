package selectpokemon;

import javax.swing.*;
import java.awt.*;

// 포켓몬 영어 이름 : Pikachu(피카츄), Squirtle(꼬부기), Bulbasaur(이상해씨)

class MyFrame extends JFrame {
    public MyFrame(){
        setSize(768,576);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Select pocketmon");

        //전체 패널
        JPanel panel = new JPanel(new BorderLayout());

        //레이블 패널
        JPanel labelPanel = new JPanel(new FlowLayout()); // 기본 설정값이 FlowLayout()으로, 작성 생략 가능
        JLabel label = new JLabel("사용할 포켓몬을 선택하세요");
        labelPanel.add(label);

        //능력치 패널
        JPanel stranghtPanel = new JPanel();
        ImageIcon stranghtIcon = new ImageIcon("C:/Users/skyye/OneDrive/바탕 화면/서경대 3-2/JAVA/포켓몬/능력치.png");
        JLabel stranghtLabel = new JLabel(stranghtIcon);
        stranghtPanel.add(stranghtLabel);

        //버튼 패널
        JPanel buttonPanel = new JPanel(new FlowLayout());

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

        buttonPanel.add(pikachuButton);
        buttonPanel.add(squirtlebutton);
        buttonPanel.add(bulbasaurButton);
        panel.add(labelPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(stranghtPanel, BorderLayout.SOUTH);

        add(panel);
        setVisible(true); // 가시화
    }
}

public class selectPokemon extends JFrame {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}

