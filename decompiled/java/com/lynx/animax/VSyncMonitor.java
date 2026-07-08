package com.lynx.animax;

import X.C786410Ut5;
import X.C787470Uun;
import Y.ARunnableS96S0000000_20;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes21.dex */
public class VSyncMonitor {
    public static native void nativeInvokeCallback(long j);

    public static void requestVSync() {
        ARunnableS96S0000000_20 aRunnableS96S0000000_20 = new ARunnableS96S0000000_20(10);
        Handler handlerLIZ = C787470Uun.LIZ();
        Message messageObtain = Message.obtain(handlerLIZ, aRunnableS96S0000000_20);
        messageObtain.setAsynchronous(true);
        C786410Ut5.LJLJJLL(handlerLIZ, messageObtain);
    }

    public static void LIZ(long j) {
        nativeInvokeCallback(j);
    }
}
