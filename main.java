import javax.swing.SwingUtilities;
import model.*;
import controller.*;
import view.*;


public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginView form = new LoginView();
            form.setVisible(true);
        });
    }
}
