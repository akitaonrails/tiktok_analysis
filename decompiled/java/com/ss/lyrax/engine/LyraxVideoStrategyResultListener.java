package com.ss.lyrax.engine;

import android.os.Build;
import com.bytedance.realx.base.Logging;
import com.ss.lyrax.utils.LyraxNativeCleaner;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoStrategyResultListener {
    public final long handle;

    public static native void nativeDispose(long j);

    public static native boolean nativeEquals(long j, long j2);

    public static native long nativeGetDestroyVideoStrategyResultListener();

    public static native void nativeOnVideoStrategyResult(long j, LyraxVideoStrategyChannelResult[] lyraxVideoStrategyChannelResultArr);

    public void dispose() {
        Logging.e("LyraxVideoStrategyResultListener", "lyrax publisher dispose");
        nativeDispose(this.handle);
    }

    public void finalize() {
        if (Build.VERSION.SDK_INT < 33) {
            LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroyVideoStrategyResultListener(), this.handle);
        }
    }

    public LyraxVideoStrategyResultListener(long j) {
        if (j != 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                LyraxNativeCleaner.register(this, j, nativeGetDestroyVideoStrategyResultListener());
            }
            Logging.e("LyraxVideoStrategyResultListener", "lyrax publisher create");
            this.handle = j;
            return;
        }
        throw new IllegalStateException("handler is nullptr");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LyraxVideoStrategyResultListener) {
            return nativeEquals(this.handle, ((LyraxVideoStrategyResultListener) obj).handle);
        }
        return false;
    }

    public void onVideoStrategyResult(LyraxVideoStrategyChannelResult[] lyraxVideoStrategyChannelResultArr) {
        nativeOnVideoStrategyResult(this.handle, lyraxVideoStrategyChannelResultArr);
    }
}
