package com.ss.lyrax.engine;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.ILyraxObject;
import com.ss.lyrax.utils.LyraxNativeCleaner;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxBaseContext implements ILyraxObject {
    public String appId;
    public long handle;

    public static class Instance {
        public static LyraxBaseContext instance;
    }

    public static native void nativeDispose(long j);

    public static native long nativeGetDestroyLyraxBaseContext();

    public static native long nativeInitBaseContext(LyraxBaseContextOption lyraxBaseContextOption);

    @Override // com.ss.lyrax.ILyraxObject
    public long getNativePtr() {
        return 0L;
    }

    public static synchronized void dispose() {
        LyraxBaseContext lyraxBaseContext = Instance.instance;
        if (lyraxBaseContext != null) {
            nativeDispose(lyraxBaseContext.handle);
            Instance.instance = null;
        }
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroyLyraxBaseContext(), this.handle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public static LyraxBaseContext getInstance() {
        return Instance.instance;
    }

    public String getAppId() {
        return this.appId;
    }

    public LyraxBaseContext(LyraxBaseContextOption lyraxBaseContextOption) {
        if (lyraxBaseContextOption != null) {
            this.appId = lyraxBaseContextOption.appId;
        }
        long jNativeInitBaseContext = nativeInitBaseContext(lyraxBaseContextOption);
        this.handle = jNativeInitBaseContext;
        if (jNativeInitBaseContext != 0) {
            LyraxNativeCleaner.register(this, jNativeInitBaseContext, nativeGetDestroyLyraxBaseContext());
            return;
        }
        throw new IllegalStateException("Failed to create LyraxBaseContext");
    }

    public static synchronized void init(LyraxBaseContextOption lyraxBaseContextOption) {
        if (Instance.instance == null) {
            Instance.instance = new LyraxBaseContext(lyraxBaseContextOption);
        }
    }
}
