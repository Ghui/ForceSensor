
package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String shortUuidFormat = "0000%04X-0000-1000-8000-00805F9B34FB";
    public static String RFDuino_MEASUREMENT = String.format(shortUuidFormat, 0x2220 & 0xFFFF);
   // public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        // Sample Services.
        //attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        //attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put(RFDuino_MEASUREMENT, "Heart Rate Measurement");
        //attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        //RFDuino Serivce ATTRIBUTE IDS
        attributes.put("00001800-0000-1000-8000-00805f9b34fb","First Service");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb","Second Service");
        attributes.put("00002220-0000-1000-8000-00805f9b34fb","DATA Service");

        //RFDuino Characteristic UUIDS
        attributes.put("00002221-0000-1000-8000-00805f9b34fb","My DATA");

    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
