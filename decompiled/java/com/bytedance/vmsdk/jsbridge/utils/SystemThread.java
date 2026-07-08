package com.bytedance.vmsdk.jsbridge.utils;

import X.C786410Ut5;
import Y.ARunnableS123S0100000_23;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.utils.SystemThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;

/* JADX INFO: loaded from: classes24.dex */
public class SystemThread {
    public Thread mAndroidThread;
    public long mNativeThread;

    public static native void nativeRun(long j);

    public void join() {
        try {
            ThreadMethodProxy.join(this.mAndroidThread);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void stop() {
        Looper looperMyLooper = Looper.myLooper();
        if (C786410Ut5.u3() != this.mAndroidThread || looperMyLooper == null) {
            return;
        }
        looperMyLooper.quit();
    }

    public static void attachMainThread(final long j) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            nativeRun(j);
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0oOd
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SystemThread@88d5.attachMainThread$1");
                    try {
                        SystemThread.nativeRun(j);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SystemThread@88d5.attachMainThread$1");
                }
            });
        }
    }

    private void createAndroidThread(String str, int i) {
        BPEAThread bPEAThread = new BPEAThread(new ARunnableS123S0100000_23(this, 22), str);
        this.mAndroidThread = bPEAThread;
        ThreadMethodProxy.setPriority(bPEAThread, i);
        this.mAndroidThread.start();
    }

    public SystemThread(long j, String str, int i) {
        this.mNativeThread = j;
        createAndroidThread(str, i);
    }

    public static SystemThread create(long j, String str, int i) {
        return new SystemThread(j, str, i);
    }
}
