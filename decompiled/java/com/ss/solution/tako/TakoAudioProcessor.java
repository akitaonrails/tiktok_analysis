package com.ss.solution.tako;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.ILyraxEngine;
import com.ss.lyrax.utils.LyraxNativeCleaner;

/* JADX INFO: loaded from: classes21.dex */
public class TakoAudioProcessor {
    public final long mNativeHandle;

    public static native long nativeCreate(long j, TakoAudioMediaInfo takoAudioMediaInfo, TakoDuckingConfig takoDuckingConfig);

    public static native void nativeDispose(long j);

    public static native long nativeGetDestroy();

    public static native int nativeProcess(long j, TakoAudioFrameInfo takoAudioFrameInfo);

    public void dispose() {
        nativeDispose(this.mNativeHandle);
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroy(), this.mNativeHandle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public TakoAudioProcessor(long j) {
        if (j != 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                LyraxNativeCleaner.register(this, j, nativeGetDestroy());
            }
            this.mNativeHandle = j;
            return;
        }
        throw new IllegalStateException("handler is nullptr");
    }

    public int process(TakoAudioFrameInfo takoAudioFrameInfo) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -1;
        }
        return nativeProcess(j, takoAudioFrameInfo);
    }

    public static TakoAudioProcessor create(ILyraxEngine iLyraxEngine, TakoAudioMediaInfo takoAudioMediaInfo, TakoDuckingConfig takoDuckingConfig) {
        if (iLyraxEngine == null) {
            return null;
        }
        long jNativeCreate = nativeCreate(iLyraxEngine.getNativePtr(), takoAudioMediaInfo, takoDuckingConfig);
        if (jNativeCreate == 0) {
            return null;
        }
        return new TakoAudioProcessor(jNativeCreate);
    }
}
