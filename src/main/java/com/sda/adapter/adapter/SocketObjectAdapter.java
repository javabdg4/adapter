package com.sda.adapter.adapter;

public class SocketObjectAdapter implements SocketAdpater {

    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v, 40);
    }

    public Volt convertVolt(Volt v, int volt) {
        return new Volt(v.getVolts() / volt);
    }
}
