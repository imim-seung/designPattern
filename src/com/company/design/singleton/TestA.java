package com.company.design.singleton;

public class TestA {
    private SocketClient socketClient;

    public TestA() {
        this.socketClient=SocketClient.getInstance();
    }
    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
