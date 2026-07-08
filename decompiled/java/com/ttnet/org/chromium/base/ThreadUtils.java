package com.ttnet.org.chromium.base;

import X.C1499100p76;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes24.dex */
public class ThreadUtils {
    public static final Object LIZ = new Object();
    public static BPEAHandler LIZIZ;

    public static Handler LIZ() {
        boolean z;
        synchronized (LIZ) {
            try {
                if (LIZIZ == null) {
                    LIZIZ = new BPEAHandler(Looper.getMainLooper());
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            TraceEvent.LLILLL.set(true);
            if (TraceEvent.LLILLJJLI) {
                C1499100p76.LIZ();
            }
        }
        return LIZIZ;
    }

    public static boolean isThreadPriorityAudio(int i) {
        if (Process.getThreadPriority(i) == -16) {
            return true;
        }
        return false;
    }

    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }
}
