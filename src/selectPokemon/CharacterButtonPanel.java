package selectPokemon;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// 포켓몬 영어 이름 : Pikachu(피카츄), Squirtle(꼬부기), Bulbasaur(이상해씨)

public class CharacterButtonPanel extends JPanel {
    public CharacterButtonPanel(JFrame frame) {

        //피카츄 버튼
        ImageIcon pikachuIcon = new ImageIcon("src/img/피카츄.png");
        JButton pikachuButton = new JButton(pikachuIcon);
        pikachuButton.setBorderPainted(false); // 버튼 테두리 제거
        pikachuButton.setContentAreaFilled(false); // 버튼 배경 제거
        pikachuButton.setFocusPainted(false); // 버튼 클릭 시 표시 제거
        pikachuButton.setOpaque(true);


        //꼬부기 버튼
        ImageIcon squirtleIcon = new ImageIcon("src/img/꼬부기.png");
        JButton squirtlebutton = new JButton(squirtleIcon);
        squirtlebutton.setBorderPainted(false);
        squirtlebutton.setContentAreaFilled(false);
        squirtlebutton.setFocusPainted(false);
        squirtlebutton.setOpaque(true);

        //이상해씨 버튼
        ImageIcon bulbasaurIcon = new ImageIcon("src/img/이상해씨.png");
        JButton bulbasaurButton = new JButton(bulbasaurIcon);
        bulbasaurButton.setBorderPainted(false);
        bulbasaurButton.setContentAreaFilled(false);
        bulbasaurButton.setFocusPainted(false);
        bulbasaurButton.setOpaque(true);

        // 피카츄 버튼에 이벤트 추가
        pikachuButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int result = JOptionPane.showConfirmDialog(frame, "피카츄를 선택하셨습니다. 계속하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.out.println("피카츄 선택");
                    switchToMapPanel(frame);
                } else {
                    System.out.println("다시 선택하세요.");
                }
            }
        });

        // 꼬부기 버튼에 이벤트 추가
        squirtlebutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int result = JOptionPane.showConfirmDialog(frame, "꼬부기를 선택하셨습니다. 계속하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.out.println("꼬부기 선택");
                    switchToMapPanel(frame);
                } else {
                    System.out.println("다시 선택하세요.");
                }
            }
        });

        // 이상해씨 버튼에 이벤트 추가
        bulbasaurButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int result = JOptionPane.showConfirmDialog(frame, "이상해씨를 선택하셨습니다. 계속하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.out.println("이상해씨 선택");
                    switchToMapPanel(frame);
                } else {
                    System.out.println("다시 선택하세요.");
                }
            }
        });

        this.add(pikachuButton);
        this.add(squirtlebutton);
        this.add(bulbasaurButton);
    }
        //지도 화면 전환 메서드
        private void switchToMapPanel(JFrame frame) {
            frame.getContentPane().removeAll(); // 기존 패널 제거
            frame.getContentPane().add(new MapPanel()); // 새로운 지도 패널 추가
            frame.revalidate(); // 패널 업데이트
            frame.repaint(); // 패널 다시 그리기

    }

}
