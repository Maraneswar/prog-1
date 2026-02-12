import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class HelloWorld {
    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hello World");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            // Add the label
            JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
            frame.add(label);

            // Center the frame on the screen
            frame.setLocationRelativeTo(null);

            frame.setVisible(true);
        });
    }
}
