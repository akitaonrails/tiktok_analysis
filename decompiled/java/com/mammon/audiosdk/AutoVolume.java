package com.mammon.audiosdk;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class AutoVolume {
    public static native float Native_GetAutoVolume(float[] fArr);

    static {
        INVOKESTATIC_com_mammon_audiosdk_AutoVolume_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("audioeffect");
    }

    public static float GetAutoVolume(float[] fArr) {
        return Native_GetAutoVolume(fArr);
    }

    public static void INVOKESTATIC_com_mammon_audiosdk_AutoVolume_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
