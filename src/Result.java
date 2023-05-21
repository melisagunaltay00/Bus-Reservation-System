import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Result extends JFrame {
    private JButton goToHomepageButton;
    private JPanel resultPanel;

    public Result() {

        setContentPane(resultPanel);
        setTitle("Seyyid's App");
        setSize(300,230);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        goToHomepageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomePage hp = new HomePage();
                hp.setVisible(true);
                setVisible(false);
            }
        });
    }
}
