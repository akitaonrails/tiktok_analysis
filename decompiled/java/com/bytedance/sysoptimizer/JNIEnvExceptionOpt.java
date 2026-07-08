package com.bytedance.sysoptimizer;

import X.C786410Ut5;
import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
public class JNIEnvExceptionOpt {
    public static volatile boolean sInit;
    public static IThrowableConsumer sThrowableConsumer;

    public interface IThrowableConsumer {
        boolean consume(Thread thread, Throwable th);
    }

    public static native int nStart();

    public static boolean consume(Throwable th) {
        IThrowableConsumer iThrowableConsumer = sThrowableConsumer;
        if (iThrowableConsumer == null) {
            return false;
        }
        return iThrowableConsumer.consume(C786410Ut5.u3(), th);
    }

    public static int start(Context context, IThrowableConsumer iThrowableConsumer) {
        if (sInit) {
            return 1;
        }
        if (SysOptimizer.loadOptimizerLibrary(context) && !sInit) {
            sThrowableConsumer = iThrowableConsumer;
            int iNStart = nStart();
            sInit = true;
            return iNStart;
        }
        return -1;
    }
}
