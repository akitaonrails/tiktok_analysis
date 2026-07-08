package com.bytedance.bpea.transmit.delegate;

import X.C0W9T;
import X.C0W9U;
import X.C0WP5;
import X.C2179971ATj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* JADX INFO: loaded from: classes14.dex */
public class BPEAThread extends PthreadThread {
    public C0W9T bpeaTraceContext;

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        com_bytedance_bpea_transmit_delegate_BPEAThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void com_bytedance_bpea_transmit_delegate_BPEAThread__run$___twin___() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        this.bpeaTraceContext = null;
        try {
            super.run();
            if (zLJ) {
                C0W9U.LJFF();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    public BPEAThread() {
        super("te/BPEAThread");
        this.bpeaTraceContext = C0WP5.LIZIZ() ? C0W9U.LIZIZ() : null;
    }

    public final C0W9T getBpeaTraceContext() {
        return this.bpeaTraceContext;
    }

    public BPEAThread(Runnable runnable) {
        C0W9T c0w9tLIZIZ;
        super(runnable, "te/BPEAThread");
        if (C0WP5.LIZIZ()) {
            c0w9tLIZIZ = C0W9U.LIZIZ();
        } else {
            c0w9tLIZIZ = null;
        }
        this.bpeaTraceContext = c0w9tLIZIZ;
    }

    public static void com_bytedance_bpea_transmit_delegate_BPEAThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BPEAThread bPEAThread) {
        try {
            bPEAThread.com_bytedance_bpea_transmit_delegate_BPEAThread__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public final void setBpeaTraceContext(C0W9T c0w9t) {
        this.bpeaTraceContext = c0w9t;
    }

    public BPEAThread(String str) {
        C0W9T c0w9tLIZIZ;
        super(str);
        if (C0WP5.LIZIZ()) {
            c0w9tLIZIZ = C0W9U.LIZIZ();
        } else {
            c0w9tLIZIZ = null;
        }
        this.bpeaTraceContext = c0w9tLIZIZ;
    }

    public BPEAThread(ThreadGroup threadGroup, Runnable runnable) {
        C0W9T c0w9tLIZIZ;
        super(threadGroup, runnable, "te/BPEAThread");
        if (C0WP5.LIZIZ()) {
            c0w9tLIZIZ = C0W9U.LIZIZ();
        } else {
            c0w9tLIZIZ = null;
        }
        this.bpeaTraceContext = c0w9tLIZIZ;
    }

    public BPEAThread(Runnable runnable, String str) {
        C0W9T c0w9tLIZIZ;
        super(runnable, str);
        if (C0WP5.LIZIZ()) {
            c0w9tLIZIZ = C0W9U.LIZIZ();
        } else {
            c0w9tLIZIZ = null;
        }
        this.bpeaTraceContext = c0w9tLIZIZ;
    }

    public BPEAThread(ThreadGroup threadGroup, String str) {
        C0W9T c0w9tLIZIZ;
        super(threadGroup, str);
        if (C0WP5.LIZIZ()) {
            c0w9tLIZIZ = C0W9U.LIZIZ();
        } else {
            c0w9tLIZIZ = null;
        }
        this.bpeaTraceContext = c0w9tLIZIZ;
    }

    public BPEAThread(ThreadGroup threadGroup, Runnable runnable, String str) {
        C0W9T c0w9tLIZIZ;
        super(threadGroup, runnable, str);
        if (C0WP5.LIZIZ()) {
            c0w9tLIZIZ = C0W9U.LIZIZ();
        } else {
            c0w9tLIZIZ = null;
        }
        this.bpeaTraceContext = c0w9tLIZIZ;
    }

    public BPEAThread(ThreadGroup threadGroup, Runnable runnable, String str, long j) {
        C0W9T c0w9tLIZIZ;
        super(threadGroup, runnable, str, j);
        if (C0WP5.LIZIZ()) {
            c0w9tLIZIZ = C0W9U.LIZIZ();
        } else {
            c0w9tLIZIZ = null;
        }
        this.bpeaTraceContext = c0w9tLIZIZ;
    }
}
