package com.tiktok.avocadoguard;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class AvocadoGuard {
    static {
        INVOKESTATIC_com_tiktok_avocadoguard_AvocadoGuard_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("avocadoguard");
    }

    public native void StartTrace(String str, TraceListener traceListener);

    public native void StopTrace();

    public native void test();

    public static void INVOKESTATIC_com_tiktok_avocadoguard_AvocadoGuard_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
