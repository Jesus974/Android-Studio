import javax.swing.JFrame;
import java.awt.event.*;

public class MonApplication {

  public static void main(String[] args) {
    MaFenetre f = new MaFenetre();
    f.afficher();
  }
}

class MaFenetre {

  JFrame mainFrame = null;

  public MaFenetre() {

    mainFrame = new JFrame();
    mainFrame.setTitle("Mon application");

    mainFrame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent ev) {
        System.exit(0);
      }
    });

    mainFrame.setSize(320, 240);
  }

  public void afficher() {
    mainFrame.setVisible(true);
  }
}