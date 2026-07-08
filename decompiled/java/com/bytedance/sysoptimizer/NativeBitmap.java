package com.bytedance.sysoptimizer;

import X.C1C7U;
import X.C2179971ATj;
import android.content.Context;
import android.os.Build;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes27.dex */
public class NativeBitmap {
    public static boolean mEnabled;
    public static boolean mStarted;

    public static native boolean start(int i);

    public static double getJavaHeapUtilizaiton() {
        return (Runtime.getRuntime().totalMemory() * 1.0d) / Runtime.getRuntime().maxMemory();
    }

    public static synchronized boolean enable(Context context) {
        if (Build.VERSION.SDK_INT > 25) {
            return false;
        }
        return realStart(context);
    }

    public static synchronized boolean realStart(Context context) {
        if (mEnabled) {
            return true;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                boolean zStart = start(Build.VERSION.SDK_INT);
                mEnabled = zStart;
                return zStart;
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static synchronized boolean enable(final Context context, final long j, final double d, long j2) {
        if (Build.VERSION.SDK_INT > 25) {
            return false;
        }
        if (Runtime.getRuntime().maxMemory() > j2) {
            return false;
        }
        if (mStarted || mEnabled) {
            return true;
        }
        mStarted = true;
        new BPEAThread(null, new Runnable() { // from class: com.bytedance.sysoptimizer.NativeBitmap.1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("NativeBitmap@5f50.enable$1");
                com_bytedance_sysoptimizer_NativeBitmap$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("NativeBitmap@5f50.enable$1");
            }

            public void com_bytedance_sysoptimizer_NativeBitmap$1__run$___twin___() {
                while (true) {
                    try {
                        Thread.sleep(j);
                        if (NativeBitmap.mEnabled) {
                            return;
                        }
                        if (NativeBitmap.getJavaHeapUtilizaiton() >= d) {
                            NativeBitmap.realStart(context);
                            return;
                        }
                        continue;
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }

            public static void com_bytedance_sysoptimizer_NativeBitmap$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_bytedance_sysoptimizer_NativeBitmap$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        }, "NativeBitmap", 262144L).start();
        return true;
    }
}
