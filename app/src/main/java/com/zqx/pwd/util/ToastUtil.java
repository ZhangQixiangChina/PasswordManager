package com.zqx.pwd.util;

import android.widget.Toast;

import com.zqx.pwd.MyApp;

public class ToastUtil {

    private static Toast sToast;

    public static void show(String text) {
        if (sToast == null) {
            sToast = Toast.makeText(MyApp.context, text, Toast.LENGTH_SHORT);
        } else {
            sToast.setText(text);
        }
        sToast.show();
    }

    public static void hide(){
        sToast.cancel();
    }
}
