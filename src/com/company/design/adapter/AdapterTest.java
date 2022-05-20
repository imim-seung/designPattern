package com.company.design.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        HairDryer hairDryer=new HairDryer();
        connect(hairDryer);

        Cleaner cleaner=new Cleaner();
        //220 V 이므로 부를 수 없다.
//        connect(cleaner);

        Electronic110V adapter=new SocketAdapter(cleaner);
        connect(adapter);
    }
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
