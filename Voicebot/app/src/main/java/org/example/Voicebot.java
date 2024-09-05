package com.example.voicebot;

import javax.sound.sampled.*;
import java.io.*;

public class Voicebot {

    public static void main(String[] args) {
        AudioFormat format = new AudioFormat(16000, 16, 1, true, true);
        DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
        
        try (TargetDataLine microphone = (TargetDataLine) AudioSystem.getLine(info);
             AudioInputStream ais = new AudioInputStream(microphone);
             ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            
            microphone.open(format);
            microphone.start();

            System.out.println("Capturing audio for 5 seconds...");
            long startTime = System.currentTimeMillis();
            
            // Capture audio for 5 seconds
            while (System.currentTimeMillis() - startTime < 5000) {
                out.write(ais.readNBytes(4096));
            }

            // Save the captured audio to a WAV file
            byte[] audioData = out.toByteArray();
            try (AudioInputStream audioInputStream = new AudioInputStream(
                    new ByteArrayInputStream(audioData), format, audioData.length)) {
                AudioSystem.write(audioInputStream, AudioFileFormat.Type.WAVE, new File("captured_audio.wav"));
            }

            System.out.println("Audio captured and saved to 'captured_audio.wav'");

        } catch (LineUnavailableException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("Closing voice bot...");
    }
}