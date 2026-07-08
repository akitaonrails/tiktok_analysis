package com.bytedance.byted_bach_sdk.finder;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BachResourceFinder {
    public boolean isDestroyed;
    public long m_nativePtr;

    public abstract void destroy();

    static {
        INVOKESTATIC_com_bytedance_byted_bach_sdk_finder_BachResourceFinder_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bach-sdk-jni");
    }

    public static void INVOKESTATIC_com_bytedance_byted_bach_sdk_finder_BachResourceFinder_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
