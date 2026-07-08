package com.bytedance.platform.godzilla.memopt;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public final class MemSpongeHelper {
    public static native void debug(boolean z);

    public static native void setHideLargeObjectMaxBytes(long j);

    public static native int start(int i, long j);

    public static native int startWhenOOM(int i, long j);

    public static native void stop();

    static {
        LoadSoLancet.LIZJ("godzilla-memsponge");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("godzilla-memsponge");
        LoadSoLancet.LJ(jUptimeMillis, "godzilla-memsponge");
        LoadSoLancet.LIZLLL(jUptimeMillis, "godzilla-memsponge");
        LoadSoLancet.LIZIZ("godzilla-memsponge");
    }
}
