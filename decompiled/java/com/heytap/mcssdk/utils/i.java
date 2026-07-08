package com.heytap.mcssdk.utils;

import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes10.dex */
public class i {
    public static final ExecutorService a = C786410Ut5.h4();
    public static final Handler b = new BPEAHandler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        a.execute(runnable);
    }

    public static void b(Runnable runnable) {
        C786410Ut5.LJJZZIII(b, runnable);
    }
}
