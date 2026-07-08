package com.ss.ttlivestreamer.core.utils;

import X.C0W9U;
import X.C1274040jG6;
import X.C1274080jGA;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1273750jFd;
import X.InterfaceC1273760jFe;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS25S1100000_20;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class SafeHandlerThread extends NativeHandlerThread {
    public InterfaceC1273760jFe listener;
    public long mAliveTimeMs;
    public InterfaceC1273750jFd mDispatch;
    public boolean mEnableSafeMode;
    public SafeHandler mHandler;
    public boolean mHasStart;
    public final Object mLockFence;
    public AtomicBoolean mLocked;
    public boolean mQuiting;
    public final Runnable mReleaseRunnable;
    public Runnable mReleaseRunnableOuter;
    public volatile boolean mReleased;

    public synchronized Handler getHandler() {
        return getHandlerInner();
    }

    public SafeHandlerThread lock() {
        return lock(null);
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            bpea_origin_onLooperPrepared();
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

    @Override // android.os.HandlerThread
    public boolean quit() {
        this.mQuiting = true;
        return super.quit();
    }

    @Override // android.os.HandlerThread
    public boolean quitSafely() {
        this.mQuiting = true;
        return super.quitSafely();
    }

    public void setOnLooperPreparedListener(InterfaceC1273760jFe interfaceC1273760jFe) {
    }

    @Override // com.ss.ttlivestreamer.core.utils.NativeHandlerThread, java.lang.Thread
    public synchronized void start() {
        synchronized (this) {
            try {
                if (!this.mHasStart) {
                    this.mHasStart = true;
                    try {
                        super.start();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private SafeHandler getHandlerInner() {
        if (this.mHandler == null) {
            this.mHandler = new SafeHandler(getLooper());
        }
        return this.mHandler;
    }

    public boolean isLocked() {
        return this.mLocked.get();
    }

    @Override // com.ss.ttlivestreamer.core.utils.NativeHandlerThread
    public void release() {
        if (this.mIsNative) {
            super.release();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Release thread:");
        sbLIZ.append(getName());
        AVLog.ioi("SafeHandlerThread", C2188811AlT.LIZIZ(sbLIZ));
        try {
            quitSafely();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.quit();
        }
    }

    private void bpea_origin_onLooperPrepared() {
        super.onLooperPrepared();
    }

    public static class SafeHandler extends BPEAHandler {
        public Handler.Callback LL;

        public SafeHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("SafeHandlerThread$SafeHandler@61fa.handleMessage");
            Handler.Callback callback = this.LL;
            if (callback != null) {
                callback.handleMessage(message);
            }
            C1C7U.LIZIZ("SafeHandlerThread$SafeHandler@61fa.handleMessage");
        }
    }

    public SafeHandlerThread(String str) {
        this(str, 0);
    }

    public synchronized void enableSafeMode(InterfaceC1273750jFd interfaceC1273750jFd) {
        if (this.mEnableSafeMode && this.mDispatch != null) {
            return;
        }
        this.mEnableSafeMode = true;
        this.mDispatch = interfaceC1273750jFd;
        C786410Ut5.LJJZZIII(getHandler(), new ARunnableS120S0100000_20(this, 118));
    }

    public SafeHandlerThread lock(Handler.Callback callback) {
        getHandlerInner().removeCallbacks(this.mReleaseRunnable);
        if (!isLocked() && !this.mReleased) {
            synchronized (this.mLockFence) {
                try {
                    if (!this.mReleased) {
                        getHandlerInner().removeCallbacks(this.mReleaseRunnable);
                        this.mLocked.set(true);
                        setHandlerCallback(callback);
                        return this;
                    }
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return null;
    }

    public boolean post(int i) {
        return C786410Ut5.LJLILLLLZI(getHandler(), i);
    }

    public boolean postAtFrontOfQueue(Runnable runnable) {
        return C786410Ut5.LJL(getHandler(), runnable);
    }

    public void removeCallbacks(Runnable runnable) {
        getHandler().removeCallbacks(runnable);
    }

    public void setAliveTimeMs(long j) {
        this.mAliveTimeMs = j;
    }

    public void setHandlerCallback(Handler.Callback callback) {
        SafeHandler handlerInner = getHandlerInner();
        if (handlerInner != null) {
            handlerInner.LL = callback;
        }
    }

    @Override // com.ss.ttlivestreamer.core.utils.NativeHandlerThread
    public void setThreadName(String str) {
        if (!post(new ARunnableS25S1100000_20(this, str, 11))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Set name failed.current:");
            sbLIZ.append(getName());
            sbLIZ.append(",new:");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(strLIZIZ);
            C1274080jGA.LIZ.LIZ("SafeHandlerThread.setThreadName", androidRuntimeException);
            if (!C1274040jG6.LIZ()) {
                AVLog.logKibana(6, "SafeHandlerThread", strLIZIZ, null);
                return;
            }
            throw androidRuntimeException;
        }
    }

    public void unlock(Runnable runnable) {
        getHandlerInner().removeCallbacks(this.mReleaseRunnable);
        if (this.mAliveTimeMs > 0) {
            this.mReleaseRunnableOuter = runnable;
            getHandlerInner().postDelayed(this.mReleaseRunnable, this.mAliveTimeMs);
        }
        this.mLocked.set(false);
    }

    public boolean post(Runnable runnable) {
        return C786410Ut5.LJJZZIII(getHandler(), runnable);
    }

    public void post(Message message) {
        C786410Ut5.LJLJJL(getHandler(), message);
    }

    public SafeHandlerThread(String str, int i) {
        super(str, i);
        this.mLocked = new AtomicBoolean(false);
        this.mAliveTimeMs = 0L;
        this.mLockFence = new Object();
        this.mReleaseRunnable = new ARunnableS120S0100000_20(this, 117);
    }

    public boolean post(int i, Object obj) {
        return C786410Ut5.LJLJJL(getHandler(), this.mHandler.obtainMessage(i, obj));
    }

    public boolean postDelayed(Runnable runnable, long j) {
        return C786410Ut5.LJLIIL(j, getHandler(), runnable);
    }

    public boolean post(int i, int i2, int i3, Object obj) {
        return C786410Ut5.LJLJJL(getHandler(), this.mHandler.obtainMessage(i, i2, i3, obj));
    }
}
