package com.company.design.proxy;

public class ProxyTest {
    public static void main(String[] args) {
//        Browser browser=new Browser("www.naver.com");
//        browser.show();
//        browser.show();
        IBrowser browser=new BrowerProxy("www.naver.com");

        try {
            browser.show();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //AOP : 메서드의 실행시간 전 후로 작업하고 싶은 것 정보를 남길 때 일괄적으로 특정 패키지의 모든 메서드들 전후에 넣을 수 있음




    }

}
