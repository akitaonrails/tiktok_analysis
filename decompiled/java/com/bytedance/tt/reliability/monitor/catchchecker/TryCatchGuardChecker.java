package com.bytedance.tt.reliability.monitor.catchchecker;

/* JADX INFO: loaded from: classes25.dex */
public class TryCatchGuardChecker {
    public static boolean enableCheck;
    public static EnterTryCatchBlockListener listener;

    public interface EnterTryCatchBlockListener {
        void onCatch(Throwable th);
    }

    public static void doCheck(Throwable th) {
        EnterTryCatchBlockListener enterTryCatchBlockListener;
        if (enableCheck && th != null && (enterTryCatchBlockListener = listener) != null) {
            enterTryCatchBlockListener.onCatch(th);
        }
    }

    public static void monitor(boolean z, EnterTryCatchBlockListener enterTryCatchBlockListener) {
        if (z && enableCheck) {
            return;
        }
        enableCheck = z;
        listener = enterTryCatchBlockListener;
    }
}
