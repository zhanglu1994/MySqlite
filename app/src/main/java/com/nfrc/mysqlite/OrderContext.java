package com.nfrc.mysqlite;

import android.content.Context;

/**
 * Created by zhangl on 2018/11/27.
 */

public class OrderContext {

    private static volatile OrderContext instance;

    private Context applicationContext;

    public static OrderContext getInstance() {
        if (instance == null){
            throw new RuntimeException(OrderContext.class.getSimpleName() + "has not been initialized!");
        }

        return instance;
    }

    public Context getApplicationContext() {
        return applicationContext;
    }

    public OrderContext(Context applicationContext) {
        this.applicationContext = applicationContext;
    }

    /**
     * 全局信息 只能调用一次
     */
    public static void init(Context applicationContext) {
        if (instance != null) {
            throw new RuntimeException(OrderContext.class.getSimpleName() + " can not be initialized multiple times!");
        }
        instance = new OrderContext(applicationContext);
    }

    public static boolean isInitialized() {
        return (instance != null);
    }
}


