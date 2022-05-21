package com.company.design.aop;

import com.company.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class AopTest {
    public static void main(String[] args) {
        AtomicLong start= new AtomicLong();
        AtomicLong end=new AtomicLong();
        IBrowser aopBrowser =new AopBrower("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
            long now =System.currentTimeMillis();
            end.set(now-start.get());
                });

        try {
            aopBrowser.show();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("loading time :" + end.get() );

    }
}
