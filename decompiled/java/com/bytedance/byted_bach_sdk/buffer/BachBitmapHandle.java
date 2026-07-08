package com.bytedance.byted_bach_sdk.buffer;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class BachBitmapHandle {
    public long m_nativeHandle;

    private native Bitmap nativeGet(long j);

    static {
        INVOKESTATIC_com_bytedance_byted_bach_sdk_buffer_BachBitmapHandle_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bach-sdk-jni");
    }

    public Bitmap get() {
        return nativeGet(this.m_nativeHandle);
    }

    public static void INVOKESTATIC_com_bytedance_byted_bach_sdk_buffer_BachBitmapHandle_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
