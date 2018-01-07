import javax.swing.*;

/**
 * Created by infuntis on 15/01/17.
 */

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(326,316);
        setLocation(300,300);
        add(new GameField());
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}