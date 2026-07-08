package com.bytedance.sysoptimizer.anr;

import X.C0W9U;
import X.C1C7U;
import X.C2179971ATj;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes14.dex */
public class AnrMonitor extends BPEAThread {
    public static int postMode;
    public final int ANR_TIMEOUT;
    public final HandlerChecker mHandlerChecker;
    public boolean mLastStatus;
    public final Object mLock;
    public int mLooperWaitMs;
    public int mNewAnrTimeOutMs;
    public boolean mPaused;
    public long mStartTime;
    public boolean mThreadStart;

    public final class HandlerChecker implements Runnable {
        public volatile boolean mCompleted = true;
        public final Handler mHandler;

        public void com_bytedance_sysoptimizer_anr_AnrMonitor$HandlerChecker__run$___twin___() {
            this.mCompleted = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("AnrMonitor$HandlerChecker@7a01.run");
            com_bytedance_sysoptimizer_anr_AnrMonitor$HandlerChecker_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("AnrMonitor$HandlerChecker@7a01.run");
        }

        public Thread getThread() {
            return this.mHandler.getLooper().getThread();
        }

        public boolean isOverdueLocked() {
            if (this.mCompleted) {
                return false;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            AnrMonitor anrMonitor = AnrMonitor.this;
            return jUptimeMillis >= anrMonitor.mStartTime + ((long) anrMonitor.mLooperWaitMs);
        }

        public void scheduleCheckLocked() {
            if (this.mCompleted) {
                AnrMonitor.this.mStartTime = SystemClock.uptimeMillis();
                this.mCompleted = false;
                if (AnrMonitor.postMode == 1) {
                    C786410Ut5.LJJZZIII(this.mHandler, this);
                } else {
                    C786410Ut5.LJL(this.mHandler, this);
                }
            }
        }

        public static void com_bytedance_sysoptimizer_anr_AnrMonitor$HandlerChecker_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(HandlerChecker handlerChecker) {
            try {
                handlerChecker.com_bytedance_sysoptimizer_anr_AnrMonitor$HandlerChecker__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public HandlerChecker(Handler handler) {
            this.mHandler = handler;
        }
    }

    public static class Holder {
        public static final AnrMonitor INSTANCE = new AnrMonitor();
    }

    private void bpea_origin_run() {
        com_bytedance_sysoptimizer_anr_AnrMonitor_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void com_bytedance_sysoptimizer_anr_AnrMonitor__run$___twin___() {
        Process.setThreadPriority(-2);
        int i = 0;
        int i2 = 0;
        while (true) {
            synchronized (this) {
                try {
                    if (this.mPaused) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C786410Ut5.u3().interrupt();
                        }
                    }
                    this.mHandlerChecker.scheduleCheckLocked();
                    try {
                        wait(this.mLooperWaitMs);
                    } catch (InterruptedException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    if (this.mHandlerChecker.isOverdueLocked()) {
                        if (needNotify()) {
                            i2++;
                            AnrManager.getInstance().onAnrChange(true, i2);
                            this.mLastStatus = true;
                        }
                        i = 0;
                    } else {
                        i++;
                        if (this.mLastStatus && isAnrRestore(i)) {
                            AnrManager.getInstance().onAnrChange(false, 0);
                            this.mLastStatus = false;
                            i = 0;
                            i2 = 0;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public void pauseThread() {
        synchronized (this.mLock) {
            try {
                this.mPaused = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void resumeThread() {
        synchronized (this.mLock) {
            try {
                this.mPaused = false;
                notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        C1C7U.LIZ("AnrMonitor@b31b.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            com_bytedance_sysoptimizer_anr_AnrMonitor_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            if (zLJ) {
                C0W9U.LJFF();
            }
            C1C7U.LIZIZ("AnrMonitor@b31b.run");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    public AnrMonitor() {
        this.mLooperWaitMs = LSPassThroughRecordSizeConfig.DEFAULT;
        this.mNewAnrTimeOutMs = 8000;
        this.ANR_TIMEOUT = 2000;
        this.mLock = new Object();
        HandlerChecker handlerChecker = new HandlerChecker(new BPEAHandler(Looper.getMainLooper()));
        this.mHandlerChecker = handlerChecker;
        handlerChecker.scheduleCheckLocked();
    }

    private boolean needNotify() {
        return SystemClock.uptimeMillis() - this.mStartTime < ((long) this.mNewAnrTimeOutMs);
    }

    public static AnrMonitor getInstance() {
        return Holder.INSTANCE;
    }

    public static void com_bytedance_sysoptimizer_anr_AnrMonitor_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnrMonitor anrMonitor) {
        try {
            anrMonitor.com_bytedance_sysoptimizer_anr_AnrMonitor__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    private boolean isAnrRestore(int i) {
        if (i * this.mLooperWaitMs > 60000) {
            return true;
        }
        return false;
    }

    public static void setPostMode(int i) {
        postMode = i;
    }

    public void anrOptStart(int i, int i2) {
        synchronized (this) {
            try {
                if (!this.mThreadStart) {
                    this.mPaused = false;
                    this.mThreadStart = true;
                    if (this.mNewAnrTimeOutMs > 2000) {
                        this.mNewAnrTimeOutMs = i;
                    }
                    if (i2 > 0 && i2 < 2000) {
                        this.mLooperWaitMs = i2;
                    }
                    setName("AnrOptThread");
                    start();
                } else {
                    resumeThread();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
