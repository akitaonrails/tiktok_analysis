package com.ss.pusher.core.utils;

import X.C1283060jUe;
import X.C1C7U;
import X.C2188811AlT;
import android.os.Looper;
import ci3.a;
import java.lang.Thread;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class NativeHandlerThread extends a implements Runnable {
    public int LL;
    public final int LLILLJJLI;

    public static native int nativeCreatePThread(String str, Runnable runnable);

    @Override // java.lang.Thread
    public synchronized void start() {
        super.start();
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean zLIZ;
        C1C7U.LIZ("NativeHandlerThread@a135.run");
        try {
            super.run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NativeHandlerThread@a135.run");
    }

    @Override // android.os.HandlerThread
    public final Looper getLooper() {
        return super.getLooper();
    }

    @Override // java.lang.Thread
    public final Thread.State getState() {
        return super.getState();
    }

    @Override // android.os.HandlerThread
    public final int getThreadId() {
        return this.LL;
    }

    public NativeHandlerThread(String str) {
        super(str);
        this.LLILLJJLI = 1;
        this.LL = -1;
        Integer num = (Integer) ((HashMap) C1283060jUe.LIZ).get(str);
        if (num != null && num.intValue() <= 19 && num.intValue() >= -19) {
            this.LLILLJJLI = num.intValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Create a NativeHandlerThread ");
        sbLIZ.append(str);
        sbLIZ.append(", priority is ");
        sbLIZ.append(this.LLILLJJLI);
        AVLog.iod("NativeHandlerThread", C2188811AlT.LIZIZ(sbLIZ));
    }
}
