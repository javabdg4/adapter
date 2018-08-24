package com.sda.adapter;

import com.sda.adapter.adapter.SocketAdpater;
import com.sda.adapter.adapter.SocketClassAdapter;
import com.sda.adapter.adapter.SocketObjectAdapter;
import com.sda.adapter.adapter.Volt;

public class App {
    public static void main(String[] args) {

        XML xml = new XML();
        xml.writeData();

        ObjectAdapter();
    }

    public static void ObjectAdapter() {
        SocketAdpater socketAdpater = new SocketObjectAdapter();
        Volt v3 = getVolt(socketAdpater, 3);
        Volt v12 = getVolt(socketAdpater, 12);
        Volt v120 = getVolt(socketAdpater, 120);
        System.out.println(v12.getVolts());
    }

    public static void classAdapter() {
        SocketAdpater socketAdpater = new SocketClassAdapter();
    }

    public static Volt getVolt(SocketAdpater socketAdpater, int volt) {
        switch (volt) {
            case 3:
                return socketAdpater.get3Volt();
            case 12:
                return socketAdpater.get12Volt();
            case 120:
                return socketAdpater.get120Volt();
            default:
                return socketAdpater.get120Volt();
        }
    }
}
