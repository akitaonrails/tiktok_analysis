package com.bytedance.otis.attribution.utils;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public final class SoLoad {
    public static final SoLoad LIZ = new SoLoad();

    public final void init() {
    }

    static {
        try {
            LoadSoLancet.LIZJ("otis_attrib");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("otis_attrib");
            LoadSoLancet.LJ(jUptimeMillis, "otis_attrib");
            LoadSoLancet.LIZLLL(jUptimeMillis, "otis_attrib");
            LoadSoLancet.LIZIZ("otis_attrib");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
