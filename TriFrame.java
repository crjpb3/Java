import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TriFrame extends JFrame {

    JButton submit;

    TriFrame(){
        JFrame window = new JFrame();

        JLabel angleLabel = new JLabel();
        angleLabel.setText("Angle 1: ");
        angleLabel.setBounds(10,50,50,20);

        JTextArea angle = new JTextArea("");
        angle.setBounds(60,50,75,20);
        angle.setBorder(BorderFactory.createLineBorder(Color.black));

        submit = new JButton();
        submit.setBounds(50,100,75,25);
        submit.setText("Submit");
        submit.addActionListener(e->System.out.println(angle.getText()));

        window.add(angleLabel);
        window.add(angle);
        window.add(submit);
        window.setTitle("Triangle Solver");
        //window.getContentPane().setBackground(new Color(67,69,74));
        window.setSize(800,800);
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
