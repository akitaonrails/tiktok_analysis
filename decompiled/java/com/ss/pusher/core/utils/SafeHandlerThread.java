package com.ss.pusher.core.utils;

import X.C1C7U;
import X.C2188811AlT;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class SafeHandlerThread extends NativeHandlerThread {
    public SafeHandler LLILLL;
    public boolean LLILZ;
    public final Object LLILZIL;

    public final synchronized Handler getHandler() {
        if (this.LLILLL == null) {
            this.LLILLL = new SafeHandler(getLooper());
        }
        return this.LLILLL;
    }

    @Override // com.ss.pusher.core.utils.NativeHandlerThread, java.lang.Thread
    public final synchronized void start() {
        synchronized (this) {
            try {
                if (!this.LLILZ) {
                    this.LLILZ = true;
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

    @Override // android.os.HandlerThread
    public final boolean quit() {
        return super.quit();
    }

    @Override // android.os.HandlerThread
    public final boolean quitSafely() {
        return super.quitSafely();
    }

    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Release thread:");
        sbLIZ.append(getName());
        AVLog.ioi("SafeHandlerThread", C2188811AlT.LIZIZ(sbLIZ));
        super.quitSafely();
    }

    public static class SafeHandler extends BPEAHandler {
        public SafeHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("SafeHandlerThread$SafeHandler@324a.handleMessage");
            C1C7U.LIZIZ("SafeHandlerThread$SafeHandler@324a.handleMessage");
        }
    }

    public SafeHandlerThread(String str) {
        super(str);
        new AtomicBoolean(false);
        this.LLILZIL = new Object();
    }
}
