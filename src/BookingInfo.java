import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookingInfo extends JFrame {
    private JButton cancelTheSeatButton;
    private JPanel infoPanel;
    private JLabel infoTitle;
    private JLabel seatInfo;
    private JButton continueButton;
    JLabel seatNumberLabel;

    public BookingInfo(){
        setContentPane(infoPanel);
        setTitle("Seyyid's Booking App");
        setSize(300,230);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result rp = new Result();
                setVisible(false);
            }
        });
        cancelTheSeatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomePage hp = new HomePage();
                hp.setVisible(true);
                setVisible(false);
            }
        });
    }
}
