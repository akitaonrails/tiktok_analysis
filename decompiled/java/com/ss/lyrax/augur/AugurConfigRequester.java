package com.ss.lyrax.augur;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.utils.LyraxNativeCleaner;

/* JADX INFO: loaded from: classes21.dex */
public class AugurConfigRequester {
    public long handle;

    public static native long nativeCreateAugurConfigRequester(AugurConfigRequestOption augurConfigRequestOption);

    public static native void nativeDispose(long j);

    public static native long nativeGetDestroyAugurConfigRequester();

    public static native LyraxErrorCode nativeRequestConfigAsync(long j, int i);

    public static native void nativeShutdown(long j);

    public static native void nativeStartup(long j);

    public static native boolean nativeUpdateRequestParams(long j, AugurConfigRequestParam augurConfigRequestParam);

    public void dispose() {
        nativeDispose(this.handle);
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroyAugurConfigRequester(), this.handle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public void shutdown() {
        nativeShutdown(this.handle);
    }

    public void startup() {
        nativeStartup(this.handle);
    }

    public long getHandle() {
        return this.handle;
    }

    public long getNativePtr() {
        return this.handle;
    }

    public AugurConfigRequester(AugurConfigRequestOption augurConfigRequestOption) {
        long jNativeCreateAugurConfigRequester = nativeCreateAugurConfigRequester(augurConfigRequestOption);
        this.handle = jNativeCreateAugurConfigRequester;
        if (jNativeCreateAugurConfigRequester != 0) {
            LyraxNativeCleaner.register(this, jNativeCreateAugurConfigRequester, nativeGetDestroyAugurConfigRequester());
            return;
        }
        throw new IllegalStateException("Failed to create AugurConfigRequester");
    }

    public LyraxErrorCode requestConfigAsync(int i) {
        return nativeRequestConfigAsync(this.handle, i);
    }

    public boolean updateRequestParams(AugurConfigRequestParam augurConfigRequestParam) {
        return nativeUpdateRequestParams(this.handle, augurConfigRequestParam);
    }
}
