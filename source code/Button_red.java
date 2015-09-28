package hw3;

/*This class is used for clicking the "start both ball" button, the two ball 
  starts at the same time*/

import java.awt.*;
import java.awt.event.*;

public class Button_red implements ActionListener {

    Dijkstra di = new Dijkstra();
    
     IP_header ip = new IP_header();
     
     TCP_header tcp = new TCP_header();
     
     Ethernet_frame eth_frame = new Ethernet_frame();
        

    public void actionPerformed(ActionEvent e) {
        
        
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) {
                //System.out.println(HW3.wr[0][0]);
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) {
                if (HW3.wr[i][j] != 0 && HW3.wr[i][j] != -1) {
                    HW3.wr[i][j] = (int) (Math.random() * (8 - 1) + 1);
                    HW3.wr[j][i] = HW3.wr[i][j];
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) {
                if (HW3.wb[i][j] != 0 && HW3.wb[i][j] != -1) {
                    HW3.wb[i][j] = (int) (Math.random() * (8 - 1) + 1);
                    HW3.wb[j][i] = HW3.wb[i][j];
                }
            }
        }

        HW3.path = di.dijkstra(HW3.wr);
        HW3.pathb = di.dijkstra(HW3.wb);

        Font font = new Font("Verdana", Font.BOLD, 12);

        HW3.jLabel_r1r2.setText(String.valueOf(HW3.wr[0][1])); //input weight for red ball
        HW3.jLabel_r1r2.setFont(font);
        HW3.jLabel_r1r2.setForeground(Color.RED);
        HW3.jLabel_r1r7.setText(String.valueOf(HW3.wr[0][6]));
        HW3.jLabel_r1r7.setFont(font);
        HW3.jLabel_r1r7.setForeground(Color.RED);
        HW3.jLabel_r2r5.setText(String.valueOf(HW3.wr[1][4]));
        HW3.jLabel_r2r5.setFont(font);
        HW3.jLabel_r2r5.setForeground(Color.RED);
        HW3.jLabel_r7r5.setText(String.valueOf(HW3.wr[6][4]));
        HW3.jLabel_r7r5.setFont(font);
        HW3.jLabel_r7r5.setForeground(Color.RED);
        HW3.jLabel_r2r3.setText(String.valueOf(HW3.wr[1][2]));
        HW3.jLabel_r2r3.setFont(font);
        HW3.jLabel_r2r3.setForeground(Color.RED);
        HW3.jLabel_r5r6.setText(String.valueOf(HW3.wr[4][5]));
        HW3.jLabel_r5r6.setFont(font);
        HW3.jLabel_r5r6.setForeground(Color.RED);
        HW3.jLabel_r7r8.setText(String.valueOf(HW3.wr[6][7]));
        HW3.jLabel_r7r8.setFont(font);
        HW3.jLabel_r7r8.setForeground(Color.RED);
        HW3.jLabel_r6r3.setText(String.valueOf(HW3.wr[5][2]));
        HW3.jLabel_r6r3.setFont(font);
        HW3.jLabel_r6r3.setForeground(Color.RED);
        HW3.jLabel_r6r8.setText(String.valueOf(HW3.wr[5][7]));
        HW3.jLabel_r6r8.setFont(font);
        HW3.jLabel_r6r8.setForeground(Color.RED);
        HW3.jLabel_r3r4.setText(String.valueOf(HW3.wr[2][3]));
        HW3.jLabel_r3r4.setFont(font);
        HW3.jLabel_r3r4.setForeground(Color.RED);
        HW3.jLabel_r8r4.setText(String.valueOf(HW3.wr[7][3]));
        HW3.jLabel_r8r4.setFont(font);
        HW3.jLabel_r8r4.setForeground(Color.RED);

        HW3.jLabel_r1r2b.setText(String.valueOf(HW3.wb[0][1])); //input weight for blue ball
        HW3.jLabel_r1r2b.setFont(font);
        HW3.jLabel_r1r2b.setForeground(Color.BLUE);
        HW3.jLabel_r1r7b.setText(String.valueOf(HW3.wb[0][6]));
        HW3.jLabel_r1r7b.setFont(font);
        HW3.jLabel_r1r7b.setForeground(Color.BLUE);
        HW3.jLabel_r2r5b.setText(String.valueOf(HW3.wb[1][4]));
        HW3.jLabel_r2r5b.setFont(font);
        HW3.jLabel_r2r5b.setForeground(Color.BLUE);
        HW3.jLabel_r7r5b.setText(String.valueOf(HW3.wb[6][4]));
        HW3.jLabel_r7r5b.setFont(font);
        HW3.jLabel_r7r5b.setForeground(Color.BLUE);
        HW3.jLabel_r2r3b.setText(String.valueOf(HW3.wb[1][2]));
        HW3.jLabel_r2r3b.setFont(font);
        HW3.jLabel_r2r3b.setForeground(Color.BLUE);
        HW3.jLabel_r5r6b.setText(String.valueOf(HW3.wb[4][5]));
        HW3.jLabel_r5r6b.setFont(font);
        HW3.jLabel_r5r6b.setForeground(Color.BLUE);
        HW3.jLabel_r7r8b.setText(String.valueOf(HW3.wb[6][7]));
        HW3.jLabel_r7r8b.setFont(font);
        HW3.jLabel_r7r8b.setForeground(Color.BLUE);
        HW3.jLabel_r6r3b.setText(String.valueOf(HW3.wb[5][2]));
        HW3.jLabel_r6r3b.setFont(font);
        HW3.jLabel_r6r3b.setForeground(Color.BLUE);
        HW3.jLabel_r6r8b.setText(String.valueOf(HW3.wb[5][7]));
        HW3.jLabel_r6r8b.setFont(font);
        HW3.jLabel_r6r8b.setForeground(Color.BLUE);
        HW3.jLabel_r3r4b.setText(String.valueOf(HW3.wb[2][3]));
        HW3.jLabel_r3r4b.setFont(font);
        HW3.jLabel_r3r4b.setForeground(Color.BLUE);
        HW3.jLabel_r8r4b.setText(String.valueOf(HW3.wb[7][3]));
        HW3.jLabel_r8r4b.setFont(font);
        HW3.jLabel_r8r4b.setForeground(Color.BLUE);

        HW3.inputstring = HW3.inputField.getText();
        HW3.strdata = "";
        char[] a = HW3.inputstring.toCharArray();
        for (int i = 0; i < a.length; i++) {
            HW3.strdata = HW3.strdata + Integer.toBinaryString(a[i]) + "";
        }
        HW3.ss = HW3.strdata;
        HW3.f = 1;
        
        HW3.inputstring2 = HW3.inputField.getText();
         HW3.strdata2 = "";
         char[] b = HW3.inputstring2.toCharArray();
         for (int i = 0; i < b.length; i++) {
         HW3.strdata2 = HW3.strdata2 + Integer.toBinaryString(b[i]) + "";
         }
         HW3.ss2 = HW3.strdata2;
        
        HW3.redButton.setEnabled(false);

        HW3.x1 = 60;  //red ball
        HW3.y1 = 100;
        HW3.x2 = 60;    //blue ball
        HW3.y2 = 100;
        
        HW3.t1.resume();
        HW3.t2.resume();

        HW3.t1.start();
        HW3.t2.start();
                
        ip.TotalLength = ip.TotalLength + 8 * HW3.inputstring.length();
        ip.IP_headeree();
        
        tcp.TCP_headeree();
        
        eth_frame.Ethernet_headeree();
        
    }
}
