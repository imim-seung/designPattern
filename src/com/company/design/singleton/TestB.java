package com.company.design.singleton;

public class TestB {
    private SocketClient socketClient;

    public TestB() {
        this.socketClient=SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }

}
