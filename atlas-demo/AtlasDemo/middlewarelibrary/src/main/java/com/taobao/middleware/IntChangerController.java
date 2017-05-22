package com.taobao.middleware;

/**
 * Created by jiejing on 2017/5/22.
 */

public class IntChangerController {

    private static IntChanger changer;

    static {
        changer = new IntChanger() {
            @Override
            public int getInteger() {
                return 0;
            }
        };
    }

    public static IntChanger getChanger() {
        return changer;
    }

    public static void setChanger(IntChanger pchanger) {
        changer = pchanger;
    }
}
