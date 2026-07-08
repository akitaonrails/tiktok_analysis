package com.ss.bytertc.engine.adapter;

import X.C786410Ut5;
import android.os.Handler;
import ci3.a;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class VideoSinkTask extends a {
    public Handler mHandler;
    public Object mLock;

    public VideoSinkTask() {
        super("VideoSinkTaskManager", 0);
        this.mLock = new Object();
    }

    public void exit() {
        synchronized (this.mLock) {
            try {
                quitSafely();
                this.mHandler = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void init() {
        synchronized (this.mLock) {
            try {
                start();
                this.mHandler = new BPEAHandler(getLooper());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void post(Runnable runnable) {
        synchronized (this.mLock) {
            try {
                Handler handler = this.mHandler;
                if (handler != null) {
                    C786410Ut5.LJJZZIII(handler, runnable);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void postDelayed(Runnable runnable, long j) {
        synchronized (this.mLock) {
            try {
                Handler handler = this.mHandler;
                if (handler != null) {
                    C786410Ut5.LJLIIL(j, handler, runnable);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
