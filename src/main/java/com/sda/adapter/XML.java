package com.sda.adapter;

public class XML implements Writer{
    @Override
    public void writeData() {
        JSON json = new JSON();
        json.json();
    }
}
