import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame {
    private JButton button;
    private String[] fortuna = {
            "No confundas la sabiduría con la suerte, uno solo llega a conocerse a sí mismo después de enfrentarse al peligro. - Son Goku",
            "No te preocupes, pase lo que pase, estaré bien, no importa cuánto tiempo pase, te lo prometo. - Vegeta",
            "La confianza no surge de la nada, nace de algo... A veces, nace del miedo. - Son Gohan",
            "¡No importa cuántas veces te caigas, sigue adelante! - Son Goku",
            "Incluso el peor día puede convertirse en el mejor. - Son Goku",
            "Ya basta Freezer ahhhhh. - Krilin",
            "¡Las personas cambian! Renuncian a sus verdaderas características y adquieren otras nuevas. - Piccolo",
            "La fuerza depende de la voluntad humana, mientras más te esfuerces, más fuerte serás. - Krillin",
            "Lo más importante es no rendirse nunca, ¿entiendes? - Son Goku",
            "Los sacrificios deben hacerse por el bien común. - Son Goku",
            "A veces, nuestros sueños necesitan un poco más de tiempo para convertirse en realidad. - Son Goku"

    };

    public Main() {
        setTitle("Galleta de la Fortuna");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 350);
        setLocationRelativeTo(null);

        initializeComponents();
    }

    private void initializeComponents() {
        JPanel panel = new JPanel();
        button = new JButton("Abrir galleta");
        button.addActionListener(new ButtonClickListener());
        panel.add(button);
        add(panel);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                String fortune = getRandomFortune();
                showMessage(fortune);
            }
        }
    }

    private String getRandomFortune() {
        Random random = new Random();
        int index = random.nextInt(fortuna.length);
        return fortuna[index];
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Mensaje de la galleta de la Fortuna", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Main app = new Main();
                app.setVisible(true);
            }
        });
    }
}
