package com.bytedance.otis.memory;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes9.dex */
public final class EnsureLoad {
    public static final EnsureLoad LIZ = new EnsureLoad();
    public static final boolean LIZIZ;

    public static final void init() {
    }

    static {
        try {
            System.currentTimeMillis();
            LoadSoLancet.LIZJ("res_memory");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("res_memory");
            LoadSoLancet.LJ(jUptimeMillis, "res_memory");
            LoadSoLancet.LIZLLL(jUptimeMillis, "res_memory");
            LoadSoLancet.LIZIZ("res_memory");
            LIZIZ = true;
            System.currentTimeMillis();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
