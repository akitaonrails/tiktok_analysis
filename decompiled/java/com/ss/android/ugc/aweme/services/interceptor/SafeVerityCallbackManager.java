package com.ss.android.ugc.aweme.services.interceptor;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public class SafeVerityCallbackManager {
    public static final Object LOCK = new Object();
    public static volatile SafeVerityCallbackManager sInstance;
    public SafeVerityCallback mCallback;

    public static SafeVerityCallbackManager getInstance() {
        if (sInstance == null) {
            synchronized (SafeVerityCallbackManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new SafeVerityCallbackManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void notifyResult(SafeVerityResponse safeVerityResponse) {
        synchronized (LOCK) {
            try {
                SafeVerityCallback safeVerityCallback = this.mCallback;
                if (safeVerityCallback != null) {
                    safeVerityCallback.onComplete(safeVerityResponse);
                    this.mCallback = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void register(SafeVerityCallback safeVerityCallback) {
        if (safeVerityCallback == null) {
            return;
        }
        synchronized (LOCK) {
            try {
                this.mCallback = safeVerityCallback;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
