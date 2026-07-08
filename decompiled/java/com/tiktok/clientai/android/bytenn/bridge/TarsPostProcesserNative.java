package com.tiktok.clientai.android.bytenn.bridge;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public final class TarsPostProcesserNative {
    public static final TarsPostProcesserNative LIZ = new TarsPostProcesserNative();

    public final native float[][] objectDetectionBox(float[] fArr, int i, float f, int i2, float f2, float f3);

    static {
        LoadSoLancet.LIZJ("client_ai_impl_jni");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("client_ai_impl_jni");
        LoadSoLancet.LJ(jUptimeMillis, "client_ai_impl_jni");
        LoadSoLancet.LIZLLL(jUptimeMillis, "client_ai_impl_jni");
        LoadSoLancet.LIZIZ("client_ai_impl_jni");
    }
}
