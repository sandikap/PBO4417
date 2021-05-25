import java.awt.*;
import java.awt.event.*;

class TextFieldExample1 {
    public static void main(String[] args) {
        Frame f =new Frame("TextField Example");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        TextField t1;
        TextField t2;
        t1 = new TextField("Text field 1");
        t1.setBounds(50, 100, 200, 30);
        t2 = new TextField("Text field 2");
        t2.setBounds(50, 150, 200, 30);
        f.add(t1);
        f.add(t2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}