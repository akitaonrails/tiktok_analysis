package com.bytedance.anrthanos.optimization;

import android.os.Build;
import android.os.Looper;
import com.bytedance.anrthanos.utils.EzUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class MessageLoggingOpt {
    public static boolean needCut;
    public static boolean sIsDebug;

    public static int startOpt() {
        return startMessageLoggingCutJava(Build.VERSION.SDK_INT);
    }

    public static void checkLoopStatus(String str) {
        if (Build.VERSION.SDK_INT > 29) {
            try {
                Field fieldByPassHiddenApi = EzUtils.getFieldByPassHiddenApi(Looper.class, "sObserver");
                fieldByPassHiddenApi.setAccessible(true);
                fieldByPassHiddenApi.get(Looper.getMainLooper());
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            Field fieldByPassHiddenApi2 = EzUtils.getFieldByPassHiddenApi(Looper.class, "mLogging");
            fieldByPassHiddenApi2.setAccessible(true);
            fieldByPassHiddenApi2.get(Looper.getMainLooper());
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static int startMessageLoggingCutJava(int i) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return -1;
        }
        if (sIsDebug) {
            checkLoopStatus("Before opt");
        }
        needCut = true;
        if (i >= 29) {
            try {
                Field fieldByPassHiddenApi = EzUtils.getFieldByPassHiddenApi(Looper.class, "sObserver");
                fieldByPassHiddenApi.setAccessible(true);
                if (fieldByPassHiddenApi.get(mainLooper) != null) {
                    fieldByPassHiddenApi.set(mainLooper, null);
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            Field declaredField = Looper.class.getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            if (declaredField.get(mainLooper) != null) {
                declaredField.set(mainLooper, null);
            }
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (NoSuchFieldException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (sIsDebug) {
            checkLoopStatus("After opt");
            return 0;
        }
        return 0;
    }

    public static int startOpt(boolean z) {
        sIsDebug = z;
        return startOpt();
    }
}
