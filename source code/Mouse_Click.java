package hw3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mouse_Click implements MouseListener {

    private Component rootPane;
    static JTextArea jtext = new JTextArea();

    @Override
    public void mouseClicked(MouseEvent e) {

        {
            //Application Layer(red ball)
            if (HW3.y1 > HW3.ly && HW3.y1 < HW3.ly + HW3.h - 15) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 150 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 150) {

                    HW3.t1.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is Application Layer. The message is : " + HW3.inputstring, "Application Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t1.resume();
                }
            }

            //interface between Application Layer and Presentation Layer(red ball)
            if (HW3.y1 > HW3.ly + HW3.h && HW3.y1 < HW3.ly + HW3.h + HW3.h1 - 15) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 50 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 50) {
                    HW3.t1.suspend();
                    Frame f = new Frame();
                    f.setVisible(true);
                    //JOptionPane.showMessageDialog(rootPane, "This is the Interface Layer between Application Layer and Presentation Layer", "Interface Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t1.resume();
                }
            }

            //Presentation(red ball)
            if (HW3.y1 > HW3.ly + HW3.h + HW3.h1 && HW3.y1 < HW3.ly + HW3.h * 2 + HW3.h1 - 15) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 50 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 50) {
                    HW3.t1.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is Presentation Layer. The message is : " + HW3.inputstring, "Presentation Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t1.resume();
                }
            }

            //interface between Presentation Layer and Session Layer(red ball)
            if (HW3.y1 > HW3.ly + HW3.h * 2 + HW3.h1 && HW3.y1 < HW3.ly + (HW3.h + HW3.h1) * 2 - 15) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 50 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 50) {
                    HW3.t1.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is the Interface Layer between Presentation Layer and Session Layer", "Interface Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t1.resume();
                }
            }

            //Session(red ball)
            if (HW3.y1 > HW3.ly + (HW3.h + HW3.h1) * 2 && HW3.y1 < HW3.ly + (HW3.h + HW3.h1) * 2 + HW3.h - 15) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 50 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 50) {
                    HW3.t1.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is Session Layer. The message is : " + HW3.inputstring, "Session Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t1.resume();
                }
            }

            //interface between Session Layer and Transport Layer(red ball)
            if (HW3.x1 == 60 && HW3.y1 > HW3.ly + (HW3.h + HW3.h1) * 2 + HW3.h && HW3.y1 < HW3.ly + (HW3.h + HW3.h1) * 3 - 15) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 50 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 50) {
                    HW3.t1.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is the Interface Layer between Session Layer and Transport Layer", "Interface Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t1.resume();
                }
            }

            //Transport(red ball)
            if (HW3.y1 > HW3.ly + (HW3.h + HW3.h1) * 3 && HW3.y1 < HW3.ly + (HW3.h + HW3.h1) * 3 + HW3.h - 15) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 50 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 50) {
                    HW3.t1.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is Transport Layer. The message is : " + HW3.inputstring, "Transport Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t1.resume();
                }
            }

            //interface between Transport Layer and Network Layer(red ball)
            if (HW3.y1 > HW3.ly + (HW3.h + HW3.h1) * 3 + HW3.h && HW3.y1 < HW3.ly + (HW3.h + HW3.h1) * 4 - 15) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 50 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 50) {
                    HW3.t1.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is the Interface Layer between Transport Layer and Network Layer", "Interface Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t1.resume();
                }
            }

            //Network(red ball)
            if (HW3.y1 > HW3.ly + (HW3.h + HW3.h1) * 4 && HW3.y1 < HW3.ly + (HW3.h + HW3.h1) * 4 + HW3.h - 15) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 50 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 50) {
                    HW3.t1.suspend();
                    final JFrame j = new JFrame();
                    JPanel jp = new JPanel();
                    char[] a = HW3.inputstring.toCharArray();
                    for (int i = 0; i < a.length; i++) {
                        HW3.strdata = HW3.strdata + Integer.toBinaryString(a[i]) + "";
                    }

                    HW3.messageLabel = new JLabel("");
                    HW3.layerLabel = new JLabel("This is Network Layer !");
                    HW3.messageLabel.setText("The message is : ");
                    jtext.setText(IP_header.IP_bin + TCP_header.TCP_bin + HW3.strdata);
                    jtext.setPreferredSize(new Dimension(200, 300));
                    jtext.setLineWrap(true);
                    jtext.setEditable(false);

                    j.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                            j.dispose();
                            HW3.t1.resume();
                        }
                    });

                    jp.add(HW3.layerLabel);
                    jp.add(HW3.messageLabel);
                    jp.add(jtext);
                    j.add(jp);
                    j.setSize(300, 400);
                    j.setLocation(400, 200);
                    j.setTitle("Network Layer");
                    jp.setBackground(Color.WHITE);
                    j.setVisible(true);

                }
            }

            //interface between Network Layer and Data-Link Layer(red ball)
            if (HW3.y1 > HW3.ly + (HW3.h + HW3.h1) * 4 + HW3.h && HW3.y1 < HW3.ly + (HW3.h + HW3.h1) * 5 - 15) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 50 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 50) {
                    HW3.t1.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is the Interface Layer between Network Layer and Data-Link Layer", "Interface Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t1.resume();
                }
            }

            //Data-Link(red ball)
            if (HW3.y1 > HW3.ly + (HW3.h + HW3.h1) * 5 && HW3.y1 < HW3.ly + (HW3.h + HW3.h1) * 5 + HW3.h - 15) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 50 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 50) {

                    HW3.flagLineRed = 1;
                    HW3.t1.suspend();

                    final JFrame j = new JFrame();
                    HW3.messageLabel = new JLabel("");
                    jtext.setText(Ethernet_frame.Frame_bin);
                    jtext.setPreferredSize(new Dimension(500, 200));
                    jtext.setLineWrap(true);
                    jtext.setEditable(false);

                    HW3.layerLabel = new JLabel("This is Data-Link Layer !");
                    HW3.messageLabel.setText("The message is : ");

                    DataLink dataLink = new DataLink();
                    JScrollPane js = new JScrollPane();
                    js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                    js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                    js.setViewportView(dataLink);
                    dataLink.setPreferredSize(new Dimension(3500, 1500));
                    dataLink.revalidate();

                    j.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                            j.dispose();
                            HW3.t1.resume();
                        }
                    });

                    dataLink.add(HW3.layerLabel);
                    dataLink.add(HW3.messageLabel);
                    dataLink.add(jtext);
                    j.add(js);
                    j.setSize(800, 740);
                    j.setTitle("Data-Link Layer");
                    dataLink.setBackground(Color.WHITE);
                    j.setVisible(true);

                }
            }

            //Physical Layer(red ball)
            if ((HW3.y1 > HW3.ly + (HW3.h + HW3.h1) * 6 && HW3.x1 < HW3.lx + 220) || (HW3.y1 > HW3.ly + (HW3.h + HW3.h1) * 6 && HW3.x1 > HW3.lx + 820)) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 60 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 60) {

                    //HW3.flagLineRed = 1;
                    HW3.t1.suspend();
                    //HW3.strdata = "";

                    final JFrame j = new JFrame();
                    HW3.messageLabel = new JLabel("");
                    HW3.layerLabel = new JLabel("This is Physical Layer !");

                    HW3.dividendLabel = new JLabel("Dividend (Appending eight 0s after dataword) :");
                    HW3.detectionLabel = new JLabel("");
                    HW3.augmenterField = new JTextField(10);
                    HW3.augmenterField.setEditable(false);
                    HW3.dataField = new JTextField(20);
                    HW3.divisorLabel = new JLabel("The divisor is : 100110010");
                    HW3.CRCButton = new JButton("CRC Error Detection");

                    HW3.augmenterField.setText("00000000");
                    HW3.messageLabel.setText("The message is : " + Ethernet_frame.Frame_bin);
                    HW3.dataField.setText(HW3.ss);

                    Drawsine_red drawSine = new Drawsine_red();

                    JScrollPane js = new JScrollPane();
                    js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                    js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                    js.setViewportView(drawSine);
                    drawSine.setPreferredSize(new Dimension(1500, 1500));
                    drawSine.revalidate();
                    j.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                            j.dispose();
                            //HW3.flagLineRed = 0;
                            HW3.t1.resume();
                        }
                    });

                    drawSine.add(HW3.messageLabel);
                    drawSine.add(HW3.layerLabel);
                    //drawSine.add(dividendLabel);
                    //drawSine.add(dataField);
                    //drawSine.add(augmenterField);
                    //drawSine.add(CRCButton);
                    //drawSine.add(detectionLabel);
                    //drawSine.add(divisorLabel);

                    j.add(js);
                    j.setSize(1000, 740);
                    //j.setTitle("");
                    //j.setBackground(Color.white);
                    drawSine.setBackground(Color.white);
                    j.setVisible(true);

                }
            }

            //CRC between R7 router and R8 router(red ball)
            //if (HW3.y1 == 640 && HW3.x1 > 420 && HW3.x1 < 820) {
            if (HW3.y1 >= 440 && HW3.y1 <= 640 && HW3.x1 > 320 && HW3.x1 < 920) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x1 + 60 && e.getY() >= HW3.y1 && e.getY() <= HW3.y1 + 60) {

                    HW3.t1.suspend();
                    HW3.strdata = "";
                    //inputstring = inputField.getText();

                    final JFrame j = new JFrame();
                    HW3.layerLabel = new JLabel("");
                    HW3.messageLabel = new JLabel("");
                    //HW3.dividendLabel = new JLabel("Dividend (Appending eight 0s after dataword) :");
                    HW3.dividendLabel = new JLabel("Revise the original data: ");
                    HW3.detectionLabel = new JLabel("");
                    HW3.augmenterField = new JTextField(10);
                    HW3.augmenterField.setEditable(false);
                    HW3.dataField = new JTextField(20);
                    //HW3.divisorLabel = new JLabel("The divisor is : 100110010");
                    HW3.divisorLabel = new JLabel("The original data is : " + HW3.strdata);
                    HW3.CRCButton = new JButton("CRC Error Detection");

                    HW3.CRCButton.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            //String ss = "1001110";
                            HW3.ss = HW3.dataField.getText();
                            CRC crc = new CRC();
                            if (crc.ifzero(HW3.ss, HW3.strdata) == true) {
                                //System.out.println("no error");
                                HW3.detectionLabel.setText("There is no error");
                            } else {
                                //System.out.println("error");
                                HW3.detectionLabel.setText("Warning: There is an error!");
                            }
                        }
                    });

                    char[] a = HW3.inputstring.toCharArray();
                    //String result = "";
                    for (int i = 0; i < a.length; i++) {
                        HW3.strdata = HW3.strdata + Integer.toBinaryString(a[i]) + "";
                    }
                    HW3.augmenterField.setText(HW3.strdata);
                    HW3.messageLabel.setText("The correct message is : " + Ethernet_frame.Frame_bin);
                    HW3.dataField.setText(HW3.ss);

                    Drawsine_red drawSine = new Drawsine_red();

                    JScrollPane js = new JScrollPane();

                    js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                    js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                    //js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                    //js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
                    js.setViewportView(drawSine);
                    drawSine.setPreferredSize(new Dimension(1500, 1500));
                    drawSine.revalidate();
                    j.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                            j.dispose();
                            HW3.t1.resume();
                        }
                    });

                    drawSine.add(HW3.messageLabel);
                    //drawSine.add(layerLabel);
                    drawSine.add(HW3.dividendLabel);
                    drawSine.add(HW3.dataField);
                    drawSine.add(HW3.augmenterField);
                    drawSine.add(HW3.CRCButton);
                    drawSine.add(HW3.detectionLabel);
                    drawSine.add(HW3.divisorLabel);

                    j.add(js);
                    j.setSize(1000, 740);
                    j.setTitle("CRC and ARQ between two routers");
                    //j.setBackground(Color.white);
                    drawSine.setBackground(Color.white);
                    j.setVisible(true);

                }
            }

            //Application Layer(blue ball)
            if ((HW3.x2 == 60 && HW3.y2 > HW3.ly && HW3.y2 < HW3.ly + HW3.h - 15) || (HW3.x2 == 720 && HW3.y2 > HW3.my && HW3.y2 < HW3.my + HW3.h - 15)) {
                if (e.getX() >= HW3.x2 && e.getX() <= HW3.x2 + 50 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 50) {
                    HW3.t2.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is Application Layer. The message is : " + HW3.inputstring2, "Application Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t2.resume();
                }
            }

            //interface between Application Layer and Presentation Layer(blue ball)
            if ((HW3.x2 == 60 && HW3.y2 > HW3.ly + HW3.h && HW3.y2 < HW3.ly + HW3.h + HW3.h1 - 15) || (HW3.x2 == 720 && HW3.y2 > HW3.my + HW3.h && HW3.y2 < HW3.my + HW3.h + HW3.h1 - 15)) {
                if (e.getX() >= HW3.x2 && e.getX() <= HW3.x2 + 50 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 50) {
                    HW3.t2.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is the Interface Layer between Application Layer and Presentation Layer", "Interface Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t2.resume();
                }
            }

            //Presentation(blue ball)
            if ((HW3.x2 == 60 && HW3.y2 > HW3.ly + HW3.h + HW3.h1 && HW3.y2 < HW3.ly + HW3.h * 2 + HW3.h1 - 15) || (HW3.x2 == 720 && HW3.y2 > HW3.my + HW3.h + HW3.h1 && HW3.y2 < HW3.my + HW3.h * 2 + HW3.h1 - 15)) {
                if (e.getX() >= HW3.x2 && e.getX() <= HW3.x2 + 50 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 50) {
                    HW3.t2.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is Presentation Layer. The message is : " + HW3.inputstring2, "Presentation Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t2.resume();
                }
            }

            //interface between Presentation Layer and Session Layer(blue ball)
            if ((HW3.x2 == 60 && HW3.y2 > HW3.ly + HW3.h * 2 + HW3.h1 && HW3.y2 < HW3.ly + (HW3.h + HW3.h1) * 2 - 15) || (HW3.x2 == 720 && HW3.y2 > HW3.my + HW3.h * 2 + HW3.h1 && HW3.y2 < HW3.my + (HW3.h + HW3.h1) * 2 - 15)) {
                if (e.getX() >= HW3.x2 && e.getX() <= HW3.x2 + 50 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 50) {
                    HW3.t2.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is the Interface Layer between Presentation Layer and Session Layer", "Interface Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t2.resume();
                }
            }

            //Session(blue ball)
            if ((HW3.x2 == 60 && HW3.y2 > HW3.ly + (HW3.h + HW3.h1) * 2 && HW3.y2 < HW3.ly + (HW3.h + HW3.h1) * 2 + HW3.h - 15) || (HW3.x2 == 720 && HW3.y2 > HW3.my + (HW3.h + HW3.h1) * 2 && HW3.y2 < HW3.my + (HW3.h + HW3.h1) * 2 + HW3.h - 15)) {
                if (e.getX() >= HW3.x2 && e.getX() <= HW3.x2 + 50 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 50) {
                    HW3.t2.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is Session Layer. The message is : " + HW3.inputstring2, "Session Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t2.resume();
                }
            }

            //interface between Session Layer and Transport Layer(blue ball)
            if ((HW3.x2 == 60 && HW3.x2 == 60 && HW3.y2 > HW3.ly + (HW3.h + HW3.h1) * 2 + HW3.h && HW3.y2 < HW3.ly + (HW3.h + HW3.h1) * 3 - 15) || (HW3.x2 == 720 && HW3.x2 == 60 && HW3.y2 > HW3.my + (HW3.h + HW3.h1) * 2 + HW3.h && HW3.y2 < HW3.my + (HW3.h + HW3.h1) * 3 - 15)) {
                if (e.getX() >= HW3.x2 && e.getX() <= HW3.x2 + 50 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 50) {
                    HW3.t2.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is the Interface Layer between Session Layer and Transport Layer", "Interface Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t2.resume();
                }
            }

            //Transport(blue ball)
            if ((HW3.x2 == 60 && HW3.y2 > HW3.ly + (HW3.h + HW3.h1) * 3 && HW3.y2 < HW3.ly + (HW3.h + HW3.h1) * 3 + HW3.h - 15) || (HW3.x2 == 720 && HW3.y2 > HW3.my + (HW3.h + HW3.h1) * 3 && HW3.y2 < HW3.my + (HW3.h + HW3.h1) * 3 + HW3.h - 15)) {
                if (e.getX() >= HW3.x2 && e.getX() <= HW3.x2 + 50 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 50) {
                    HW3.t2.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is Transport Layer. The message is : " + HW3.inputstring2, "Transport Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t2.resume();
                }
            }

            //interface between Transport Layer and Network Layer(blue ball)
            if ((HW3.x2 == 60 && HW3.y2 > HW3.ly + (HW3.h + HW3.h1) * 3 + HW3.h && HW3.y2 < HW3.ly + (HW3.h + HW3.h1) * 4 - 15) || (HW3.x2 == 720 && HW3.y2 > HW3.my + (HW3.h + HW3.h1) * 3 + HW3.h && HW3.y2 < HW3.my + (HW3.h + HW3.h1) * 4 - 15)) {
                if (e.getX() >= HW3.x2 && e.getX() <= HW3.x2 + 50 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 50) {
                    HW3.t2.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is the Interface Layer between Transport Layer and Network Layer", "Interface Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t2.resume();
                }
            }

            //Network(blue ball)
            if ((HW3.x2 == 60 && HW3.y2 > HW3.ly + (HW3.h + HW3.h1) * 4 && HW3.y2 < HW3.ly + (HW3.h + HW3.h1) * 4 + HW3.h - 15) || (HW3.x2 == 720 && HW3.y2 > HW3.my + (HW3.h + HW3.h1) * 4 && HW3.y2 < HW3.my + (HW3.h + HW3.h1) * 4 + HW3.h - 15)) {
                if (e.getX() >= HW3.x2 && e.getX() <= HW3.x2 + 50 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 50) {
                    HW3.t2.suspend();
                    //JOptionPane.showMessageDialog(rootPane, "This is Network Layer. The message is : " + HW3.inputstring2, "Network Layer", JOptionPane.PLAIN_MESSAGE);
                    final JFrame j = new JFrame();
                    JPanel jp = new JPanel();

                    char[] a = HW3.inputstring.toCharArray();
                    for (int i = 0; i < a.length; i++) {
                        HW3.strdata = HW3.strdata + Integer.toBinaryString(a[i]) + "";
                    }

                    HW3.messageLabel = new JLabel("");
                    HW3.layerLabel = new JLabel("This is Network Layer !");
                    HW3.messageLabel.setText("The message is : ");
                    jtext.setText(IP_header.IP_bin + TCP_header.TCP_bin + HW3.strdata);
                    jtext.setPreferredSize(new Dimension(200, 300));
                    jtext.setLineWrap(true);
                    jtext.setEditable(false);

                    j.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                            j.dispose();
                            HW3.t2.resume();
                        }
                    });

                    jp.add(HW3.layerLabel);
                    jp.add(HW3.messageLabel);
                    jp.add(jtext);
                    j.add(jp);
                    j.setSize(300, 400);
                    j.setLocation(400, 200);
                    j.setTitle("Network Layer");
                    jp.setBackground(Color.WHITE);
                    j.setVisible(true);
                    j.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                            j.dispose();
                            HW3.t2.resume();
                        }
                    });

                    jp.add(HW3.layerLabel);
                    jp.add(HW3.messageLabel);
                    jp.add(jtext);
                    j.add(jp);
                    j.setSize(300, 400);
                    j.setLocation(400, 200);
                    j.setTitle("Network Layer");
                    jp.setBackground(Color.WHITE);
                    j.setVisible(true);

                }
            }

            //interface between Network Layer and Data-Link Layer(blue ball)
            if ((HW3.x2 == 60 && HW3.y2 > HW3.ly + (HW3.h + HW3.h1) * 4 + HW3.h && HW3.y2 < HW3.ly + (HW3.h + HW3.h1) * 5 - 15) || (HW3.x2 == 720 && HW3.y2 > HW3.my + (HW3.h + HW3.h1) * 4 + HW3.h && HW3.y2 < HW3.my + (HW3.h + HW3.h1) * 5 - 15)) {
                if (e.getX() >= HW3.x2 && e.getX() <= HW3.x2 + 50 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 50) {
                    HW3.t1.suspend();
                    JOptionPane.showMessageDialog(rootPane, "This is the Interface Layer between Network Layer and Data-Link Layer", "Interface Layer", JOptionPane.PLAIN_MESSAGE);
                    HW3.t1.resume();
                }
            }

            //Data-Link(blue ball)
            if ((HW3.x2 == 60 && HW3.y2 > HW3.ly + (HW3.h + HW3.h1) * 5 && HW3.y2 < HW3.ly + (HW3.h + HW3.h1) * 5 + HW3.h - 15) || (HW3.x2 == 720 && HW3.y2 > HW3.my + (HW3.h + HW3.h1) * 5 && HW3.y2 < HW3.my + (HW3.h + HW3.h1) * 5 + HW3.h - 15)) {
                if (e.getX() >= HW3.x1 && e.getX() <= HW3.x2 + 50 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 50) {

                    HW3.flagLineRed = 1;
                    HW3.t2.suspend();

                    final JFrame j = new JFrame();
                    HW3.messageLabel = new JLabel("");
                    jtext.setText(Ethernet_frame.Frame_bin);
                    jtext.setPreferredSize(new Dimension(500, 200));
                    jtext.setLineWrap(true);
                    jtext.setEditable(false);

                    HW3.layerLabel = new JLabel("This is Data-Link Layer !");
                    HW3.messageLabel.setText("The message is : ");

                    DataLink dataLink = new DataLink();

                    JScrollPane js = new JScrollPane();
                    js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                    js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                    js.setViewportView(dataLink);
                    dataLink.setPreferredSize(new Dimension(3500, 1500));
                    dataLink.revalidate();

                    j.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                            j.dispose();
                            HW3.t2.resume();
                        }
                    });

                    dataLink.add(HW3.layerLabel);
                    dataLink.add(HW3.messageLabel);
                    dataLink.add(jtext);
                    j.add(js);
                    j.setSize(800, 740);
                    j.setTitle("Data-Link Layer");
                    dataLink.setBackground(Color.WHITE);
                    j.setVisible(true);

                }
            }

            //Physical Layer(blue ball)
            if ((HW3.x2 == 60 && HW3.y2 > HW3.ly + (HW3.h + HW3.h1) * 6 && HW3.x2 < HW3.lx + 220) || (HW3.y2 > HW3.my + (HW3.h + HW3.h1) * 6 && HW3.x2 > HW3.lx + 820)) {
                if (e.getX() >= HW3.x2 && e.getX() <= HW3.x2 + 60 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 60) {
                    //HW3.flagLineRed = 1;
                    HW3.t2.suspend();
                    //HW3.strdata = "";

                    final JFrame j = new JFrame();
                    HW3.messageLabel = new JLabel("");
                    HW3.layerLabel = new JLabel("This is Physical Layer !");

                    HW3.dividendLabel = new JLabel("Dividend (Appending eight 0s after dataword) :");
                    HW3.detectionLabel = new JLabel("");
                    HW3.augmenterField = new JTextField(10);
                    HW3.augmenterField.setEditable(false);
                    HW3.dataField = new JTextField(20);
                    HW3.divisorLabel = new JLabel("The divisor is : 100110010");
                    HW3.CRCButton = new JButton("CRC Error Detection");

                    HW3.augmenterField.setText("00000000");
                    HW3.messageLabel.setText("The message is : " + Ethernet_frame.Frame_bin);
                    HW3.dataField.setText(HW3.ss);

                    Drawsine_red drawSine = new Drawsine_red();

                    JScrollPane js = new JScrollPane();
                    js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                    js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                    js.setViewportView(drawSine);
                    drawSine.setPreferredSize(new Dimension(1500, 1500));
                    drawSine.revalidate();
                    j.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                            j.dispose();
                            //HW3.flagLineRed = 0;
                            HW3.t2.resume();
                        }
                    });

                    drawSine.add(HW3.messageLabel);
                    drawSine.add(HW3.layerLabel);
                    //drawSine.add(dividendLabel);
                    //drawSine.add(dataField);
                    //drawSine.add(augmenterField);
                    //drawSine.add(CRCButton);
                    //drawSine.add(detectionLabel);
                    //drawSine.add(divisorLabel);

                    j.add(js);
                    j.setSize(1000, 740);
                    //j.setTitle("");
                    //j.setBackground(Color.white);
                    drawSine.setBackground(Color.white);
                    j.setVisible(true);

                }
            }

            //CRC between R2 router and R3 router(blue ball)
            //if (HW3.y2 == 440 && HW3.x2 > 420 && HW3.x2 < 820) {
            if (HW3.y2 >= 440 && HW3.y2 <= 640 && HW3.x2 > 320 && HW3.x2 < 920) {
                if (e.getX() >= HW3.x2 && e.getX() <= HW3.x2 + 60 && e.getY() >= HW3.y2 && e.getY() <= HW3.y2 + 60) {

                    HW3.t2.suspend();
                    HW3.strdata = "";
                    //inputstring = inputField.getText();

                    final JFrame j = new JFrame();
                    HW3.layerLabel = new JLabel("");
                    HW3.messageLabel = new JLabel("");
                    //HW3.dividendLabel = new JLabel("Dividend (Appending eight 0s after dataword) :");
                    HW3.dividendLabel = new JLabel("Revise the original data: ");
                    HW3.detectionLabel = new JLabel("");
                    HW3.augmenterField = new JTextField(10);
                    HW3.augmenterField.setEditable(false);
                    HW3.dataField = new JTextField(20);
                    //HW3.divisorLabel = new JLabel("The divisor is : 100110010");
                    HW3.divisorLabel = new JLabel("The original data is : " + HW3.strdata);
                    HW3.CRCButton = new JButton("CRC Error Detection");

                    HW3.CRCButton.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            //String ss = "1001110";
                            HW3.ss = HW3.dataField.getText();
                            CRC crc = new CRC();
                            if (crc.ifzero(HW3.ss, HW3.strdata) == true) {
                                //System.out.println("no error");
                                HW3.detectionLabel.setText("There is no error");
                            } else {
                                //System.out.println("error");
                                HW3.detectionLabel.setText("Warning: There is an error!");
                            }
                        }
                    });

                    char[] a = HW3.inputstring.toCharArray();
                    //String result = "";
                    for (int i = 0; i < a.length; i++) {
                        HW3.strdata = HW3.strdata + Integer.toBinaryString(a[i]) + "";
                    }
                    HW3.augmenterField.setText(HW3.strdata);
                    HW3.messageLabel.setText("The correct message is : " + Ethernet_frame.Frame_bin);
                    HW3.dataField.setText(HW3.ss);

                    Drawsine_red drawSine = new Drawsine_red();

                    JScrollPane js = new JScrollPane();

                    js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                    js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                    //js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                    //js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
                    js.setViewportView(drawSine);
                    drawSine.setPreferredSize(new Dimension(1500, 1500));
                    drawSine.revalidate();
                    j.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                            j.dispose();
                            HW3.t2.resume();
                        }
                    });

                    drawSine.add(HW3.messageLabel);
                    //drawSine.add(layerLabel);
                    drawSine.add(HW3.dividendLabel);
                    drawSine.add(HW3.dataField);
                    drawSine.add(HW3.augmenterField);
                    drawSine.add(HW3.CRCButton);
                    drawSine.add(HW3.detectionLabel);
                    drawSine.add(HW3.divisorLabel);

                    j.add(js);
                    j.setSize(1000, 740);
                    j.setTitle("CRC and ARQ between two routers");
                    //j.setBackground(Color.white);
                    drawSine.setBackground(Color.white);
                    j.setVisible(true);
                }
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
