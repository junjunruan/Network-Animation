

package hw3;

public class TCP_header {
    
        long SouP = 0x006E;
        long DesP = 0x049F;
        long Seq1 = 0x745B;
        long Seq2 = 0xEEA2;
        long Ack1 = 0x599A;
        long Ack2 = 0x000E;
        long HL_Re_f = 0x5018;
        long Win = 0x2400;
        long check_sum = 0x0000;
        long UP = 0x0000;
        long sum;
        long wrap_sum;
        long checksum;
        long div = 0xFFFF;
        static String TCP_bin;
    
    void TCP_headeree(){
        
        
        sum  = SouP + DesP + Seq1 + Seq2 + Ack1 + Ack2 + HL_Re_f + Win + check_sum + UP;
        wrap_sum = sum % div;
        checksum = div - wrap_sum;
        String checksum_bin = Long.toBinaryString(checksum);
        checksum_bin = String.format("%16s",checksum_bin).replace(' ', '0');
        
        String SouP_bin = Long.toBinaryString(SouP); 
        SouP_bin = String.format("%16s",SouP_bin).replace(' ', '0');
        
        String DesP_bin = Long.toBinaryString(DesP); 
        DesP_bin = String.format("%16s",DesP_bin).replace(' ', '0');
        
        String Seq1_bin = Long.toBinaryString(Seq1);
        Seq1_bin = String.format("%16s",Seq1_bin).replace(' ', '0');
        
        String Seq2_bin = Long.toBinaryString(Seq2);
        Seq2_bin = String.format("%16s",Seq2_bin).replace(' ', '0');
        
        String Ack1_bin = Long.toBinaryString(Ack1);
        Ack1_bin = String.format("%16s",Ack1_bin).replace(' ', '0');
        
        String Ack2_bin = Long.toBinaryString(Ack2);
        Ack2_bin = String.format("%16s",Ack2_bin).replace(' ', '0');
        
        String HL_Re_f_bin = Long.toBinaryString(HL_Re_f);
        HL_Re_f_bin = String.format("%16s",HL_Re_f_bin).replace(' ', '0');
        
        String Win_bin = Long.toBinaryString(Win);
        Win_bin = String.format("%16s",Win_bin).replace(' ', '0');
        
        String UP_bin = Long.toBinaryString(UP);
        UP_bin = String.format("%16s",UP_bin).replace(' ', '0');

        TCP_bin = SouP_bin + DesP_bin + Seq1_bin + Seq2_bin + Ack1_bin + Ack2_bin + HL_Re_f_bin + Win_bin + checksum_bin + UP_bin;
        
    }
    
}
