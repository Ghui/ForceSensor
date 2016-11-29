package com.example.android.bluetoothlegatt;

import android.util.Log;

/**
 * Created by MELAB on 6/16/2016.
 */
public class HexAsciiConverter {
    private final static String TAG = DeviceControlActivity.class.getSimpleName();
    //**************************************
    //      HEX ASCII to Decimal CONVERT TABLE
    //      30   -------> 0
    //      31   -------> 1
    //      32   -------> 2
    //      33   -------> 3
    //      34   -------> 4
    //      35   -------> 5
    //      36   -------> 6
    //      37   -------> 7
    //      38   -------> 8
    //      39   -------> 9
    //      2c   -------> ,
    //**************************************
    public static String HexAscii2Decimal(String input){
        String val = "";
        String temp;
        for(int i = 0; i <input.length();i=i+3){
            temp = input.substring(i,i+2);
            //Log.d(TAG,"My HEXASCII temp Value: " + temp);
            /*switch (temp){
                case "30":
                    val.concat("0");
                    break;
                case "31":
                    val.concat("1");
                    break;
                case "32":
                    val.concat("2");
                    break;
                }*/
            if(temp.substring(1,2).equals("C")) {
                val = val.concat(",");
            }
            else {
                val = val.concat(temp.substring(1,2));
            }
        }
        //Log.d(TAG,"MY VAL IN HEXASCII2DECIMAL "+val);
        return val;
    }
}
