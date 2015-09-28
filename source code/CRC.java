package hw3;

/*This class is used for CRC error detection and correction*/

import static hw3.HW3.strdiv;

public class CRC {

    //decide if the data is correct or not
    boolean ifzero(String strcrc, String strdata) {

        boolean flag = true;
        long data[] = new long[strdata.length()];
        for (int i = 0; i < strdata.length(); i++) {
            data[i] = Character.digit(strdata.charAt(i), 10);
            //System.out.println(data[i]);
        }

        int length = data.length + HW3.divisor.length - 1;
        HW3.div = new long[length];
        HW3.rem = new long[length];
        HW3.crc = new long[length];
        strdiv = strdata + "00000000";
        //int div[] = new int[strdiv.length()];
        for (int i = 0; i < length; i++) {
            HW3.div[i] = Character.digit(strdiv.charAt(i), 10);
            HW3.rem[i] = HW3.div[i];
            //System.out.println(rem[i]);
        }

        HW3.rem = divide(HW3.div, HW3.divisor, HW3.rem);
        //System.out.println(rem);

        for (int i = 0; i < HW3.div.length; i++) //append dividend and ramainder
        {
            HW3.crc[i] = (HW3.div[i] ^ HW3.rem[i]);
            //System.out.println(crc[i]);
        }

        long crc[] = new long[strcrc.length()];
        for (int j = 0; j < crc.length; j++) {
            crc[j] = Character.digit(strcrc.charAt(j), 10);
            HW3.rem[j] = crc[j];
        }
        HW3.rem = divide(crc, HW3.divisor, HW3.rem);

        for (int i = 0; i < HW3.rem.length; i++) {
            if (HW3.rem[i] != 0) {
                flag = false;
                //System.out.println("Error");
                break;
            }
            if (i == HW3.rem.length - 1) {
                flag = true;
            }
            //System.out.println("No Error");
        }

        return flag;
    }

    //get reminder
    static long[] divide(long div[], long divisor[], long rem[]) {
        int cur = 0;
        while (true) {
            for (int i = 0; i < divisor.length; i++) {
                rem[cur + i] = (rem[cur + i] ^ divisor[i]);
            }

            while (rem[cur] == 0 && cur != (rem.length - 1)) {
                cur++;
            }

            if ((rem.length - cur) < divisor.length) {
                break;
            }
        }
        return rem;
    }
}
