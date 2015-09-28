
package hw3;

public class IP_header {
    
        long Ver_HLEN_Ser = 0x4500;
        long TotalLength = 20;
        long ID = 0xC001;
        long Flag_Offset = 0x0000;
        long TTL_Protocol = 0x0411;
        long Header_check = 0x0000;
        long SouIP1 = 0x0A0C;
        long SouIP2 = 0x0E05;
        long Des_IP1 = 0x0C06;
        long Des_IP2 = 0x0709;
        long sum;
        long wrap_sum;
        long checksum;
        long div = 0xFFFF;
            
        static String IP_bin;
        
    void IP_headeree(){
        sum  = Ver_HLEN_Ser + TotalLength + ID + Flag_Offset + TTL_Protocol + Header_check + SouIP1 + SouIP2 + Des_IP1 + Des_IP2;
        wrap_sum = sum % div;
        checksum = div - wrap_sum;
        String checksum_bin = Long.toBinaryString(checksum);
        checksum_bin = String.format("%16s",checksum_bin).replace(' ', '0');
        
        String Ver_HLEN_Ser_bin = Long.toBinaryString(Ver_HLEN_Ser); 
        Ver_HLEN_Ser_bin = String.format("%16s",Ver_HLEN_Ser_bin).replace(' ', '0');
        
        String TotalLength_bin = Long.toBinaryString(TotalLength); 
        TotalLength_bin = String.format("%16s",TotalLength_bin).replace(' ', '0');
        
        String ID_bin = Long.toBinaryString(ID);
        ID_bin = String.format("%16s",ID_bin).replace(' ', '0');
        
        String Flag_Offset_bin = Long.toBinaryString(Flag_Offset);
        Flag_Offset_bin = String.format("%16s",Flag_Offset_bin).replace(' ', '0');
        
        String TTL_Protocol_bin = Long.toBinaryString(TTL_Protocol);
        TTL_Protocol_bin = String.format("%16s",TTL_Protocol_bin).replace(' ', '0');
        
        String SouIP1_bin = Long.toBinaryString(SouIP1);
        SouIP1_bin = String.format("%16s",SouIP1_bin).replace(' ', '0');
        
        String SouIP2_bin = Long.toBinaryString(SouIP2);
        SouIP2_bin = String.format("%16s",SouIP2_bin).replace(' ', '0');
        
        String Des_IP1_bin = Long.toBinaryString(Des_IP1);
        Des_IP1_bin = String.format("%16s",Des_IP1_bin).replace(' ', '0');
        
        String Des_IP2_bin = Long.toBinaryString(Des_IP2);
        Des_IP2_bin = String.format("%16s",Des_IP2_bin).replace(' ', '0');
        
        IP_bin = Ver_HLEN_Ser_bin + TotalLength_bin + ID_bin 
                + Flag_Offset_bin + TTL_Protocol_bin + checksum_bin + 
                SouIP1_bin + SouIP2_bin + Des_IP1_bin + Des_IP2_bin;
        //System.out.print(IP_bin);
    }
}
