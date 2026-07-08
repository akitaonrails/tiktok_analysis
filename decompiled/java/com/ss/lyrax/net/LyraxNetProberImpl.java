package com.ss.lyrax.net;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.ILyraxNetProber;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.utils.LyraxNativeCleaner;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxNetProberImpl implements ILyraxNetProber {
    public final long handle;

    public static native void nativeDispose(long j);

    public static native boolean nativeEquals(long j, long j2);

    public static native LyraxNetProberBandwidthResult nativeGetBandwidthResult(long j);

    public static native long nativeGetDestroyNetProber();

    public static native LyraxErrorCode nativeSetListener(long j, ILyraxNetProberListener iLyraxNetProberListener);

    public static native LyraxErrorCode nativeStartProbe(long j);

    public static native LyraxErrorCode nativeStopProbe(long j);

    @Override // com.ss.lyrax.ILyraxNetProber
    public void dispose() {
        nativeDispose(this.handle);
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroyNetProber(), this.handle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    @Override // com.ss.lyrax.ILyraxNetProber
    public LyraxNetProberBandwidthResult getBandwidthResult() {
        return nativeGetBandwidthResult(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxNetProber
    public LyraxErrorCode startProbe() {
        return nativeStartProbe(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxNetProber
    public LyraxErrorCode stopProbe() {
        return nativeStopProbe(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxObject
    public long getNativePtr() {
        return this.handle;
    }

    public LyraxNetProberImpl(long j) {
        if (j != 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                LyraxNativeCleaner.register(this, j, nativeGetDestroyNetProber());
            }
            this.handle = j;
            return;
        }
        throw new IllegalStateException("handler is nullptr");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof LyraxNetProberImpl)) {
            return nativeEquals(this.handle, ((LyraxNetProberImpl) obj).handle);
        }
        return false;
    }

    @Override // com.ss.lyrax.ILyraxNetProber
    public LyraxErrorCode setListener(ILyraxNetProberListener iLyraxNetProberListener) {
        return nativeSetListener(this.handle, iLyraxNetProberListener);
    }
}
