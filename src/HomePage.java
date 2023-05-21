import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {
    private JPanel HomePage;
    private JLabel fullName;
    private JTextField fullNameInput;
    private JTextField emailInput;
    private JButton submitButton;
    private JButton clearButton;
    private JLabel seyyidSAppLabel;

    public HomePage() {
        setContentPane(HomePage);
        setTitle("Seyyid's Booking App");
        setSize(300, 230);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fullNameInput.setText("");
                emailInput.setText("");
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectSeat ss = new SelectSeat();
                ss.setVisible(true);
                setVisible(false);
            }
        });
    }
}
