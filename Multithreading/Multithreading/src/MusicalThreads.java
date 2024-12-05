import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class MusicalThreads {

    // The class for playing a single note.
    static class PlayNotes implements Runnable {
        private final String[] notes;
        private final CountDownLatch latch;
        private final boolean isThread1;

        // Constructor that takes an array of notes to play, a latch for synchronization, and an indicator for thread 1
        public PlayNotes(String[] notes, CountDownLatch latch, boolean isThread1) {
            this.notes = notes;
            this.latch = latch;
            this.isThread1 = isThread1;
        }

        // Method to play a single tone based on the note name
        private void playTone(String note) {
            try {
                // Build the path dynamically by concatenating the folder and the note file
                File audioFile = new File("C:/Users/sheha/OneDrive/Desktop/Info5100/Multithreading/Multithreading/src/music/" + note);  // Update this path to your music files directory
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
                // Adjust the sleep duration to wait for the sound to finish. You might need to adjust based on the sound length.
                Thread.sleep(600);  // Increase time to match the tone's length (500ms was too short)
                clip.close();
            } catch (IOException | UnsupportedAudioFileException | LineUnavailableException | InterruptedException e) {
                e.printStackTrace();
            }
        }

        // The run method that plays the notes in the provided order
        @Override
        public void run() {
            for (String note : notes) {
                // Play the tone
                playTone(note);
                // Synchronize after each note
                latch.countDown(); // Decrement the latch count
                try {
                    // Wait for the other thread to reach the same point
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Define the notes for each thread in the sequence do, re, mi, fa, sol, la, si, do-octave
        String[] thread1Notes = {"do.wav", "mi.wav", "sol.wav", "si.wav", "do-octave.wav"};
        String[] thread2Notes = {"re.wav", "fa.wav", "la.wav", "do-octave.wav"};

        // CountDownLatch for synchronization
        CountDownLatch latch = new CountDownLatch(1);  // Only one countdown for initial sync

        // Create the two threads
        Thread thread1 = new Thread(new PlayNotes(thread1Notes, latch, true));
        Thread thread2 = new Thread(new PlayNotes(thread2Notes, latch, false));

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Basic music finished playing.");

        // Playing "Twinkle Twinkle Little Star"
        System.out.println("Now playing Twinkle Twinkle Little Star...");

        // Define the melody for Twinkle Twinkle Little Star
        String[] twinkleNotes1 = {
                "do.wav", "do.wav", "sol.wav", "sol.wav", "la.wav", "la.wav", "sol.wav",
                "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "re.wav", "do.wav"
        };

        String[] twinkleNotes2 = {
                "so.wav", "so.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav",
                "so.wav", "so.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav"
        };

        // Create the threads for playing Twinkle Twinkle
        CountDownLatch twinkleLatch = new CountDownLatch(1);  // Synchronize twinkle music start
        Thread twinkleThread1 = new Thread(new PlayNotes(twinkleNotes1, twinkleLatch, true));
        Thread twinkleThread2 = new Thread(new PlayNotes(twinkleNotes2, twinkleLatch, false));

        // Start the threads
        twinkleThread1.start();
        twinkleThread2.start();

        try {
            // Wait for both threads to finish
            twinkleThread1.join();
            twinkleThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Twinkle Twinkle Little Star finished playing.");
    }
}
