package hw3;
/*This class is used for displaying message in datalink layer*/

public class Ethernet_frame {
    
    long x1 = 0x000A;
    long x2 = 0xE6F0;
    long x3 = 0x05A3;
    long x4 = 0x0012;
    long x5 = 0x0000;
    long x6 = 0x0C06;
    long x7 = 0x0709;
    long x8 = 0x0000;
    long x9 = 0x0A0C;
    long x10 = 0x0E05;
    long x11 = 0x0016;
    long x12 = 0x0000;
    long check;
    long checksum;
    long wrap_check;
    long div = 0xFFFF;
    static String Frame_bin;
    String input_bin;
    
    
    void Ethernet_headeree(){
        
        check  = x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11+x12;
        wrap_check = check % div;
        checksum = div - wrap_check;
        String checksum_bin = Long.toBinaryString(checksum);
        checksum_bin = String.format("%16s",checksum_bin).replace(' ', '0');
        
        String x1_bin = Long.toBinaryString(x1); 
        x1_bin = String.format("%16s",x1_bin).replace(' ', '0');
        
        String x2_bin = Long.toBinaryString(x2); 
        x2_bin = String.format("%16s",x2_bin).replace(' ', '0');
        
        String x3_bin = Long.toBinaryString(x3);
        x3_bin = String.format("%16s",x3_bin).replace(' ', '0');
        
        String x4_bin = Long.toBinaryString(x4);
        x4_bin = String.format("%16s",x4_bin).replace(' ', '0');
        
        String x5_bin = Long.toBinaryString(x5);
        x5_bin = String.format("%16s",x5_bin).replace(' ', '0');
        
        String x6_bin = Long.toBinaryString(x6);
        x6_bin = String.format("%16s",x6_bin).replace(' ', '0');
        
        String x7_bin = Long.toBinaryString(x7);
        x7_bin = String.format("%16s",x7_bin).replace(' ', '0');
        
        String x8_bin = Long.toBinaryString(x8);
        x8_bin = String.format("%16s",x8_bin).replace(' ', '0');
        
        String x9_bin = Long.toBinaryString(x9);
        x9_bin = String.format("%16s",x9_bin).replace(' ', '0');
        
        String x10_bin = Long.toBinaryString(x10);
        x10_bin = String.format("%16s",x10_bin).replace(' ', '0');
        
        String x11_bin = Long.toBinaryString(x11);
        x11_bin = String.format("%16s",x11_bin).replace(' ', '0');
        

        String inputdata = String.format("%46s",IP_header.IP_bin + TCP_header.TCP_bin + HW3.strdata).replace(' ', '0');
        
        Frame_bin = x1_bin + x2_bin + x3_bin + x4_bin + x5_bin + x6_bin + x7_bin + x8_bin + x9_bin + x10_bin + x11_bin + inputdata+ checksum_bin;
        
    }
}
