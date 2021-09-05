/*
package chattingApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client extends JFrame {
    JPanel p1;
    JTextField t1;
    JButton b1;
    static JTextArea a1;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    Client() {
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0,0,400,50);
        add(p1);
        // Arrow Image
        ImageIcon i1=new ImageIcon("C:\\Users\\Ritesh Verma\\IdeaProjects\\Chatting-Application\\src\\chattingApplication\\icons\\back.png");
        Image i2= i1.getImage().getScaledInstance(26,26,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(5,8,28,28);
        p1.add(l1);
        l1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });


        //Ironman image
        ImageIcon i4=new ImageIcon("C:\\Users\\Ritesh Verma\\IdeaProjects\\Chatting-Application\\src\\chattingApplication\\icons\\ironman.png");
        Image i5= i4.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        ImageIcon i6 =new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(45,1,50,50);
        p1.add(l2);


        //NAme text
        JLabel l3=new JLabel("Ironman");
        l3.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        l3.setForeground(Color.WHITE);
        l3.setBounds(100,3,150,15);
        p1.add(l3);


        //Active text
        JLabel l4=new JLabel("Active");
        l4.setFont(new Font("SAN_SERIF",Font.CENTER_BASELINE,11));
        l4.setForeground(Color.WHITE);
        l4.setBounds(120,25,150,13);
        p1.add(l4);

        //video call
        ImageIcon i7=new ImageIcon("C:\\Users\\Ritesh Verma\\IdeaProjects\\Chatting-Application\\src\\chattingApplication\\icons\\videocall.png");
        Image i8= i7.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
        ImageIcon i9 =new ImageIcon(i8);
        JLabel l5=new JLabel(i9);
        l5.setBounds(250,5,32,30);
        p1.add(l5);



        //call
        ImageIcon i10=new ImageIcon("C:\\Users\\Ritesh Verma\\IdeaProjects\\Chatting-Application\\src\\chattingApplication\\icons\\call.png");
        Image i11= i10.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
        ImageIcon i12 =new ImageIcon(i11);
        JLabel l6=new JLabel(i12);
        l6.setBounds(300,5,30,30);
        p1.add(l6);




        //dot
        ImageIcon i13=new ImageIcon("C:\\Users\\Ritesh Verma\\IdeaProjects\\Chatting-Application\\src\\chattingApplication\\icons\\threedot.png");
        Image i14= i13.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
        ImageIcon i15 =new ImageIcon(i14);
        JLabel l7=new JLabel(i15);
        l7.setBounds(350,5,30,30);
        p1.add(l7);


        //TextArea
        a1=new JTextArea();
        a1.setBounds(2,50,400,430);
        a1.setFont(new Font("SAN_SERIF",Font.CENTER_BASELINE,13));
        a1.setEditable(false);
        a1.setLineWrap(true);
        a1.setWrapStyleWord(true);

        add(a1);





        //textfield
        t1=new JTextField();
        t1.setBounds(5,490,330,50);
        add(t1);
        t1.setFont(new Font("SAN_SERIF",Font.BOLD,16));


        //Send
        ImageIcon i16=new ImageIcon("C:\\Users\\Ritesh Verma\\IdeaProjects\\Chatting-Application\\src\\chattingApplication\\icons\\send.png");
        Image i17= i16.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        ImageIcon i18 =new ImageIcon(i17);
        JLabel l8=new JLabel(i18);
        l8.setBounds(335,490,50,50);
        add(l8);
        l8.addMouseListener(new MouseAdapter() {
            @Override public void mouseClicked(MouseEvent e) {
                try {
                String out=t1.getText();
                a1.setText(a1.getText()+"\n \t \t \t "+ out);

                    dout.writeUTF(out);
                } catch (IOException ioException) {

                }
                t1.setText("");
            }
        });


        setLayout(null);
        setSize(400,550);
        setLocation(650,80);
        setUndecorated(true);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Client().setVisible(true);
        try {
            s=new Socket("127.0.0.1",6001);
            din=new DataInputStream(s.getInputStream());
            dout=new DataOutputStream(s.getOutputStream());
            String msginput="";
            msginput= din.readUTF();
            a1.setText(a1.getText()+"\n"+msginput);
        }
        catch (Exception e){

        }
    }

}
*/
