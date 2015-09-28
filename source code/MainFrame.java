package hw3;
/*This is used for painting seven layer and routers*/

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MainFrame extends JPanel {

    private Component rootPane;

    public void paint(Graphics g) {

        HW3.inputField.setLocation(420, 50);
        HW3.redButton.setLocation(650, 45);
        HW3.noteLabel.setLocation(420, 80);
        HW3.noteLabel2.setLocation(420, 100);
        HW3.noteLabel3.setLocation(420, 120);

        HW3.jLabel_r1r2.setLocation(340, 480);
        HW3.jLabel_r1r2b.setLocation(365, 480);
        HW3.jLabel_r1r7.setLocation(340, 580);
        HW3.jLabel_r1r7b.setLocation(365, 580);
        HW3.jLabel_r2r5.setLocation(440, 480);
        HW3.jLabel_r2r5b.setLocation(465, 480);
        HW3.jLabel_r7r5.setLocation(440, 580);
        HW3.jLabel_r7r5b.setLocation(465, 580);
        HW3.jLabel_r2r3.setLocation(620, 420);
        HW3.jLabel_r2r3b.setLocation(645, 420);
        HW3.jLabel_r5r6.setLocation(620, 520);
        HW3.jLabel_r5r6b.setLocation(645, 520);
        HW3.jLabel_r7r8.setLocation(620, 620);
        HW3.jLabel_r7r8b.setLocation(645, 620);
        HW3.jLabel_r6r3.setLocation(750, 480);
        HW3.jLabel_r6r3b.setLocation(775, 480);
        HW3.jLabel_r6r8.setLocation(750, 580);
        HW3.jLabel_r6r8b.setLocation(775, 580);
        HW3.jLabel_r3r4.setLocation(850, 480);
        HW3.jLabel_r3r4b.setLocation(875, 480);
        HW3.jLabel_r8r4.setLocation(850, 580);
        HW3.jLabel_r8r4b.setLocation(875, 580);

        super.paint(g);

        Font fontB = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 18);
        Font fontP = new Font("Arial", Font.PLAIN, 15);

        //draw left seven layers           
        g.setColor(Color.GREEN);
        g.fillRect(HW3.lx, HW3.ly, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("7: Application", HW3.lx + 10, HW3.ly + 30);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(HW3.lx, HW3.ly + HW3.h, 180, HW3.h1);
        g.setColor(Color.black);
        g.setFont(fontP);
        g.drawString("Layer Interface", HW3.lx + 10, HW3.ly + 30 + HW3.h1);

        g.setColor(Color.GREEN);
        g.fillRect(HW3.lx, HW3.ly + HW3.h + HW3.h1, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("6: Presentation", HW3.lx + 10, HW3.ly + 30 + HW3.h + HW3.h1);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(HW3.lx, HW3.ly + HW3.h * 2 + HW3.h1, 180, HW3.h1);
        g.setColor(Color.black);
        g.setFont(fontP);
        g.drawString("Layer Interface", HW3.lx + 10, HW3.ly + 30 + HW3.h + HW3.h1 * 2);

        g.setColor(Color.GREEN);
        g.fillRect(HW3.lx, HW3.ly + (HW3.h + HW3.h1) * 2, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("5: Session", HW3.lx + 10, HW3.ly + 30 + (HW3.h + HW3.h1) * 2);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(HW3.lx, HW3.ly + (HW3.h + HW3.h1) * 2 + HW3.h, 180, HW3.h1);
        g.setColor(Color.black);
        g.setFont(fontP);
        g.drawString("Layer Interface", HW3.lx + 10, HW3.ly + 30 + (HW3.h + HW3.h1) * 2 + HW3.h1);

        g.setColor(Color.GREEN);
        g.fillRect(HW3.lx, HW3.ly + (HW3.h + HW3.h1) * 3, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("4: Transport", HW3.lx + 10, HW3.ly + 30 + (HW3.h + HW3.h1) * 3);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(HW3.lx, HW3.ly + (HW3.h + HW3.h1) * 3 + HW3.h, 180, HW3.h1);
        g.setColor(Color.black);
        g.setFont(fontP);
        g.drawString("Layer Interface", HW3.lx + 10, HW3.ly + 30 + (HW3.h + HW3.h1) * 3 + HW3.h1);

        g.setColor(Color.GREEN);
        g.fillRect(HW3.lx, HW3.ly + (HW3.h + HW3.h1) * 4, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("3: Network", HW3.lx + 10, HW3.ly + 30 + (HW3.h + HW3.h1) * 4);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(HW3.lx, HW3.ly + (HW3.h + HW3.h1) * 4 + HW3.h, 180, HW3.h1);
        g.setColor(Color.black);
        g.setFont(fontP);
        g.drawString("Layer Interface", HW3.lx + 10, HW3.ly + 30 + (HW3.h + HW3.h1) * 4 + HW3.h1);

        g.setColor(Color.GREEN);
        g.fillRect(HW3.lx, HW3.ly + (HW3.h + HW3.h1) * 5, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("2: Data Link", HW3.lx + 10, HW3.ly + 30 + (HW3.h + HW3.h1) * 5);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(HW3.lx, HW3.ly + (HW3.h + HW3.h1) * 5 + HW3.h, 180, HW3.h1);
        g.setColor(Color.black);
        g.setFont(fontP);
        g.drawString("Layer Interface", HW3.lx + 10, HW3.ly + 30 + (HW3.h + HW3.h1) * 5 + HW3.h1);

        g.setColor(Color.GREEN);
        g.fillRect(HW3.lx, HW3.ly + (HW3.h + HW3.h1) * 6, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("1: Physical", HW3.lx + 10, HW3.ly + 30 + (HW3.h + HW3.h1) * 6);

        //draw right seven layers
        g.setColor(Color.GREEN);
        g.fillRect(HW3.rx, HW3.ry, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("7: Application", HW3.rx + 10, HW3.ry + 30);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(HW3.rx, HW3.ry + HW3.h, 180, HW3.h1);
        g.setColor(Color.black);
        g.setFont(fontP);
        g.drawString("Layer Interface", HW3.rx + 10, HW3.ry + 30 + HW3.h1);

        g.setColor(Color.GREEN);
        g.fillRect(HW3.rx, HW3.ry + HW3.h + HW3.h1, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("6: Presentation", HW3.rx + 10, HW3.ry + 30 + HW3.h + HW3.h1);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(HW3.rx, HW3.ry + HW3.h * 2 + HW3.h1, 180, HW3.h1);
        g.setColor(Color.black);
        g.setFont(fontP);
        g.drawString("Layer Interface", HW3.rx + 10, HW3.ry + 30 + HW3.h + HW3.h1 * 2);

        g.setColor(Color.GREEN);
        g.fillRect(HW3.rx, HW3.ry + (HW3.h + HW3.h1) * 2, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("5: Session", HW3.rx + 10, HW3.ry + 30 + (HW3.h + HW3.h1) * 2);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(HW3.rx, HW3.ry + (HW3.h + HW3.h1) * 2 + HW3.h, 180, HW3.h1);
        g.setColor(Color.black);
        g.setFont(fontP);
        g.drawString("Layer Interface", HW3.rx + 10, HW3.ry + 30 + (HW3.h + HW3.h1) * 2 + HW3.h1);

        g.setColor(Color.GREEN);
        g.fillRect(HW3.rx, HW3.ry + (HW3.h + HW3.h1) * 3, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("4: Transport", HW3.rx + 10, HW3.ry + 30 + (HW3.h + HW3.h1) * 3);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(HW3.rx, HW3.ry + (HW3.h + HW3.h1) * 3 + HW3.h, 180, HW3.h1);
        g.setColor(Color.black);
        g.setFont(fontP);
        g.drawString("Layer Interface", HW3.rx + 10, HW3.ry + 30 + (HW3.h + HW3.h1) * 3 + HW3.h1);

        g.setColor(Color.GREEN);
        g.fillRect(HW3.rx, HW3.ry + (HW3.h + HW3.h1) * 4, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("3: Network", HW3.rx + 10, HW3.ry + 30 + (HW3.h + HW3.h1) * 4);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(HW3.rx, HW3.ry + (HW3.h + HW3.h1) * 4 + HW3.h, 180, HW3.h1);
        g.setColor(Color.black);
        g.setFont(fontP);
        g.drawString("Layer Interface", HW3.rx + 10, HW3.ry + 30 + (HW3.h + HW3.h1) * 4 + HW3.h1);

        g.setColor(Color.GREEN);
        g.fillRect(HW3.rx, HW3.ry + (HW3.h + HW3.h1) * 5, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("2: Data Link", HW3.rx + 10, HW3.ry + 30 + (HW3.h + HW3.h1) * 5);

        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(HW3.rx, HW3.ry + (HW3.h + HW3.h1) * 5 + HW3.h, 180, HW3.h1);
        g.setColor(Color.black);
        g.setFont(fontP);
        g.drawString("Layer Interface", HW3.rx + 10, HW3.ry + 30 + (HW3.h + HW3.h1) * 5 + HW3.h1);

        g.setColor(Color.GREEN);
        g.fillRect(HW3.rx, HW3.ry + (HW3.h + HW3.h1) * 6, 180, HW3.h);
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("1: Physical", HW3.rx + 10, HW3.ry + 30 + (HW3.h + HW3.h1) * 6);

        //import computer images
        BufferedImage computer = null;
        try {
            computer = ImageIO.read(new File("computer.jpg"));
        } catch (IOException e) {
        }
        g.drawImage(computer, HW3.lx + 30, HW3.ry + (HW3.h + HW3.h1) * 6 + 100, 110, 80, rootPane); //left computer
        g.drawImage(computer, HW3.rx + 90, HW3.ry + (HW3.h + HW3.h1) * 6 + 100, 110, 80, rootPane); //right computer

        //draw router images
        BufferedImage router = null;
        try {
            router = ImageIO.read(new File("router.jpg"));
        } catch (IOException e) {
        }

        g.drawImage(router, 275, 515, 100, 60, rootPane);  //left router 
        g.setColor(Color.black);
        g.setFont(fontB);
        g.drawString("R1", 280, 515);

        g.drawImage(router, 380, 420, 100, 60, rootPane);
        g.drawString("R2", 400, 420);

        g.drawImage(router, 780, 420, 100, 60, rootPane);
        g.drawString("R3", 800, 420);

        g.drawImage(router, 475, 515, 100, 60, rootPane);
        g.drawString("R5", 500, 515);

        g.drawImage(router, 675, 515, 100, 60, rootPane);
        g.drawString("R6", 700, 515);

        g.drawImage(router, 380, 620, 100, 60, rootPane);
        g.drawString("R7", 440, 680);

        g.drawImage(router, 780, 620, 100, 60, rootPane);
        g.drawString("R8", 840, 680);

        g.drawImage(router, 875, 515, 100, 60, rootPane);  //right router 
        g.drawString("R4", 900, 515);

        g.drawLine(HW3.lx + 80, HW3.ry + (HW3.h + HW3.h1) * 6 + 35, HW3.lx + 80, 540);
        //g.drawLine(lx + 100, ly + (h + h1) * 6 + 145, lx + 930, ly + (h + h1) * 6 + 145);
        g.drawLine(HW3.lx + 80, 540, 320, 540);//left computer to R1

        g.drawLine(320, 540, 420, 440);//R1 to R2
        //g.drawRect(lx + 270, ry + (h + h1) * 6 + 60, 25, 25);
        //g.drawString("1", lx + 280, ry + (h + h1) * 6 + 80);

        g.drawLine(420, 440, 820, 440);//R2 to R3
        //g.drawRect(lx + 500, ry + (h + h1) * 6 - 18, 25, 25);
        //g.drawString("5", lx + 510, ry + (h + h1) * 6);

        g.drawLine(820, 440, 920, 540);//R3 to R4
        //g.drawRect(lx + 790, ry + (h + h1) * 6 + 60, 25, 25);
        //g.drawString("10", lx + 790, ry + (h + h1) * 6 + 78);

        g.drawLine(320, 540, 420, 640);//R1 to R7
        //g.drawRect(lx + 270, ry + (h + h1) * 6 + 200, 25, 25);
        //g.drawString("2", lx + 280, ry + (h + h1) * 6 + 220);

        g.drawLine(420, 640, 820, 640);//R7 to R8
        //g.drawRect(lx + 500, ry + (h + h1) * 6 + 247, 25, 25);
        //g.drawString("7", lx + 510, ry + (h + h1) * 6 + 265);

        g.drawLine(820, 640, 920, 540);//R8 to R4
        //g.drawRect(lx + 800, ry + (h + h1) * 6 + 200, 25, 25);
        //g.drawString("11", lx + 800, ry + (h + h1) * 6 + 220);

        g.drawLine(420, 440, 520, 540);//R2 to R5
        //g.drawRect(lx + 400, ry + (h + h1) * 6 + 60, 25, 25);
        //g.drawString("3", lx + 410, ry + (h + h1) * 6 + 80);

        g.drawLine(520, 540, 420, 640);//R5 to R7
        //g.drawRect(lx + 400, ry + (h + h1) * 6 + 200, 25, 25);
        //g.drawString("4", lx + 410, ry + (h + h1) * 6 + 220);

        g.drawLine(520, 540, 720, 540);//R5 to R6
        //g.drawRect(lx + 520, ry + (h + h1) * 6 + 120, 25, 25);
        //g.drawString("6", lx + 530, ry + (h + h1) * 6 + 140);

        g.drawLine(720, 540, 820, 640);//R6 to R8
        //g.drawRect(lx + 695, ry + (h + h1) * 6 + 190, 25, 25);
        //g.drawString("9", lx + 700, ry + (h + h1) * 6 + 210);

        g.drawLine(720, 540, 820, 440);//R6 to R3
        //g.drawRect(lx + 695, ry + (h + h1) * 6 + 70, 25, 25);
        //g.drawString("8", lx + 700, ry + (h + h1) * 6 + 90);

        g.drawLine(920, 540, HW3.lx + 980, 540);//R4 to right computer
        g.drawLine(HW3.lx + 980, 540, HW3.lx + 980, HW3.ly + (HW3.h + HW3.h1) * 6 + 35);

            //line for middle
            /*g.drawLine(lx + 340, ly + (h + h1) * 6 + 145, lx + 340, my + (h + h1) * 6 + 110);
         g.drawLine(lx + 350, my + (h + h1) * 6 + 110, lx + 540, my + (h + h1) * 6 + 110);
         g.drawLine(lx + 540, my + (h + h1) * 6 + 110, lx + 540, my + (h + h1) * 6 + 35);*/
        //draw red ball
        g.setColor(Color.red);
        g.fillOval(HW3.x1, HW3.y1, 25, 25);

        //draw blue ball
        g.setColor(Color.blue);
        g.fillOval(HW3.x2, HW3.y2, 25, 25);

        //draw nak ball
        g.setColor(Color.yellow);
        g.fillOval(HW3.x3, HW3.y3, 25, 25);
        //draw ack ball
        g.setColor(Color.cyan);
        g.fillOval(HW3.x4, HW3.y4, 25, 25);
        
        //draw nak ball
        g.setColor(Color.yellow);
        g.fillOval(HW3.x5, HW3.y5, 25, 25);
        //draw ack ball
        g.setColor(Color.cyan);
        g.fillOval(HW3.x6, HW3.y6, 25, 25);
    }

}
