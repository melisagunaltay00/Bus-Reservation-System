import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectSeat extends JFrame {
    private JLabel seyyidsAppSeat;
    private JLabel seatTitle;
    private JTextField textField1;
    private JButton button1;
    private JPanel seatPanel;
    JLabel allSeats;

    public SelectSeat(){
        setContentPane(seatPanel);
        setTitle("Seyyid's Booking App");
        setSize(300,230);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BookingInfo bi = new BookingInfo();
                if(textField1.getText().length() > 0){
                    bi.seatNumberLabel.setText(textField1.getText());
                }
                setVisible(false);
            }
        });
    }
}
