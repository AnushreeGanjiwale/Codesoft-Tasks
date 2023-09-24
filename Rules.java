package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    JButton start,back;
    String name;
    public Rules(String name){
        this.name=name;
      
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1000,900);
        setLocation(350,50);
        setVisible(true);
        
        JLabel Heading=new JLabel("Welcome" + " "+ name + " " + "to Simple Minds");
        Heading.setBounds(50,50,900,80);
        Heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        Heading.setForeground(Color.BLUE);
        add(Heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(20,90,700,600);
        rules.setFont(new Font("Tahoma",Font.PLAIN,20));
        rules.setForeground(Color.black);
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
);
     add(rules);
     start = new JButton("start");
     start.setBounds(400,700,100,30);
     start.addActionListener(this);
     add(start);
     
      back=new JButton("Back");
      back.setBounds(250,700,100,30);
      back.addActionListener(this);
      add(back);
    }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==start){
        
    }else{
          setVisible(false);
          new Login();
        }
    }
    public static void main(String args[]){
        new Rules("User");
    
    }
}
