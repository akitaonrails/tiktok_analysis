package com.ttnet.org.chromium.base;

import J.N;
import X.C1499100p76;
import X.C1499270p7N;
import X.C1499320p7S;
import X.C786410Ut5;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes24.dex */
public class TraceEvent implements AutoCloseable {
    public static volatile boolean LLILLJJLI;
    public static final AtomicBoolean LLILLL;
    public static boolean LLILZ;
    public final String LL;

    static {
        new AtomicBoolean();
        LLILLL = new AtomicBoolean();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        String str = this.LL;
        EarlyTraceEvent.LIZJ(str, false);
        if (LLILLJJLI) {
            N.M5yUVmrW(str, null);
        }
    }

    public TraceEvent(String str) {
        this.LL = str;
        EarlyTraceEvent.LIZ(str, false);
        if (LLILLJJLI) {
            N.MajVTFsV(str, null);
        }
    }

    public static TraceEvent LIZ(String str) {
        if (!EarlyTraceEvent.LIZIZ() && !LLILLJJLI) {
            return null;
        }
        return new TraceEvent(str);
    }

    public static void dumpViewHierarchy(long j) {
        ApplicationStatus.LIZ();
    }

    public static void setEnabled(boolean z) {
        C1499270p7N c1499270p7N = null;
        if (z) {
            synchronized (EarlyTraceEvent.LIZIZ) {
                try {
                    if (EarlyTraceEvent.LIZIZ()) {
                        throw null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (LLILLJJLI != z) {
            LLILLJJLI = z;
            Looper looper = ThreadUtils.LIZ().getLooper();
            if (z) {
                c1499270p7N = C1499320p7S.LIZ;
            }
            C786410Ut5.LJIIZILJ(looper, c1499270p7N);
        }
        if (LLILLL.get()) {
            C1499100p76.LIZ();
        }
    }

    public static void setEventNameFilteringEnabled(boolean z) {
        LLILZ = z;
    }
}
