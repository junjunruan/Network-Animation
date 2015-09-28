
package hw3;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


//draw sine wave for blue ball
    public class DrawSine_blue extends JPanel {
        
        private Component rootPane;

        public void paint(Graphics g) {

            HW3.layerLabel.setLocation(320, 10);
            HW3.messageLabel.setLocation(320, 30);
            HW3.divisorLabel.setLocation(320, 53);
            HW3.dividendLabel.setLocation(320, 80);
            HW3.dataField.setLocation(600, 80);
            HW3.augmenterField.setLocation(823, 80);
            HW3.CRCButton.setLocation(320, 130);
            HW3.detectionLabel.setLocation(600, 135);

            super.paint(g);

            int m = 0;
            int n = 0;
            int i = 0;

            int xCenter = 10;  //base point x
            int yTop1 = 250;   //up axis
            int yTop2 = 400;   //down axis
            int yScale = 40;
            int xAxis = 1500;

            int yCenter1 = yTop1 + yScale;  //base point y for up axis
            int yCenter2 = yTop2 + yScale;  //base point y for down axis
            int x = 0, y = 0;

            //draw the axis
            g.drawLine(xCenter, yTop1, xCenter, yTop1 + 2 * yScale);
            g.drawLine(xCenter, yCenter1, xCenter + xAxis, yCenter1);

            char a[] = HW3.strdata2.toCharArray();

            for (int j = 0; j < a.length; j++) {

                //paint red sine curve
                if (a[j] == '0') {

                    g.setColor(Color.red);

                    for (i = m; i < m + 120; i++) {
                        x = xCenter + i;
                        y = (int) (yCenter1 - Math.sin(Math.toRadians(i * 3)) * yScale);
                        // there's no drawPoint in java so draw a VERY short line
                        g.drawLine(x, y, x, y);
                    }
                    g.drawString("0", m + 60 / 2, 240);
                    m = m + 120;

                }

                //paint blue sine curve
                if (a[j] == '1') {

                    g.setColor(Color.BLUE);

                    for (i = m; i < m + 120; i++) {
                        x = xCenter + i;
                        y = (int) (yCenter1 - Math.sin(Math.toRadians(i * 6)) * yScale);
                        // there's no drawPoint in java so draw a VERY short line
                        g.drawLine(x, y, x, y);
                    }
                    g.drawString("1", m + 70 / 2, 240);
                    m = m + 120;
                }
            }

            if (HW3.flagLineBlue == 1) {
                //paint down axis
                g.setColor(Color.BLACK);
                g.drawLine(xCenter, yTop2, xCenter, yTop2 + 2 * yScale);
                g.drawLine(xCenter, yCenter2, xCenter + xAxis, yCenter2);

                for (int j = 0; j < a.length; j++) {

                    //draw red line
                    if (a[j] == '0') {

                        g.setColor(Color.red);
                        g.drawLine(n + 10, yTop2 + 10, n + 70, yTop2 + 10);
                        g.drawString("0", n + 30, 380);
                        n = n + 60;

                    }

                    //draw blue line
                    if (a[j] == '1') {

                        g.setColor(Color.BLUE);
                        g.drawLine(n + 10, yCenter2 + 30, n + 70, yCenter2 + 30);
                        g.drawString("1", n + 30, 380);
                        n = n + 60;

                    }
                }
            }

            /*BufferedImage Ethernet = null;
            try {
                Ethernet = ImageIO.read(new File("Ethernet.jpg"));
            } catch (IOException e) {
            }
            g.drawImage(Ethernet, 100, 500, 500, 150, rootPane);

            BufferedImage TcpIp = null;
            try {
                TcpIp = ImageIO.read(new File("TcpIp.png"));
            } catch (IOException e) {
            }
            g.drawImage(TcpIp, 100, 650, 500, 480, rootPane);*/

        }
    }


