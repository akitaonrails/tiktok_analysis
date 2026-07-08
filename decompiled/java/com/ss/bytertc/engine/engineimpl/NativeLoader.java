package com.ss.bytertc.engine.engineimpl;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class NativeLoader {
    public static void INVOKESTATIC_com_ss_bytertc_engine_engineimpl_NativeLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static void loadLibrary(String str) {
        INVOKESTATIC_com_ss_bytertc_engine_engineimpl_NativeLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
    }
}
