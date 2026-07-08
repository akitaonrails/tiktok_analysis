package com.ss.bytertc.engine.handler;

import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes25.dex */
public class AppExecutors {
    public static final AppExecutors INSTANCE = new AppExecutors(new MainThreadExecutor());
    public final Executor mMainThread;

    public static class MainThreadExecutor implements Executor {
        public Handler mainThreadHandler;

        public MainThreadExecutor() {
            this.mainThreadHandler = new BPEAHandler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C786410Ut5.LJJZZIII(this.mainThreadHandler, runnable);
        }
    }

    public static AppExecutors getInstance() {
        return INSTANCE;
    }

    public Executor mainThread() {
        return this.mMainThread;
    }

    public AppExecutors(Executor executor) {
        this.mMainThread = executor;
    }
}
