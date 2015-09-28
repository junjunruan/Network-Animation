package hw3;
/* This is the main class containing several threads*/

import java.awt.*;
import javax.swing.*;

public class HW3 extends JFrame {

    int WindowHight = 1280;
    int WindowWidth = 780;
    long StartTime;
    public static Thread t1;
    public static Thread t2;
    public static Thread t3;
    public static Thread t4;
    public static Thread t5;
    public static Thread t6;

    static boolean flag = true;
    static boolean flagb = true;
    static String inputstring;  //red ball
    static String inputstring2;  //blue ball 
    static JButton redButton;
    static JButton blueButton;
    static JLabel noteLabel;
    static JLabel noteLabel2;
    static JLabel noteLabel3;
    //JButton restartButton;
    static JTextField inputField;
    static JTextField dataField;
    static JLabel messageLabel;
    static JLabel dividendLabel;
    static JLabel detectionLabel;
    static JTextField augmenterField;
    static JButton CRCButton;
    static JLabel divisorLabel;
    static JLabel layerLabel;

    static int x1 = 60;  //red ball
    static int y1 = 100;
    static int x2 = 60;    //blue ball
    static int y2 = 100;
    static int lx = 100;   //the leftmost point of left seven layers
    static int ly = 100;
    static int rx = lx + 840;  //the leftmost point of right seven layers
    static int ry = ly;
    static int mx = lx + 420;  //the leftmost point of middle seven layers
    static int my = ly - 120;
    static int h = 35;       //height of each layer
    static int h1 = 18;      //height of interface layer
    static int x3 = 2000;    //yellow ball stands for NAK
    static int y3 = 652;
    static int x4 = 2000;    //green ball stands for ACK
    static int y4 = 652;
    static int x5 = 2000;    //yellow ball stands for NAK
    static int y5 = 400;
    static int x6 = 2000;    //green ball stands for ACK
    static int y6 = 400;
    static int f = 1;
    static int fb = 1;
    static int flagLineRed = 0;
    static int flagLineBlue = 0;

    static int data[];
    static long div[];
    static long divisor[] = {1, 0, 1, 1, 1, 0, 0, 1, 0};
    static long rem[];
    static long crc[];
    static String strdiv;
    static String strdata = "";
    static String strdata2 = "";
    static String ss = "";
    static String ss2 = "";

    static int path[];
    static int pathb[];
    static int w[][];

    static JTextField jLabel_r1r2; //weight for red ball
    static JTextField jLabel_r1r7;
    static JTextField jLabel_r2r5;
    static JTextField jLabel_r7r5;
    static JTextField jLabel_r2r3;
    static JTextField jLabel_r5r6;
    static JTextField jLabel_r7r8;
    static JTextField jLabel_r6r3;
    static JTextField jLabel_r6r8;
    static JTextField jLabel_r3r4;
    static JTextField jLabel_r8r4;

    static JTextField jLabel_r1r2b; //weight for blue ball
    static JTextField jLabel_r1r7b;
    static JTextField jLabel_r2r5b;
    static JTextField jLabel_r7r5b;
    static JTextField jLabel_r2r3b;
    static JTextField jLabel_r5r6b;
    static JTextField jLabel_r7r8b;
    static JTextField jLabel_r6r3b;
    static JTextField jLabel_r6r8b;
    static JTextField jLabel_r3r4b;
    static JTextField jLabel_r8r4b;

    static int wr[][] = {
        {0, 1, -1, -1, -1, -1, 2, -1},
        {1, 0, 5, -1, 3, -1, -1, -1},
        {-1, 5, 0, 10, -1, 8, -1, -1},
        {-1, -1, 10, 0, -1, -1, -1, 11},
        {-1, 3, -1, -1, 0, 6, 4, -1},
        {-1, -1, 8, -1, 6, 0, -1, 9},
        {2, -1, -1, -1, 4, -1, 0, 7},
        {-1, -1, -1, 11, -1, 9, 7, 0}
    };

    static int wb[][] = {
        {0, 1, -1, -1, -1, -1, 2, -1},
        {1, 0, 5, -1, 3, -1, -1, -1},
        {-1, 5, 0, 10, -1, 8, -1, -1},
        {-1, -1, 10, 0, -1, -1, -1, 11},
        {-1, 3, -1, -1, 0, 6, 4, -1},
        {-1, -1, 8, -1, 6, 0, -1, 9},
        {2, -1, -1, -1, 4, -1, 0, 7},
        {-1, -1, -1, 11, -1, 9, 7, 0}
    };

    HW3() {


        /*int w[][] = {
         {0, 1, -1, -1, -1, -1, 2, -1},
         {1, 0, 5, -1, 3, -1, -1, -1},
         {-1, 5, 0, 10, -1, 8, -1, -1},
         {-1, -1, 10, 0, -1, -1, -1, 11},
         {-1, 3, -1, -1, 0, 6, 4, -1},
         {-1, -1, 8, -1, 6, 0, -1, 9},
         {2, -1, -1, -1, 4, -1, 0, 7},
         {-1, -1, -1, 11, -1, 9, 7, 0}
         };*/
        jLabel_r1r2 = new JTextField(2);//red ball
        jLabel_r1r7 = new JTextField(2);
        jLabel_r2r5 = new JTextField(2);
        jLabel_r7r5 = new JTextField(2);
        jLabel_r2r3 = new JTextField(2);
        jLabel_r5r6 = new JTextField(2);
        jLabel_r7r8 = new JTextField(2);
        jLabel_r6r3 = new JTextField(2);
        jLabel_r6r8 = new JTextField(2);
        jLabel_r3r4 = new JTextField(2);
        jLabel_r8r4 = new JTextField(2);

        jLabel_r1r2b = new JTextField(2); //blue ball
        jLabel_r1r7b = new JTextField(2);
        jLabel_r2r5b = new JTextField(2);
        jLabel_r7r5b = new JTextField(2);
        jLabel_r2r3b = new JTextField(2);
        jLabel_r5r6b = new JTextField(2);
        jLabel_r7r8b = new JTextField(2);
        jLabel_r6r3b = new JTextField(2);
        jLabel_r6r8b = new JTextField(2);
        jLabel_r3r4b = new JTextField(2);
        jLabel_r8r4b = new JTextField(2);

        //final Dijkstra di = new Dijkstra();
        //this.getGraphicsConfiguration().getDevice().setFullScreenWindow(this);
        MainFrame drawpane = new MainFrame();

        inputField = new JTextField(20);
        noteLabel = new JLabel("   Note: Yellow Ball stands for NAK , Green Ball stands for ACK ! ");
        noteLabel2 = new JLabel("   Note: Between R7 and R8, error detection for red ball! ");
        noteLabel3 = new JLabel("   Note: Between R2 and R3, error detection for blue ball! ");
        redButton = new JButton("Start Both Ball");
        Button_red rd = new Button_red();
        redButton.addActionListener(rd);

        t1 = new Thread(new Runnable() {
            private Graphics g;

            public void run() {

                while (y1 >= 100) {

                    try {
                        if (x1 == 60 && y1 < 540) {
                            y1 = y1 + 4;
                            Thread.sleep(150);
                        }
                        if (y1 == 540 && x1 < 319) {
                            x1 = x1 + 4;
                            Thread.sleep(150);
                        }
                        if (919 < x1 && x1 < 1152 && y1 == 540) {
                            x1 = x1 + 4;
                            Thread.sleep(150);
                        }
                        if (x1 == 1152) {
                            y1 = y1 - 4;
                            Thread.sleep(150);
                        }
                        if (y1 == 100) {
                            redButton.setEnabled(true);
                            //x1 = 60;
                            //y1 = 100;
                            t1.suspend();
                        }

                        CRC crc = new CRC();
                        flag = crc.ifzero(ss, strdata);

                        for (int i = 0; i < path.length - 1; i++) {

                            int delay = wr[path[i]][path[i + 1]];

                            if (path[i] == 0 && path[i + 1] == 1 && 319 < x1 && x1 < 420 && y1 > 440) { //r1-r2(x1=420,y1=440)
                                x1 = x1 + 2;
                                y1 = y1 - 2;
                                //System.out.println("r1-r2" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 0 && path[i + 1] == 6 && 319 < x1 && x1 < 420 && y1 < 640) { //r1-r7(x1=420,y1=640)
                                x1 = x1 + 2;
                                y1 = y1 + 2;
                                //System.out.println("r1-r7" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 1 && path[i + 1] == 4 && 419 < x1 && x1 < 520 && 439 < y1 && y1 < 540) { //r2-r5(x1=520,y1=540)
                                x1 = x1 + 2;
                                y1 = y1 + 2;
                                //System.out.println("r2-r5" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 6 && path[i + 1] == 4 && 419 < x1 && x1 < 520 && 540 < y1 && y1 < 641) { //r7-r5(x1=520,y1=540)
                                x1 = x1 + 2;
                                y1 = y1 - 2;
                                //System.out.println("r7-r5" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 1 && path[i + 1] == 2 && 419 < x1 && x1 < 820 && y1 == 440) { //r2-r3(x1=820,y1=440)
                                x1 = x1 + 4;
                                //System.out.println("r2-r3" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 4 && path[i + 1] == 5 && 519 < x1 && x1 < 720 && y1 == 540) { //r5-r6(x1=720,y1=540)
                                x1 = x1 + 4;
                                //System.out.println("r5-6" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 6 && path[i + 1] == 7 && 419 < x1 && x1 < 820 && y1 == 640) { //r7-r8(x1=816,y1=640)       
                                x1 = x1 + 4;
                                if (x1 == 816 && y1 == 640 && flag == false) {
                                    //t3.join();
                                    x3 = 816;
                                    y1 = 1000;
                                    f = 1;
                                    t3.resume();
                                    t3.start();
                                }

                                if (x1 == 816 && y1 == 640 && f == 1 && flag == true) {
                                    //t4.join();
                                    x4 = 816;
                                    y1 = 1000;
                                    f = 0;
                                    t4.resume();
                                    t4.start();
                                }
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 5 && path[i + 1] == 2 && 719 < x1 && x1 < 820 && 440 < y1 && y1 < 541) { //r6-r3(x1=820,y1=440)
                                x1 = x1 + 2;
                                y1 = y1 - 2;
                                //System.out.println("r6-3" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 5 && path[i + 1] == 7 && 719 < x1 && x1 < 820 && 539 < y1 && y1 < 640) { //r6-r8()
                                x1 = x1 + 2;
                                y1 = y1 + 2;
                                //System.out.println("r6-8" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 2 && path[i + 1] == 3 && 819 < x1 && x1 < 920 && y1 < 540) { //r3-r4(x1=920,y1=540)
                                x1 = x1 + 2;
                                y1 = y1 + 2;
                                //System.out.println("r3-r4" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 7 && path[i + 1] == 3 && 819 < x1 && x1 < 920 && 540 < y1 && y1 < 641) { //r8-r4(x1=920,y1=540)
                                x1 = x1 + 2;
                                y1 = y1 - 2;
                                //System.out.println("r8-4" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            //reverse direction
                            if (path[i] == 4 && path[i + 1] == 1 && 420 < x1 && x1 < 521 && 440 < y1 && y1 < 541) { //r5-r2
                                x1 = x1 - 2;
                                y1 = y1 - 2;
                                //System.out.println("r5-2" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 4 && path[i + 1] == 6 && 420 < x1 && x1 < 521 && 539 < y1 && y1 < 640) { //r5-r7
                                x1 = x1 - 2;
                                y1 = y1 + 2;
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 2 && path[i + 1] == 1 && 420 < x1 && x1 < 821 && y1 == 440) { //r3-r2
                                x1 = x1 - 4;
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 5 && path[i + 1] == 4 && 520 < x1 && x1 < 721 && y1 == 540) { //r6-r5
                                x1 = x1 - 4;
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 7 && path[i + 1] == 6 && 520 < x1 && x1 < 821 && y1 == 640) { //r8-r7
                                x1 = x1 - 4;
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 2 && path[i + 1] == 5 && 719 < x1 && x1 < 820 && 440 < y1 && y1 < 541) { //r3-r6
                                x1 = x1 - 2;
                                y1 = y1 + 2;
                                Thread.sleep(delay * 10);
                            }
                            if (path[i] == 7 && path[i + 1] == 5 && 720 < x1 && x1 < 821 && 540 < y1 && y1 < 641) { //r8-r6
                                x1 = x1 - 2;
                                y1 = y1 - 2;
                                Thread.sleep(delay * 10);
                            }

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    repaint();
                }
            }
        });

        //blue ball
        t2 = new Thread(new Runnable() {
            private Graphics g;

            public void run() {

                while (y2 >= 100) {

                    try {
                        if (x2 == 60 && y2 < 540) {
                            y2 = y2 + 4;
                            //System.out.println("r0" + "x1=" + x1 + "y1=" + y1);
                            Thread.sleep(80);

                        }
                        if (y2 == 540 && x2 < 319) {
                            x2 = x2 + 4;
                            //System.out.println("r0" + "x1=" + x1 + "y1=" + y1);
                            Thread.sleep(80);
                        }
                        if (919 < x2 && x2 < 1152 && y2 == 540) {
                            x2 = x2 + 4;
                            //System.out.println("r4" + "x1=" + x1 + "y1=" + y1);
                            Thread.sleep(80);
                        }
                        if (x2 == 1152) {
                            y2 = y2 - 4;
                            //System.out.println("r4" + "x1=" + x1 + "y1=" + y1);
                            Thread.sleep(80);
                        }
                        if (y2 == 100) {
                            redButton.setEnabled(true);
                            //x2 = 60;
                            //y2 = 100;
                            t2.suspend();
                        }

                        CRC crc = new CRC();
                        flagb = crc.ifzero(ss2, strdata2);

                        for (int i = 0; i < pathb.length - 1; i++) {

                            int delay = wb[pathb[i]][pathb[i + 1]];

                            if (pathb[i] == 0 && pathb[i + 1] == 1 && 319 < x2 && x2 < 420 && y2 > 440) { //r1-r2(x1=420,y1=440)
                                x2 = x2 + 2;
                                y2 = y2 - 2;
                                //System.out.println("r1-r2" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 0 && pathb[i + 1] == 6 && 319 < x2 && x2 < 420 && y2 < 640) { //r1-r7(x1=420,y1=640)
                                x2 = x2 + 2;
                                y2 = y2 + 2;
                                //System.out.println("r1-r7" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 1 && pathb[i + 1] == 4 && 419 < x2 && x2 < 520 && 439 < y2 && y2 < 540) { //r2-r5(x1=520,y1=540)
                                x2 = x2 + 2;
                                y2 = y2 + 2;
                                //System.out.println("r2-r5" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 6 && pathb[i + 1] == 4 && 419 < x2 && x2 < 520 && 540 < y2 && y2 < 641) { //r7-r5(x1=520,y1=540)
                                x2 = x2 + 2;
                                y2 = y2 - 2;
                                //System.out.println("r7-r5" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 1 && pathb[i + 1] == 2 && 419 < x2 && x2 < 820 && y2 == 440) { //r2-r3(x1=820,y1=440)
                                x2 = x2 + 4;
                                /*if (x2 == 816 && y2 == 440 && flagb == false) {
                                 //t3.join();
                                 x5 = 816;
                                 y2 = 1000;
                                 fb = 1;
                                 t5.resume();
                                 t5.start();
                                 }

                                 if (x2 == 816 && y2 == 440 && f == 1 && flagb == true) {
                                 //t4.join();
                                 x6 = 816;
                                 y2 = 1000;
                                 fb = 0;
                                 t6.resume();
                                 t6.start();
                                 }*/
                                //System.out.println("r2-r3" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 4 && pathb[i + 1] == 5 && 519 < x2 && x2 < 720 && y2 == 540) { //r5-r6(x1=720,y1=540)
                                x2 = x2 + 4;
                                //System.out.println("r5-6" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 6 && pathb[i + 1] == 7 && 419 < x2 && x2 < 820 && y2 == 640) { //r7-r8(x1=810,y1=676)
                                x2 = x2 + 4;

                                //System.out.println("r7-8" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 5 && pathb[i + 1] == 2 && 719 < x2 && x2 < 820 && 440 < y2 && y2 < 541) { //r6-r3(x1=820,y1=440)
                                x2 = x2 + 2;
                                y2 = y2 - 2;
                                //System.out.println("r6-3" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 5 && pathb[i + 1] == 7 && 719 < x2 && x2 < 820 && 539 < y2 && y2 < 640) { //r6-r8()
                                x2 = x2 + 2;
                                y2 = y2 + 2;
                                //System.out.println("r6-8" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 2 && pathb[i + 1] == 3 && 819 < x2 && x2 < 920 && y2 < 540) { //r3-r4(x1=920,y1=540)
                                x2 = x2 + 2;
                                y2 = y2 + 2;
                                //System.out.println("r3-r4" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 7 && pathb[i + 1] == 3 && 819 < x2 && x2 < 920 && 540 < y2 && y2 < 641) { //r8-r4(x1=920,y1=540)
                                x2 = x2 + 2;
                                y2 = y2 - 2;
                                //System.out.println("r8-4" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            //reverse direction
                            if (pathb[i] == 4 && pathb[i + 1] == 1 && 420 < x2 && x2 < 521 && 440 < y2 && y2 < 541) { //r5-r2
                                x2 = x2 - 2;
                                y2 = y2 - 2;
                                //System.out.println("r5-2" + "x1=" + x1 + "y1=" + y1);
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 4 && pathb[i + 1] == 6 && 420 < x2 && x2 < 521 && 539 < y2 && y2 < 640) { //r5-r7
                                x2 = x2 - 2;
                                y2 = y2 + 2;
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 2 && pathb[i + 1] == 1 && 420 < x2 && x2 < 821 && y2 == 440) { //r3-r2
                                x2 = x2 - 4;
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 5 && pathb[i + 1] == 4 && 520 < x2 && x2 < 721 && y2 == 540) { //r6-r5
                                x2 = x2 - 4;
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 7 && pathb[i + 1] == 6 && 520 < x2 && x2 < 821 && y2 == 640) { //r8-r7
                                x2 = x2 - 4;
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 2 && pathb[i + 1] == 5 && 719 < x2 && x2 < 820 && 440 < y2 && y2 < 541) { //r3-r6
                                x2 = x2 - 2;
                                y2 = y2 + 2;
                                Thread.sleep(delay * 10);
                            }
                            if (pathb[i] == 7 && pathb[i + 1] == 5 && 720 < x2 && x2 < 821 && 540 < y2 && y2 < 641) { //r8-r6
                                x2 = x2 - 2;
                                y2 = y2 - 2;
                                Thread.sleep(delay * 10);
                            }

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    repaint();
                }
            }

        });

        //yellow ball, nak for red ball
        t3 = new Thread(new Runnable() {
            private Graphics g;

            public void run() {

                while (x3 >= 420 && x3 <= 816) {

                    x3 = x3 - 4;
                    if (x3 == 420) {
                        x3 = 2000;
                        dataField.setText(strdata);
                        ss = dataField.getText();
                        x1 = 420;
                        y1 = 640;
                        t3.suspend();
                        //i3++;
                    }
                    try {
                        Thread.sleep(30);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    repaint();
                }
            }
        });

        //green ball, ack for red ball
        t4 = new Thread(new Runnable() {
            private Graphics g;

            public void run() {

                while (x4 >= 420 && x4 <= 816) {

                    x4 = x4 - 4;
                    if (x4 == 420) {
                        x4 = 2000;
                        x1 = 820;
                        y1 = 640;
                        t4.suspend();
                        //i4++;
                    }
                    try {
                        Thread.sleep(30);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    repaint();
                }
            }
        });

        /*yellow ball, nak for blue ball
         t5 = new Thread(new Runnable() {
         private Graphics g;

         public void run() {

         while (x5 >= 420 && x5 <= 816) {

         x5 = x5 - 4;
         if (x5 == 420) {
         x5 = 2000;
         dataField.setText(strdata2);
         ss2 = dataField.getText();
         x2 = 420;
         y2 = 440;
         t5.suspend();
         //i5++;
         }
         try {
         Thread.sleep(50);
         } catch (Exception e) {
         e.printStackTrace();
         }
         repaint();
         }
         }
         });

         //green ball, ack for blue ball
         t6 = new Thread(new Runnable() {
         private Graphics g;

         public void run() {

         while (x6 >= 420 && x6 <= 816) {

         x6 = x6 - 4;
         if (x6 == 420) {
         x6 = 2000;
         x2 = 820;
         y2 = 440;
         t6.suspend();
         //i4++;
         }
         try {
         Thread.sleep(50);
         } catch (Exception e) {
         e.printStackTrace();
         }
         repaint();
         }
         }
         });*/
        this.addMouseListener(new Mouse_Click());

        drawpane.add(inputField);
        drawpane.add(redButton);
        //drawpane.add(blueButton);
        drawpane.add(jLabel_r1r2);
        drawpane.add(jLabel_r1r7);
        drawpane.add(jLabel_r2r5);
        drawpane.add(jLabel_r7r5);
        drawpane.add(jLabel_r2r3);
        drawpane.add(jLabel_r5r6);
        drawpane.add(jLabel_r7r8);
        drawpane.add(jLabel_r6r3);
        drawpane.add(jLabel_r6r8);
        drawpane.add(jLabel_r3r4);
        drawpane.add(jLabel_r8r4);

        drawpane.add(jLabel_r1r2b);
        drawpane.add(jLabel_r1r7b);
        drawpane.add(jLabel_r2r5b);
        drawpane.add(jLabel_r7r5b);
        drawpane.add(jLabel_r2r3b);
        drawpane.add(jLabel_r5r6b);
        drawpane.add(jLabel_r7r8b);
        drawpane.add(jLabel_r6r3b);
        drawpane.add(jLabel_r6r8b);
        drawpane.add(jLabel_r3r4b);
        drawpane.add(jLabel_r8r4b);

        drawpane.add(noteLabel);
        drawpane.add(noteLabel2);
        //drawpane.add(noteLabel3);
        //drawpane.add(restartButton);
        this.add(drawpane);
        this.setSize(WindowHight, WindowWidth);
        this.setTitle("Layers");
        this.setVisible(true);
        //this.setBackground(Color.white);
        drawpane.setBackground(Color.white);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        new HW3();

    }
}
