package com.tiktok.json;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public final class EnsureLoad {
    public static final EnsureLoad LIZ = new EnsureLoad();

    public static final void init() {
    }

    static {
        try {
            LoadSoLancet.LIZJ("json_opt");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("json_opt");
            LoadSoLancet.LJ(jUptimeMillis, "json_opt");
            LoadSoLancet.LIZLLL(jUptimeMillis, "json_opt");
            LoadSoLancet.LIZIZ("json_opt");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
