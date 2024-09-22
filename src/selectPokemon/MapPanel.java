
package selectPokemon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import funtions.SwitchPanel;
import storeScreen.StorePanel;


public class MapPanel extends JPanel {

    public MapPanel(JFrame frame) {

        // 지도 이미지 로드 (Tiled에서 저장한 PNG 파일 경로)
        ImageIcon mapIcon = new ImageIcon("src/map/smallMap.png");  // 수정된 파일 경로
        JLabel mapLabel = new JLabel(mapIcon);
        // 지도 이미지를 패널에 추가
        this.setLayout(new BorderLayout());
        this.add(mapLabel, BorderLayout.CENTER);

        //상점으로 들어가는 임시 버튼
        JButton inStoreButton=new JButton("상점");
        inStoreButton.setBounds(350,300,100,50);
        inStoreButton.setOpaque(false); // 투명 배경으로 설정

        inStoreButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JPanel switchToStorePanel=new storeScreen.StorePanel(frame);
                SwitchPanel.switchPanel(frame,switchToStorePanel);
            }
        });
        this.add(inStoreButton, BorderLayout.SOUTH);
    }
}

/* 경민님 코
package selectPokemon;

import javax.swing.*;
import java.awt.*;

public class MapPanel extends JPanel {

    public MapPanel() {
        // 지도 이미지 로드 (Tiled에서 저장한 PNG 파일 경로)
        ImageIcon mapIcon = new ImageIcon("src/map/지도.png");  // 수정된 파일 경로
        JLabel mapLabel = new JLabel(mapIcon);

        // 지도 이미지를 패널에 추가
        this.setLayout(new BorderLayout());
        this.add(mapLabel, BorderLayout.CENTER);
    }
}
*/