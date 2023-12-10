import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//1220505050 Abdulkadir Kılıç

// ButonUygulamasi classını JButton sınıfından Kalıtıyoruz.
public class ButonUygulamasi extends JButton {

    // Pasif ve aktif renkleri tanımladık.
    private static Color pasifRenk = Color.RED;
    private static Color aktifRenk = Color.GREEN;
    
    // GraphQL şema URL'si ve butonun durumu için tanımlamalar yaptım.
    private String graphqlSchemaUrl;
    private boolean isActive;

    private ImageIcon aktifIcon;
    private ImageIcon pasifIcon;
    
    // Yapıtıcı metod tanımını yaptım
    public ButonUygulamasi(String graphqlSchemaUrl) {
        this.graphqlSchemaUrl = graphqlSchemaUrl;
        this.isActive = false;

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
    
  // Butonun varsayılan özelliklerini ayarlayan metot tanımını yaptım.
    private void setDefaults() {
        setBackground(pasifRenk);
        setBorderPainted(true);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setOpaque(true);
        setPreferredSize(new Dimension(100, 100));
        setIcon(pasifIcon);
    }
    
// Butona tıklandığında çalışacak metotu çağırdım.
    private void handleButtonClick() {
        if (!isActive) {
            setButtonActive();
            runGraphQLMutation();
        } else { 
            // Buton daha önce basılmışsa bu gövde çalışacak
            setButtonPasif();
            System.out.println("Değişiklik Yaptınız. Butonu Pasif Hale Getirdiniz.");
        }
    }
    
 // Butonu tıklanıldığı  aktif hale getiren metot tanımı.
    private void setButtonActive() {
        setBackground(aktifRenk);
        setIcon(aktifIcon);
        isActive = true;
    }
    
    // Basılmış butonu pasif hale getiren metot tanımı.
    private void setButtonPasif() {
        setDefaults();
        isActive = false;
    }
    
// GraphQL şemasında bir mutation çalıştırma işlemi gerçekleştiren metot.
    private void runGraphQLMutation() {
        System.out.println("Değişiklik Yaptınız. " + graphqlSchemaUrl);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Button Kontrol Paneli");
                frame.setLayout(new GridLayout(4, 4));

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        ButonUygulamasi button = new ButonUygulamasi("Butonu Aktif Hale Getirdiniz.");
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
