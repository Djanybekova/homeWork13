package com.company;

public class Main {

    public static void main(String[] args) {
        Class cl = new Class("Programme", 5,new int[]{12,15,14,1});
        cl.method(cl.getWord(), cl.getNumber(), cl.getArr());
    }
}
