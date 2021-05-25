import java.awt.*;
import java.awt.event.*;

class TextFieldExample2 extends Frame implements ActionListener {
    TextField t1;
    TextField t2;
    TextField t3;
    
    Button b1;
    Button b2;
    
    TextFieldExample2() {
        t1 = new TextField();
        t1.setBounds(50, 50, 150, 20);
        t2 = new TextField();
        t2.setBounds(50, 100, 150, 20);
        t3 = new TextField();
        t3.setBounds(50, 150, 150, 20);
        t3.setEditable(false);
        
        b1 = new Button("+");
        b1.setBounds(50, 200, 50, 20);
        b2 = new Button("-");
        b2.setBounds(120, 200, 50, 20);
        b1.addActionListener(this);
        b2.addActionListener(this);

        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();
        int a = Integer.parseInt(s1);   
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource()==b1){
            c=a+b;
        }
        else if(e.getSource()==b2){
            c=a-b;
        }
        String result = String.valueOf(c);
        t3.setText(result);
    }
    public static void main(String[] args) {
        new TextFieldExample2();
    }
}