package com.darryncampbell.wifi_rtt_trilateration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Configuration {

    public static final int NUM_HISTORICAL_POINTS = 10;
    public static final int MILLISECONDS_BETWEEN_RANGING_REQUESTS = 50; //  1000

    public enum CONFIGURATION_TYPE {
        THREE_DIMENSIONAL_1,
        TWO_DIMENSIONAL_1,   //  2D will just set all the 3rd dimensions to 0.0
        TWO_DIMENSIONAL_2,
        TWO_DIMENSIONAL_3,
        TESTING,
        TESTING_2,
        TESTING_3
    }

    AccessPoint ap1;
    AccessPoint ap2;
    AccessPoint ap3;
    AccessPoint ap4;
    AccessPoint ap5;
    ArrayList<AccessPoint> accessPoints;
    ArrayList<String> macAddresses;
    ArrayList<Integer> apOffsets;

    int ap1_offset;
    int ap2_offset;
    int ap3_offset;
    int ap4_offset;
    int ap5_offset;

    public Configuration(CONFIGURATION_TYPE configuration_type)
    {
        if (configuration_type == CONFIGURATION_TYPE.THREE_DIMENSIONAL_1)
        {
            //  The configuration consists of a number of Access points in 3 dimensional space (x,y,z) identified by their BSSID
            ap1 = new AccessPoint("08:b4:b1:66:db:9b", 3260.0, 100.0, 0.0, "Lounge");
            ap2 = new AccessPoint("5c:02:14:e6:18:6f", 2980.0, 6900.0, 800.0, "Dining Room");
            ap3 = new AccessPoint("04:d4:c4:63:5a:98", 3050.0, 6900.0, 2550.0, "Bedroom 3");
            ap4 = new AccessPoint("58:cb:52:a9:bd:78", 7840.0, 6850.0, 3410.0, "Bedroom 4");

            ap1_offset = 1;
            ap2_offset = 1;
            ap3_offset = 1;
            ap4_offset = 1;

            accessPoints = new ArrayList<>();
            macAddresses = new ArrayList<>();
            apOffsets = new ArrayList<>();

            accessPoints.add(ap1);
            accessPoints.add(ap2);
            accessPoints.add(ap3);
            accessPoints.add(ap4);

            apOffsets.add(ap1_offset);
            apOffsets.add(ap2_offset);
            apOffsets.add(ap3_offset);
            apOffsets.add(ap4_offset);

            macAddresses.add(ap1.getBssid());
            macAddresses.add(ap2.getBssid());
            macAddresses.add(ap3.getBssid());
            macAddresses.add(ap4.getBssid());
        }
        else if (configuration_type == CONFIGURATION_TYPE.TWO_DIMENSIONAL_1)
        {
            //  The configuration consists of a number of Access points in 3 dimensional space (x,y,z) identified by their BSSID
            //  Description:
            //  2 APs, one in the lounge by the bay window and one in the dining room, on the floor in front of the dresser (in line with right foot)
            ap1 = new AccessPoint("08:b4:b1:66:db:9b", 3260.0, 490.0, 0.0, "Lounge");
            ap2 = new AccessPoint("5c:02:14:e6:18:6f", 2980.0, 6900.0, 0.0, "Dining Room");

            ap1_offset = 1;
            ap2_offset = 1;

            accessPoints = new ArrayList<>();
            macAddresses = new ArrayList<>();
            apOffsets = new ArrayList<>();

            accessPoints.add(ap1);
            accessPoints.add(ap2);

            apOffsets.add(ap1_offset);
            apOffsets.add(ap2_offset);

            macAddresses.add(ap1.getBssid());
            macAddresses.add(ap2.getBssid());
        }
        else if (configuration_type == CONFIGURATION_TYPE.TWO_DIMENSIONAL_2)
        {
            //  The configuration consists of a number of Access points in 3 dimensional space (x,y,z) identified by their BSSID
            //  Description:
            //  3 APs, one in the lounge by the bay window and one in the dining room, on the floor in front of the dresser (in line with right foot)
            //  1 in the downstairs study (below socket)
            ap1 = new AccessPoint("d4:35:38:75:ec:bd", 0, 4000, 0.0, "Lounge");
            ap2 = new AccessPoint("04:d4:c4:63:5a:9c", 7600, 4000, 0.0, "Dining Room");
            ap3 = new AccessPoint("08:b4:b1:66:db:9b", 0, 0, 0.0, "Study");
            // 谷歌 08:b4:b1:66:db:9b
            //04:d4:c4:63:5a:9c
            //d4:35:38:75:ec:bd

            ap1_offset = 11000;
            ap2_offset = -7000;
            ap3_offset = -1100;
            ap4_offset = -1000;
            ap5_offset = -1000;

            accessPoints = new ArrayList<>();
            macAddresses = new ArrayList<>();
            apOffsets = new ArrayList<>();

            accessPoints.add(ap1);
            accessPoints.add(ap2);
            accessPoints.add(ap3);

            apOffsets.add(ap1_offset);
            apOffsets.add(ap2_offset);
            apOffsets.add(ap3_offset);

            macAddresses.add(ap1.getBssid());
            macAddresses.add(ap2.getBssid());
            macAddresses.add(ap3.getBssid());
        }
        else if (configuration_type == CONFIGURATION_TYPE.TWO_DIMENSIONAL_3)
        {
            //  The configuration consists of a number of Access points in 3 dimensional space (x,y,z) identified by their BSSID
            //  Description:
            //  3 APs, one in the lounge by the bay window and one in the dining room, on the floor in front of the dresser (in line with right foot)
            //  1 in the downstairs study (below socket)
            ap1 = new AccessPoint("d4:35:38:75:ec:bd", 0, 3800, 0.0, "Xiaomi_ax3000");
            ap2 = new AccessPoint("04:d4:c4:63:5a:9c", 8000, 3800, 0.0, "Ausu_98");
            ap3 = new AccessPoint("08:b4:b1:66:db:9b", 0, 0, 0.0, "Google_WiFI");
            ap4 = new AccessPoint("e8:9f:80:8d:f9:cf", 8000, 0, 0.0, "Velop1");
            ap5 = new AccessPoint("e8:9f:80:8d:f5:43", 4000, 1900, 0.0, "Velop2");

            ap1_offset = 11000;
            ap2_offset = -7000;
            ap3_offset = -1100;
            ap4_offset = -500;
            ap5_offset = -500;

            accessPoints = new ArrayList<>();
            macAddresses = new ArrayList<>();
            apOffsets = new ArrayList<>();

            accessPoints.add(ap1);
            accessPoints.add(ap2);
            accessPoints.add(ap3);
            accessPoints.add(ap4);
            accessPoints.add(ap5);

            apOffsets.add(ap1_offset);
            apOffsets.add(ap2_offset);
            apOffsets.add(ap3_offset);
            apOffsets.add(ap4_offset);
            apOffsets.add(ap5_offset);

            macAddresses.add(ap1.getBssid());
            macAddresses.add(ap2.getBssid());
            macAddresses.add(ap3.getBssid());
            macAddresses.add(ap4.getBssid());
            macAddresses.add(ap5.getBssid());
        }
        else if (configuration_type == CONFIGURATION_TYPE.TESTING)
        {
            //  The configuration consists of a number of Access points in 3 dimensional space (x,y,z) identified by their BSSID
            //  Description:
            //  3 APs, one in the lounge by the bay window and one in the dining room, on the floor in front of the dresser (in line with right foot)
            //  1 in the downstairs study (below socket)
            ap1 = new AccessPoint("08:b4:b1:66:db:9b", 3260.0, 490.0, 0.0, "Lounge");
            ap2 = new AccessPoint("5c:02:14:e6:18:6f", 3050.0, 6900.0, 2550.0, "Bedroom 3");
            ap3 = new AccessPoint("04:d4:c4:63:5a:98", 6320.0, -600.0, 0.0, "Study");

            ap1_offset = 1;
            ap2_offset = 1;
            ap3_offset = 1;

            accessPoints = new ArrayList<>();
            macAddresses = new ArrayList<>();
            apOffsets = new ArrayList<>();

            accessPoints.add(ap1);
            accessPoints.add(ap2);
            accessPoints.add(ap3);

            apOffsets.add(ap1_offset);
            apOffsets.add(ap2_offset);
            apOffsets.add(ap3_offset);

            macAddresses.add(ap1.getBssid());
            macAddresses.add(ap2.getBssid());
            macAddresses.add(ap3.getBssid());
        }
        else if (configuration_type == CONFIGURATION_TYPE.TESTING_2)
        {
            //  The configuration consists of a number of Access points in 3 dimensional space (x,y,z) identified by their BSSID
            //  Description:
            //  3 APs, one in the lounge by the bay window and one in the dining room, on the floor in front of the dresser (in line with right foot)
            //  1 in the downstairs study (below socket)
            ap1 = new AccessPoint("04:d4:c4:63:5a:9c", 3260.0, 490.0, 0.0, "Lounge");
            ap3 = new AccessPoint("d4:35:38:75:ec:bd", 6320.0, -600.0, 0.0, "Study");

            ap1_offset = -7000;
            ap3_offset = 11000;

            accessPoints = new ArrayList<>();
            macAddresses = new ArrayList<>();
            apOffsets = new ArrayList<>();

            accessPoints.add(ap1);
            accessPoints.add(ap3);

            apOffsets.add(ap1_offset);
            apOffsets.add(ap3_offset);

            macAddresses.add(ap1.getBssid());
            macAddresses.add(ap3.getBssid());
        }
        else if (configuration_type == CONFIGURATION_TYPE.TESTING_3)
        {
            ap1 = new AccessPoint("08:b4:b1:66:db:9b", 3260.0, 490.0, 0.0, "Lounge");

            ap1_offset = 1;

            accessPoints = new ArrayList<>();
            macAddresses = new ArrayList<>();
            apOffsets = new ArrayList<>();

            accessPoints.add(ap1);

            apOffsets.add(ap1_offset);

            macAddresses.add(ap1.getBssid());
        }


        Collections.sort(accessPoints);
    }

    public List<AccessPoint> getConfiguration()
    {
        return accessPoints;
    }

    // Used to check if the access point we are ranging to is in our map
    public List<String> getMacAddresses()
    {
        return macAddresses;
    }

    // 用于返回configuation内的offset信息
    public ArrayList<Integer> getApOffsets() { return apOffsets; }

}
