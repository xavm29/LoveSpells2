package com.white.magic.couples.lovespells;

import android.app.Application;

import com.growthyourapp.sdk.GYASDK;
import com.onesignal.OneSignal;

public class gyasingleton extends Application {


    GYASDK sdk;
    @Override
    public void onCreate() {
        super.onCreate();
        sdk =new GYASDK();
        // OneSignal Initialization
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();




    }

    public GYASDK getSdk() {
        return sdk;
    }
}
