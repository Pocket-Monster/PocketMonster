package mainScreen;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class BackgroundMusic {

    private Clip clip;

    //배경 음악 재생 메서드
    public void playBackgroundMusic(String filePath) {
        try {
            File soundFile = new File(filePath); // 절대 경로로 접근
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY); // 무한 반복
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // 배경 음악 중지 메서드
    public void stopBackgroundMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();  // 음악을 멈춤
            clip.close();
        }
    }

    // 패널 전환 시 음악 중지
    public void switchPanel() {
        stopBackgroundMusic(); // 패널 전환 전 음악 중지
        // 패널 전환 로직 추가
    }
}
