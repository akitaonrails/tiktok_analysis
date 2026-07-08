package com.bytedance.refcache;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class FileLocker {
    public static volatile boolean LIZ = true;

    public static native long _getTotalSpace(String str);

    public static native int getStatus(String str);

    static {
        try {
            LoadSoLancet.LIZJ("flock-lib");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("flock-lib");
            LoadSoLancet.LJ(jUptimeMillis, "flock-lib");
            LoadSoLancet.LIZLLL(jUptimeMillis, "flock-lib");
            LoadSoLancet.LIZIZ("flock-lib");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ = false;
        }
    }
}
