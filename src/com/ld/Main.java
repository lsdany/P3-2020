package com.ld;

import com.ld.list.SimpleList;

/**
 * @author Luisdany Israel Pernillo
 */

public class Main {

    public static void main(String[] args) {

//        SimpleList<String> simpleList = new SimpleList<>();
//        simpleList.addElement("8");
//        simpleList.addElement("10");
//        simpleList.addElement("1");
//        simpleList.addElement("9");
//        simpleList.addElement("15");

        SimpleList<Integer> simpleList = new SimpleList<>();
        simpleList.addElement(8);
        simpleList.addElement(10);
        simpleList.addElement(1);
        simpleList.addElement(9);
        simpleList.addElement(15);

        System.out.println("Original List");
        simpleList.show();
        simpleList.orderList();
        System.out.println("\n Ordered List");
        simpleList.show();


    }
}
