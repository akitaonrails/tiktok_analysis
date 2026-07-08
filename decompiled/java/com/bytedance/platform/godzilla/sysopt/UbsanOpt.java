package com.bytedance.platform.godzilla.sysopt;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public final class UbsanOpt {
    public static native void end();

    public static native void start();

    static {
        LoadSoLancet.LIZJ("godzilla-sysopt");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("godzilla-sysopt");
        LoadSoLancet.LJ(jUptimeMillis, "godzilla-sysopt");
        LoadSoLancet.LIZLLL(jUptimeMillis, "godzilla-sysopt");
        LoadSoLancet.LIZIZ("godzilla-sysopt");
    }
}
