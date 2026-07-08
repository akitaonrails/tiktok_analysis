package com.ss.android.ugc.aweme.services.interceptor.callback;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateCallbackManager {
    public static volatile AgeGateCallbackManager sInstance;
    public AgeGateCallback currentCallback;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;
    public static final Object LOCK = new Object();

    public static final class Companion {
        public final AgeGateCallbackManager getInstance() {
            if (AgeGateCallbackManager.sInstance == null) {
                synchronized (AgeGateCallbackManager.class) {
                    try {
                        if (AgeGateCallbackManager.sInstance == null) {
                            AgeGateCallbackManager.sInstance = new AgeGateCallbackManager();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return AgeGateCallbackManager.sInstance;
        }
    }

    public final void notifyResult(String str) {
        synchronized (LOCK) {
            try {
                AgeGateCallback ageGateCallback = this.currentCallback;
                if (ageGateCallback != null) {
                    ageGateCallback.onComplete(str);
                }
                this.currentCallback = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void register(AgeGateCallback ageGateCallback) {
        synchronized (LOCK) {
            try {
                this.currentCallback = ageGateCallback;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
