package com.company.design.singleton;

//한번 연결해 놓았던 통로로 계속 통신한다
public class SocketClient {
    //자기 자신을 객체로 갖고 있어야 한다
    private static SocketClient socketClient=null;
    private SocketClient(){
    }
    //객체를 리턴하는 클래스를 만들어줘야 함
    public static SocketClient getInstance(){
        if(socketClient==null){
           socketClient=new SocketClient();
        }
        return socketClient;
    }
    public void connect(){
        System.out.println("connect");
    }
}
