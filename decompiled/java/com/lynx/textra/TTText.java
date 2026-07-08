package com.lynx.textra;

import android.graphics.Paint;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes21.dex */
public class TTText {
    public static boolean sInitialized;
    public static boolean sSelfRenderingPreloaded;
    public static Paint mPainter = new Paint();
    public static JavaFontManager mFontManager = null;

    public static void Initial() {
        Initial(false);
    }

    public static boolean PreloadSelfRendering() {
        return PreloadSelfRendering(false);
    }

    public static native JavaFontManager nativeGetDefaultFontManager();

    public static native void nativeInitialCache();

    public static native boolean nativePreloadSelfRendering();

    public static void INVOKESTATIC_com_lynx_textra_TTText_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static synchronized void Initial(boolean z) {
        if (sInitialized) {
            return;
        }
        if (z) {
            INVOKESTATIC_com_lynx_textra_TTText_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("tttext_lite");
        }
        nativeInitialCache();
        mFontManager = nativeGetDefaultFontManager();
        sInitialized = true;
    }

    public static synchronized boolean PreloadSelfRendering(boolean z) {
        if (sSelfRenderingPreloaded) {
            return true;
        }
        if (z) {
            INVOKESTATIC_com_lynx_textra_TTText_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("tttext_lite");
        }
        boolean zNativePreloadSelfRendering = nativePreloadSelfRendering();
        sSelfRenderingPreloaded = zNativePreloadSelfRendering;
        return zNativePreloadSelfRendering;
    }
}
