package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;  
    JTextField tfname=new JTextField();
    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(120,0,600,500);
        add(image);  
        
        
       
         
        JLabel Heading=new JLabel("simple Minds");
        Heading.setBounds(850,60,300,45);
        Heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        Heading.setForeground(Color.BLUE);
        add(Heading);
        
        JLabel Name=new JLabel("Enter your Name");
        Name.setBounds(900,150,500,20);
        Name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        Name.setForeground(Color.BLUE);
        add(Name);
        
        tfname.setBounds(835,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(835,270,120,25);
        rules.addActionListener(this);
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(1020,270,120,25);
        back.addActionListener(this);
        add(back);
        
       setVisible(true);
       setSize(1200,600);
       setLocation(200,150);
}

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            setVisible(false);
            String name= tfname.getText();
            new Rules(name);
    }else if(ae.getSource()==back){
        setVisible(false);
        
    }
    }
    
    
    public static void main(String args[]){
        new Login();
    
}
}
