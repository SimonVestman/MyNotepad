import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotepadEDITOR {
    private JScrollBar scrollBar1;
    private JTextArea textArea1;
    private JButton Arkiv;
    private JButton button2;
    private JButton button3;
    private JPanel panel;

    static JMenuBar menuBar;
    static JMenu menu;
    static JMenuItem menuItem;



    public NotepadEDITOR() {
        Arkiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("NotepadEDITOR");
        frame.setContentPane(new NotepadEDITOR().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        menuBar = new JMenuBar();
        menu =  new JMenu("Stuff");
        menuItem = new JMenuItem("HEj222");

        menuBar.add(menu);
        menu.add(menuItem);
        frame.setJMenuBar(menuBar);

    }
}


