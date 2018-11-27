package com.nfrc.mysqlite;

import android.app.Application;

/**
 * Created by zhangl on 2018/11/27.
 */

public class OrderApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (!OrderContext.isInitialized()) {
            OrderContext.init(getApplicationContext());
        }


    }
}
