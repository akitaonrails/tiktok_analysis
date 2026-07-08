package com.ss.vcbkit;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes14.dex */
public class VCBaseKitLoader {
    public static volatile boolean LIZ;

    public static synchronized boolean loadLibrary() {
        if (LIZ) {
            return true;
        }
        if (UnExpected.LIZ) {
            LoadSoLancet.LIZJ("vcbasekit");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("vcbasekit");
            LoadSoLancet.LJ(jUptimeMillis, "vcbasekit");
            LoadSoLancet.LIZLLL(jUptimeMillis, "vcbasekit");
            LoadSoLancet.LIZIZ("vcbasekit");
            LIZ = true;
            return LIZ;
        }
        try {
            UnExpected.LIZ = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            UnExpected.LIZ = false;
        }
        try {
            LoadSoLancet.LIZJ("vcbasekit");
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            Librarian.LJFF("vcbasekit");
            LoadSoLancet.LJ(jUptimeMillis2, "vcbasekit");
            LoadSoLancet.LIZLLL(jUptimeMillis2, "vcbasekit");
            LoadSoLancet.LIZIZ("vcbasekit");
            LIZ = true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return LIZ;
    }
}
