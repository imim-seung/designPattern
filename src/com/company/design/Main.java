package com.company.design;

import com.company.design.singleton.SocketClient;
import com.company.design.singleton.TestA;
import com.company.design.singleton.TestB;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestA testA=new TestA();
        TestB testB=new TestB();

        SocketClient a=testA.getSocketClient();
        SocketClient b=testB.getSocketClient();

        System.out.println("두 객체가 동일 ? "+ a.equals(b));

    }
}
