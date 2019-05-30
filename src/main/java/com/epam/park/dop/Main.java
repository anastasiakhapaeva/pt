package com.epam.park.dop;

import com.epam.park.transport.Bus;

public class Main {

    public static void main(String[] args) {
        String str1 = "I am a best Tester in EPAM";
        System.out.println(new StringBuilder(str1).reverse());

        StringBuilder sb = new StringBuilder();
        for (int i = str1.length() - 1; i >=0; i--) {
            sb.append(str1.charAt(i));
        }
        System.out.println(sb);
    }

}
