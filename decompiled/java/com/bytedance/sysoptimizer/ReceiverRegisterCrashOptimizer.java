package com.bytedance.sysoptimizer;

import X.C838410Wul;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes14.dex */
public class ReceiverRegisterCrashOptimizer {
    public static Application sApplication;
    public static DoRegisterHandlerCallback sDoRegisterHandlerCallback;
    public static ReceiverLogInterface sReceiverLogInterface;
    public static BroadcastReceiverRegisterCallback sReceiverRegisterHandler;

    public interface BroadcastReceiverRegisterCallback {
        boolean isAsyncFilter(IntentFilter intentFilter);

        boolean needHookFilter(IntentFilter intentFilter);

        void prePostMessage(Message message);
    }

    public interface DoRegisterHandlerCallback {
        boolean shouldDoRegisterHandler();
    }

    public static void doHWReceiverFix() {
        Application application = sApplication;
        if (application == null) {
            return;
        }
        HWReceiverCrashOptimizer.fix(application);
    }

    public static boolean doRegisterHandler() {
        DoRegisterHandlerCallback doRegisterHandlerCallback = sDoRegisterHandlerCallback;
        if (doRegisterHandlerCallback == null) {
            return false;
        }
        return doRegisterHandlerCallback.shouldDoRegisterHandler();
    }

    public static boolean fixedOpen() {
        return sApplication != null;
    }

    public static BroadcastReceiverRegisterCallback getReceiverRegisterHandler() {
        return sReceiverRegisterHandler;
    }

    public static void fix(Application application) {
        sApplication = application;
    }

    public static boolean isAsync(IntentFilter intentFilter) {
        BroadcastReceiverRegisterCallback broadcastReceiverRegisterCallback = sReceiverRegisterHandler;
        if (broadcastReceiverRegisterCallback == null) {
            return false;
        }
        return broadcastReceiverRegisterCallback.isAsyncFilter(intentFilter);
    }

    public static void setBroadcastReceiverRegisterHandler(BroadcastReceiverRegisterCallback broadcastReceiverRegisterCallback) {
        sReceiverRegisterHandler = broadcastReceiverRegisterCallback;
    }

    public static void setDoRegisterHandlerCallback(DoRegisterHandlerCallback doRegisterHandlerCallback) {
        sDoRegisterHandlerCallback = doRegisterHandlerCallback;
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Application application = sApplication;
        if (application == null) {
            return null;
        }
        return C838410Wul.LJFF(application.getBaseContext(), broadcastReceiver, intentFilter, 2);
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        Application application = sApplication;
        if (application == null) {
            return null;
        }
        return application.getBaseContext().registerReceiver(broadcastReceiver, intentFilter, i);
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        Application application = sApplication;
        if (application == null) {
            return null;
        }
        return C838410Wul.LJI(application.getBaseContext(), broadcastReceiver, intentFilter, str, handler, 2);
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        Application application = sApplication;
        if (application == null) {
            return null;
        }
        return application.getBaseContext().registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
    }
}
