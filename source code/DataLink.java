package hw3;

/* This class is used for display message in datalink */

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

//draw TCPIP for data link layer
public class DataLink extends JPanel {

    private Component rootPane;

    public void paint(Graphics g) {

        HW3.layerLabel.setLocation(120, 30);
        HW3.messageLabel.setLocation(120, 60);
        Mouse_Click.jtext.setLocation(120, 80);

        super.paint(g);

        //int m = 0;
        int n = 0;
        //int i = 0;

        int xCenter = 10;  //base point x
        //int yTop1 = 250;   //up axis
        int yTop2 = 250;   //down axis
        int yScale = 40;
        int xAxis = 1500;

        //int yCenter1 = yTop1 + yScale;  //base point y for up axis
        int yCenter2 = yTop2 + yScale;  //base point y for down axis
        int x = 0, y = 0;

        //char a[] = HW3.strdata.toCharArray();
        char a[] = Ethernet_frame.Frame_bin.toCharArray();

        if (HW3.flagLineRed == 1) {
            //paint down axis
            g.setColor(Color.BLACK);
            g.drawLine(xCenter, yTop2, xCenter, yTop2 + 2 * yScale);
            g.drawLine(xCenter, yCenter2, xCenter + xAxis, yCenter2);

            for (int j = 0; j < a.length; j++) {

                //draw red line
                if (a[j] == '0') {

                    g.setColor(Color.red);
                    g.drawLine(n + 10, yTop2 + 10, n + 70, yTop2 + 10);
                    g.drawString("0", n + 30, 230);
                    n = n + 60;

                }

                //draw blue line
                if (a[j] == '1') {

                    g.setColor(Color.BLUE);
                    g.drawLine(n + 10, yCenter2 + 30, n + 70, yCenter2 + 30);
                    g.drawString("1", n + 30, 230);
                    n = n + 60;

                }
            }
        }

        /*BufferedImage Ethernet = null;
         try {
         Ethernet = ImageIO.read(new File("Ethernet.jpg"));
         } catch (IOException e) {
         }
         g.drawImage(Ethernet, 100, 90, 500, 150, rootPane);

         BufferedImage TcpIp = null;
         try {
         TcpIp = ImageIO.read(new File("TcpIp.png"));
         } catch (IOException e) {
         }
         g.drawImage(TcpIp, 100, 240, 500, 480, rootPane);*/
    }
}
