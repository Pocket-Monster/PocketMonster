package sounds;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class PlayMusic {

    private Clip clip;
    private Clip effectClip;

    //배경 음악 재생 메서드
    public void playBackgroundMusic(String filePath) {
        try {
            File soundFile = new File(filePath); // 절대 경로로 접근
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
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

    public void playEffectSound(String filePath) {
        try {
            if (effectClip != null && effectClip.isRunning()) {
                effectClip.stop();
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource(filePath));

            effectClip = AudioSystem.getClip();
            effectClip.open(audioStream);
            effectClip.start();
            effectClip.drain();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }




}
