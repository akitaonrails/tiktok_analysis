package com.ss.ttlivestreamer.core.utils;

import X.C1268940j7s;
import X.C1269000j7y;
import X.C1269390j8b;
import X.C143900gn;
import X.C786410Ut5;
import X.InterfaceC1268930j7r;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.ScopeMonitor;

/* JADX INFO: loaded from: classes21.dex */
public class ScopeMonitor {
    public static boolean enabled = true;
    public HandlerThread mHandlerThread;
    public Handler mLogHandler;
    public C1269390j8b mThreadChecker;
    public C1268940j7s scopeMonitorOptService;

    public static native void nativeCalcElapse(int i, long j, long j2);

    private boolean isCalcElapseEnabled() {
        return C1269000j7y.LIZ || enabled;
    }

    private void release() {
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread == null) {
            return;
        }
        try {
            handlerThread.quitSafely();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mHandlerThread.quit();
        }
        this.mHandlerThread = null;
    }

    public void releaseScopeMonitor() {
        release();
    }

    public ScopeMonitor(boolean z) {
        if (z) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("ScopeMonitor", C143900gn.LIZ(0, "ScopeMonitor"));
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mLogHandler = new BPEAHandler(C786410Ut5.W2(this.mHandlerThread));
        this.mThreadChecker = null;
    }

    public void setScopeMonitorOptService(C1268940j7s c1268940j7s) {
        this.scopeMonitorOptService = c1268940j7s;
    }

    public void CalcElapseOpt(int i, long j) {
        if (isCalcElapseEnabled()) {
            CalcElapse(i, j, TimeUtils.currentTimeMs());
        }
    }

    private void CalcElapseInstance(final int i, final long j, final long j2) {
        Handler handler = this.mLogHandler;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0j9T
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ScopeMonitor@9159.CalcElapseInstance$1");
                    try {
                        ScopeMonitor.nativeCalcElapse(i, j, j2);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ScopeMonitor@9159.CalcElapseInstance$1");
                }
            });
        }
    }

    public void CalcElapse(int i, long j, long j2) {
        C1268940j7s c1268940j7s;
        if (C1269000j7y.LIZ && (c1268940j7s = this.scopeMonitorOptService) != null) {
            InterfaceC1268930j7r interfaceC1268930j7r = c1268940j7s.LL;
            if (interfaceC1268930j7r != null) {
                interfaceC1268930j7r.LIZ(i, j, j2);
                return;
            }
            return;
        }
        if (!enabled) {
            return;
        }
        CalcElapseInstance(i, j, j2);
    }
}
