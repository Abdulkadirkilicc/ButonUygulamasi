import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonUygulamasi extends JButton {

    private static Color pasifRenk = Color.RED;
    private static Color aktifRenk = Color.GREEN;

    private static ButonUygulamasi[][] buttons; 
    private static ButonUygulamasi activeButton = null;

    private String graphqlSchemaUrl;

    private ImageIcon aktifIcon;
    private ImageIcon pasifIcon;

    public ButonUygulamasi(String graphqlSchemaUrl) {
        this.graphqlSchemaUrl = graphqlSchemaUrl;

        // aktif ve pasif icon nesneleri
        aktifIcon = new ImageIcon(getClass().getResource("a.jpg"));
        pasifIcon = new ImageIcon(getClass().getResource("p.jpg"));

        setDefaults();
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick();
            }
        });
    }

    private void setDefaults() {
        setBackground(pasifRenk);
        setBorderPainted(true);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setOpaque(true);
        setPreferredSize(new Dimension(100, 100));
        setIcon(pasifIcon);
    }

    private void handleButtonClick() {
        if (activeButton == this) {
            setButtonPasif();
        } else {
            if (activeButton != null) {
                activeButton.setButtonPasif();
            }
            setButtonActive();
            runGraphQLMutation();
        }
    }

    private void setButtonActive() {
        setBackground(aktifRenk);
        setIcon(aktifIcon);
        activeButton = this;
    }

    private void setButtonPasif() {
        setDefaults();
        activeButton = null;
    }

    private void runGraphQLMutation() {
        System.out.println("Değişiklik Yaptınız. " + graphqlSchemaUrl);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Button Kontrol Paneli");
                frame.setLayout(new GridLayout(4, 4));

                buttons = new ButonUygulamasi[4][4];

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        ButonUygulamasi button = new ButonUygulamasi("Butonu Aktif Hale Getirdiniz.");
                        buttons[i][j] = button;
                        frame.add(button);
                    }
                }

                frame.setSize(600, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
