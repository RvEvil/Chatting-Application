package chattingApplication;

import javax.swing.*;

public class Server extends JFrame {
    Server(){
        setSize(350,480);
        setVisible(true);
        setLocation(220,100);
    }

    public static void main(String[] args) {
        new Server().setVisible(true);
    }

}
