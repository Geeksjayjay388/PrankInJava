import javax.swing.JOptionPane;

public class PrankVirusAlert {
    public static void main(String[] args) throws InterruptedException {
        String[] messages = {
            "⚠️ WARNING: Suspicious activity detected!",
            "🛑 Your system may be infected!",
            "💣 Attempting to quarantine files...",
            "❌ Quarantine failed. System breach imminent!",
            "😱 Just kidding! It's a prank 😄"
        };

        for (String msg : messages) {
            JOptionPane.showMessageDialog(null, msg, "System Alert", JOptionPane.ERROR_MESSAGE);
            Thread.sleep(1500); // Pause between messages
        }

        JOptionPane.showMessageDialog(null, "Hope you didn’t panic 😅", "Prank Complete", JOptionPane.INFORMATION_MESSAGE);
    }
}
