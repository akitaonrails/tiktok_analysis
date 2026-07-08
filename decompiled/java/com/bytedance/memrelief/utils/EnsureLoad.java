package com.bytedance.memrelief.utils;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public final class EnsureLoad {
    public static final EnsureLoad LIZ = new EnsureLoad();

    public static final void init() {
    }

    public final native void setDebugger(boolean z);

    static {
        try {
            LoadSoLancet.LIZJ("memrelief");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("memrelief");
            LoadSoLancet.LJ(jUptimeMillis, "memrelief");
            LoadSoLancet.LIZLLL(jUptimeMillis, "memrelief");
            LoadSoLancet.LIZIZ("memrelief");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
