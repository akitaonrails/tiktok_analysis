package com.bytedance.ies.safemode.SmartProtected.utils.logger;

import X.C0VSD;
import X.C786410Ut5;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class LLog {
    public static final LLog LIZ = new LLog();
    public static final C0VSD LIZIZ;

    private final native void nativePrintCompleteLog(String str, String str2);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0VSD] */
    static {
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        LIZIZ = new Object() { // from class: X.0VSD
        };
        System.getProperty("line.separator");
    }

    public static final void LIZ(Throwable th, String str, Object... objArr) {
        C0VSD c0vsd = LIZIZ;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        c0vsd.getClass();
        if (objArrCopyOf.length != 0) {
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
            C786410Ut5.j4(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        }
        Log.getStackTraceString(th);
    }
}
