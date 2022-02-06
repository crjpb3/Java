import javax.swing.*;
import java.awt.Color;

public class Main {

    static public void main(String[] args){
        JFrame window = new JFrame();
        JTextArea angle = new JTextArea("Known Angle");
        angle.setBounds(50,50,75,20);
        angle.setBorder(BorderFactory.createLineBorder(Color.black));
        window.add(angle);
        window.setTitle("Triangle Solver");
        //window.getContentPane().setBackground(new Color(67,69,74));
        window.setSize(800,800);
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}
