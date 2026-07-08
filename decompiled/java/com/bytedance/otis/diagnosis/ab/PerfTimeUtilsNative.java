package com.bytedance.otis.diagnosis.ab;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public final class PerfTimeUtilsNative {
    public static final PerfTimeUtilsNative LIZ = new PerfTimeUtilsNative();
    public static final boolean LIZIZ;

    public static final native long getCurrentThreadCpuTimeNanos();

    static {
        try {
            LoadSoLancet.LIZJ("perf_time_utils");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("perf_time_utils");
            LoadSoLancet.LJ(jUptimeMillis, "perf_time_utils");
            LoadSoLancet.LIZLLL(jUptimeMillis, "perf_time_utils");
            LoadSoLancet.LIZIZ("perf_time_utils");
            LIZIZ = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
