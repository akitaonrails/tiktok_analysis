package com.bytedance.otis.resource.util;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public final class EnsureLoad {
    public static final EnsureLoad LIZ = new EnsureLoad();
    public static final boolean LIZIZ;

    public final void init() {
    }

    static {
        try {
            System.currentTimeMillis();
            LoadSoLancet.LIZJ("resource_monitor");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("resource_monitor");
            LoadSoLancet.LJ(jUptimeMillis, "resource_monitor");
            LoadSoLancet.LIZLLL(jUptimeMillis, "resource_monitor");
            LoadSoLancet.LIZIZ("resource_monitor");
            LIZIZ = true;
            System.currentTimeMillis();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
